package com.hspedu.wrapper;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class WrapperExercise03 {
    public static void main(String[] args) {
        /**
         * 判断是否相等
         */
        //示例1
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2); //F --- 并非同一个对象

        //示例2
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4); //T --- 自动装箱，在-128到127之间，没有创建对象，直接在数组里面取得，值相等返回true

        //示例3
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6); //F --- 自动装箱 调用Integer.valueOf()方法，但是超出范围，创建对象，两者不相同

        //示例4
        Integer i7 = 127;
        Integer i8 = new Integer(127);
        System.out.println(i7 == i8); //F --- 对象不相同，返回false

        //示例5
        Integer i9 = 128;
        int i10 = 128;
        System.out.println(i9 == i10); //T --- 只要有基本数据类型，那么就是在比较值，两者相同放回true
    }
}
