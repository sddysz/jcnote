package cn.dongyeshengzhen.cloudnote.note.web;

import cn.dongyeshengzhen.cloudnote.note.service.NoteManager;
import cn.dongyeshengzhen.cloudnote.user.service.UserDataManager;
import cn.dongyeshengzhen.framework.security.shiro.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/note")
public class NoteController {
    @Autowired
    private NoteManager noteManager;
    @Autowired
    private UserDataManager userDataManager;

    @RequestMapping(value = "")
    public String note(Model model) {


        model.addAttribute("isAdmin", true);
        model.addAttribute("userInfo", userDataManager.findOne(ShiroUtils.getUserId().intValue()));
        model.addAttribute("notebooks", null);
        model.addAttribute("shareNotebooks", null);
        model.addAttribute("sharedUserInfos", null);
        model.addAttribute("notes", null);
        model.addAttribute("noteContentJson", null);
        model.addAttribute("noteContent", null);
        model.addAttribute("tags", null);
        model.addAttribute("globalConfigs", null);
        model.addAttribute("openRegister", true);
        model.addAttribute("locale", "zh-cn");
        model.addAttribute("UrlPrefix", "127.0.0.1:8080");
        return "note/note";
    }
}
