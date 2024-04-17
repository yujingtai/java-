package com.hspedu.houserent;

import com.hspedu.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView的对象，这是系统的入口
        new HouseView().mainMenu();
        System.out.println("系统已退出！");

    }
}
