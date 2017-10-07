package cn.dongyeshengzhen.framework.security.web;

import cn.dongyeshengzhen.framework.model.MsgModel;
import cn.dongyeshengzhen.framework.security.entity.User;
import cn.dongyeshengzhen.framework.security.service.UserManager;
import cn.dongyeshengzhen.framework.security.shiro.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * 用户管理Controller
 *
 * @author yuqs
 * @since 0.1
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {
    //注入用户管理对象
    @Autowired
    private UserManager userManager;
    //注入角色管理对象

    @RequestMapping(value = "edit")
    public String edit(Model model) {
        return "admin/user/editPassword";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String savePwd(RedirectAttributes redirectAttributes, String newPwd) {
        try {
            User user = ShiroUtils.getUser();
            user.setPassword(newPwd);
            userManager.save(user);
        } catch (Exception e){
            MsgModel msgModel=new MsgModel();
            msgModel.setStatus(MsgModel.EXCEPTION);
            msgModel.setMessage("修改密码失败");
            redirectAttributes.addFlashAttribute("message",msgModel);
        }
        return "redirect:/admin";
    }

}
