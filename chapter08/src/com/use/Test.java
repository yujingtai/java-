package com.use;

import com.xiaoqiang.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();//这里第一个可以不用写全，计算机可以识别出是小强的dog
        System.out.println(dog);

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();//这里明确的告诉编译器是小明的Dog类
        System.out.println(dog1);
    }
}
