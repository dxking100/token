package com.duideduo.token;

import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.binary.Base64;
import com.duideduo.http.HttpUtil;
import com.duideduo.aes.AESUtil;

public class TokenUtil {

    public static String WALLET_AES_KEY = "WALLET_AES_KEY";
    public static String SHOP_AES_KEY = "SHOP_AES_KEY";
    public static String ROUND_SHOP_AES_KEY = "ROUND_SHOP_AES_KEY";
    public static String CHAT_AES_KEY = "CHAT_AES_KEY";

    //验证token
    public static boolean checkToken() throws Exception {
        HttpUtil.httpsGet("验 证服务"); // 返回人员信息
        return true;
    }

    //生成token
    public static String getWalletServiceToken(Object userInfo){
        return Base64.encodeBase64String(AESUtil.encode(JSON.toJSONString(userInfo),WALLET_AES_KEY));
    }
    public static String getShopServiceToken(Object userInfo){
        return Base64.encodeBase64String(AESUtil.encode(JSON.toJSONString(userInfo),SHOP_AES_KEY));
    }
    public static String getRoundShopServiceToken(Object userInfo){
        return Base64.encodeBase64String(AESUtil.encode(JSON.toJSONString(userInfo),ROUND_SHOP_AES_KEY));
    }
    public static String getChatServiceToken(Object userInfo){
        return Base64.encodeBase64String(AESUtil.encode(JSON.toJSONString(userInfo),CHAT_AES_KEY));
    }
}
