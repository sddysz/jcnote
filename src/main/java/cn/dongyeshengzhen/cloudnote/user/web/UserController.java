package cn.dongyeshengzhen.cloudnote.user.web;

import cn.dongyeshengzhen.cloudnote.user.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserManager userManager;
}
