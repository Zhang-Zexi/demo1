package com.zzx.demo.interview.oop.company;

import com.zzx.demo.interview.oop.company.Employee;

/**
 * @ClassName Accouting
 * @Description
 * @Author zhangzx
 * @Date 2019/1/8 20:11
 * Version 1.0
 **/
public class Accouting {
//    BankEndPoint bank;
    void payAll() {
//        Employee.loadAllEmployees();
        for (Employee employee : Employee.allEmployees) {
//            employee.getPaid(bank);
            employee.loadAllEmployees();
//            Employee.getPaid(bank);
        }
    }



}
