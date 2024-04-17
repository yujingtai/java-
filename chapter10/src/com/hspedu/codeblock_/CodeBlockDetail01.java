package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //?什么时候加载类？

        //1、创建对象实例时
        AA aa = new AA();
        //2、创建子类对象实例时
        AA aa1 = new AA(); //先加载父类，再加载子类！
        //3、使用类的静态成员时
        System.out.println(CC.n1);

        //如果使用类的静态成员，普通代码块是不会执行的
        //普通代码块是创建一个对象时才调用，创建一次就调用一次
        //而static是在加载类时调用并且只调用一次

    }
}

class DD {
    static {
        System.out.println("DD 的静态代码块被调用");
    }
}
class CC extends DD {
    public static int n1 = 10;
    static {
        System.out.println("CC 的静态代码块被调用");
    }

    { //普通代码块
        System.out.println("CC 的普通代码块被调用");
    }
}
class BB {
    //静态代码块
    static {
        System.out.println("BB 的静态代码块被调用");
    }
}

class AA extends BB {
    //静态代码块
    static {
        System.out.println("AA 的静态代码块被调用");
    }
}