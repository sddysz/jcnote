package cn.dongyeshengzhen.portal.content.dao;

import cn.dongyeshengzhen.portal.content.entity.Content;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by dongye on 2016/9/10.
 */
public class ContentDaoExtendImpl implements ContentDaoExtend {

    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    @Override
    public List<Content> findContentByTypeId(Integer contentTypeId) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Content> criteriaQuery = criteriaBuilder.createQuery(Content.class);
        Root<Content> root = criteriaQuery.from(Content.class);
        criteriaQuery.select(root);
        Predicate condition = criteriaBuilder.equal(root.join("type").get("id"), contentTypeId);
        criteriaQuery.where(condition);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
