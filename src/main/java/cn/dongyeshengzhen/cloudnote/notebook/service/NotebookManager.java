package cn.dongyeshengzhen.cloudnote.notebook.service;

import cn.dongyeshengzhen.cloudnote.notebook.dao.NotebookDao;
import cn.dongyeshengzhen.cloudnote.notebook.entity.Notebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class NotebookManager {

    @Autowired
    NotebookDao notebookDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public Notebook findOne(Integer id) {
        return notebookDao.findOne(id);
    }

}
