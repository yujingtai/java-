package com.hspedu.string_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringExercise07 {
    public static void main(String[] args) {
        /**
         * 编译器不会那么傻，会进行一个底层优化
         *      =>String a = "hellowjh" 创建一个对象
         */
        String a = "hello" + "wjh"; //创建了一个对象！！！

        String b = "hello";
        String c = "abc";

    }
}
