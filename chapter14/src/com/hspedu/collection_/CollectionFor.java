package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.2));
        col.add(new Book("小李飞刀", "古龙", 23.2));
        col.add(new Book("红楼梦", "曹雪芹", 123.3));

        //使用增强for循环 --- 快捷键是 I
        //其底层还是调用迭代器，是个简化版的迭代器
        for (Object obj : col) {
            System.out.println(obj);
        }

        List<Dog> list = new ArrayList<>();
        list.add(new Dog("yuzhongyuan", 20));
        list.add(new Dog("wangxin", 19));
        list.add(new Dog("shangyi", 20));

        //使用迭代器
        //首先创建自己的迭代器
        Iterator<Dog> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //使用增强for
        for (Dog dog : list) {
            System.out.println(dog);
        }

    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}