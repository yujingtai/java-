package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.utils.Utility;

/**
 * HouseService
 * 定义House[] , 保存House对象
 * 响应HouseView的调用
 * 完成对房屋信息的各种调用：crud
 */
public class HouseService {//业务层
    private House[] houses; //保存House对象
    private int houseNums = 1; //记录当前有多少个房屋信息
    private int idCounter = 1; //房子前面的序号，初始化为1，后续新增房源时，idCounter要自增
    //构造器
    public HouseService(int size) {
        houses = new House[size];//创建HouseService对象 指定数组大小
        //先写一个
        houses[0] = new House(1,"Tom", "1233", "Pairs", 2000, "未出租");
    }

    //find 方法，根据id查找房源
    public House findById(int findId) {//如果没有对象可以返回，那么就返回一个null

        //遍历
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }

        return null;
    }

    //del 方法，删除一个房屋信息
    public boolean del(int delId) {
        //先要找到 删除房屋的下标
        int index = -1;//设置一个标志符
        for (int i = 0; i < houseNums; i++) {//遍历一遍房屋的列表
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        //找到了
        //这里要真正的实现删除
        //要实现数组的删除
        for (int i = index; i < houseNums - 1 ; i++) {
            houses[i] = houses[i + 1];
//            int newId = houses[i].getId() - 1;//别改id
//            houses[i].setId(newId);
        }
        houses[--houseNums] = null; //把当前存在的房屋信息的最后一个 置空，，不能用数组呀，数组可能很长没有填满房屋信息
        return true;
    }



    //add方法，添加新对象，放回boolean
    public boolean add(House newhouse) {
        //判断是否还可以继续添加（考虑数组扩容问题）
        if (houseNums >= houses.length) { //
            //数组扩容
            //新创建一个数组
            House[] houses1 = new House[houseNums];
            for (int i = 0; i < houses.length; i++) { //把原先的数组中的元素 先拷贝一遍
                houses1[i] = houses[i];
            }

            //把newHouse对象加入到
            houses1[houseNums++] = newhouse;//先放入新房源，然后自增houseNums
            newhouse.setId(++idCounter); //先自增，然后set
        } else {
            //把newHouse对象加入到
            houses[houseNums++] = newhouse;//先放入新房源，然后自增houseNums
            newhouse.setId(++idCounter); //先自增，然后set
        }

        return true;
    }

    //list方法，返回所有房屋的信息
    public House[] list() {
        return houses;
    }
}
