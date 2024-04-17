package com.hspedu.exception_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        //num2 = 0 程序会抛出异常，程序会崩溃
        //有时候不应该出现一个致命的问题，就导致整个系统崩溃
        //所以 有异常处理机制
        //如果程序员认为一段代码可能会出错 可以使用try-catch异常处理机制来解决
        //  ctrl + alt + t 选中后的快捷键
        try {
            int res = num1 / num2; //运行时异常
        } catch (Exception e) {
            System.out.println(e.getMessage()) ;
        }
        System.out.println("程序继续运行....");
    }
}
