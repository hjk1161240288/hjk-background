/*
package com.jk.shiro;

import com.jk.model.PoitestBean;
import com.jk.service.PoitestBeanService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MyRealm extends AuthorizingRealm {
     @Autowired
     private PoitestBeanService poitestBeanService;
    //认证方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取到输入框输入的用户名
        String loginNumber = (String)token.getPrincipal();
        System.out.println(loginNumber);
        PoitestBean user = poitestBeanService.queryUserByName(loginNumber);
        System.out.println(user);
        if(user == null){
            //如果用户对象为空 抛出用户名错误异常
            throw new UnknownAccountException();
        }
        //认证器 第一个参数为用户名或用户对象会存入session中 第二个参数为密码 第三个参数为当前real名称
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user,user.getPassword(),this.getName());
        return simpleAuthenticationInfo;
    }

    //授权方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        //从session中获取到当前登录的用户对象
        //Object principal = SecurityUtils.getSubject().getPrincipal();
        */
/*UserBean user = (UserBean)principal.getPrimaryPrincipal();
        List<String> powerList = userService.queryPowerRemarkByuserId(user.getId());*//*

           List<String> reghtList = new ArrayList<String>();
//        reghtList.add("book:query");
//        reghtList.add("book:queryAll");
//        reghtList.add("book:add");
        //创建一个授权器
        SimpleAuthorizationInfo sai = new SimpleAuthorizationInfo();
        sai.addStringPermissions(reghtList);
        return sai;
    }

}
*/
