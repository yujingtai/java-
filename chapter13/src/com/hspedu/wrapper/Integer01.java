package com.hspedu.wrapper;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        /**
         * public static final int MIN_VALUE = 0x80000000
         * public static final int MAX_VALUE = 0x7fffffff
         */
//        Long long1 = new Long(0);
        //演示int < - > Integer 的装箱和拆箱
        //jdk5前是手动装箱和拆箱
        //手动装箱 int -> Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -> int
        int i = integer.intValue();

        //jdk5之后就是自动装箱和拆箱
        int n2 = 200;
        //自动装箱
        Integer integer2 = n2; //在底层还是调用了Integer.valueOf(n2)方法
        //自动拆箱
        int n3 = integer2;  //底层调用了Integer.intValue()
    }
}
