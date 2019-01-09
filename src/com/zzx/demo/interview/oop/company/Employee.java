package com.zzx.demo.interview.oop.company;

import java.util.List;
import java.util.Objects;

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

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
//        this.name = name;
//        this.salary = 0;
        this(name, 0);
    }

    void doWork(){
        loadAllEmployees();
    }

    void getPaid(BankEndPoint bank) {
        bank.payment(name, salary);
        this.name = "Mary";
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }



    public static void loadAllEmployees() {
        //   Loads all employees from database.
//        this.name = "Mary";
//        Employee e = new Employee();
//        e.name = "Mary";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
