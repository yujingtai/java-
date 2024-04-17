package com.hspedu.modifier;

public class B {
    public void say() {
        A a = new A();
        //在同一个包下，可以访问 public ,protected ,还有默认 ，不能访问private
        System.out.println("n=" + a.n1 + a.n2 + a.n3);
    }
}
