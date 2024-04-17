package com.hspedu.innerclass;

/**
 * 匿名内部类的最佳实践
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
       Picture picture = new Picture();
       picture.show();

        //直接将匿名内部类做参数传递
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一张美丽的风景画");
            }
        }); //这样的好处是如果类只使用一次，就不用专门去创建一个 Picture 的类
    }

    //静态方法
    public static void f1(IL il) {
        il.show();
    }
}

//接口
interface IL {
    void show();
}

//类-》实现IL-》在编程领域称之为 “硬编码”，比较死板
class Picture implements IL {

    @Override
    public void show() {
        System.out.println("这是一张美丽的风景画");
    } //如果要修改的话，会一改俱改
}