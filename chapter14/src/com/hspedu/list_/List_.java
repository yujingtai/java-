package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class List_ {
    public static void main(String[] args) {
        //List集合类中元素有序（即添加顺序和取出顺序一致）、且可重复
        List list = new ArrayList(); //常用的有 ArrayList, LinkedList, Vector
        list.add("jack");
        list.add("tom");
        list.add("wjh");
        System.out.println(list); //[jack, tom, wjh] 与添加顺序相同


    }
}
