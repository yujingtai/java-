package com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Student student = new Student("tom", "男", 18, "111");
        System.out.println(student.play());
        Teacher teacher = new Teacher("milan", "女", 28, 3);
        System.out.println(teacher.play());

        System.out.println("------------------------------");
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", "male", 19, "123");
        persons[1] = new Student("mary", "female", 17, "124");
        persons[2] = new Teacher("alice", "female", 30, 10);
        persons[3] = new Teacher("jane", "female", 28, 6);
        new Person().bubbling(persons);
        for (Person p : persons) {
            System.out.println("姓名：" + p.getName() + "\t年龄：" + p.getAge());
        }

        System.out.println("===============================");
        Student s = (Student) persons[3];
        System.out.println("学生信息如下：\n" + "姓名：" + s.getName() +
                "\n年龄：" + s.getAge() + "\n性别：" + s.getSex() +
                "\n学号：" + s.getStu_id());
        s.study();
        System.out.println(s.play());

    }
}