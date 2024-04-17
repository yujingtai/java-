package com.hspedu.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);//证明n1是 static
        //IB.n1 = 20; n1是fianl
    }
}

interface IB {

    //接口中的属性是 public static fianl
    int n1 = 10; //等价于 public static fianl int n1 = 10;
    void hi();

}

interface IC {
    void ok();
}

interface ID extends IB, IC { //接口不能继承其他的类，但是可以继承多个别的接口

}
class Pig implements IB, IC { //一个类可以实现多个接口

    @Override
    public void hi() {

    }

    @Override
    public void ok() {

    }
}

interface IE { //接口的修饰符只能是 public 和 默认的，他们的使用与 定义类时一样
    //只有在interface文件里面，与文件名相同的接口必须使用 public
}
