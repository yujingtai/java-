package com.hspedu.interface_;

public interface Ainterface {
    //写属性
    public int n1 = 10;
    //写方法（1.抽象方法、2默认实现方法、3静态方法）
    //在接口中，抽象方法可以省略 abstract 关键字
    public void hi();//抽象方法

    //在jdk8后，可以有 默认实现方法 ，需要使用default关键字修饰
    default public void ok() {//不能写上abstract关键字
        System.out.println("ok");
    }
    //还可以是静态方法
    public static void hello() { //不能写上 abstract 关键字
        System.out.println("hello");
    }
}
