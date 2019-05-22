/*
package com.jk.shiro;


import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;

import javax.security.auth.Subject;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class MyFormAuthziction extends FormAuthenticationFilter {
    */
/**
     * 重写成功登陆方法
     * @param token
     * @param subject
     * @param request
     * @param response
     * @return
     *//*

    public Boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws IOException {
       //清空原有路径 跳转到下一个路径
        SavedRequest savedRequest = WebUtils.getAndClearSavedRequest(request);
        if(savedRequest!=null) {
            String requestUrl = savedRequest.getRequestUrl();
            //如果上一次请求路径为空,则跳转到登陆成功页面
            if ("/".equals(requestUrl)) {
                WebUtils.redirectToSavedRequest(request, response, "/treelist");
            } else {
                WebUtils.redirectToSavedRequest(request, response, requestUrl);
            }
        }else {
            WebUtils.redirectToSavedRequest(request, response, "/treelist");
        }
        return  false;
    }
}
*/
