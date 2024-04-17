package com.hspedu.extend.improve;

//父类，pupil和graduate 的基类
public class Student {
    //公有属性
    public String name;
    public int age;
    private double score;

    //创建一个无参构造器
    public Student(String name,int age) {
        System.out.println("Student有参构造器被调用");
    }
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名：" + name + "  年龄：" + age + "  成绩：" + score);
    }
}
