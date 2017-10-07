package cn.dongyeshengzhen.framework.security.dao;

import cn.dongyeshengzhen.framework.security.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by dongye on 2016/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/applicationContext.xml",
        "classpath:/persistence.xml"})
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void findByUsername() throws Exception {
        User user=userDao.findByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void countByUsername() throws Exception {

    }
}