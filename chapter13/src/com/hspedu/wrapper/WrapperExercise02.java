package com.hspedu.wrapper;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        //static 中没有this
        method1();
    }

    public static void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);  //false

        /**
         * 下面的案例要看valueOf()的源码
         *  如果包箱的值在 -128 到 127 之间 就直接返回值
         *  如果宝箱的值在范围之外的就要 new Integer(n) 新建了个对象实例
         */
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); //true m, n8是值
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); //false x, y是不同的对象引用
    }
}
