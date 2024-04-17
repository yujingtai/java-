package com.hspedu.set_;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class SetMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1.以Set接口的实现类 HashSet 来讲解Set的接口方法
        //2.Set接口的实现类的对象(Set接口的对象),不能存放重复的元素,只能添加一个null
        //3.set接口对象存放数据是无序的（添加的顺序与取出的顺序不一致），所以set是没有索引的！！！
        //4.但是，取出的顺序是固定的
        Set set = new HashSet();
        set.add("john");
        set.add("jack");
        set.add("wjh");
        set.add("wjh");
        set.add(null);
        System.out.println(set.add(null)); //输出false
        System.out.println(set); //[null, wjh, john, jack] 可以看出取出的顺序（会固定）与存放的顺序不一致

        System.out.println("使用迭代器：");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //也可以使用增强for循环，毕竟底层就是使用迭代器
        //但是不能使用普通的for循环，因为Set接口没有get()方法
//        for (int i = 0; i < set.size(); ++i) {
//            System.out.println(set.get(i)); //java: 找不到符号
//        }
        //Collection作为Set的父接口，里面只有基本的add与remove，并没有get与set方法
    }
}
