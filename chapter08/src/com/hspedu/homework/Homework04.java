package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Employee employee = new Manager("tom", 200, 30,1.2);
        ((Manager)employee).setmSalary(2000);//不能直接用父类的引用来调用setmSalary,编译会报错，但是通过向下转型后就可调用子类的特有方法了
        System.out.println("经理" + employee.getName() + "的工资：" + employee.printSalary());

        employee = new Staff("smith", 150, 30,1);
        System.out.println("员工" + employee.getName() + "的工资：" + employee.printSalary());
    }
}
