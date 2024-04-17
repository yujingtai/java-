package com.hspedu.math;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        //Math常用的方法（静态方法）
        //1.Math.abs() 取绝对值
        //2.Math.pow(2, 4) 求2的4次方
        //3.Math.ceil() 向上取整 >=参数
        //4.Math.floor() 向下取整 <=参数
        //5.Math.round() 四舍五入
        //6.Math.sqrt() 求开方
        //7.Math.min()  Math.max()
        //8.Math.random() 返回0 <= x < - 1之间的一个随机小数
        // 思考：请写出获取a-b之间的一个随机数，比如a = 2, b = 7
        int a = 2, b = 7;
        int count = 0;
        for (int i = 0; i < 10; ++i) {
            double num = Math.random() * (b + 1);
            if (num >= a) {
                ++count;
                System.out.println((int)num);
            }
        }
        System.out.println("共输出了" + count + "个数");
    }
}
