package cn.dongyeshengzhen.framework.security.dao;

import cn.dongyeshengzhen.framework.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 用户持久化类
 *
 * @author yuqs
 * @since 0.1
 */
@Repository
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    User findByUsername(String username);

    int countByUsername(String username);
}
