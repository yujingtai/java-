package com.hspedu.Homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework06 {
   public static void main(String[] args) {
      Person tangseng = new Person("tangseng", new Horse());
      tangseng.common();
      tangseng.passRiver();
      tangseng.common();
      tangseng.passFireHill();
   }
}

interface Vehicles {
   public void work();
}

class Horse implements Vehicles{
   @Override
   public void work() {
      System.out.println("使用马儿");
   }
}

class Boat implements Vehicles {
   @Override
   public void work() {
      System.out.println("使用船过河");
   }
}

class Plane implements Vehicles {
   @Override
   public void work() {
      System.out.println("使用飞机过火焰山");
   }
}
class VehiclesFactory {

   //马儿应该使用一匹
    private static Horse horse = new Horse();//饿汉式
    //防止构造器会创建新的马
   private VehiclesFactory(){}

    public static Horse getHorse() {
       return new Horse();
    }

    public static Boat getBoat() {
       return new Boat();
    }

    public static Plane getPlane() {
      return new Plane();
    }
}

class Person {
   private String name;
   private Vehicles vehicles;

   public Person(String name, Vehicles vehicles) {
      this.name = name;
      this.vehicles = vehicles;
   }

   //编程思想，可以把具体的要求，封装成方法
   //把之前写的类、接口 全部用上
   //通过人，使用什么工具，过路或者过河
   public void passRiver() {
      if (!(vehicles instanceof Boat)) {
         //传进来的交通工具不是船（包括null）
         vehicles = VehiclesFactory.getBoat();
      }
      vehicles.work(); //接口的多态
   }

   public void common() {
      if (!(vehicles instanceof Horse)) {
         //传进来交通工具不是马
         vehicles = VehiclesFactory.getHorse();
      }
      vehicles.work();
   }

   public void passFireHill() {
      if (!(vehicles instanceof Plane)) {
         vehicles = VehiclesFactory.getPlane();
      }
      vehicles.work();
   }
}