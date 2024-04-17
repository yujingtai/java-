package com.hspedu.string_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp"; //直接赋值，a指向常量池
        String b = new String("hsp"); // 通过构造器，b指向堆中对象
        System.out.println(a.equals(b)); //true
        System.out.println(a == b); // false ----两个对象地址不同

        System.out.println(a == b.intern()); //true----intern()方法返回常量池的地址
        System.out.println(b == b.intern()); //false
    }
}
