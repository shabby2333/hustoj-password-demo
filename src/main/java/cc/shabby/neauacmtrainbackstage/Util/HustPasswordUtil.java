package cc.shabby.neauacmtrainbackstage.Util;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * HUST Password Java实现版 by 杨大佬
 * @author codelover
 */
@Component
public class HustPasswordUtil {


    private static String getMd5(String str) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(str.getBytes());
        byte[] md5Bytes = md5.digest();
        StringBuilder res = new StringBuilder();
        for (byte md5Byte : md5Bytes) {
            int temp = md5Byte & 0xFF;
            if (temp <= 0XF) { // 转化成十六进制不够两位，前面加零
                res.append("0");
            }
            res.append(Integer.toHexString(temp));
        }
        return res.toString();
    }

    private static byte[] encode(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(str.getBytes());
            return (messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] byteMergerAll(byte[]... values) {
        int lengthByte = 0;
        for (byte[] value : values) {
            lengthByte += value.length;
        }
        byte[] allByte = new byte[lengthByte];
        int countLength = 0;
        for (byte[] b : values) {
            System.arraycopy(b, 0, allByte, countLength, b.length);
            countLength += b.length;
        }
        return allByte;
    }

    /***
     * HUST OJ的密码校验方法
     * @param password 密码
     * @param saved 保存(加密后)的密码
     * @return 密码是否正确
     */
    public static boolean pwCheck(String password,String saved)
    {
        String hash = "";
        String svd = new String(org.apache.commons.codec.binary.Base64.decodeBase64(saved), StandardCharsets.UTF_8);
        String salt = svd.substring(svd.length()-4,svd.length());

        try
        {
            byte[] t = encode(getMd5(password) + salt);
            String tmp = new String(t, StandardCharsets.UTF_8) + salt;
            hash = new String(org.apache.commons.codec.binary.Base64.encodeBase64(byteMergerAll(t,salt.getBytes())), StandardCharsets.UTF_8);
        }catch(Exception e){
            System.out.println(e.toString());
        }

        return hash.substring(0, 32).equals(saved);

    }

}
