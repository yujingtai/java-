package com.hspedu.extend.improve;

public class Pupil extends Student{

    //设置一个无参构造器
    public Pupil() {
        //super 和 this 两者不能共存！ 他们两个都要在第一行
        //super 必须在子类构造器的第一行 ，当创建子类对象时，调用子类的构造器，首先会找到父类的构造器，先有父在有子
        super("wujinhui", 18); //当父类中没有无参构造器，就必须显示的super指出对应的父类哪个构造器，否则编译器报错
        System.out.println("Pupil无参构造器被调用");
    }
    public void testing() {
        System.out.println("小学生" + name + " 正在考数学");
    }
}
