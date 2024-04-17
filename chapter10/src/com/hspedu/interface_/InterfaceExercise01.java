package com.hspedu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        System.out.println(b.a);
        System.out.println(AA.a);
        System.out.println(B.a);
//        System.out.println(c.a);
//        System.out.println(C.a);
//        System.out.println(B.c);
        System.out.println(c.n2);
    }
}

interface AA {
    int a = 23;
}

class B implements AA {

}

class C {
    public int n2 = 10;
    public void hi() {

    }
}

