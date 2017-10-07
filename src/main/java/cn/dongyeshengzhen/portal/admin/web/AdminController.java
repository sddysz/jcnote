package cn.dongyeshengzhen.portal.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dongye on 2016/9/12.
 */
@Controller
@RequestMapping(value = "admin")
public class AdminController {

    @RequestMapping(value = "")
    public String index(){
        return "admin/index";
    }


}
