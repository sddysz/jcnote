package cn.dongyeshengzhen.cloudnote.user.dao;


import cn.dongyeshengzhen.cloudnote.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

}

