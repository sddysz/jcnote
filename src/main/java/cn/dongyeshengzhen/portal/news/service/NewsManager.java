package cn.dongyeshengzhen.portal.news.service;

import cn.dongyeshengzhen.framework.model.MsgModel;
import cn.dongyeshengzhen.framework.model.PageRequestModel;
import cn.dongyeshengzhen.portal.news.dao.NewsDao;
import cn.dongyeshengzhen.portal.news.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Service
public class NewsManager {
    @Autowired
    NewsDao newsDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public News findOne(Integer id) {
        return newsDao.findOne(id);
    }

    public List<News> findDisplayNews() {
        Page<News> page = findPage(1, null);
        List<News> newsList = page.getContent();
        if (page.getContent().size() > 5) {
            newsList = page.getContent().subList(0, 5);
        }
        return newsList;
    }

    public Page<News> findPage(Integer pageNumber, Integer type) {
        PageRequestModel pageRequestModel = new PageRequestModel();
        pageRequestModel.setPageNumber(pageNumber);
        pageRequestModel.setPageSize(10);
        pageRequestModel.setSortBy("createTime");
        pageRequestModel.setDirection("DESC");
        Specification<News> specification = newsDao.getSpecification(pageNumber, type);
        return newsDao.findAll(specification, pageRequestModel.toPageable());
    }

    public List<News> findNews(Integer type) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<News> criteriaQuery = criteriaBuilder.createQuery(News.class);
        Root<News> root = criteriaQuery.from(News.class);
        criteriaQuery.select(root);
        Predicate condition = criteriaBuilder.equal(root.get("type").as(Integer.class), type);
        criteriaQuery.where(condition);
        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("createTime")));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public void save(News news) {
        news.setCreateTime(new Date());
        if (news.getId() != null) {
            News tempContent = newsDao.findOne(news.getId());
            news.setCreateTime(tempContent.getCreateTime());
        }
        news.setUpdateTime(new Date());
        newsDao.save(news);
    }


    public List findAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<News> criteriaQuery = criteriaBuilder.createQuery(News.class);
        Root<News> root = criteriaQuery.from(News.class);
        criteriaQuery.select(root);
        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("createTime")));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public MsgModel delete(Integer id) {
        MsgModel msgModel = new MsgModel();
        try {
            newsDao.delete(id);
            msgModel.setStatus(MsgModel.SUCCESS);
            msgModel.setMessage("删除成功");
        } catch (Exception e) {
            msgModel.setStatus(MsgModel.FALSE);
            msgModel.setMessage("删除失败");
            return msgModel;
        }

        return msgModel;
    }
}
