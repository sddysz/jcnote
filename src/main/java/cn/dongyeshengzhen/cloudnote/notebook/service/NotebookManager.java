package cn.dongyeshengzhen.cloudnote.notebook.service;

import cn.dongyeshengzhen.cloudnote.notebook.dao.NotebookDao;
import cn.dongyeshengzhen.cloudnote.notebook.entity.Notebook;
import cn.dongyeshengzhen.cloudnote.notebook.entity.NotebookNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Service
public class NotebookManager {

    @Autowired
    NotebookDao notebookDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public Notebook findOne(Integer id) {
        return notebookDao.findOne(id);
    }


    public List<Notebook> getAllNotebookNodes() {
        List list = notebookDao.findAll();

        return parseAndSortNotebooks(list, false, true);
    }

    // 整理(成有关系)并排序
// GetNotebooks()调用
// ShareService调用
    public List parseAndSortNotebooks(List<Notebook> userNotebooks, boolean noParentDelete, boolean needSort) {
        // 整理成info.Notebooks
        // 第一遍, 建map
        // notebookId => info.Notebooks
        Map<String, Notebook> userNotebooksMap = new HashMap<>();

        for (Notebook notebook : userNotebooks) {
            userNotebooksMap.put(Integer.toString(notebook.getNotebookId()), notebook);
        }

        // 第二遍, 追加到父下

        // 需要删除的id
        Map<String, Boolean> needDeleteNotebookId = new HashMap<>();
        for (Notebook each : userNotebooks) {
            // 如果有父, 那么追加到父下, 并剪掉当前, 那么最后就只有根的元素
            if (each.getParentNotebookId() != null && each.getParentNotebookId() != -1) {
                if (userNotebooksMap.get(Integer.toString(each.getParentNotebookId())) != null) {
                    Notebook notebook = userNotebooksMap.get(Integer.toString(each.getParentNotebookId()));
                    if (notebook.getSubNotebooks() == null) {
                        notebook.setSubNotebooks(new ArrayList<Notebook>());
                    }

                    notebook.getSubNotebooks().add(each); // Subs是存地址
                    needDeleteNotebookId.put(Integer.toString(each.getNotebookId()), true);
                    // delete(userNotebooksMap, id)
                    //userNotebooksMap.remove(Integer.toString(each.getNotebookId()));
                } else if (noParentDelete) {
                    // 没有父, 且设置了要删除
                    needDeleteNotebookId.put(Integer.toString(each.getNotebookId()), true);
                    // delete(userNotebooksMap, id)
                    userNotebooksMap.remove(Integer.toString(each.getNotebookId()));
                }
            }
        }

        // 第三遍, 得到所有根
        List finalNotebooks = new ArrayList();
        Set<String> set = userNotebooksMap.keySet();
        for (String key : set) {
            if (!needDeleteNotebookId.containsKey(key) || !needDeleteNotebookId.get(key)) {
                finalNotebooks.add(userNotebooksMap.get(key));
            }
        }


        // 最后排序
        if (needSort) {
            sortSubNotebooks(finalNotebooks);
        }
        return finalNotebooks;
    }

    private void sortSubNotebooks(List<Notebook> eachNotebooks) {
        // 遍历子, 则子往上进行排序
        for (Notebook eachNotebook : eachNotebooks) {
            if (eachNotebook.getSubNotebooks() != null && !eachNotebook.getSubNotebooks().isEmpty()) {
                sortSubNotebooks(eachNotebook.getSubNotebooks());
            }
        }
        // 子排完了, 本层排
        Collections.sort(eachNotebooks);
    }

}


