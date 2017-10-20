package cn.dongyeshengzhen.cloudnote.note.service;

import cn.dongyeshengzhen.cloudnote.note.dao.NoteDao;
import cn.dongyeshengzhen.cloudnote.note.entity.Note;
import cn.dongyeshengzhen.framework.model.PageRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class NoteManager {

    @Autowired
    NoteDao noteDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public Note findOne(Integer id) {
        return noteDao.findOne(id);
    }
    public Page<Note> findPage(Integer pageNumber, Integer notebookId) {
        PageRequestModel pageRequestModel = new PageRequestModel();
        pageRequestModel.setPageNumber(pageNumber);
        pageRequestModel.setPageSize(10);
        pageRequestModel.setSortBy("createdTime");
        pageRequestModel.setDirection("DESC");
        Specification<Note> specification = noteDao.getSpecification(pageNumber, notebookId);
        return noteDao.findAll(specification, pageRequestModel.toPageable());
    }
}
