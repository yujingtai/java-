package com.hspedu.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager wjh = new Manager("wjh", 1, 20000);
        wjh.work();
    }
}

abstract class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee {
    private double bonus;
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "在工作");

    }
}
