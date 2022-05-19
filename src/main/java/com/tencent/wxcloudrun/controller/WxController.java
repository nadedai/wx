package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.utils.WXPublicUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hht
 * 2022/5/19 9:15
 */

@Slf4j
@RestController
@RequestMapping("wx")
public class WxController {

    @RequestMapping("verify_token")
    public String verifyWXToken(HttpServletRequest request)  {
        log.info("verify_token");
        String msgSignature = request.getParameter("signature");
        String msgTimestamp = request.getParameter("timestamp");
        String msgNonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        if (WXPublicUtils.verifyUrl(msgSignature, msgTimestamp, msgNonce)) {
            return echostr;
        }
        return null;
    }
}
