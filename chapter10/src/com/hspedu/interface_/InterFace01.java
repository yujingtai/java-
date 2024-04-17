package com.hspedu.interface_;

public class InterFace01 {
    public static void main(String[] args) {
        //创建手机、相机对象
        //Camera实现了接口UsbInterface
        Camera camera = new Camera();
        //Phone实现接口UsbInterface
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("==================");
        computer.work(camera);
    }
}
