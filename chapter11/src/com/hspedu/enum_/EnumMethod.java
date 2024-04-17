package com.hspedu.enum_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2 枚举类，来演示各种方法
        Season2 autumn = Season2.Autumn;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal() 输出的是枚举对象的次序，从0开始编号的
        //Autumn 是第三个枚举对象，输出2
        System.out.println(autumn.ordinal());
        //values 方法，返回类型Season2[]，返回枚举类中的所有常量
        Season2[] values = Season2.values();
        for (Season2 season2 : values) {
            System.out.println(season2);
        }
        System.out.println("=========================");
        //valueOf: 将字符串转换成枚举对象，要求字符串是已有的常量名，否则报错
        Season2 autumn1 = Season2.valueOf("Autumn");
        System.out.println(autumn1);

        //compareTo: 比较两个枚举常量，比较的就是编号
        //return self.ordinal - other.ordinal; 底层源码
        //返回int 前面的编号-后面的编号
        System.out.println(Season2.SUMMER.compareTo(Season2.Autumn));
    }
}
