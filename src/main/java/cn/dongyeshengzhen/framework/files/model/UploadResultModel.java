package cn.dongyeshengzhen.framework.files.model;

/**
 * Created by zhaoq on 2016/8/31.
 */
public class UploadResultModel {
    private Boolean result = false;
    private String fileId = "";
    private String message = "";

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
