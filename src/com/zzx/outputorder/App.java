package com.zzx.outputorder;

/**
 * @ClassName App
 * @Description
 * @Author zhangzx
 * @Date 2019/11/3 16:43
 * Version 1.0
 **/

public class App {

    private static App d = new App();
    private SubClass t = new SubClass();

    static
    {
        System.out.println(3);
    }

    public App()
    {
        System.out.println(4);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello");
    }
}

class SuperClass
{
    SuperClass()
    {
        System.out.println("构造SuperClass");
    }
}

class SubClass extends SuperClass
{
    static
    {
        System.out.println(1);
    }

    public SubClass()
    {
        System.out.println(2);
    }
}
