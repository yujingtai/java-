package com.hspedu.pkg;


import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {

        //使用系统提供的 Arrays 完成 数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //传统需要冒泡来排序
        //这里系统提供了相关类，可以更方便完成
        Arrays.sort(arr);

        //打印输出
        for (int ints : arr) {
            System.out.print(ints + "\t");
        }

    }
}
