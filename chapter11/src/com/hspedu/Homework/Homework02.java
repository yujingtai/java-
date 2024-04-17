package com.hspedu.Homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Force.getNextNum());
        System.out.println(Force.getNextNum());

        Force force1 = new Force();
        Force force2 = new Force();
        Force force3 = new Force();

        System.out.println(force1.getSerialNumber() + "\t" +
        force2.getSerialNumber() + "\t" + force3.getSerialNumber());
    }
}

class Force {
    private static int currentNum = 100000;

    private int serialNumber;
    public int getSerialNumber() {
        return serialNumber;
    }

    //构造器
    public Force() {
        serialNumber = getNextNum();
    }
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}
