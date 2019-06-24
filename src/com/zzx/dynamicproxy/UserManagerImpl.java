package com.zzx.dynamicproxy;

/**
 *
 * @ClassName StaticProxy.java
 * @Description 实际操作对象--被代理对象
 *
 */
class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String userName) {
        System.out.println("添加用户成功!用户为：" + userName);

    }

}
