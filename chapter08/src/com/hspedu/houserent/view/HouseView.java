package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;
import com.hspedu.houserent.utils.Utility;

import javax.crypto.spec.PSource;

/**
 * 1、显示界面
 * 2、接受用户输入
 * 3、调用 HouseService 完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);//设置数组大小为10

    //根据id来修改房屋信息
    public void update() {
        System.out.println("==================修改房屋信息=================");
        System.out.println("请选择待修改的房屋的编号：（-1代表退出）");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("==================放弃修改房屋信息=================");
            return;
        }

        //根据输入得到的updateId 查找对象
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("==================修改房屋的编号不存在=================");
            return;
        }

        System.out.print("姓名：(" + house.getName() + "):" );
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.print("电话：(" + house.getPhone() + "):");
        String phone = Utility.readString(11, "");
        if (!"".equals(phone)) {//如果不是换行
            house.setPhone(phone);
        }

        System.out.print("地址:(" + house.getAddress() + "):");
        String address = Utility.readString(16,"");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.print("租金:(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.print("状态：(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("==================放弃修改房屋信息成功=================");
    }


    //查找
    public void findHouse() {
        System.out.println("==================查找房屋信息=================");
        System.out.print("请输入你要查找的id:");
        int findId = Utility.readInt();

        //调用业务类的findById方法
        House house = houseService.findById(findId);
        if ( house != null) {
            System.out.println(house);
        } else {
            System.out.println("=================查找房屋信息id不存在================");
        }
    }



    //编写退出程序
    public void exit() {
        char ch = Utility.readConfirmSelection();//里面已经有无限循环，ch 只能是 Y\N
        if (ch == 'Y') {
            loop = false;
        }
    }

    //编写delHouse() 接受输入的id，调用Service的del方法
    public void delHouse() {
        System.out.println("==================删除房屋信息=================");
        System.out.print("请输入待删除的房屋编号（-1是退出）：");
        //接受用户的输入id
        int delId = Utility.readInt();
        //如果 delId 是 -1 就退出
        if (delId == -1) {
            System.out.println("=================放弃删除房屋信息================");
            return;
        }
        char choice = Utility.readConfirmSelection();//readConfirmSelection里面就有循环，如果输入的不是 Y/N 就出不来
        if (choice == 'Y') {
            //调用业务层的方法，完成删除功能
            if (houseService.del(delId)) {
                System.out.println("=================删除房屋信息成功================");
            } else {
                System.out.println("=================删除房屋信息失败================");
            }
        } else {
            System.out.println("=================放弃删除房屋信息================");
        }
    }


    //编写addHouse() 接受输入，创建House 对象 ，调用add方法
    public void addHouse() {
        System.out.println("============添加房屋============");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);

        //创建一个新的House对象，注意 ID 是系统分配的，用户不能选择
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)) {
            System.out.println("==========添加房屋成功==========");
        } else {
            System.out.println("==========添加房屋失败==========");
        }
    }
    //编写房屋列表
    public void listHouses() {
        System.out.println("\n==============房屋列表==============");
        System.out.println("编号\t房主\t电话\t地址\t\t月租\t状态(已出租/未出租)");
        House[] houses = houseService.list();//得到房屋信息
        for (House h : houses) {
            if (h != null) {
                System.out.println(h.toString()); //toString方法在 House 类中已经被重写
            }
        }
    }
    //显示主菜单
    public void mainMenu() {

        do{
            System.out.println("\n\n============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");

            System.out.print("请输入你的选择（1 - 6）：");
            key = Utility.readChar();
            switch (key) {
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    findHouse();
                    break;
                case '3' :
                    delHouse();
                    break;
                case '4' :
                    update();
                    break;
                case '5' :
                    listHouses();
                    break;
                case '6' :
                    exit();
                    break;
            }
        }while(loop);
    }
}
