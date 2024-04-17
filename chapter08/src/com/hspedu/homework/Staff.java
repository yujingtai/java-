package com.hspedu.homework;

public class Staff extends Employee{
    private double grade;

    public Staff(String name, double dailySalary, int workDays, double grade) {
        super(name, dailySalary, workDays);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public double printSalary() {
        return super.printSalary() * grade;
    }
}
