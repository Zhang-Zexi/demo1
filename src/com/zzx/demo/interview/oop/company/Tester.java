package com.zzx.demo.interview.oop.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

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

//        employee2 = new Manager("Mary", 400000, Arrays.asList(employee1));
        System.out.println("employee1 == employee3 ?" + (employee1 == employee3));
        System.out.println("employee1.equals(employee3) ?" + (employee1.equals(employee3) ));
        System.out.println(employee2);

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("Print using for each");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Testing managers");
        Employee manager = new Manager("Tony", 100000);
        employees.add(manager);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
