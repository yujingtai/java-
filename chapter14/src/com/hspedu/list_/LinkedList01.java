package com.hspedu.list_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node wjh = new Node("wjh");

        //连接三个节点，形成双向链表
        jack.next = tom;
        tom.next = wjh;
        wjh.pre = tom;
        tom.pre = jack;

        Node first = jack; //让first引用指向jack，就是双向节点的头节点
        Node last = wjh;   //双向链表的为节点

        //遍历输出 链表
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //底层使用双向链表，优点为添加与删除效率很高
        //演示 添加
        Node smith = new Node("smith");
        //链表的添加 好像在不取巧的情况，非得知道它的前一个节点
        smith.next = tom.next;
        tom.next = smith;
        //smith.pre = wjh.pre;
        //wjh.pre = smith;
        first = jack; //重置一下
        //遍历输出 链表
        System.out.println("---------------");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //因为我注释掉了两者的pre,但是当我遍历输出时，竟然发现还是将 smith 插进去了，
        //这应该叫做没完全插进去，仅仅只是改变了next，若要查pre则会原形必露
        System.out.println(smith.pre); //null
        System.out.println(wjh.pre);   //tom
    }
}

//定义一个Node类，Node对象，表示双向链表的一个节点
class Node {
    public Object item; //真正存放数据
    public Node next;
    public Node pre;
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "item:" + item;
    }
}
