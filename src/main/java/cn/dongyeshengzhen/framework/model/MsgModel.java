package cn.dongyeshengzhen.framework.model;

import java.util.HashMap;
import java.util.List;

/**
 * Created by YANGCY on 2016/8/8.
 */
public class MsgModel {
    public static int SUCCESS = 1;
    public static int FALSE = 0;
    public static int EXCEPTION=2;

    private Integer status;
    private String message;
    private List result;
    private Integer id;
    private String idStr;

    private String title;
    private HashMap<String,Object> params;

    public MsgModel() {

    }

    public MsgModel(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public MsgModel(Integer status, String message, List result, Integer id, String idStr) {
        this.status = status;
        this.message = message;
        this.result = result;
        this.id = id;
        this.idStr = idStr;
    }

    public MsgModel(Integer status, String message, List result, Integer id, String idStr, HashMap<String,Object> params) {
        this.status = status;
        this.message = message;
        this.result = result;
        this.id = id;
        this.idStr = idStr;
        this.params = params;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public HashMap<String,Object> getParams() {
        return params;
    }

    public void setParams(HashMap<String,Object> params) {
        this.params = params;
    }
}
