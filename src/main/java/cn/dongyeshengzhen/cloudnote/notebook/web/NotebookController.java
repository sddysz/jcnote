package cn.dongyeshengzhen.cloudnote.notebook.web;

import cn.dongyeshengzhen.cloudnote.note.service.NoteManager;
import cn.dongyeshengzhen.cloudnote.notebook.entity.Notebook;
import cn.dongyeshengzhen.cloudnote.notebook.entity.NotebookNode;
import cn.dongyeshengzhen.cloudnote.notebook.service.NotebookManager;
import cn.dongyeshengzhen.cloudnote.user.service.UserDataManager;
import cn.dongyeshengzhen.framework.security.shiro.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/notebook")
public class NotebookController {
    @Autowired
    private NotebookManager notebookManager;
    @Autowired
    private UserDataManager userDataManager;


    @RequestMapping(value = "getList")
    @ResponseBody
    public NotebookNode getNotebooks() {

        Notebook rootNode = new Notebook();
        rootNode.setNotebookId(-1);
        rootNode.setTitle("所有笔记本");
        rootNode.setSubNotebooks(notebookManager.getAllNotebookNodes());
        return rootNode.convert2Node();
    }

}
