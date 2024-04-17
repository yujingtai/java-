package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {

        /**
         * 1、首先考虑静态字段
         * 加载类的时候，static代码块的优先级 与 static属性初始化优先级 是一样的
         * 这个时候就看定义的顺序，谁在前就先调用谁
         *
         * 2、然后考虑普通字段
         * 创建实例时，普通代码块的优先级 与 普通属性的初始化优先级 是一样的
         * 同样看定义的顺序，谁在前面就先调用谁
         *
         * 3、最后是 构造器 被调用
         * 类加载 -> 实例的创建
         */
        A aa = new A();

    }
}

class A {

    private int n2 = getN2();
    private static int n1 = getN1(); // 属性的初始化写在代码块前面，所以就先执行

    {//普通构造器
        System.out.println("A 的普通构造器被调用");

    }
    static {
        //静态代码块
        System.out.println("A 的静态代码块被调用");
    }

    public static int getN1() { // 方法必须是静态的，否则无法在 静态的环境中 被调用
        System.out.println("getN1 被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2 被调用");
        return 100;
    }

    //无参构造器
    public A() {
        System.out.println("无参构造器被调用");
    }
}