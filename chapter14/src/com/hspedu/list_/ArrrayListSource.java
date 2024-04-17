package com.hspedu.list_;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ArrrayListSource {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /**
         * ArrayList存放数据 transient Object[] elementData; //transient 短暂的，不可序列化
         */
        //实践 debug 一下ArrayList的底层扩容机制
        //使用无参构造
        ArrayList list = new ArrayList(); //可以发现，会默认创建一个空的elementData,然后在底层扩容一次成为capaticy(容量)为10的elementData
        for (int i = 1; i <= 10; ++i) {
            list.add(i);
        }
        list.add(100); //首先进行一个new Integer.valueOf(100)的装箱操作，（-128到127不创建对象），然后扩容1.5倍向下取整
        list.add(200);

        //使用有参
        ArrayList list1 = new ArrayList(5);
        //会自动创建初始容量为5的elementDate数组，扩容机制一样不赘述

    }
}
