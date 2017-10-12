package cn.dongyeshengzhen.cloudnote.user.service;

import cn.dongyeshengzhen.cloudnote.user.dao.UserDataDao;
import cn.dongyeshengzhen.cloudnote.user.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class UserDataManager {

    @Autowired
    UserDataDao userDataDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public UserData findOne(Integer id) {
        return userDataDao.findOne(id);
    }

}
