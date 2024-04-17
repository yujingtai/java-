package com.hspedu.poly_.objectpoly;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态
        //等号左边是编译类型
        //等号右边是运行类型
        Animal animal = new Dog();
        //当执行到改行时，animal的运行类型时Dog
        animal.cry();

        animal = new Cat();
        animal.cry();
    }
}
