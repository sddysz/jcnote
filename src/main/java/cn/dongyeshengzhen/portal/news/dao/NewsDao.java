package cn.dongyeshengzhen.portal.news.dao;

import cn.dongyeshengzhen.portal.content.dao.ContentDaoExtend;
import cn.dongyeshengzhen.portal.news.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by dongye on 2016/9/28.
 */
public interface NewsDao extends JpaRepository<News, Integer>, JpaSpecificationExecutor<News>,NewsDaoExtend {
}
