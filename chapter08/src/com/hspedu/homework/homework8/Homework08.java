package com.hspedu.homework.homework8;

public class Homework08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(10);
        savingsAccount.deposit(10);
        savingsAccount.deposit(10);
        savingsAccount.deposit(10);
        System.out.println(savingsAccount.getBalance());//1039

        savingsAccount.earnMonthlyInterest();
        //savingsAccount.withdraw(10);
        System.out.println(savingsAccount.getBalance());
    }
}


class BankAccount {
    private double balance;//余额
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //存款 deposit
    public void deposit(double amount) {
        balance += amount;
    }

    //取款 withdraw
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {//扩展也是继承的意义之一


    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//重写父类的存钱方法
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount - 1);//重写父类的取钱方法
    }
}

class SavingsAccount extends BankAccount {//扩展父类
    //子类特有属性
    private int count = 3;//动态管理
    private double rate = 0.01;//利率 动态管理

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {//重写父类方法存钱
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount - 1);
        }
        count--;
    }

    //每个月有利息
    public void earnMonthlyInterest() {
        count = 3;//一旦调用这个方法，就把次数重置
        super.deposit(getBalance() * rate);//将利息存入余额
    }
}
