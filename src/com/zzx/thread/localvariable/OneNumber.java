package com.zzx.thread.localvariable;

/**
 * @ClassName OneNumber
 * @Description
 * @Author zhangzx
 * @Date 2019/8/16 17:23
 * Version 1.0
 **/
public class OneNumber {

    public void receiverUserName(String userName) {
        int num = 0;
        if (userName.equals("a")) {
            num = 100;
        } else {
            num = 200;
        }
        System.out.println("userName:" + userName + " 数字是:" + num);
    }
}
