package com.zzx.staticproxy;

import java.util.Date;

/**
 *
 * @ClassName StaticProxy.java
 * @Description 代理对象,与被代理对象实现同一个接口，这样就达到了隐藏了真正的目标对象，让客户觉得访问代理对象就是在方式真实的对象
 *
 */
class Proxy implements UserManager{

    private UserManagerImpl umi;

    public Proxy(UserManagerImpl umi){
        this.umi = umi;
    }

    @Override
    public void addUser(String userName) {
        //使用代理的一个好处是可以在对实际对象访问前进行一些必要的处理，控制了对实际对象的访问
        //在添加之前做一些日志操作
        System.out.println("添加之前，记录到日志里去……");
        umi.addUser(userName);
        //在添加之后也做一些日志操作
        System.out.println("记录成功！时间：" + new Date());
    }
}

public class StaticProxy {

    public static void main(String[] args) {
        //客户想访问实际对象，只需要访问实际对象的代理对象即可
        UserManager um = new Proxy(new UserManagerImpl());
        um.addUser("张三");
    }
}

