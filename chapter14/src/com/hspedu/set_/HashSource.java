package com.hspedu.set_;

import java.util.HashSet;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class HashSource {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        //通过下面的源码分析，为什么第二个java添加不进去
        //因为是直接添加的常量"java",所以直接是判为想要加入相同的对象，肯定不行
        System.out.println("set = " + hashSet); //set = [java, php]
        hashSet.add(new Dog("jack"));
        hashSet.add(new Dog("jack"));
        //可以发现 欸？怎么可以添加两个jack呢(Dog类中我重写了toString方法，让其直接输出name)
        //首先添加的是两个不同的Dog对象
        //其次还要考虑这两个对象通过equals()方法后，是否相同，答案是否定的，
        //    因为我并没有重写equals，默认的该方法会比较两个是否为一个对象，结果肯定为否定的
        System.out.println("set = " + hashSet); //set = [java, jack, php, jack]
        hashSet.add(new String("merry"));
        hashSet.add(new String("merry"));
        //这里就不能添加两个merry
        //因为 两个String虽然是不同的两个对象，但是String中的equals()是比较两者的内容，而他们的内容一致，所以添加不成功
        System.out.println("set = " + hashSet); //set = [java, jack, php, jack, merry]
        /**
         * 对HashSet的源码解读
         * 1.执行构造器 HashSet()
         *     public HashSet() {
         *         map = new HashMap<>();
         *     }
         * 2.执行add()
         *     public boolean add(E e) {
         *         return map.put(e, PRESENT)==null; //PRESENT ： private static final Object PRESENT = new Object(); 用来占位的
         *     }
         * 3.执行put() ，该方法会执行hash(key) 得到key对应的hash值： return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
         *     public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *     }
         * 4.执行 putVal 核心也是最难的部分
         *     final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
         *         Node <K,V>[] tab; Node<K,V> p; int n, i; // 辅助变量
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;   //如果table为空，先进行默认的扩容，capacity=16
         *         if ((p = tab[i = (n - 1) & hash]) == null) // &：按位与       Node p正是经过计算得到的（要添加的元素的）的索引位置上的 节点元素
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k; //哪里需要用时，就在哪里设置变量
         *             //下面就是，HashMap 添加的规则：
         *             //添加重复元素时（p.hash == hash）,只要key完全相同（比如直接添加一个相同的对象）
         *             //或者 使用equals()后（所以要看这个equals方法到底是在比较什么），p.key == key ,就将 e = p
         *             if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             //添加的p，若为红黑树，那就要进行红黑树的转变方法，这里不多说
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             //其余的情况：也就是该索引上拥有一条链表：而由于第一条判断，已经确定首元素肯定与p不同。所以从第二个元素开始，遍历比较
         *             else {
         *                 for (int binCount = 0; ; ++binCount) { //遍历该索引上的链表
         *                     if ((e = p.next) == null) {        //如果一直找到链表上最后一个元素，
         *                         p.next = newNode(hash, key, value, null);  //那么就添加到其后面
         *                         if (binCount >= TREEIFY_THRESHOLD - 1)     // -1 for 1st
         *                             treeifyBin(tab, hash);     //这是准备树化，当某一索引上的链表长度超过等于8并且该table的索引大于64
         *                         break;
         *                     }
         *                     if (e.hash == hash &&              //在遍历时链表时，要将每一个元素与要寻找的key比较，
         *                         ((k = e.key) == key || (key != null && key.equals(k))))  //若相同，那就是找到了，无需添加直接退出循环
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key ：已存在，添加不成功
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;   //返回旧value
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)  //如果使用量大于临界点（默认的临界因子为0.75 * Capacity）
         *             resize();            //进行扩容
         *         afterNodeInsertion(evict); //HashSet的空方法，留给子类补充实现的
         *         return null;             //返回null给上一级方法 put(),也就是添加成功
         *     }
         */
    }
}
