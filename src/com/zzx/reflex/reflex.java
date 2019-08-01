package com.zzx.reflex;

/**
 * @ClassName reflex
 * @Description 反射的使用Demo
 * @Author zhangzx
 * @Date 2019/8/1 14:43
 * Version 1.0
 **/
public class reflex {

    public static void main(String[] args) {
        // 1.Object -> getClass();
        Student stu = new Student();
        Class stuClass = stu.getClass();// 获取Class对象
        System.out.println(stuClass.getName());

        // 2.任何数据类型（包括基本数据类型），都有一个“静态的”class属性
        Class stuClass2 = Student.class;

        // 判断第一个获取的Class对象和第二个中方式获取的是否是同一个
        System.out.println(stuClass == stuClass2);//

        // 3.通过Class类的静态方法: forName(String className) --常用
        try {
            Class stuClass3 = Class.forName("com.zzx.reflex.Student");//必须是真实的路径，就是带包名的类路径
            System.out.println(stuClass3 == stuClass2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 运行期间，一个类只有一个Class对象产生
/** 三种方式常用第三种
 * 第一种对象都有了还要反射干嘛？
 * 第二种需要导入类的包，依赖太强，不导包就报错
 * 第三种，一个字符串可以传入也可以写在配置文件等多种方法
**/