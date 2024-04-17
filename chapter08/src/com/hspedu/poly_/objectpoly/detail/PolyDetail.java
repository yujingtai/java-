package com.hspedu.poly_.objectpoly.detail;

public class PolyDetail {
    //要写主方法！！
    public static void main(String[] args) {


        //体验向上转型

        //左边是编译类型，右边是运行类型
        Animal animal = new Cat();
        Object obj = new Cat();//同样，即使跨越了阶级，同样是可以编译成功的

        //注意点
        //1、可以调用父类的所有成员（方法和属性），但要遵循访问权限
        //2、不可以调用子类的特有的成员，
        //   因为在编译时，编译器认为animal是Animal的对象，所以无法访问子类的新增成员
        //animal.catchMouse(); //报错根本无法解析，catchMouse是子类的特有成员方法，javac编译识别不了


        //但是在运行时，由java来执行，这时候要看的是运行类型
        //animal的运行类型是 cat
        //所以调用方法先从 cat 子类开始，查找顺序 与之前的完全相同
        animal.eat();
        animal.sleep();//如果子类没有，就往上一级寻找，（遵守访问权限）

        //现在我想要调用Cat的 catchMouse 方法
        //多态的向下转型
        //编译类型是Cat，
        Cat cat = (Cat) animal;//要求父类的引用必须指向的是当前目标类型的对象，在之前animal的本质就是cat
        cat.catchMouse();

        //如果，animal 并没有先向上转型成Dog 而直接向下转型，就会有运行错误
        //dog 和 cat 虽然都是继承的 animal ,但是它们两者之间是没有任何关系的，狗的对象不能指向猫
        Dog dog = (Dog) animal;//编译并不会报错，但是运行起来就会显示错误



    }

}
