package com.hspedu.codeblock_;

import jdk.nashorn.internal.ir.CallNode;

public class CodeBlock01 {
    public static void main(String[] args) {
        Moive moive1 = new Moive("奥本海默");
        System.out.println("=========================");
        Moive moive2 = new Moive("流浪地球", 50);
    }
}

class Moive {
    private String name;
    private double price;
    private String director;

    //初始代码块
    //在创建对象的时候就会先调用 代码块
    //代码块的调用顺序高于构造器
    static { //如果是 静态代码块 那么只会执行 一次！！！
        System.out.println("电影开始....");
        System.out.println("duang duang duang");
    }

    ; //这个分号可以加也可以不加

    public Moive(String name) {
        System.out.println("第一个构造器被调用");
        this.name = name;
    }

    public Moive(String name, double price) {
        System.out.println("第二个构造器被调用");
        this.name = name;
        this.price = price;
    }

    public Moive(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
