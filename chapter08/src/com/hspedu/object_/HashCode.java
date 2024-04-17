package com.hspedu.object_;

import java.sql.SQLOutput;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aa2 = aa;
        //hashCode 不是地址！
        System.out.println("aa.hashCode() = " + aa.hashCode());
        System.out.println("aa1.hashCode() = " + aa1.hashCode());
        System.out.println("aa2.hashCode() = " + aa2.hashCode());//当为同一对象时，hashCode 一定相等
    }
}

class AA {}


