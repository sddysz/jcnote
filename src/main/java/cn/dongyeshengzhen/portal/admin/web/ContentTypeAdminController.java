package cn.dongyeshengzhen.portal.admin.web;

import cn.dongyeshengzhen.framework.model.MsgModel;
import cn.dongyeshengzhen.framework.security.service.MenuManager;
import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import cn.dongyeshengzhen.portal.content.service.ContentManager;
import cn.dongyeshengzhen.portal.content.service.ContentTypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by dongye on 2016/9/17.
 */
@Controller
@RequestMapping(value = "admin/contentType")
public class ContentTypeAdminController {
    @Autowired
    private ContentManager contentManager;
    @Autowired
    private ContentTypeManager contentTypeManager;
    @Autowired
    private MenuManager menuManager;

    @RequestMapping(value = "list")
    public String edit(Model model) {

        model.addAttribute("contentTypeList", contentTypeManager.findAll());


        return "admin/contentType/list";
    }


    @RequestMapping(value = "edit")
    public String edit(Model model, @RequestParam(value = "id", required = false) Integer id) {

        if (id != null) {
            model.addAttribute("contentType", contentTypeManager.findOne(id));
        }
        model.addAttribute("menuList", menuManager.findAll());

        return "admin/contentType/edit";
    }

    @RequestMapping(value = "save")
    public String save(RedirectAttributes redirectAttributes, ContentType contentType) {
        redirectAttributes.addFlashAttribute("msg", contentTypeManager.save(contentType));
        return "redirect:/admin/contentType/list";

    }

    @RequestMapping(value = "delete")
    public String delete(RedirectAttributes redirectAttributes, Integer id) {
        MsgModel msg = contentTypeManager.delete(id);
        redirectAttributes.addFlashAttribute("msg", msg);
        return "redirect:/admin/contentType/list";

    }

}
