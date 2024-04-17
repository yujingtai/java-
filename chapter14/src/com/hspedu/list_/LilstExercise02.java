package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class LilstExercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("hongloumeng",199.3 , "caoxueqing"));
        list.add(new Book("sanguoyanyi", 23.3, "luoguanzhong"));
        list.add(new Book("xiyouji", 334, "wuchengen"));

        //如何对列表排序
        System.out.println("排序前");
        for (Object object : list) {
            System.out.println(object);
        }

        sort(list); //使用冒泡对列表进行个排序
        System.out.println("排序后");
        for (Object object : list) {
            System.out.println(object);
        }


    }

    public static void sort(List list) {
        //根据价格排序
        for (int i = 0; i < list.size() - 1; ++i) {
            for (int j = 0; j < list.size() - 1 - i; ++j) {
                //取出对象Book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;
    private String autor;

    public Book(String name, double price, String autor) {
        this.name = name;
        this.price = price;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAutur() {
        return autor;
    }

    public void setAutur(String autor) {
        this.autor = autor;
    }

    public String toString() {
        return "名称：" + name + "\t\t价格：" + price + "\t\t作者：" + autor;
    }
}