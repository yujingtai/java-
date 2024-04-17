package com.hspedu.string_;

import java.util.Arrays;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //1.equals
        //2.equalsIgnoreCase 忽略大小写判断内容是否相等
        //3.length
        //4.indexOf 获取 字符或者字符串 第一次出现的的索引，找不到返回-1
        //5.lastIndexOf 获取 字符或者字符串 最后一次出现的的索引，找不到返回-1
        //6.substring 截取一定范围的内容
        String name = "wjhdsg";
        System.out.println(name.substring(0)); //wjhdsg
        System.out.println(name.substring(1,5)); //返回索引1到5之间的字符，包括1不包括5

        //7.toUpperCase
        //8.toLowerCase
        //9.concat 拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("宝钗").concat("黛玉");
        System.out.println(s1);

    }
}
