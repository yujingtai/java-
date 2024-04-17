package com.hspedu.annotation_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Override {
    public static void main(String[] args) {

    }
}

/*
    源码中的注解类
    public @interface Override {}
 */

class Father {
    public void fly() {
        System.out.println("Father fly...");
    }
}

class Son extends Father {
    @java.lang.Override //最重要的作用是编译器会进行一个语法的校验
    public void fly() {
        System.out.println("Son fly...");
    }
}
