package com.tencent.wxcloudrun.utils;

/**
 * @author: hht
 * 2022/5/19 9:48
 */
public class WXPublicUtils {
    public static boolean verifyUrl(String msgSignature, String timeStamp, String nonce)
            throws AesException {
        // 这里的 WXPublicConstants.TOKEN 填写你自己设置的Token就可以了
        String signature = SHA1.getSHA1(WXPublicConstants.TOKEN, timeStamp, nonce);
        if (!signature.equals(msgSignature)) {
            throw new AesException(AesException.ValidateSignatureError);
        }
        return true;
    }
}
