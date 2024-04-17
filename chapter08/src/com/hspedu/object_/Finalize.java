package com.hspedu.object_;

public class Finalize {
    public static void main(String[] args) {

        Car bmw = new Car("宝马");
        bmw = null; //这时 Car 对象就是一个垃圾，垃圾回收器就会回收对象，在销毁对象前，会调用fianlize方法
                    //所以 程序员可以重写fianlize，就可以在fianlize中，写自己的业务逻辑代码（比如释放资源：数据库连接、或者打开文件）
                    //如果不重写方法，就为默认处理

        System.gc();//主动调用垃圾回收器，有概率调不出来，并且程序不会阻塞在这里，会继续往下走

        System.out.println("程序结束");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {//垃圾回收有自己的算法，并不是一旦有没有引用的对象，就会销毁这个垃圾
        System.out.println("销毁汽车！" + name);
    }
}
