package com.hspedu.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        System.out.println("===============");
        bbb = new BBB(); //BBB中静态代码块只调用一次，所以这次中没有输出 BBB静态代码块被调用
    }
}

/**
 * 这次又补充了继承时的情况
 * 尚且不论在类加载时就会调用的static字段
 * 当类的实例创建，就会调用构造器，构造器中还有调用的顺序！
 *  1、super() 首先看父类的构造器，对于父类的构造器同理
 *  2、普通代码块，其中因为普通属性的初始化优先级 与 普通代码块优先级相同，所以要看定义顺序
 */
class AAA {
    {//AAA的普通代码块
        System.out.println("AAA 的普通代码块");
    }
    public AAA() {
        //1、super()    超类是Object, 也可以不写这个super()
        //2、普通代码块
        System.out.println("AAA() 被调用");
    }
}

class BBB extends AAA {
    //public int n3 = getN3();
    static {
        System.out.println("BBB 静态代码块被调用...");
    }
    {//普通代码块
        System.out.println("BBB 普通代码块...");
    }
    public int n3 = getN3(); //跟Detail02 一样，优先级相同，看定义顺序
    public BBB() {
        //1、super()
        //2、普通代码块
        System.out.println("BBB() 被调用");
    }

    public int getN3() {
        System.out.println("getN3() 被调用");
        return 100;
    }
}
