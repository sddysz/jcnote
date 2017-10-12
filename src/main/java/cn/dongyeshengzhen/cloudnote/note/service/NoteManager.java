package cn.dongyeshengzhen.cloudnote.note.service;

import cn.dongyeshengzhen.cloudnote.note.dao.NoteDao;
import cn.dongyeshengzhen.cloudnote.note.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
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

}
