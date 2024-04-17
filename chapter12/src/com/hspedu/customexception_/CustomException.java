package com.hspedu.customexception_;

/**
 * @author 吴金辉
 * @version 1.0
 */

//throws:在方法声明处，后面接异常类型
//throw:在方法体内部，后面接异常对象，代表手动生成一个异常对象
public class CustomException { //自定义异常
   public static void main(String[] args) {
      int age = 180;
      //要求范围在 18 - 120 之间，否则抛出一个自定义异常
      if (age < 18 || age > 120) {
         //可以通过构造器，设置信息
         throw new AgeException("年龄不在范围内"); //注意是 throw 而不是 throws
      }

      System.out.println("年龄正常！");
   }
}

//自定义一个异常
//有两种 ： Exception---编译时异常   RuntimeException----运行时异常
//1.一般情况，我们自定义异常是继承 RuntimeException
//  如果继承 Exception 那么调用自定义类的方法 还需要加上 throws 自定义异常
class AgeException extends RuntimeException {
   public AgeException(String message) {
      super(message);
   }
}
