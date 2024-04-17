package com.hspedu.static_.main_;

public class Main01 {
    //静态属性
    private static String  name = "韩顺平教育";
    private  String  name1 = "韩顺平教育";

    //静态方法
    public static void hi() {
        System.out.println("hi!");
    }

    public static void main(String[] args) {
        //静态方法main可以访问本类的静态成员
        System.out.println("name = " + name);
        hi(); //可以直接调用，静态成员在类解析的时候就在Class类中了

        //但是不能直接访问非静态成员,可以用过类的实例化进行间接的访问
        System.out.println(new Main01().name1);
    }
}
