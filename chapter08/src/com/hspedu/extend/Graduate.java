package com.hspedu.extend;
//大学生 考试简单情况
public class Graduate {
    //可以发现，大部分代码都与小学生一样
    //代码复用性很差
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("大学生 " + name + " 正在考大学数学");
    }
    public void showInfo() {
        System.out.println("学生名：" + name + "  年龄：" + age + "  成绩：" + score);
    }
}
