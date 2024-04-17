package com.hspedu.bignum;

import java.math.BigDecimal;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 1333.9203488912723;
        //当要去保存一个精度非常高的数时，double就不够用了
        //可以使用 BigDecimal
        BigDecimal bigDecimal = new BigDecimal("23432.23432543535234534534543");
        System.out.println(bigDecimal);

        //同样不能直接对BigDecimal 直接加、减、乘、除
        //使用方法来计算，创建一个对象准备接收
    }
}
