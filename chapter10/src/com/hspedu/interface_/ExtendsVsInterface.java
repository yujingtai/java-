package com.hspedu.interface_;

/**
 * 继承是 is-a 的关系，接口是 like-a 的关系
 * 接口在一定程度上实现代码的的解耦，（接口的规范性+动态绑定机制P）
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();
        wukong.flying();
        wukong.swimming();
    }
}

//猴子
class Monkey {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println("猴子会爬树");
    }
    public Monkey(String name) {
        this.name = name;
    }
}

//继承
class LittleMonkey extends Monkey implements Fishable, Birdable{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学🐟，学会游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 通过学鸟，学会飞");
    }
}

interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}