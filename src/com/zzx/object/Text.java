package com.zzx.object;

/**
 * @ClassName Student
 * @Description
 * @Author zhangzx
 * @Date 2019/7/4 16:17
 * Version 1.0
 **/
class Student
{
    String name;
    int age;
    //重写父类（Object类）中的equals方法
    public boolean equals()
    {
        boolean temp;
        Student s1 = new Student();
        s1.name="张三";s1.age=12;
        Student s2 = new Student();
        s2.name="张三";s2.age=12;
        System.out.println("s1的哈希码："+s1.hashCode());
        System.out.println("s2的哈希码："+s2.hashCode());
        if((s1.name.equals(s2.name))&&(s1.age==s2.age))
        {
            temp = true;
        }
        else
        {
            temp = false;
        }
        return temp;
    }
    //重写hashCode()方法
    public int hashCode()
    {
        return age*(name.hashCode());
    }
}

public class Text{
    public static void main(String[] args)
    {
        Student s3 = new Student();
        System.out.println(s3.equals()?"s1和s2是同一人":"s1和s2不是同一人");
    }
}