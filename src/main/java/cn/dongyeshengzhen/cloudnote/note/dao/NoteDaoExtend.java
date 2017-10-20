package cn.dongyeshengzhen.cloudnote.note.dao;

import cn.dongyeshengzhen.cloudnote.note.entity.Note;
import org.springframework.data.jpa.domain.Specification;

public interface NoteDaoExtend {
    public Specification<Note> getSpecification(Integer pageNumber, Integer notebookId);
}
