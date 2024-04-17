package com.hspedu.homework;

public class Manager extends Employee {
    //Manager特有属性
    private double grade;
    private double mSalary;//奖金不固定，所以最好不要在，构造器中直接初始化，通过 setmSalary 来动态指定奖金

    public Manager(String name, double dailySalary, int workDays, double grade) {
        super(name, dailySalary, workDays);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getmSalary() {
        return mSalary;
    }

    public void setmSalary(double mSalary) {
        this.mSalary = mSalary;
    }

    @Override
    public double printSalary() {
        return super.printSalary() * grade + mSalary;
    }
}
