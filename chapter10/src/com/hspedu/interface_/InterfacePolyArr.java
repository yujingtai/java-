package com.hspedu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2]; //多态数组 -》 接口数组
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();

        for (int i = 0; i < usbs.length; i++) {
             usbs[i].work();
             if (usbs[i] instanceof Phone_) {
                 ((Phone_) usbs[i]).call(); //如果不进行 向下转型，那么编译通不过，Usb中没有这个方法
             }
        }
    }
}

interface Usb {
    void work();
}

class Phone_ implements Usb {
    @Override
    public void work() {
        System.out.println("Phone works");
    }

    public void call() {
        System.out.println("call phone");
    }
}

class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("Camera works");
    }
}