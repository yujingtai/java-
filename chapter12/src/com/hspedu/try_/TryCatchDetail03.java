package com.hspedu.try_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class TryCatchDetail03 {
    public static void main(String[] args) {
        //可以进行 try - finally 配合使用，这种用法相当于没有捕获异常，因此程序会直接崩掉
        //应用场景：不管是否发生都会执行的一种业务逻辑
        //如果没有应对异常的方法，就会throws给JVM，也就是直接报错
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        } finally {
            System.out.println("执行finally……");
        }

        System.out.println("程序继续执行……");
    }
}
