package com.hspedu.poly_.poly_polyparameter;

public class Empolyee {//父类
    private String name;
    private double monSalary;
    //创建构造器
    public Empolyee(String name, double monSalary) {
        this.name = name;
        this.monSalary = monSalary;
    }

    public String getName() {
        return name;
    }

    public double getMonSalary() {
        return monSalary;
    }

    public double getAnnual() {//计算年工资
        double yearSalary = monSalary * 12;
        return yearSalary;
    }
}
