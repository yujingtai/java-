package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    该类是完成零钱通的各个功能的类
    使用OOP
    将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    //属性
    //定义相关变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = " ";

    String details = "-----------零钱通明细------------";

    //增加 收益入账 的变量
    double money = 0;
    Date date = null;//获取实时时间
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");//格式化时间
    double balance = 0;//余额

    //新增消费所需的变量
    String note = " ";

    //退出所需变量
    char ch = ' ';

    //方法 零钱通界面
    public void mainLooking() {
        do {

            System.out.println("\n--------------零钱通--------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.print("请选择1 - 4：");
            key = scanner.next();

            //使用switch 分支控制
            switch (key) {
                case "1" :
                    System.out.println(details);
                    break;
                case "2" :
                   this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                    this.outSys();
                    break;
                default :
                    System.out.println("选择有误，请重新选择");
            }

        }while(loop);
        System.out.println("-------退出零钱通系统--------");
    }


    //方法2：收益入账
    public void income() {
        System.out.print("入账金额：");
        money = scanner.nextDouble();
        //money 的值应该需要校验....
        //找出不正确的金额条件，作为判断条件
        if(money <= 0) {
            System.out.println("收益入账需要大于0");
            return;
        }
        balance += money;
        date = new Date();//获取时间
        //这里的 += 雀氏很妙，既保留了之前的入账记录，又可以写下当前的入账
        details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
        return;
    }

    //方法 3、消费
    public void pay() {
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        //money 需要校验
        if(money <= 0 || money > balance) {
            System.out.println("消费的金额应该在0 - " + balance);
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        //更新details
        details += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
        return;
    }

    //方法 4、退出
    public void outSys() {
        //增加一个死循环
        while (true) {//输入不是 y/n 就出不去
            System.out.println("你确定要退出吗？y/n");
            ch = scanner.next().charAt(0);
            if (ch == 'y' || ch == 'n') {
                break;
            }else {
                System.out.println("输入有误，重新输入");
            }
        }
        //退出循环，就一定是 y/n ,此时再来判断是否退出菜单页面
        if (ch == 'y') {
            loop = false;
        }
        return;
    }
}
