package com.hspedu.homework;

public class Homework09 {
    public static void main(String[] args) {
        new LabelPoint(123, 432, "wjh");
    }
}

class Point {
    //属性

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabelPoint extends Point {
    private String label;
    public LabelPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}
