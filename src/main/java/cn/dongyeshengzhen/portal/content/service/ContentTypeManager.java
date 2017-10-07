package cn.dongyeshengzhen.portal.content.service;

import cn.dongyeshengzhen.framework.model.MsgModel;
import cn.dongyeshengzhen.portal.content.dao.ContentTypeDao;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Service
public class ContentTypeManager {
    @Autowired
    ContentManager contentManager;
    @Autowired
    ContentTypeDao contentTypeDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public ContentType findOne(Integer id) {
        return contentTypeDao.findOne(id);
    }

    public ContentType findOne(String name) {
        return contentTypeDao.findByName(name);
    }

    public MsgModel save(ContentType contentType) {
        MsgModel msgModel = new MsgModel();
        try {
            contentType.setCreateTime(new Date());
            if (contentType.getId() != null) {
                ContentType tempContentType = contentTypeDao.findOne(contentType.getId());
                contentType.setCreateTime(tempContentType.getCreateTime());
            }
            contentType.setUpdateTime(new Date());
            contentTypeDao.save(contentType);
            msgModel.setStatus(MsgModel.SUCCESS);
        } catch (Exception e) {
            msgModel.setStatus(MsgModel.FALSE);
            msgModel.setMessage("保存失败");
            return msgModel;
        }
        return msgModel;
    }

    public List<ContentType> findAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ContentType> criteriaQuery = criteriaBuilder.createQuery(ContentType.class);
        Root<ContentType> root = criteriaQuery.from(ContentType.class);
        criteriaQuery.select(root);
        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("orderId")), criteriaBuilder.desc(root.get("updateTime")));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public MsgModel delete(Integer id) {
        MsgModel msgModel = new MsgModel();
        ContentType contentType = new ContentType();
        contentType.setId(id);
        try {
            List list = contentManager.findContents(contentType);
            if (!list.isEmpty()) {
                msgModel.setStatus(MsgModel.FALSE);
                msgModel.setMessage("此类型下仍有内容，不能删除");
                return msgModel;
            }

            contentTypeDao.delete(id);
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
