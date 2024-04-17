package com.hspedu.string_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringExcercise01 {
    public static void main(String[] args) {
        String a = "abc"; //直接在常量池中创建 便且将地址返回给a
        String b = "abc"; //在常量池中已经有了，就不再创建，b直接获取地址
        System.out.println(a.equals(b)); //t---字符串的内容比较通过equals
        System.out.println(a == b); //t---比较地址
    }
}
