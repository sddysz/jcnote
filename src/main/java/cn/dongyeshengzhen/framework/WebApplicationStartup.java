package cn.dongyeshengzhen.framework;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by zhaoq on 2016/4/9.
 */
public class WebApplicationStartup implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("....................服务启动成功.............................");
    }
}
