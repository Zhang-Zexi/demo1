package com.zzx.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName UserBHandler
 * @Description
 * @Author zhangzx
 * @Date 2019/6/24 17:59
 * Version 1.0
 **/
public class UserBHandler implements InvocationHandler {
    public UserBHandler(UserBImpl userB, DataValidateImpl dataValidate) {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
