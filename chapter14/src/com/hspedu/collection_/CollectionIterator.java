package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 吴金辉
 * @version 1.0
 */

/**
 * 解释一下迭代器iterator
 *      Iterator是一个接口 只要是实现了Interable接口的类，都是可用interator()方法来获取本身的迭代器，进行迭代器遍历
 * 1.iterator不是存储器
 * 2.iterator一开始指向首元素的上方，通过hasNext()来判断下一个元素是否为空
 *   如果不为空返回true,否则返回false.
 * 3.next()方法是返回下一个元素，他通常要和hasNext()结合使用，防止报错
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.2));
        col.add(new Book("小李飞刀", "古龙", 23.2));
        col.add(new Book("红楼梦", "曹雪芹", 123.3));

        //使用迭代器来遍历col
        //1.先得到 col 对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环 --- 快捷键itit 又是记不住快捷键可以用ctrl + j显示
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next); //默认调用toString()
        }
        //3.当退出while后，这时iterator迭代器，指向最后的元素
        //iterator.next();  //报错：NoSuchElementException
        //如果还想循环，可以重置迭代器
        iterator = col.iterator();
        iterator.next();
    }
}

class Book {
    private String name;
    private String autor;
    private double price;

    public Book(String name, String autor, double price) {
        this.name = name;
        this.autor = autor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
                ", autor='" + autor + '\'' +
                ", price=" + price +
                '}';
    }
}
