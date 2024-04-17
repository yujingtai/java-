package com.hspedu.extend.exercise;

public class Computer {//父类
    private String cpu;
    private int memory;
    private int disk;//硬盘

    //创建构造器，有参构造器
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回Computer信息
    public String getDetails() {
        return "cpu=" + cpu + " memory=" + memory + " disk=" + disk;
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
