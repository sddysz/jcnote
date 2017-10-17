package cn.dongyeshengzhen.cloudnote.notebook.service;

import cn.dongyeshengzhen.cloudnote.notebook.dao.NotebookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/applicationContext.xml",
        "classpath:/applicationContext-security.xml",
        "classpath:/persistence.xml"})
public class NotebookManagerTest {

    @Autowired
    NotebookDao notebookDao;
    @Autowired
    NotebookManager notebookManager;

    @Test
    public void parseAndSortNotebooks() throws Exception {
        List list = notebookDao.findAll();
        List list1 = notebookManager.parseAndSortNotebooks(list, true, true);
        System.out.println(list1);


    }

}