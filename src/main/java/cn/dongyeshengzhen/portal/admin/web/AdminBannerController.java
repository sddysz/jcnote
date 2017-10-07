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
@RequestMapping(value = "/admin/firstpage")
public class AdminBannerController {

    @Autowired
    private FirstPageManager firstPageManager;

    @RequestMapping(value = "banner")
    public String bannerList(Model model) {
        model.addAttribute("bannerList", firstPageManager.findByType(FirstPageType.BANNER));
        return "admin/firstpage/banner/bannerlist";
    }

    @RequestMapping(value = "banner/edit")
    public String bannerEdit(Integer id, Model model) {
        if (id!=0){
            model.addAttribute("banner",firstPageManager.findOne(id));
        }
        return "admin/firstpage/banner/banneredit";
    }

    @RequestMapping(value = "/banner/save")
    public String save(Model model, FirstPage firstPage,Integer id) {
            firstPage.setId(id);
        firstPageManager.saveBanner(firstPage);
        return "redirect:/admin/firstpage/banner";

    }
    @RequestMapping(value = "/banner/delete")
    public String delete(Model model, Integer id) {
        firstPageManager.delete(id);
        return "redirect:/admin/firstpage/banner";

    }
}
