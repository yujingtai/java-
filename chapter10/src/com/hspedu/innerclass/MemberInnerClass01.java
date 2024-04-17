package com.hspedu.innerclass;

/**
 * 成员内部类
 */
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        //outer08.t1();

        //外部其他类，使用成员内部类的三种方式,注意：能调用成员内部类的前提是，他不是 private 的权限
        //第一种方式：
        //将 new Inner08() 看作 outer08的一个属性，这就是一个语法，没什么纠结的
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        //第二种方式
        //在外部类中，编写一个方法，可以返回 Inner08 对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
    }
} 

class Outer08 { //外部类
    private int n1 = 10;
    public String name = "张三";

    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        Inner08 inner08 = outer08.new Inner08(); //在这里可以不用写成  Outer08.Inner08 inner08 = outer08.new Inner08();
    }

    //1.注意：成员内部类，是定义在外部类的成员位子上的
    //2.可以添加任何修饰符public protected private
    //3.外部类想要访问内部类的属性或者方法，需要先创建Inner的对象实例，再通过对象实例来访问
    //  同样，因为外部类与内部类在一个类中，所以无论是什么类型都是可以访问的
    class Inner08 { //成员内部类
        private int n1 = 33;
        private double sal = 99.9;
        public void say() {
            //可以直接访问外部类的所有成员
            //同样，如果有属性与外部类重名，遵循就近原则
            //同名的情况下，如果想访问外部类的属性，使用 外部类名.this.n1
            System.out.println("n1 = " + Outer08.this.n1 + "     name = " + name);
        }
    }

    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);//内部类的成员也都能在外部类使用
    }


    public Inner08 getInner08Instance() {
        return new Inner08(); //返回一个 Inner08 的对象
    }
}