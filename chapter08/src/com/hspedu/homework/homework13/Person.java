package com.hspedu.homework.homework13;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person() {

    }
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return getName() + "爱玩";
    }

    //有年龄来决定次序
    public void bubbling(Person[] persons) {
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            int index = -1;
            for (int j = 0; j < persons.length - i - 1; j++) {
                if ( persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                    index++;
                }
            }
            if (index == -1) {
                break;
            }
        }
    }
}
