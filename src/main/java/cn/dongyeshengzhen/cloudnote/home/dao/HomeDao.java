package cn.dongyeshengzhen.cloudnote.home.dao;


import cn.dongyeshengzhen.cloudnote.user.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeDao extends JpaRepository<UserData, Integer>, JpaSpecificationExecutor<UserData> {

}

