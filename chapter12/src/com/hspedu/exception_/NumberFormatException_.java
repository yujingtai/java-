package com.hspedu.exception_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        //String name = "12324";
        String name = "wujinhui";
        //将 String 转换为 int
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}
