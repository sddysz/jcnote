package cn.dongyeshengzhen.portal.firstPage.dao;

import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.firstPage.entity.FirstPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by dongye on 2016/9/4.
 */
@Repository
public interface FirstPageDao extends JpaRepository<FirstPage, Integer>, JpaSpecificationExecutor<FirstPage> {
}
