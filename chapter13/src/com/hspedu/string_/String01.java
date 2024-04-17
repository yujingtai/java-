package com.hspedu.string_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        //1.String 对象用于保存字符串， 也就是一组字符序列
        //2."jack"为字符串常量，双引号括起来的字符序列
        //3.字符串字符使用Unicode字符编码，一个字符(不分字母还是汉字)都是占两个字节
        //4.String有很多构造器，常用有以下
        //  new String()    new String(String original)  new String(char[] a)
        //  new String(char a, int startIndex, int count)   new String(byte[] b)
        //5.String类实现了接口 Serializable【String 可以串行化：可以在网络上传输】
        //               接口 Comparable【String 对象可以比较大小】
        //6.String 是final类，不能被继承
        //7.String 有属性 private final char[] value; 用于存放字符串内容
        //8.一定要注意：value是一个final类型，不可以修改(需要功力)
        //  新的地址，但是单个字符的内容是可以变化的？？？（我真不理解，可是当我修改name.charAt(0)='i'的时候，编译器会报错，不是说可以修改内容吗？）
        //  因为String的封装，导致其字符串的单个字符内容是不可变的
        String name = "jack";
        name = "tom";
        //name.charAt(0) = 'e';  //报错了----不可变charAt(int index) 方法的实现只是返回字符串中指定位置的字符，并不提供任何修改字符串内容的机制

        //做个final的实验，内容可以改变但是地址不能修改
        final char[] value = {'a', 'b', 'c'};
        value[0] = 'w';
        for (char ch : value) {
            System.out.print(ch + "\t");
        } // w   b   c 的确将value的内容修改了
        //这里我再创建一个字符数组 key
        char[] key = {'d', 'e', 'f'};
        //value = key; //的确，当我修改地址的时候会报错

    }
}
