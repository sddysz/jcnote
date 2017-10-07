package cn.dongyeshengzhen.framework.files.service;

import cn.dongyeshengzhen.framework.files.dao.FilesDao;
import cn.dongyeshengzhen.framework.files.entity.Files;
import cn.dongyeshengzhen.framework.utils.DateUtils;
import cn.dongyeshengzhen.framework.utils.FileSystemUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

/**
 * Created by zhaoq on 2016/8/31.
 */
@Service
public class DataBaseFilesManager implements IFilesManager {

    @Autowired
    private FilesDao filesDao;

    private String WEB_ROOT_LOCAL_PATH = FileSystemUtil.getWebRootLocalPath();
    @Value("#{propertiesReader[local_path]}")
    private String LOCAL_PATH;

    @Override
    public Files upload(String fileName, Long size, String contentType, InputStream inputStream) {
        //本地存储目录
        String path = WEB_ROOT_LOCAL_PATH + LOCAL_PATH;
        //本地相对路径，根据月份分目录保存
        String localPath = "";
        //判断当前目录是否存在,不存在则创建
        File dir = new File(path + localPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //本地相对路径文件名
        localPath = localPath + "/" + UUID.randomUUID().toString()+"."+FileSystemUtil.getExtName(fileName);
        //本地绝对路径文件名
        String filePath = path + localPath;
        //创建文件
        File tempFile = new File(filePath);
        try {
            //保存文件
            FileUtils.copyInputStreamToFile(inputStream, tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建数据记录
        Files files = new Files();
        files.setFileName(fileName);
        files.setSize(size);
        files.setLocalPath(LOCAL_PATH+localPath);
        //默认设置临保存,临时保存7天，七天后清除数据和文件
        files.setType(Files.TEMPORARY);
        files.setContentType(contentType);
        files.setCreateTime(new Date());
        return files;
    }


}
