package cn.dongyeshengzhen.portal.content.dao;

import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by dongye on 2016/9/4.
 */
@Repository
public interface ContentTypeDao extends JpaRepository<ContentType, Integer>, JpaSpecificationExecutor<ContentType> {
    ContentType findByName(String name);
}
