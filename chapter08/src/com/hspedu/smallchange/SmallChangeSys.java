package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //老韩的风格：一段代码就完成一个功能，这种思想质朴又能理清思维；
    //           判断条件尽量去找不正确的条件
    //           记住 多分支if-else 肯定是比 if 单分支 更难懂后续也更难维护与修改

    //化繁为简
    //1、先完成显示菜单
    //2、完成零钱通明细
    //3、完成收益入账
    //4、完成消费

    public static void main(String[] args) {

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
                    System.out.print("入账金额：");
                    money = scanner.nextDouble();
                    //money 的值应该需要校验....
                    //找出不正确的金额条件，作为判断条件
                    if(money <= 0) {
                        System.out.println("收益入账需要大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();//获取时间
                    //这里的 += 雀氏很妙，既保留了之前的入账记录，又可以写下当前的入账
                    details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case "3" :
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    //money 需要校验
                    if(money <= 0 || money > balance) {
                        System.out.println("消费的金额应该在0 - " + balance);
                        break;
                    }
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    //更新details
                    details += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case "4" :
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
                    break;
                default :
                    System.out.println("选择有误，请重新选择");
            }

        }while(loop);

        System.out.println("-------退出零钱通系统--------");
    }
}
