package com.hspedu.enum_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        //Season spring = new Season("spring", "warm");
        //因为对于季节而言，他的对象是固定的四个，不会有更多
        //按照现在这个样子，不能体现出这种现象
        //因此使用枚举类
        System.out.println(Season.SPRING);
    }
}
class Season{
    private String name;
    private String desc;//描述

    public static final Season SPRING = new Season("春天", "温暖");
    //将构造器私有化，目的是防止，直接在外部new
    //2.去掉set方法，防止属性被修改
    //3.在season内部直接创建固定的对象

    private Season(String name, String desc) {
        this.desc = desc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


}