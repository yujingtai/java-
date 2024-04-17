package com.hspedu.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        //debug 源码
        int[] arr = {1, -1, 10, -20, 100};
        //查看Arrays.sort方法的底层实现
        Arrays.sort(arr);
        for(int a : arr) {
            System.out.print(a + "  ");

        }
    }
}
