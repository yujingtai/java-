package com.hspedu.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class LinkedListCRUD {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);//debug取看源码

        //删除节点
        //linkedList.remove(); //默认删除第一个节点
        linkedList.remove(1); //param:index
        System.out.println(linkedList);

        //set(index, value)
        linkedList.set(0, 2); //根据索引修改元素为所给的value
        System.out.println(linkedList);

        //使用迭代器遍历
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        //首先创建一个自身的迭代器
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");
        //使用增强for循环
        for (Object object : linkedList) {
            System.out.println(object);
        }

    }
}
