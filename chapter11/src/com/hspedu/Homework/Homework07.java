package com.hspedu.Homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        new Car2(43.5).gerAir().flow();
    }
}

class Car2 {
    private double temperature;
    public Car2(double temperature) {
        this.temperature = temperature;
    }
    //Air 成员内部类
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("温度大于40，空调吹冷风");
            } else if (temperature < 0) {
                System.out.println("温度小于0，空调吹暖风");
            }

        }
    }

    //返回Air对象的一个方法
    public Air gerAir() {
        return new Air();
    }
}
