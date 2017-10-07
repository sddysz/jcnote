package cn.dongyeshengzhen.framework.files.service;

import cn.dongyeshengzhen.framework.files.entity.Files;

import java.io.InputStream;

/**
 * Created by zhaoq on 2016/9/1.
 */
public interface IFilesManager {
    /**
     * 保存文件到临时目录
     *
     * @return
     */
    Files upload(String fileName, Long size, String contentType, InputStream inputStream);

//    /**
//     * 删除文件
//     *
//     * @param fileId
//     * @return
//     */
//    Boolean delete(String fileId);
//
//    /**
//     * 临时文件转存永久文件
//     *
//     * @param fileId
//     * @return
//     */
//    Boolean toPermanent(String fileId);
//
//    /**
//     * 获得本地读取URI
//     *
//     * @param fileId
//     * @return
//     */
//    String getLocalURI(String fileId);
//
//
//    /**
//     * 清理临时文件
//     *
//     * @return
//     */
//    String clearTemporary();
//
//    Files getFilesInfo(String fileId);

}
