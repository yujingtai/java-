package com.hspedu.stringbuffer_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringBuffer01 {
   public static void main(String[] args) {
      /**
       * 1.StringBuffer 的直接父类 是 AbstractStringBuilder
       * 2.StringBuffer 实现了 Serializable(序列化) 其对象可以串行化
       * 3.在父类中 AbstractStringBuilder 有属性 char[] value，不是final
       *   该 value 数组存放字符串内容， 因此存放在堆中而不在常量池中！
       * 4.StringBuffer 是一个final类，不能被继承
       */
      StringBuffer stringBuffer = new StringBuffer();

      /**
       *  String VS StringBuffer
       *  1.String保存的是字符串常量，里面的值不能修改，每次此String类的更新实际上就是
       *    更新地址，效率较低 //private final char[] value
       *  2.StringBufferv保存的是字符串变量，里面的值可以修改，不用每次都修改地址（当容量满了，还是会修改的）
       *    （比如满了，就要扩容，将原先的先拷贝进去，再将新的地址返回给value，当然一切发生在堆中）
       *    这样所以 效率高 char[] value --- 放在堆中
       */
   }

}
