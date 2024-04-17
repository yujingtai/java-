package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ArraysSortCustom { //自定义数组排序
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
        //1.冒泡实现
        bubble01(arr);
        System.out.println(Arrays.toString(arr));
        //2.自定义 + 冒泡 实现
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i1 - i2; //从小到大排序
                //return i2 - i1; //从大到小
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    //使用冒泡排序完成
    public static void bubble01(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //使用冒泡 + 自制
    public static void bubble02(int[] arr, Comparator c) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                //从小到大
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
