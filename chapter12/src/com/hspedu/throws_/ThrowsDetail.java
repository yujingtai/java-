package com.hspedu.throws_;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() { //throws ArithmeticException 在这里可加可不加
        //1.对于编译异常，程序中必须要处理，比如 try-catch 或者 throws
        //2.对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
        //如果闹到 JVM 那里 ，就会非常简单粗暴
        //4.有try-catch 则不必有throws
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2; //ArithmeticException
    }

    public static void f1() throws FileNotFoundException {
        //在f1()中调用f3()方法，由于f3()抛出了编译时异常，
        //可以视为 调用他的f1() 也必须要抛出异常，或者用try-catch
        //否则报错！
        //相对的，如果调用的方法抛出的是运行时异常，则不会报错
        f3();
    }

    public static void f3() throws FileNotFoundException {

    }


}

class Father {
    //父类
    public void method() throws RuntimeException {}

}

class Son extends Father {
    //3.子类重写父类方法时，对抛出异常的规定：
    //  子类重写的方法所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出异常的子类型

    @Override
    public void method() throws NullPointerException {
        super.method();
    }
}



