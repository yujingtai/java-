package com.hspedu.homework;

public class Employee {//父类
    //员工属性
    private String name;
    private double dailySalary;
    private int workDays;

    public Employee(String name, double dailySalary, int workDays) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    //员工方法：打印工资
    public double printSalary() {
        return dailySalary * workDays;//单日工资*工作天数
    }
}
