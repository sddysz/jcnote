package cn.dongyeshengzhen.cloudnote.home.web;

import cn.dongyeshengzhen.cloudnote.user.service.UserDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Autowired
    private UserDataManager userDataManager;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
