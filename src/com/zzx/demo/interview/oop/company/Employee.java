package com.zzx.demo.interview.oop.company;

import java.util.List;

/**
 * @ClassName Employee
 * @Description 静态变量和静态方法
 * @Author zhangzx
 * @Date 2019/1/8 20:01
 * Version 1.0
 **/
public class Employee {
    public static List<Employee> allEmployees;

    String name;
    int salary;
    void doWork(){
        loadAllEmployees();
    }

//    void getPaid(BankEndPoint bank) {
//        bank.payment(name, salary);
//        this.name = "Mary";
//    }

    public static void loadAllEmployees() {
        //   Loads all employees from database.
//        this.name = "Mary";
//        Employee e = new Employee();
//        e.name = "Mary";
    }
}
