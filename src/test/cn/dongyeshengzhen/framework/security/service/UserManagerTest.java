package cn.dongyeshengzhen.framework.security.service;

import cn.dongyeshengzhen.framework.security.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/applicationContext.xml",
        "classpath:/applicationContext-security.xml",
        "classpath:/persistence.xml"})
public class UserManagerTest {

    @Autowired
    UserManager userManager;

    @Test
    public void save() throws Exception {

        User user=userManager.findUserByName("sddysz@126.com");
        user.setPassword("123456");
        userManager.save(user);

    }

}