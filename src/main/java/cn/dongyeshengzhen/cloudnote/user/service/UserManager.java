package cn.dongyeshengzhen.cloudnote.user.service;

import cn.dongyeshengzhen.cloudnote.user.dao.UserDao;
import cn.dongyeshengzhen.cloudnote.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class UserManager {

    @Autowired
    UserDao userDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public User findOne(Integer id) {
        return userDao.findOne(id);
    }

}
