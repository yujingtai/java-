package com.hspedu.Homework;

import javafx.scene.control.Cell;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {

        //匿名内部类最经典最常用的地方就是 直接作为函数参数传递
        //编译类型=该接口   运行类型=匿名内部类
        new Cellphone().testWork(new ICalculate() {
            @Override
            public double work(double d1, double d2) {
                return d2 + d1;
            }
        }, 3, 4);
    }
}

interface ICalculate {
    public double work(double d1, double d2); //默认为抽象方法
}

class Cellphone {
    public void testWork(ICalculate iCalculate, double d1, double d2) {
        double res = iCalculate.work(d1, d2);
        System.out.println(res);
    }
}