package com.zzx.dynamicproxy;

class PersonImpl implements Person{

    @Override
    public void consume(Float money) {
        System.out.println("消费"+ money + "元");

    }

}