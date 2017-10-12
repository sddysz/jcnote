package cn.dongyeshengzhen.cloudnote.note.dao;


import cn.dongyeshengzhen.cloudnote.note.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository<Note, Integer>, JpaSpecificationExecutor<Note> {

}

