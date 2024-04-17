package com.hspedu.homework;

public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Professor("tom",38, "professor",30000, 1.3);
        teacher.introduce();
    }
}

class Teacher {//父类
    //属性
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //方法输出方法
    public void introduce() {
        System.out.println("name=" + name + "\tage=" + age + "\tpost=" + post + "\tsalary=" + salary + "\tgrade=" + grade);
    }
}
