package com.zzx.demo.interview.oop.company;

import java.util.List;

/**
 * @ClassName Manager
 * @Description
 * @Author zhangzx
 * @Date 2019/1/28 16:51
 * Version 1.0
 **/
public class Manager extends Employee {
    List<Employee> reporters;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void getPaid(BankEndPoint bank) {
        super.getPaid(bank);
        getStocks();
    }

    @Override
    void doWork() {
        Employee worker = selectReporters();
        worker.doWork();

    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    private Employee selectReporters() {
        return null;
    }


    private void getStocks() {
    }


}
