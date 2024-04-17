package com.hspedu.string_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        /**
         * 1.先创建一个StringBuilder sb = new StringBuilder()
         * 2.执行 sb.append(hello)
         * 3.sb.append(abc)
         * 4.String c = sb.toString()
         *   "helloabc"会在字符串常量池中创建一个对象（默认常量池中先前没有）
         *   然后将地址返回给堆中的新建的一个对象   ps:这个对象可不是 new StringBuilder 而是 new String()
         *   堆中的对象再将地址返回给c
         *   最后其实c指向的是堆中对象(String) value[] ->池中 "helloabc"
         *
         */
        String c = a + b; //所以会创建3个对象！！！ 堆中两个，常量池中一个
        System.out.println(c); //helloabc
        String d = "helloabc";
        System.out.println(c == d); //false d指向常量池，而c指向堆在指向常量池
        String e = "hello" + "abc";
        System.out.println(d == e); //true
        /**
         * 小结：
         *      String a = "abc" + "def" 常量相加在池中
         *      String b = "abc"  String c = "def"
         *      String d = b + c 变量相加在堆中
         *      ps:如果是一个变量，一个常量
         *      String str = "hello" + a  也是创建三个对象，stringBuilder、堆中的value、常量池中还有一个（假设之前不存在合成后的字符串）
         *
         *
         */
    }
}
