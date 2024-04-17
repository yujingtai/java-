package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("刘备");
        list.add("张飞");
        list.add("关羽");
        System.out.println(list); //[张三丰, 刘备, 张飞, 关羽]

        //add(int index, Object ele) //在index位置上插入ele元素
        list.add(1, "吴金辉");
        System.out.println(list); //[张三丰, 吴金辉, 刘备, 张飞, 关羽]

        //boolean addAll(int index, Collection eles) 在index位置插入eles
        List list1 = new ArrayList();
        list1.add("jack");
        list1.add("tom");
        list.addAll(0, list1);
        System.out.println(list); //[jack, tom, 张三丰, 吴金辉, 刘备, 张飞, 关羽]

        //Object get(int index) //获取index上的元素

        //int indexOf(Object obj) //返回obj首次在集合中出现的位置

        //int lastIndexOf(Object obj) //返回obj最后一次在集合中出现的位置

        //Object remove(int index) : 移除指定位置的元素，并返回他
        Object object = list.remove(0);
        System.out.println(object);

        //Object set(int index, Object ele) : 设置指定位置index上的元素为ele，相当于替换

        //List subList(int fromIndex, int toIndex) : 经典左闭右开， 返回从fromIndex到toIndex - 1上的子集合
        List sublist = list.subList(1, 3); //调用方法者不会产生影响，更不会删除子集合
        System.out.println(sublist);
    }
}
