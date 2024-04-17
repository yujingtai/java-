package com.hspedu.homework;

public class Homework05 {//测试类

    public static void main(String[] args) {
        Employee05 employee05 = new Worker("Tom", 3000);
        employee05.setSalMonth(10);
        employee05.printSal();
        employee05 = new Teacher05("Simth", 3500);
        ((Teacher05)employee05).setClassSal(200);
        ((Teacher05)employee05).setClassDay(360);
        employee05.printSal();
        employee05 = new Sciencist("milan", 5000);
        ((Sciencist)employee05).setYearSal(200000);
        employee05.printSal();
    }
}

class Employee05 {//父类
    //属性
    private String name;
    private double salary;//月工资
    private int salMonth = 12;//带薪月份默认为12，对于一些职业，可能13，15...所以将他动态管理

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public Employee05(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //父类中打印工资方法
    public void printSal() {
        System.out.println(salary * salMonth);
    }
}

class Worker extends Employee05 {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.println("工人" + getName() + "的工资：" + getSalary() * getSalMonth());//年薪
    }
}

class Teacher05 extends Employee05 {
    //教师特有的属性
    private double classSal;//动态管理
    private int classDay;//动态管理

    public Teacher05(String name, double salary) {
        super(name, salary);
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    @Override
    public void printSal() {
        System.out.println("教师" + getName() + "的工资：" + (getSalary() * getSalMonth() + classSal * classDay));
    }
}

class Sciencist extends Employee05 {
    private double yearSal;//动态管理

    public Sciencist(String name, double salary) {
        super(name, salary);
    }

    public double getYearSal() {
        return yearSal;
    }

    public void setYearSal(double yearSal) {
        this.yearSal = yearSal;
    }

    @Override
    public void printSal() {
        System.out.println("科学家" + getName() + "的工资：" + (getSalary() * getSalMonth() + yearSal));
    }
}