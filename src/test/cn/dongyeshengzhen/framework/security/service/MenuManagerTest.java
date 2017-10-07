package cn.dongyeshengzhen.framework.security.service;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dongye on 2016/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/applicationContext.xml",
        "classpath:/persistence.xml"})
public class MenuManagerTest {

    @Autowired
    MenuManager menuManager;

    @Test
    public void findAll() throws Exception {
        List<Menu> list = menuManager.findAll();
        System.out.println(list.size());
        for (Menu m : list) {
            System.out.println(String.valueOf(m.getId()) + m.getName() + m.getOrder());
            System.out.println(m.getContentTypeList().size());
        }


    }
}