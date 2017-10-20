package cn.dongyeshengzhen.cloudnote.note.dao;

import cn.dongyeshengzhen.cloudnote.note.entity.Note;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class NoteDaoImpl implements NoteDaoExtend {
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    @Override
    public Specification<Note> getSpecification(Integer pageNumber, Integer notebookId) {
        return new Specification<Note>() {
            @Override
            public Predicate toPredicate(Root<Note> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (notebookId != null) {
                    Predicate p1 = cb.equal(root.get("notebookId").as(Integer.class), notebookId);
                    predicates.add(p1);
                }
                Predicate[] p = new Predicate[predicates.size()];
                cq.where(cb.and(predicates.toArray(p)));
                cq.orderBy(cb.desc(root.get("createdTime").as(Integer.class)));
                cq.distinct(true);
                return cq.getRestriction();
            }
        };
    }


}
