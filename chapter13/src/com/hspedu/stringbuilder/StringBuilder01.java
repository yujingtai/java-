package com.hspedu.stringbuilder;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        //1.StringBuilder 继承 AbstractStringBuilder 类
        //2.实现了Serializable ,说明StringBuilder对象是可以串行化(对象可以网络传输，保存到文件中
        //3.同样为final类，不能被继承
        //4.StringBuilder 对象字符仍然放在其父类 AbstractStringBuilder 的 char[] value;
        //  因此 字符序列放在堆中的
        //5.StringBuilder方法没有做 互斥 的处理 (即没有关键字 synchronized) ,因此在单线程的情况下使用
        //
//        StringBuilder sb = new StringBuilder();
//        sb.append("wjhhhhhh");
//        sb.setCharAt(1,'h');
//        System.out.println(sb.toString());
//        sb.insert(1, "sb");
//        System.out.println(sb.toString());
//        int n = sb.indexOf("j", 3);
//        System.out.println(n);


        //搞懂insert
        /**
         * 本质insert(int index, String str)
         * 在 容器中 找到index的位置，就地将str插进去，那么原本在这个位置上的就往后移，直到将
         * str完全的插进去，最后返回修改的对象
         */
        //StringBuilder insert(int index, char[] str, int offset, int len)
        //本质还是一样的，就是插入一段字符数组（由后三个param决定），到原容器中，并返回
        String str = "qwertyuiop,asdfghjkl";
        StringBuilder stringBuilder = new StringBuilder(str);
        char[] chars = {'s', 'b', 'w', 'j', 'h'};
        stringBuilder.insert(1, chars, 0, 5);
        System.out.println(stringBuilder.toString()); //qsbwjhwertyuiop,asdfghjkl


    }
}
