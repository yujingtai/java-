package com.hspedu.wrapper;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d; //自动包箱 调用Double.valueOf(100d)
        Float f = 1.5f;  //调用 Float.valueOf(1.5f)

        /**
         * ！！三元运算符是一体，精度会自动转变成最大的一个
         * 如下： 自动转化成Double类
         * 输出不是1 而是 1.0
         */
        Object obj1 = true ? new Integer(1) : new Double(3.3);
        System.out.println(obj1); //输出1.0

        /**
         * ！！if - else 并不是一体 所以该是什么类型就是什么类型
         * 并不会自动转变类型
         */
        Object obj2;
        if (true) {
            obj2 = new Integer(1);
        } else {
            obj2 = new Double(3.9);
        }
        System.out.println(obj2); //输出1
    }
}
