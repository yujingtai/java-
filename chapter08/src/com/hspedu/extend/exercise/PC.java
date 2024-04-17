package com.hspedu.extend.exercise;

public class PC extends Computer{

    private String brand;

    //继承的基本思想：父类的构造器完成父类属性初始化
    //子类的构造器完成子类的初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);//调用父类的构造器，使其初始化
        this.brand = brand;
    }

    public void printInfo() {
        //直接调用父类的 方法 getDetails() ,方便许多
        System.out.println(getDetails() + "brand=" + this.brand);
    }
}
