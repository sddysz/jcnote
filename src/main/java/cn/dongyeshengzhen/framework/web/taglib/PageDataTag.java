package cn.dongyeshengzhen.framework.web.taglib;

import cn.dongyeshengzhen.framework.web.TagDTO;
import cn.dongyeshengzhen.framework.web.taglib.builder.PageDataTagBuilder;
import org.springframework.data.domain.Page;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.tags.RequestContextAwareTag;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspWriter;

/**
 * Created by zhaoq on 2016/3/21.
 */
public class PageDataTag extends RequestContextAwareTag {
    // Spring的上下文
    private WebApplicationContext springContext;
    // Servlet的上下文
    private ServletContext servletContext = null;
    private TagDTO dto;


    private Page data;

    public Page getData() {
        return data;
    }

    public void setData(Page data) {
        this.data = data;
    }

    @Override
    protected int doStartTagInternal() throws Exception {
        String requestUri = this.getRequestContext().getRequestUri();
        //获取ServletContext
        servletContext = pageContext.getServletContext();
        //获取spring上下文
        springContext = getRequestContext().getWebApplicationContext();
        JspWriter writer = pageContext.getOut();
        if (springContext == null) {
            writer.write("获取页码失败");
        } else {
            TagDTO dto = new TagDTO(servletContext);
            dto.setProperty(PageDataTagBuilder.TOTAL_RECORDS, this.data.getTotalElements() + "");
            dto.setProperty(PageDataTagBuilder.TOTAL_PAGES, this.data.getTotalPages() + "");
            dto.setProperty(PageDataTagBuilder.PAGE_NUMBER,  this.data.getNumber() + "");
            dto.setProperty(PageDataTagBuilder.PAGE_SIZE,  this.data.getSize() + "");
            dto.setSpringContext(springContext);
            PageDataTagBuilder builder = springContext.getBean(PageDataTagBuilder.class);
            writer.write(builder.build(dto));
        }
        return 0;
    }
}
