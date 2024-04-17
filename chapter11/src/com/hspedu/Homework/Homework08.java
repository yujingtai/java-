package com.hspedu.Homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework08 {
   public static void main(String[] args) {
      //演示 枚举类的 switch 使用
      Color blue = Color.BLUE;
      blue.show();

      //演示 枚举类的 switch 使用
      switch (blue) { //枚举对象
         case RED:
            System.out.println("匹配到红色");
            break;
         case BLUE:
            System.out.println("匹配到蓝色");
            break;
         default:
            System.out.println("没匹配到");
            break;
      }
   }
}

interface tools {
   void show();
}
enum Color implements tools{
   RED(255, 0, 0), BLUE(0, 0, 255);
   private int redValue;
   private int greenValue;
   private int blueValue;

   Color(int redValue, int greenValue, int blueValue) {
      this.redValue = redValue;
      this.greenValue = greenValue;
      this.blueValue = blueValue;
   }

   @Override
   public void show() {
      System.out.println("属性值：" + redValue + " " + greenValue + " " + blueValue);
   }
}
