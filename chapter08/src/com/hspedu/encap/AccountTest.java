package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        //安置属性
        //因为属性是private，不可能在类外给其赋值
        //所以需要使用该类提供的public方法来访问属性，修改属性

        //直接使用构造器来初始化，并且在构造器中有了set，就无需担心
        Account account1 = new Account("吴金辉", 100, "2341235");
        //展示
        System.out.println(account1.info());


    }
}
