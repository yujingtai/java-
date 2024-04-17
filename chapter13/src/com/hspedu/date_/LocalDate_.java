package com.hspedu.date_;

/**
 * @author 吴金辉
 * @version 1.0
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 前两代日期有不足
 * 1.JDK1.0中包含了java.util.Date类，但是它的大多数方法已经在JDK1.1引入Calendar类之后
 *   就被弃用了
 * 2.而calendar也存在自己的问题：
 *    1）可变性：像日期和时间这样的类应该是不可变的
 *    2）偏移性：Date中的年份是从1900开始的，而月份都是从0开始的
 *    3）格式化：格式化只对Date有用，Calendar则不行
 *    4）他们的线程不安全，不能处理润秒(每隔两天多出1s)
 */
public class LocalDate_ {
   public static void main(String[] args) {
      //开发中，尽量使用第三代日期
      //第三代日期 JDK8加入
      //LocalDate：年月日   LocalTime:时分秒  LocalDateTime:都有

      //1.使用 now() 返回当前日期时间的对象
      LocalDateTime ldt = LocalDateTime.now();
      System.out.println("直接使用now(): " + ldt); //2024-04-10T23:47:05.980
      System.out.println("年：" + ldt.getYear());
      System.out.println("月：" + ldt.getMonth());
      System.out.println("月：" + ldt.getMonthValue());
      System.out.println("日：" + ldt.getDayOfMonth());
      //同样还有时分秒的方法，就不一一列举了

      //2.使用DateTimeFormatter 对象来进行格式化
      //创建 DateTimeFormatter 对象
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
      String format = dateTimeFormatter.format(ldt); //按照所给的格式进行转换，并且返回为一个String类型对象
      System.out.println("格式化的日期：" + format);  //2024年04月10日 23:57:13

      //3.plus:增加……  minus:减少…… 都是传递的LocalDateTime对象
      LocalDateTime ldt1 = ldt.plusDays(8);
      System.out.println("8天后：" + dateTimeFormatter.format(ldt1));
      LocalDateTime ldt2 = ldt.minusMinutes(1);
      System.out.println("1分钟前：" + dateTimeFormatter.format(ldt2));
   }
}
