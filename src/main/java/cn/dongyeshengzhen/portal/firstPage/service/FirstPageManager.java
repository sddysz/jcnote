package cn.dongyeshengzhen.portal.firstPage.service;

import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.service.ContentManager;
import cn.dongyeshengzhen.portal.firstPage.dao.FirstPageDao;
import cn.dongyeshengzhen.portal.firstPage.entity.FirstPage;
import cn.dongyeshengzhen.portal.firstPage.entity.FirstPageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Service
public class FirstPageManager {
    @Autowired
    FirstPageDao firstPageDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;
    @Autowired
    ContentManager contentManager;

    public FirstPage findOne(Integer id) {
        return firstPageDao.findOne(id);
    }

    public String findNewsUrl(Integer type) {
        Content content=contentManager.findNewsContent(type);
        String url=content.getType().getMenu().getName()+"/"+content.getType().getName()+"/"+content.getId();

        return "nav_"+url;
    }

    public void saveBanner(FirstPage firstPage) {
        firstPage.setType(FirstPageType.BANNER);
        if (firstPage.getId() != null) {
            FirstPage tempFirstPage = firstPageDao.findOne(firstPage.getId());
        }
        firstPageDao.save(firstPage);
    }

    public void saveNews(FirstPage firstPage) {
        firstPage.setType(FirstPageType.NEWS);
        FirstPage tempFirstPage = firstPageDao.findOne(firstPage.getId());
        firstPage.setOrderId(tempFirstPage.getId());
        firstPageDao.save(firstPage);
    }

    public List findByType(String type) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<FirstPage> criteriaQuery = criteriaBuilder.createQuery(FirstPage.class);
        Root<FirstPage> root = criteriaQuery.from(FirstPage.class);
        criteriaQuery.select(root);
        Predicate condition = criteriaBuilder.equal(root.get("type"), type);
        criteriaQuery.where(condition);
        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("orderId")));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public List findAll() {
        return firstPageDao.findAll();
    }

    public void delete(Integer id) {
        firstPageDao.delete(id);
    }
}
