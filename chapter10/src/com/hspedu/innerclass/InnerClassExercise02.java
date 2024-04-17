package com.hspedu.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //1.传递的是实现了 Bell 接口的匿名内部类
        //2.
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了！");
            }
        });

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了！");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell) { //参数是 实现Bell接口
        bell.ring(); //具有动态绑定，要根据bell的实际运行类型来决定
    }
}
