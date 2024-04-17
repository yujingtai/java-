package com.hspedu.poly_.poly_polyparameter;

public class Manager extends Empolyee {
    private double bonus;
    //创建构造器
    public Manager(String name, double monSalary, double bonus) {
        super(name, monSalary);
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("经理" + getName() + "在管理员工");
    }
    //子类重写方法
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
