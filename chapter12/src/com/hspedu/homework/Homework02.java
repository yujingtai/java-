package com.hspedu.homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        //args.length = 0;
        //这样的话 首先就会发生ArrayOutOfBoundsException
        if (args[4].equals("wjh")) { //然后有可能会发生NullPointerException
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }

        Object o = args[2]; //String -> Object向上转型
        Integer i = (Integer)o; //一定会发生ClassCastException
    }
}
