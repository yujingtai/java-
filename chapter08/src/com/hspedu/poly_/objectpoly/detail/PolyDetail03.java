package com.hspedu.poly_.objectpoly.detail;

public class PolyDetail03 {
    public static void main(String[] args) {
        //instanceof 的用法  返回true或者false
        //用于判断 对象的运行类型 是否为 XX类型或者其子类型
        AA aa = new BB();//继承中的向下转型，父类引用指向子类对象,其运行类型是BB
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
    }
}

class AA{}
class BB extends AA{}

