package com.hspedu.set_;

/**
 * @author 吴金辉
 * @version 1.0
 */
@SuppressWarnings("all")
public class HashSetStructure {
   public static void main(String[] args) {
      //模拟一个HashSet的底层 (HashMap 的底层结构)
      //1.创建一个数组，数组的类型是 Node[]
      //2.也可以称 Node[] 数组为 表
      Node[] table = new Node[16];
      System.out.println("table:" + table);
      //3.创建一个节点
      Node john = new Node("john", null);
      table[2] = john;
      Node jack = new Node("jack", null);
      john.next = jack; //将jack节点挂载到john
      Node rose = new Node("rose", null);
      jack.next = rose; //将rose节点挂载到jack
      System.out.println("table = " + table);
   }
}

class Node { // 结点对象，存储数据，可以指向下一个节点，从而形成链表
   Object item; //存放数据
   Node next; //指向下一个节点

   public Node(Object item, Node next) {
      this.item = item;
      this.next = next;
   }

   @Override
   public String toString() {
      return "Node{" +
              "item=" + item +
              ", next=" + next +
              '}';
   }
}
