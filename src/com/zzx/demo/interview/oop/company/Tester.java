package com.zzx.demo.interview.oop.company;

/**
 * @ClassName Tester
 * @Description
 * @Author zhangzx
 * @Date 2019/1/8 20:19
 * Version 1.0
 **/
public class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 10000);
//        employee1.name = "John";
//        employee1.salary = 10000;

        Employee employee2 = new Employee("Mary", 0);
//        employee1.name = "Mary";
        Employee employee3 = new Employee("John");
        employee3.salary =10000;

        System.out.println("employee1 == employee3 ?" + (employee1 == employee3));
        System.out.println("employee1.equals(employee3) ?" + (employee1.equals(employee3) ));
        System.out.println(employee2);


    }
}
