package com.hspedu.poly_.polyarr_;

public class Student extends Person{
    private double score;//没有特殊说明，属性一般都声明为private

    public Student(String name, int age, double score) {//子类构造器
        super(name, age);//初始化父类
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + " score=" + score;
    }

    //特有方法
    public void study() {
        System.out.println("学生 " + getName() + "正在上课");
    }
}
