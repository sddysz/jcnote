package cn.dongyeshengzhen.framework.web.builder;

import cn.dongyeshengzhen.framework.web.taglib.builder.MenuTagBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dysz on 2016/9/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:/applicationContext.xml",
        "classpath:/persistence.xml"})
public class MenuTagBuilderTest {

    @Autowired
    MenuTagBuilder menuTagBuilder;

    @Test
    public void build() throws Exception {

    }
}