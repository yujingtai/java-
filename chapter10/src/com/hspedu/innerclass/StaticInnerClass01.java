package com.hspedu.innerclass;

/**
 * 小结：
 *      内部类共有四种：局部内部类、匿名内部类、成员内部类、静态内部类
 *      重点掌握 匿名内部类 ：new 类/接口(参数列表) {
                                             *         ....
                                             *      }；
 */
public class StaticInnerClass01 {
    public static void main(String[] args) {

        Outer10 outer10 = new Outer10();
        //外部其他类使用静态内部类
        //因为是静态内部类，所以可以直接使用类名来调用
        //方式一
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        //方式二
        //编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner10_ = outer10.getInner10();
        inner10_.say();
    }

}


class Outer10 { //外部类
    private int  n1 = 10;
    private static String name = "zhangsan";
    //静态内部类
    //1，定义在外部类的成员位置上，并且有static修饰
    //2.可以访问外部类的所有静态成员，包括私有的，但不能直接访问非静态成员
    //3.可以加任何修饰符
    //4.作用域：同为成员，为整个类整体
    //5.访问属性同样遵循就近原则，如果想调用外部类的属性， 外部类名.属性  这里中间没有this，因为是静态！
    static class Inner10 { //静态内部类
        private String name = "wjh";
        public void say() {
            System.out.println(name); //不能访问n1
            System.out.println(Outer10.name);
        }
    }

    public Inner10 getInner10() { //满足方式二，再外部类中创建一个 能够得到内部类实例的方法
        return new Inner10();
    }
}