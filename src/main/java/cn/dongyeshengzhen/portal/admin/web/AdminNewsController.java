package cn.dongyeshengzhen.portal.admin.web;

import cn.dongyeshengzhen.portal.firstPage.entity.FirstPage;
import cn.dongyeshengzhen.portal.firstPage.entity.FirstPageType;
import cn.dongyeshengzhen.portal.firstPage.service.FirstPageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dongye on 2016/9/24.
 */
@Controller
@RequestMapping(value = "/admin/firstpage/news")
public class AdminNewsController {

    @Autowired
    private FirstPageManager firstPageManager;

    @RequestMapping(value = "")
    public String newsList(Model model) {
        model.addAttribute("newsList", firstPageManager.findByType(FirstPageType.NEWS));
        model.addAttribute("newsName",FirstPageType.NEWSNAME);
        return "admin/firstpage/news/newslist";
    }

    @RequestMapping(value = "edit")
    public String newsEdit(Integer id, Model model) {
        if (id != 0) {
            model.addAttribute("news", firstPageManager.findOne(id));
        }
        return "admin/firstpage/news/newsedit";
    }

    @RequestMapping(value = "/save")
    public String save(Model model, FirstPage firstPage, Integer id) {
        firstPage.setId(id);
        try {
            firstPageManager.saveNews(firstPage);
        } catch (Exception e) {

        }

        return "redirect:/admin/firstpage/news";

    }

}
