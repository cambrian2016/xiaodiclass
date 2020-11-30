package net.htwater.xiaodiclass.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

    //md5加密 工具类
    public static String getMD5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes("utf-8"));
            String md5 = new BigInteger(1, md.digest()).toString(16);
            for (int i = 0; i < 32 - md5.length(); i++) {
                md5 = "0" + md5;
            }
            return md5;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
