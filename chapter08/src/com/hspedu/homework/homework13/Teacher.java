package com.hspedu.homework.homework13;

public class Teacher extends Person{
    //特有属性
    private int work_age;//工龄

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    //教师特有方法
    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }
}
