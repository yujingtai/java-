package com.hspedu.debug_;

public class Debug01 {
    public static void main(String[] args) {
        //逐行执行代码 F8 + fn
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sun= " + sum);

        }
        System.out.println("退出for....");
    }
}
