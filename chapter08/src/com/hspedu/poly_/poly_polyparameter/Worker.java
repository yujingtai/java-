package com.hspedu.poly_.poly_polyparameter;

public class Worker extends Empolyee {
    //创建构造器

    public Worker(String name, double monSalary) {
        super(name, monSalary);
    }

    public void work() {//子类特有方法 工作
        System.out.println("员工" + getName() + "在工作");
    }
    //子类重写方法
    public double getAnnual() {
        return super.getAnnual();
    }
}
