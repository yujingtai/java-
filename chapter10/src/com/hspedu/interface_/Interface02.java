package com.hspedu.interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}

class A implements Ainterface {
    //如果一个类 implement（实现） 接口
    //需要将该接口的所有抽象方法都实现
    @Override
    public void hi() {
        System.out.println("hi");
    }
}