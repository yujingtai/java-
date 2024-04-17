package com.hspedu.single_;

//单例模式

import sun.reflect.generics.tree.BottomSignature;

import java.awt.*;

public class SingleTon01 {
    public static void main(String[] args) {

        //通过公共的方法来获取对象,饿汉式
        GirlFriend instance = GirlFriend.getInstance();//静态方法无需对象调用，可以直接用过类名调用

        //懒汉式
        BoyFriend instance1 = BoyFriend.getInstance();

    }

}

//有一个类，Girlfriend
//只能由一个女朋友
class GirlFriend {
    private String name;

    private static GirlFriend gf = new GirlFriend("xiaohong");//为了能在静态方法中返回gf对象
    //如何保证我们只能创建一个 GirlFriend 对象
    //单例模式-饿汉式
    //1、将构造器私有化
    //2、在类的内部直接创建一个对象
    //3、提供一个公共的static方法，返回 gf 对象
    //缺点：会造成资源浪费，比如没有使用对象，但是在加载类的时候就创建了对象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }
}

class BoyFriend {
    private String name;
    private static BoyFriend bf;//不直接创建对象
    //懒汉式：
    //缺点：有线程安全问题，但是不会造成资源浪费
    private BoyFriend(String name) {//构造器私有化，是的无法在类外实例对象，保证单例模式
        this.name = name;
    }

    public static BoyFriend getInstance() {
        if (bf == null) {
            bf = new BoyFriend("xiaoming");
        }
        return bf;
    }

}