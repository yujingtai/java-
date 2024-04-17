package com.hspedu.poly_.objectpoly.DynamicBinding;

import java.sql.SQLOutput;

/**
 * java的动态绑定机制
 * 1、当调用方法时，该方法会和该对象的 内存地址/运行类型 绑定
 * 2、当调用属性时，没有动态绑定机制，哪里声明，哪里使用！！！
 *
 * 方法和运行类型紧密相连
 * 属性在直接调用时才会与编译类型有关
 * 当然，这并不与继承中的查找关系相悖，子类中的属性或方法如果查找不到那么就要往上一级继续寻找
 */


public class DynamicBinding {//动态绑定机制
    public static void main(String[] args) {
        //向上转换
        //a的编译类型是A 运行类型是B
        A a = new B();
        System.out.println(a.sum());//40 —>30
        System.out.println(a.sum1());//30 ->20
    }
}

class A {
    public int i = 10;
    public int sum() {
        return getl() + 10;
    }
    public int sum1() {
        return i + 10;//属性是没有动态绑定的，使用这里声明的i ，也就是10
    }
    public int getl() {
        return i;
    }
 }

class B extends A {
    public int i = 20;
//    public int sum() {
//        return getl() + 20;
//    }
//    public int sum1() {
//        return i + 10;
//    }
    public int getl() {
        return i;
    }
}
