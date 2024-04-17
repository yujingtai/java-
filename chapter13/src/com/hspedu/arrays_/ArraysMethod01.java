package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3};
        //直接使用Arrays.toString()方法，显示数组
        System.out.println(Arrays.toString(integers));

        //演示sort方法的使用
        Integer[] arr = {1, -1, 7, 0, 89};
        //1.可以使用冒泡排序，也可以直接使用Arrays提供的sort方法
        //2.！！因为数组是 引用类型 ，所以通过sort排序后，会直接影响 实参arr
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //3.sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
        //4.调用定制排序时，传入两个参数 (1) 需要排序的数组arr
        //                            (2) 实现了Comparator接口的匿名内部类，要求实现 compare方法
        Arrays.sort(arr, new Comparator() { //匿名内部类
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
