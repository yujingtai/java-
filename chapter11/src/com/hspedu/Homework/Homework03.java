package com.hspedu.Homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        //向上转型
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("小猫喵喵叫……");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("小狗汪汪叫……");
    }
}