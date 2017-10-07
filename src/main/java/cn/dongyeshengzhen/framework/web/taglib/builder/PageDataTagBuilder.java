package cn.dongyeshengzhen.framework.web.taglib.builder;

import cn.dongyeshengzhen.framework.web.TagBuilder;
import cn.dongyeshengzhen.framework.web.TagDTO;
import org.springframework.stereotype.Component;

/**
 * 自定义分页标签处理类
 * @author yuqs
 * @since 0.1
 */
@Component
public class PageDataTagBuilder implements TagBuilder {
	public static final String TOTAL_RECORDS = "totalRecords";
	public static final String TOTAL_PAGES = "totalPages";
	public static final String PAGE_NUMBER = "pageNumber";
	public static final String PAGE_SIZE = "pageSize";
	public static final String LOOKUP = "lookup";
	//总记录数
	private String totalRecords;
	//总页数
	private String totalPages;
	//当前页数
	private int pageNumber;

	private String pageSize;
	//是否打开对话框的查询
	private String lookup;
	
	/**
	 * 获取DTO传递的参数，并依此构建分页的html信息
	 */
	@Override
	public String build(TagDTO dto) {
		this.totalRecords = dto.getProperty(TOTAL_RECORDS);
		this.totalPages = dto.getProperty(TOTAL_PAGES);
		this.pageNumber = Integer.parseInt(dto.getProperty(PAGE_NUMBER)) + 1;
		this.pageSize = dto.getProperty(PAGE_SIZE);
		this.lookup = dto.getProperty(LOOKUP);
		
		StringBuffer content = new StringBuffer();
		//构建分页详细信息，总记录数、总页数、当前页数
		content.append(buildPageMessage());
		//构建分页栏的上一页、下一页、首页、末页
		content.append(buildPageLink());
		content.append(buildFormInput());
		return content.toString();
	}

	private String buildFormInput() {
		StringBuilder sb = new StringBuilder();
		sb.append("<input name=\"pageNumber\" type=\"hidden\" value=\"1\"/>");
		sb.append(String.format("<input name=\"pageSize\" type=\"hidden\" value=\"%s\"/>", pageSize));
		return sb.toString();
	}

	/**
	 * 构建分页详细信息，总记录数、总页数、当前页数
	 * @return
	 */
	private String buildPageMessage() {
		return String.format("<div class=\"col-sm-5\">共 %s 记录&nbsp; 共 %s 页 &nbsp; 当前第 %s 页</div>", totalRecords, totalPages, pageNumber);
	}
	
	/**
	 * 构建分页栏的上一页、下一页、首页、末页
	 * @return
	 */
	private String buildPageLink() {
		int prePage = 0, nextPage = 0, pageNo = 1, totalPage = 1;
		try {
			//当前页
			pageNo = pageNumber;
			//总页数
			totalPage = Integer.parseInt(totalPages);
			//
			prePage = pageNo - 1;
			nextPage = pageNo + 1;
			prePage = prePage <= 0 ? 1 : prePage;
			nextPage = nextPage >= totalPage ? totalPage : nextPage;
		} catch(Exception e) {
			
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<div class=\"col-sm-7\"><ul class=\"pagination pull-right\" style=\"margin:0px;\">");
		sb.append(String.format("<li class=\"paginate_button previous %s\" page-index=\"1\"><a href=\"javascript:void(0);\">首页</a></li>", pageNumber == 1 ? "disabled":"" ));
		sb.append(String.format("<li class=\"paginate_button previous %s\" page-index=\"%s\"><a href=\"javascript:void(0);\">上一页</a></li>", pageNumber == 1 ? "disabled":"", prePage));
		int startPage = 1;
		int endPage = totalPage;
		if(totalPage > 10){
			startPage = totalPage / 2 - 4;
			endPage = startPage + 9;
		}
		for(int n = startPage;n <= endPage; n++){
			sb.append(String.format("<li class=\"paginate_button %s\" page-index=\"%s\"><a href=\"javascript:void(0);\">%s</a></li>", pageNo == n ? "active":"", n, n));
		}
		sb.append(String.format("<li class=\"paginate_button next %s\" page-index=\"%s\"><a href=\"javascript:void(0);\">下一页</a></li>", pageNo == totalPage ? "disabled":"", nextPage ));
		sb.append(String.format("<li class=\"paginate_button next %s\" page-index=\"%s\"><a href=\"javascript:void(0);\">尾页</a></li>", pageNo == totalPage ? "disabled":"" ,totalPage));

		return sb.toString();
	}

}
