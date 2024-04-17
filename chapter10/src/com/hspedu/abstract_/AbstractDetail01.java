package com.hspedu.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {

    }
}

//抽象类的本质还是类，所以可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static String name = "吴金辉大帅哥";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();//抽象方法不能有函数体，并且一旦有抽象方法，该类则必须声明为抽象类abstract

}

//如果一个类继承了抽象类，则它必须实现所有的抽象方法，除非她自己也声明为抽象类
class F extends D {
    @Override
    public void hello() {//所谓实现方法，只要有函数体就可以，即使为空也可以
        System.out.println("haohaohao");
    }
}

//抽象方法不能使用private、final、static 三个来修饰抽象方法，因为这些关键字是与重写相违背的
abstract class H {
    //private abstract void hi();
    //public static abstract void hello();
    //public final abstract void ok();
}

