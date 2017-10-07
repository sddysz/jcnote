package cn.dongyeshengzhen.framework.security.dao;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by dongye on 2016/9/4.
 */
@Repository
public interface MenuDao extends JpaRepository<Menu, Integer>, JpaSpecificationExecutor<Menu> {
    Menu findByName(String name);
}
