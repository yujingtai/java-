package com.hspedu.date_;

import java.util.Calendar;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Calendar_ { //Calendar 第二代日期
    public static void main(String[] args) {
        //1.Calendar是一个抽象类，并且构造器是private
        //  所以不能创建实例
        //new Calendar();  //'Calendar' is abstract; cannot be instantiated

        //2.可以通过 getInstance() 来获取实例
        Calendar c = Calendar.getInstance();

        //3.Calendar 有获取年、月、日、时、分、秒的方法
        //  并且他没有专门的格式化方法，根据程序员的自由组合来显示，方便
        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日" + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
         //输出为 2024年4月9日5:12:37

        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日" + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
            //输出为 2024年4月9日17:15:57 ，小时变为24小时制
    }
}
