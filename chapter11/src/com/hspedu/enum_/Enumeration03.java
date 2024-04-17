package com.hspedu.enum_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.SPRING);
    }
}

//使用 enum 关键字类实现枚举类
enum Season2 { //自动继承了一个父类 Eumn
    //1.使用关键字enum来代替class
    //2.public static fianl Season SPRING = new Season("春天" , "温暖") 直接使用
    //  SPRING("春天", "温暖") 解读成 常量名(实参列表)
    //3.如果有多个常量（对象）， 使用 , 隔开即可
    //4.要将定义的常量对象 写在前面 ，枚举对象必须放在枚举类的行首
    //5.如果使用无参构造器，创建常量，则甚至可以省略小括号
    SPRING("春天", "温暖"), SUMMER("夏天","炎热"), Autumn("秋天", "凉快"),What;
    private String name;
    private String desc;

    private Season2() { //无参构造器

    }
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
