package com.hspedu.extend;

public class Extends01 {
    public static void main(String[] args) {
        //对 他们的属性进行赋值，然后调用方法

        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("--------------");
        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 18;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
