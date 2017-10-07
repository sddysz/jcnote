package cn.dongyeshengzhen.portal.news.web;

import cn.dongyeshengzhen.portal.news.entity.News;
import cn.dongyeshengzhen.portal.news.service.NewsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dongye on 2016/9/17.
 */
@Controller
@RequestMapping(value = "/news")
public class NewsController {
    @Autowired
    private NewsManager newsManager;


    @RequestMapping(value = "getList")
    @ResponseBody
    public Page<News> edit(Model model, Integer pageNumber, Integer type) {
        return newsManager.findPage(pageNumber, type);
    }


}
