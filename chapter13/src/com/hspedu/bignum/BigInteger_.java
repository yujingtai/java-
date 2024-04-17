package com.hspedu.bignum;

import java.math.BigInteger;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {

        long l = 12345566778213l;
        //在编程中，需要处理非常大的数时，long不够用
        //可以使用 BigInteger的类来搞定
        //long l = 99999999999999999999999999999999l;
        BigInteger bigInteger = new BigInteger("99999999999999999999999999999999999999");
        System.out.println(bigInteger);

        //1.在对 BigInteger 进行加减乘除时，需要使用相应的方法，不能直接进行 + - * /
        //2.可以创建一个 要操作的BigInteger 然后进行相应的操作
        BigInteger bigInteger1 = new BigInteger("23333333");
        //加 add
        BigInteger add = bigInteger1.add(bigInteger);
        //减 substract
        //乘 multiply
        //除 divide

    }
}
