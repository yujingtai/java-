package com.hspedu.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Date_ { //Date是第一代日期
    public static void main(String[] args) throws ParseException{
        //1.获取当前系统时间
        //2.这里的Date 类是在java.util包里的
        //3.默认的输出的日期格式是国外的方式，因此通常需要格式转换
        java.util.Date d1 = new java.util.Date(); //获取当前系统时间
        System.out.println("当前日期为：" + d1); //当前日期为：Tue Apr 09 10:29:30 CST 2024

        //1.创建 SimpleDateFormat 对象，可以指定相应的格式
        //2.这里的格式使用的字母是规定好的，不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("格式转换后的:" + format); //2024年04月09日 10:34:36 星期二

        //1.可以把一个格式化的String 转成对应的 Date
        //2.将String->Date时，使用的sdf格式需要和你给的String格式一样，否则会报错ParseException
        String s = "1996年01月01日 10:20:30 星期一";
        java.util.Date parse = sdf.parse(s); //会有一个编译类型的错误，要使用异常处理机制
        System.out.println(parse); //Mon Jan 01 10:20:30 CST 1996 输出的是国际默认的形式
        //3.如果想要转换格式，则继续使用一次format方法即可
        System.out.println("转换格式：" + sdf.format(parse));
    }
}
