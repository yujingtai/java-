package com.hspedu.encap;

public class Encapsulation01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackrak");
        person.setAge(300);
        person.setSalary(30000.0);
        System.out.println(person.info());

        //工资是private类，是不能直接查看的
        //System.out.println(person.salary); 直接用对象来调用查看，是会报错的
        System.out.println(person.getSalary());//可以通过公有类方法来查看
    }
}

class Person {
    public String name;//公共
    private int age;//私有化
    private double salary;//私有化

    //自己写set 和 get 方法太麻烦，可以用快捷键
    //alt + insert
    //然后根据要求优化代码


    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验 相当于增加了业务逻辑
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("名字长度大于6");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <=120) {
            this.age = age;
        }else {
            System.out.println("你输入的年龄不对！");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性
    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}