package cn.dongyeshengzhen.cloudnote.notebook.web;

import cn.dongyeshengzhen.cloudnote.note.service.NoteManager;
import cn.dongyeshengzhen.cloudnote.notebook.service.NotebookManager;
import cn.dongyeshengzhen.cloudnote.user.service.UserDataManager;
import cn.dongyeshengzhen.framework.security.shiro.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/notebook")
public class NotebookController {
    @Autowired
    private NotebookManager notebookManager;
    @Autowired
    private UserDataManager userDataManager;


}
