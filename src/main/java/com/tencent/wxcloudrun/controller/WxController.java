package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hht
 * 2022/5/19 9:15
 */

@RestController
@RequestMapping("wx")
public class WxController {

    @RequestMapping
    public String wx(String token){
//        data = web.input()
//        if len(data) == 0:
//        return "hello, this is handle view"
//        signature = data.signature
//        timestamp = data.timestamp
//        nonce = data.nonce
//        echostr = data.echostr
//        token = "xxxx" #请按照公众平台官网\基本配置中信息填写
//
//        list = [token, timestamp, nonce]
//        list.sort()
//        sha1 = hashlib.sha1()
//        map(sha1.update, list)
//        hashcode = sha1.hexdigest()
//        print "handle/GET func: hashcode, signature: ", hashcode, signature
//        if hashcode == signature:
//        return echostr
//            else:
//        return ""
        return token;
    }
}
