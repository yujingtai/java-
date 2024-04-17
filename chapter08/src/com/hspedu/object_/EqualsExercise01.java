package com.hspedu.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", 10, '男');
        Person person2 = new Person("Jack", 10, '男');
        Person person3 = new Student("Jack", 10, '男');
        System.out.println(person1.equals(person2));//一开始equals是Object类的，只能用来判断是否为同一个对象
        System.out.println(person1.equals(person3));

        System.out.println(person1);//输出对象时，会自动调用toString方法
    }

    public static class Student extends Person{
        public Student(String name, int age, char gender) {
            super(name, age, gender);
        }
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //重写toString() 方法


    @Override
    public String toString() {//alt+insert,系统直接帮忙重写好了，要来输出对象的属性
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    //重写Object中的equals方法,判断里面的属性是否完全一样
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof Person) {
            //向下转型，
            //explain:obj的编译类型是超类Object,可以说是Person的父类
            //与之前相同，首先判断obj的运行类型是否为Person，这也是为向下转型做准备
            //然后把 obj 强转为Person类，这样父类就可以访问子类的属性（或者调用子类特有方法）
            Person p = (Person) obj;
            return this.name == p.name && this.age == p.age && this.gender == p.gender;
            //return this.name == obj.name && this.age == obj.age && this.gender == obj.gender;
        }
        return false;
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}


