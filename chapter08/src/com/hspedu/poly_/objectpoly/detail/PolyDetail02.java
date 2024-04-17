package com.hspedu.poly_.objectpoly.detail;

public class PolyDetail02 {
    public static void main(String[] args) {

        //属性没有重写一说！！
        Base base = new Sub();
        //属性调用看编译类型，与方法不同（方法调用看运行类型，遵循继承查找关系）
        System.out.println("count = " + base.count);//10

        Sub sub = new Sub();
        System.out.println("count = " + sub.count);//20

    }
}

class Base {
    int count = 10;
}
class Sub extends Base {
    int count = 20;
}

