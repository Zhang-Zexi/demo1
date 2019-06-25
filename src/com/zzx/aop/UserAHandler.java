package com.zzx.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName UserAHandler
 * @Description
 * @Author zhangzx
 * @Date 2019/6/24 17:54
 * Version 1.0
 **/
public class UserAHandler implements InvocationHandler {
    public UserAHandler(UserAImpl userA, DataValidateImpl dataValidate) {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
