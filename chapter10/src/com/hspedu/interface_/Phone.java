package com.hspedu.interface_;

public class Phone implements UsbInterface{
    //phone实现UsbInterface
    //phone要实现UsbInterface的所有方法

    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
