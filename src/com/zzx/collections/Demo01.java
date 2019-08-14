package com.zzx.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Demo01
 * @Description
 * @Author zhangzx
 * @Date 2019/8/14 11:50
 * Version 1.0
 **/
public class Demo01 {
    static List<Emp> empList;
    static
    {
        Emp emp1 = new Emp(2,"Guan YunChang");
        Emp emp2 = new Emp(3,"Zhang Fei");
        Emp emp3 = new Emp(1,"Liu Bei");
        empList = Arrays.asList(emp1,emp2,emp3);
    }
    public static void main(String[] args) {
        Collections.sort(empList);
        System.out.println(Arrays.toString(empList.toArray()));// 按员工名称逆序



//        System.out.println("before sort");
//        System.out.println(Arrays.toString(empList.toArray()));
//        Collections.sort(empList, new Comparator<Emp>() {
//            @Override
//            public int compare(Emp o1, Emp o2) {
//                /*按员工编号正序排序*/
//                return o1.getEmpno()-o2.getEmpno();
//                /*按员工编号逆序排序*/
//                //return o2.getEmpno()-o1.getEmpno();
//                /*按员工姓名正序排序*/
//                //return o1.getEname().compareTo(o2.getEname());
//                /*按员工姓名逆序排序*/
//                //return o2.getEname().compareTo(o1.getEname());
//            }
//        });
//        System.out.println("after sort");
//        System.out.println(Arrays.toString(empList.toArray()));
    }
}
