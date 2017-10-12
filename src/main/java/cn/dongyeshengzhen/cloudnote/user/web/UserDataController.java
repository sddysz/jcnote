package cn.dongyeshengzhen.cloudnote.user.web;

import cn.dongyeshengzhen.cloudnote.user.service.UserDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserDataController {
    @Autowired
    private UserDataManager userDataManager;
}
