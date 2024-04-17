package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class CollectionMethod { //以ArrayList为例
    public static void main(String[] args) {
        List list = new ArrayList();

        //add :添加单个元素
        list.add("jack");
        list.add(10); //list.add(new Integer(10))底层进行了一个自动装箱
        list.add(true);
        System.out.println(list);

        //remove: 删除指定元素
        list.remove(0); //删除第一个元素
        list.remove(true); //删除某个元素
        //list.remove(10); //para为int类型，默认传入的是要删除元素的下标
        System.out.println(list);

        //contains: 查找元素是否存在
        System.out.println(list.contains("jack"));

        //size: 获取元素个数
        System.out.println(list.size());

        //isEmpty: 判断是否为空
        System.out.println(list.isEmpty());

        //clear: 清空
        list.clear();
        System.out.println(list);

        //addAll: 添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println(list);

        //cotiansAll: 查找多个元素
        System.out.println(list.containsAll(list2));

        //removeAll: 删除多个元素
    }
}
