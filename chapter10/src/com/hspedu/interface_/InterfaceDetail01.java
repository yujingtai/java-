package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

    }
}

interface IA {
    //1、接口不能被实例化，其本身就是抽象的
    //2、接口中的所有方法是 public ,接口中的抽象方法可以省略写 abstract 和 public
    //3、一个普通类实现接口，就必须实现该接口的所有方法，使用 alt+enter 可直接补充
    //4、抽象类实现接口，可以不用实现接口的抽象方法
    void say();
    void hi();
}

class Cat implements IA {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA {
    
}