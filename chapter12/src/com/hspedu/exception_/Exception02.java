package com.hspedu.exception_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Exception02 {
    public static void main(String[] args) {
        /**
         * 异常应该分为两大类，运行时异常和编译时异常
         * 1.运行时异常，编译器不要求强制处理的异常，一般是指编程时的逻辑错误，是程序员应该避免的其出现的异常
         *      java.lang.RuntimeException类及他的子类都是运行时异常
         *      对于运行时异常不做处理。因为这类异常很普遍，若全处理会对程序可读性与运行效率产生影响
         *      如： num1 / num2 中，num2不能为0.这是在运行程序时才能发现的异常
         *
         * 2.编译时异常：这是编译器必须处置的异常
         */
    }
}
