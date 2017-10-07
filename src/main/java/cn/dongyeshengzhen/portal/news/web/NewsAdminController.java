package cn.dongyeshengzhen.portal.news.web;

import cn.dongyeshengzhen.portal.news.entity.News;
import cn.dongyeshengzhen.portal.news.service.NewsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by dongye on 2016/9/17.
 */
@Controller
@RequestMapping(value = "admin/news")
public class NewsAdminController {
    @Autowired
    private NewsManager newsManager;


    @RequestMapping(value = "list")
    public String edit(Model model) {

        model.addAttribute("newsList", newsManager.findAll());


        return "admin/news/list";
    }


    @RequestMapping(value = "edit")
    public String edit(Model model, Integer id) {


        if (id != null) {
            News news = newsManager.findOne(id);
            model.addAttribute("news", news);
        }

        return "admin/news/edit";
    }

    @RequestMapping(value = "save")
    public String save(Model model, News news) {
        newsManager.save(news);
        return "redirect:/admin/news/list";

    }

    @RequestMapping(value = "delete")
    public String delete(RedirectAttributes redirectAttributes, Integer id) {

        redirectAttributes.addFlashAttribute("message", newsManager.delete(id));
        return "redirect:/admin/news/list";

    }
}
