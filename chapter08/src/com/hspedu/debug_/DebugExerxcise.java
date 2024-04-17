package com.hspedu.debug_;

public class DebugExerxcise {
    public static void main(String[] args) {
        //创建对象的流程
        //1、加载Person类的信息
        //2、初始化：默认初始化、显示初始化、构造器初始化
        //3、返回对象地址.
        Person jack = new Person("jack", 20);
        System.out.println(jack);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//class Student extends Person
