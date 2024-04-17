package com.hspedu.homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

        try {
            //先验证输入的参数个数是否正确 两个参数
            if (args.length != 2) {
                //自定义抛出异常，再通过catch来捕获异常
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            //把接收到的参数，转成整数
            //有可能发生NumberFormatException
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2); //这里可能会抛出ArithmeticException
            System.out.println("计算结果为：" + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }

    //cal方法，计算两数相除
    public static double cal(int n1, int n2) {
        return n1 / n2;
    }

}


