package cn.dongyeshengzhen.cloudnote.notebook.dao;

import cn.dongyeshengzhen.cloudnote.notebook.entity.Notebook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/applicationContext.xml",
        "classpath:/applicationContext-security.xml",
        "classpath:/persistence.xml"})
public class NotebookDaoTest {


    @Autowired
    NotebookDao notebookDao;

    @Test
    public void findAll() throws Exception {

        List notebooks = notebookDao.findAll();
        System.out.println(notebooks.size());
        Notebook notebook = notebookDao.findOne(1);
        System.out.println("id=" + notebook.getNotebookId() + ",名字为：" + notebook.getTitle());

    }

}