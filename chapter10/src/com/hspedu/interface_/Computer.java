package com.hspedu.interface_;

public class Computer {
    //编写一个方法，计算机工作
    //1、UsbInterface usbInerface 形参是接口类型 UsbInterface
    //2、并由此接受实现了 UsbInterface 接口的类的对象实例----接口的多态性
    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }
}
