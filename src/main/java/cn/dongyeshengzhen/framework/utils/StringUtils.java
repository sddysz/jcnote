package cn.dongyeshengzhen.framework.utils;

/**
 * Created by YANGCY on 2016/7/3.
 */
public class StringUtils {
    public static boolean isNumeric(String str){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
