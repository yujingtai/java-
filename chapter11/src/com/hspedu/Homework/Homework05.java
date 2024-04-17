package com.hspedu.Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
    new A().f1();
    }
}
/*
    局部内部类：方法体中
 */
class A {
    private String name = "xiangwang";

    public void f1() {
        class B {
            //局部内部类
            private final String name = "yangcong";
            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);//当外部类的属性与内部属性重名，使用 类名.this.属性名 访问
            }
        }
        B b = new B();
        b.show();


    }
}