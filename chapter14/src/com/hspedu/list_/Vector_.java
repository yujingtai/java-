package com.hspedu.list_;

import java.util.List;
import java.util.Vector;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Vector_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //无参构造器
        Vector vector = new Vector();
        for (int i = 0; i < 10; ++i) {
            vector.add(i);
        }
        vector.add(100); //当超过初始的capacity(10)，会扩充为原来的2倍
        /**
         * 1.new Vector()
         *     public Vector() { //当使用默认构造器，会直接初始一个容量为10的数组
         *         this(10);
         *     }
         *
         * 2.vector.add(i)
         *     public synchronized boolean add(E e) {
         *         modCount++;
         *         ensureCapacityHelper(elementCount + 1);
         *         elementData[elementCount++] = e;
         *         return true;
         *     }
         */
        //对于有参构造，就是初始化容量为所给的值，如若超过，则两倍扩容
    }
}
