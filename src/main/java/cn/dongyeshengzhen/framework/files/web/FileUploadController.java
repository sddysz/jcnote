package cn.dongyeshengzhen.framework.files.web;

import cn.dongyeshengzhen.framework.files.entity.Files;
import cn.dongyeshengzhen.framework.files.service.IFilesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by dongye on 2016/8/31.
 */
@Controller
@RequestMapping(value = "/files")
public class FileUploadController {
    @Autowired
    private IFilesManager filesManager;

    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Files upload(
            @RequestParam("upload") MultipartFile multipartFile) throws IOException {
        return filesManager.upload(multipartFile.getOriginalFilename(), multipartFile.getSize(),multipartFile.getContentType(), multipartFile.getInputStream());
    }



}