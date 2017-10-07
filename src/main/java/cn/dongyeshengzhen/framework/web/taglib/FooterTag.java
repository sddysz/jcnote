package cn.dongyeshengzhen.framework.web.taglib;

import cn.dongyeshengzhen.framework.web.TagDTO;
import cn.dongyeshengzhen.framework.web.taglib.builder.FooterTagBuilder;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.tags.RequestContextAwareTag;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspWriter;

/**
 * 系统首界面左栏导航菜单自定义标签
 * 该类继承RequestContextAwareTag，主要用于获取WebApplicationContext
 * @author yuqs
 * @since 0.1
 */
public class FooterTag extends RequestContextAwareTag {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3041636263647268721L;
	//Spring的上下文
	private WebApplicationContext springContext;
	//Servlet的上下文
	private ServletContext servletContext = null;

	/**
	 * 继承RequestContextAwareTag的doStartTagInternal方法，实际上是doStartTag的模板方法
	 */
	@Override
	protected int doStartTagInternal() throws Exception {
		String requestUri = this.getRequestContext().getRequestUri();
		//获取ServletContext
		servletContext = pageContext.getServletContext();
		//获取spring上下文
		springContext = getRequestContext().getWebApplicationContext();
		JspWriter writer = pageContext.getOut();
		if (springContext == null) {
			writer.write("获取菜单项失败");
		} else {
			TagDTO dto = new TagDTO(servletContext);
			dto.setProperty("requestUri", requestUri);
			dto.setSpringContext(springContext);
			FooterTagBuilder builder = springContext.getBean(FooterTagBuilder.class);
			writer.write(builder.build(dto));
		}
		return 0;
	}
//
//	@Override
//	public int doEndTag() throws JspException {
//		return super.doEndTag();
//	}
}
