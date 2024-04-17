package com.hspedu.wrapper;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer) -> String
        Integer i = 100;
        //方式1；
        String str1 = i + "";
        //方式2；
        String str2 = i.toString();
        //方式3：
        String str3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str4 = "12345";
        //方式1：
        Integer i2 = Integer.parseInt(str4); //其实也用到了自动包箱
        //方式2：
        new Integer(str4);

    }
}
