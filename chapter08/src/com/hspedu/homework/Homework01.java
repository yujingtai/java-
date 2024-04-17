package com.hspedu.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("tom", 56, "student");
        persons[1] = new Person("smith", 19, "student");
        persons[2] = new Person("milan", 28, "teacher");

        new Person().Bubbling(persons);
        for (Person p : persons) {
            System.out.println(p);
        }

    }
}

class Person {
    private String name;
    private int age;
    private String job;
    //无参构造器
    public Person() {}
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    //方法：根据age从大到小排列person
    public void Bubbling(Person[] persons) {
        //冒泡排序
        for (int i = 0; i < persons.length - 1; i++) {//轮数
            int index = -1;
            for (int j = 0; j < persons.length - i - 1; j++) {//每一轮中要转换的个数
                if (persons[j].age > persons[j + 1].age) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                    //让 index 作为标志
                    index++;
                }
            }
            if (index == -1) {//这一轮中没有任何交换，说明已经排好顺序了
                break;
            }
        }
    }

}
