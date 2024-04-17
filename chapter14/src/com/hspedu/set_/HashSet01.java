package com.hspedu.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class HashSet01 {
   @SuppressWarnings("all")
   public static void main(String[] args) {
      //1.在执行add方法后，会返回一个boolean值
      //2.添加成功返回true，添加失败返回false
      Set set = new HashSet();
      System.out.println(set.add("pack")); //true
      System.out.println(set.add("john")); //true
      System.out.println(set.add("john")); //false
      System.out.println(set.add("john")); //false
      System.out.println(set.add("wjh"));  //true
      System.out.println(set.add("lucy")); //true
      System.out.println(set.add("lucy")); //false
      System.out.println("set：" + set);   //set：[wjh, john, pack, lucy] 取出无序

      //3.remove 删除方法
      set.remove("wjh"); //因为set中没有索引，所以就不存在根据index来删除元素
      System.out.println("remove后的set：" + set);

      //4.可不可以让set中好像加入了重复的元素？
      set = new HashSet();
      set.add("lucy");
      set.add("lucy");
      set.add(new Dog("tom"));
      set.add(new Dog("tom"));
      System.out.println(set); //[tom, tom, lucy] 好像看起来有重复的元素，但是两个tom可不是一个对象，他们仅仅是名字相同罢了，就像两个名字相同的人

      //5.再加深一下，非常经典的面试题
      set.add(new String("wjh"));
      set.add(new String("wjh")); //OK?
      //答案是加入不了！！！
      System.out.println(set); // [wjh, tom, tom, lucy] 只有一个wjh并非两个，可是明明这是两个不同的对象呀，怎么跟上面的矛盾了呢？
      //底层的源码，非常复杂，他到底是怎么实现添加元素的
      //请看 HashSetStructure
   }

}

class Dog {
   private String name;
   public Dog (String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return name;
   }
}
