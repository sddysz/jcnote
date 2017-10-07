package cn.dongyeshengzhen.portal.content.web;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import cn.dongyeshengzhen.framework.security.service.MenuManager;
import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import cn.dongyeshengzhen.portal.content.service.ContentManager;
import cn.dongyeshengzhen.portal.content.service.ContentTypeManager;
import cn.dongyeshengzhen.portal.news.entity.News;
import cn.dongyeshengzhen.portal.news.service.NewsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Controller
public class ContentController {
    @Autowired
    private MenuManager menuManager;
    @Autowired
    private ContentManager contentManager;
    @Autowired
    private ContentTypeManager contentTypeManager;
    @Autowired
    private NewsManager newsManager;

    //新闻动态
    @RequestMapping(value = "/infonews/{newsId}")
    public String news(  @PathVariable Integer newsId, Model model) {
        News news = newsManager.findOne(newsId);

        Content content = contentManager.findNewsContent(news.getType());
        List<Content> contentList = contentManager.findContents(content.getType());
        Menu menu = menuManager.findOne(content.getType().getMenu().getId());
        model.addAttribute("content", content);
        model.addAttribute("contentList", contentList);
        model.addAttribute("contentTypeList", menu.getContentTypeList());
        model.addAttribute("news", news);
        return "newsdetail";
    }

    //普通内容
    @RequestMapping(value = "/nav_{nav}/{contentType}/{id}")
    public String content(@PathVariable String nav, @PathVariable String contentType, @PathVariable Integer id, Model model) {
        Content content = contentManager.findOne(id);
        List<Content> contentList = contentManager.findContents(content.getType());
        Menu menu = menuManager.findOne(nav);
        model.addAttribute("content", content);
        model.addAttribute("contentList", contentList);
        model.addAttribute("contentTypeList", menu.getContentTypeList());
        if (content.getIsNews() != 0&&content.getIsNews() != 1) {

            return "content";
        } else {
            model.addAttribute("type",content.getIsNews());
            return "news";
        }
    }

    @RequestMapping(value = "/nav_{nav}/{typeName}")
    public String contentType(@PathVariable String nav, @PathVariable String typeName, Model model) {
        ContentType contentType = contentTypeManager.findOne(typeName);
        List<Content> contentList = contentManager.findContents(contentType);
        if (!contentList.isEmpty()) {
            return "redirect:/nav_" + nav + "/" + typeName + "/" + contentList.get(0).getId();
        } else {
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/nav_{nav}")
    public String nav(@PathVariable String nav, Model model) {

        Menu menu = menuManager.findOne(nav);
        if (!menu.getContentTypeList().isEmpty()) {
            return "redirect:/nav_" + nav + "/" + menu.getContentTypeList().get(0).getName();
        } else {
            return "redirect:/";
        }
    }

}
