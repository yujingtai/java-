package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 1.1);
        books[1] = new Book("金瓶梅", 0.9 );
        books[2] = new Book("青年文摘342", 0.5);
        books[3] = new Book("java全集", 3.5 );

        //1.冒泡排序 --- 从小到大
        //bubble01(books);

        //2.根据price 自定义排序 --- 从大到小
        bubble02(books, new Comparator() { //实现匿名内部类
            @Override
            public int compare(Object o1, Object o2) {
                double i1 = (Double)o1;
                double i2 = (Double)o2;
                return (int) (i2 - i1); //从大到小
            }
        });

        //3.根据书名长度 自定义+Arrays.sort()
        Arrays.sort(books, new Comparator<Book>() { //看得出来很灵活，想用什么属性来排序，只需要重写匿名内部类即可
            @Override
            public int compare(Book o1, Book o2) {
                return (o1.getName().length() - o2.getName().length());
            }
        });

//        for (Book book : books) {
//            System.out.println(book);
//        }
        System.out.println(Arrays.toString(books));
    }

    public static void bubble01(Book[] books) {
        int n = books.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                if (books[j].getPrice() > books[j + 1].getPrice()) {
                    double temp = books[j].getPrice();
                    books[j].setPrice(books[j + 1].getPrice());
                    books[j + 1].setPrice(temp);
                }
            }
        }
    }

    //冒泡 + 自定义 + 根据price
    public static void bubble02(Book[] books, Comparator c) {
        int n = books.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                if (c.compare(books[j].getPrice(), books[j + 1].getPrice()) > 0) {
                    double temp = books[j].getPrice();
                    books[j].setPrice(books[j + 1].getPrice());
                    books[j + 1].setPrice(temp);
                }
            }
        }
    }

    //冒泡 + 自定义 + 根据书名长度
    public static void bubble03(Book[] books, Comparator c) {
        int n = books.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                if (c.compare(books[j].getName(), books[j + 1].getName()) > 0) {
                    String temp = books[j].getName();
                    books[j].setName(books[j + 1].getName());
                    books[j + 1].setName(temp);
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
