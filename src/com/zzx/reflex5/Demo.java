package com.zzx.reflex5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName Demo
 * @Description 反射运行配置文件内容
 * @Author zhangzx
 * @Date 2019/8/1 17:44
 * Version 1.0
 **/
public class Demo {

    public static void main(String[] args) throws Exception {
        Class stuClass = Class.forName(getValue("className"));
        Method m = stuClass.getMethod(getValue("methodName"));
        m.invoke(stuClass.getConstructor().newInstance());
    }

    private static String getValue(String key) throws IOException {
        String root = System.getProperty("user.dir");
        String FileName = "pro.txt";
        String filePath = root + File.separator +"src" + File.separator + FileName;
//        String filePath = "D:\\02-DemoWorkSpace\\06-Demo\\demo1\\src\\pro.txt";
        Properties pro = new Properties();//获取配置文件的对象
        FileReader in = new FileReader(filePath);// 获取输入流
        pro.load(in);// 讲流加载到配置文件中
        in.close();
        return pro.getProperty(key);//返回根据key获取的value值
    }
}
