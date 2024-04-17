package com.hspedu.encap;

public class Account {
    //账号属性,为了封装，把属性设置成private
    private String name;
    private double balance;
    private String  passWord;

    //提供两个构造器

    public Account() {//无参构造器
    }

    public Account(String name, double balance, String passWord) {
        this.name = name;
        this.balance = balance;
        this.passWord = passWord;

        //即使传参，也需要对属性进行set
        //否则使用构造器，会直接破解掉set，后续对属性的限制都会消失
        setName(this.name);
        setBalance(this.balance);
        setPassWord(this.passWord);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { //给属性赋值
        if(name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        }else {
            System.out.println("输入的名字有误");
            this.name = "无名氏";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20) {
            this.balance = balance;
        }else {
            System.out.println("余额应该大于20");
            this.balance = 100;
        }
    }

    public String  getPassWord() {
        return passWord;
    }

    public void setPassWord(String  passWord) {
        if(passWord.length() == 6) {
            this.passWord = passWord;
        }else {
            System.out.println("密码只能由6位");
            this.passWord = "1314520";
        }
    }

    //展示属性
    public String info() {
        return "name=" + name + "\tbalance=" + balance + "\tpassword=" + passWord;
    }

}
