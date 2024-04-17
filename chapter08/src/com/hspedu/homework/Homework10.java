package com.hspedu.homework;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Tom", 27, "dentist", "男", 2345);
        Doctor doctor1 = new Doctor("Tom", 37, "dentist", "男", 2345);
        System.out.println(doctor1.equals(doctor));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {//重写Object中的方法，判断对象的属性是否相等
        if (this == obj) {//如果是同一对象，直接就返回true
            return true;
        }
        if (!(obj instanceof Doctor)) {//obj 不是 Doctor 的类或者子类，就无法向下转型，直接false吧
            return false;
        }
        //新增方法,判断属性是否相等
        Doctor d = (Doctor)obj;//向下转型
        if (this.getName().equals(d.name)  && this.age == d.age && this.gender.equals(d.gender) && this.job.equals(d.job)) {
            return true;
        }
        return false;
    }
}
