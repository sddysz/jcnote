package cn.dongyeshengzhen.framework.utils;

import org.apache.commons.lang.RandomStringUtils;

/**
 * 生成数据库名称，用于根据租户信息取得租户数据库
 * Created by zhaoq on 2015/12/27.
 */
public class DataSchemaCodeGenerator {
    private final static String PREFIX = "db_";

    public static String generatDataSchemaCode(){
            return PREFIX + RandomStringUtils.random(32, true, true);
    }

    public static String generatRandomCode(){
        return RandomStringUtils.random(64, true, true);
    }
}
