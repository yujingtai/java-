package com.hspedu.innerclass;


/**
 * 匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer04().method();
    }
}

class Outer04 { //外部类
    private int n1 = 10;
    public void method() {
        //基于接口的匿名内部类
        //1.需求： 想使用IA接口，并创建对象
        //2.传统的写法：写一个类，实现该接口，并创建对象
//        IA tiger = new Tiger();
//        tiger.cry();
        //3.我想要的：Tiger类只使用一次，后面不再使用
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型 IA
        //6.tiger的运行类型 匿名内部类 xxxx =》Outer04$1 系统分配的
        /* 底层：
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎在咆哮");
                }
            }

         */
        //7.jdk底层在创建匿名内部类 Outer04$1，立马创建了Outer04$1的实例，并且把地址返回给 tiger
        IA tiger = new IA() { //基于接口的内部类
            @Override
            public void cry() {
                System.out.println("老虎在咆哮");
            }
        };
        tiger.cry();
        System.out.println("tiger.getClass=" + tiger.getClass());
        IA dog = new IA() {
            @Override
            public void cry() {
                System.out.println("小狗汪汪叫");
            }
        };
        dog.cry();
        System.out.println("dog.getClass=" + dog.getClass());


        //演示基于类的匿名内部类
        //分析
        //1.father编译类型Father
        //2.father运行类型 匿名内部类---Outer04$3
        //3.底层会创建匿名内部类
        /*
            class Outer04$3 extends Father { 继承关系
                @Override
                public void test() {
                    System.out.println("");
                }
            }
         */
        //4.同时也直接返回 匿名内部类 Outer04$3 对象
        Father father = new Father("jack") {//jack 会传递到Father的构造器
            @Override
            public void test() {
                System.out.println("匿名内部类中重写了test()方法");
            }
        };
        father.test();
        System.out.println("father的运行类型是" + father.getClass());

        //基于抽象类的匿名内部类
        //必须重写他的方法
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}

interface IA { //接口
    public void cry();
}
//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎在咆哮");
//    }
//}
class Father { //类
    public Father(String name) {
        //构造器
    }

    public void test() { //方法

    }
}

abstract class Animal {
    abstract void eat();
}
