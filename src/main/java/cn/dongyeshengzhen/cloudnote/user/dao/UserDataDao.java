package cn.dongyeshengzhen.cloudnote.user.dao;


import cn.dongyeshengzhen.cloudnote.user.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataDao extends JpaRepository<UserData, Integer>, JpaSpecificationExecutor<UserData> {

}

