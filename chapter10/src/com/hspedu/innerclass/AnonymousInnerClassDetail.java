package com.hspedu.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        //外部其他类不能访问 匿名内部类
    }
}

class Outer05 {
    private int n1 = 100;
    public void f1() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符，因为他是一个局部变量
        //作用域：仅仅在 定义它的方法或代码块中

        Person person = new Person() {
            private int n1 = 44;
            @Override
            public void hi() {
                //可以直接访问外部类的所有成员，包括私有的
                //如果外部类和匿名内部类的成员重名，匿名内部类访问的话，
                //默认遵循就近原则，如果想访问外部类的重名成员，只用（外部类名.this.成员）去访问
                System.out.println("内 n1 = " + n1);
                System.out.println("外 n1 = " + Outer05.this.n1); //Outer05.this 就是 调用f1()的对象outer05
                System.out.println("匿名内部类重写 hi 方法");
            }
        };  //这里的；表示这一大块本身就是个句子，也就是将匿名对象的地址赋给person这个引用
        person.hi(); //动态绑定，真实的运行类型是 Outer05$1

        //还可以直接这样写
        new Person() {
            @Override
            public void hi() {
                System.out.println("这一大块本身就是一个对象");
                System.out.println("匿名内部类重写 hi 方法");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack"); //可以传参的



    }
}
class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok() " + str);
    }
}

//抽象类接口