package com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) {


    }

    //throws 与 try-catch-finally 使用一个即可，不能两个都用上
    public void f2() throws FileNotFoundException{
        //创建一个文件流对象
        //这里的异常是一个FileNotFoundExcetion 编译异常
        //可以使用try-catch-finally

//        try {
//            FileInputStream fis = new FileInputStream("");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //也可以使用throws,抛出异常，让调用f2的调用者（通常也是个方法）来处理
        //throws后面的异常类型可以是方法中产生的异常类型，也可以是他的父类
        //throws关键字后面也可以是 异常列表，即可抛出多个异常
        FileInputStream fis = new FileInputStream("");
    }
}


