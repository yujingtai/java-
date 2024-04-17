package com.hspedu.extend;
/**
 * 讲解继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //注意查找关系
        //1、首先看子类是否有该属性
        //2、如果子类有该属性，并可以访问，则返回信息
        //3、如果子类没有，就往上看，查找父类，再找爷类
        System.out.println(son.getAge() );

    }
}
class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends GrandPa{
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() { //私有属性age不能直接访问，所以可以用该类的一个public方法来间接访问
        return age;
    }
}
class Son extends Father{
    String name = "大头儿子";
}
