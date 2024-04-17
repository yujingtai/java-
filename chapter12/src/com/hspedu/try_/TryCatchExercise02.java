package com.hspedu.try_;

import java.util.Scanner;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class TryCatchExercise02 {
    public static void main(String[] args) {
        getInteger();
    }

    public static void getInteger() {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("输入一个整数：");
                num = Integer.parseInt(scanner.next());
                flag = false;
                System.out.println("输入正确");
            } catch (Exception e) {
                System.out.println("重新输入");
            }
        }
    }
}
