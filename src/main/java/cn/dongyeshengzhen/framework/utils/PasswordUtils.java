package cn.dongyeshengzhen.framework.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhaoq on 2015/12/27.
 */
public class PasswordUtils {
    /**
     * SHA加密
     *
     * @param password
     * @return
     * @throws Exception
     */
    public static String encryptSHA(String password){
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        sha.update(password.getBytes());
        byte[] bytes = sha.digest();
        BigInteger bigInteger = new BigInteger(bytes);
        return bigInteger.toString(32);
    }
}
