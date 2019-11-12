package com.zzx.hashcode;

/**
 * @ClassName Employee
 * @Description
 * @Author zhangzx
 * @Date 2019/11/12 10:44
 * Version 1.0
 **/
public class Employee extends Person{
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee(String name,int id){
        super(name);
        this.id = id;
    }
    /**
     * 重写equals()方法
     */
    public boolean equals(Object object){
        if(object instanceof Employee){
            Employee e = (Employee) object;
            return super.equals(object) && e.getId() == id;
        }
        return false;
    }
}