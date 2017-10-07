package cn.dongyeshengzhen.portal.news.dao;

import cn.dongyeshengzhen.portal.news.entity.News;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongye on 2016/8/25.
 */
public class NewsDaoImpl implements NewsDaoExtend {
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    @Override
    public Specification<News> getSpecification(Integer pageNumber, final Integer type) {
        return new Specification<News>() {
            @Override
            public Predicate toPredicate(Root<News> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<Predicate>();
                if (type != null) {
                    Predicate p1 = cb.equal(root.get("type").as(Integer.class), type);
                    predicates.add(p1);
                }
                Predicate[] p = new Predicate[predicates.size()];
                cq.where(cb.and(predicates.toArray(p)));
                cq.orderBy(cb.desc(root.get("createTime").as(Integer.class)));
                cq.distinct(true);
                return cq.getRestriction();
            }
        };
    }
}
