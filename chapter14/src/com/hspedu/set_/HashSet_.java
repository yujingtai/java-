package com.hspedu.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class HashSet_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //使用无参构造
        /**
         *     public HashSet() {
         *         map = new HashMap<>();
         *     }
         *     可以看到底层是创建了HashMap
         */
        Set set =new HashSet();
        System.out.println(set); //输出为：[]
        System.out.println("set中元素数量：" + set.size()); //0 正是创建了一个空set
        set.add(null);
        set.add(null);
        System.out.println(set); //[null] 只输出一个null
        System.out.println("set中元素数量：" + set.size()); //1 而这个元素就是null
        //同样也是无序的
    }
}
