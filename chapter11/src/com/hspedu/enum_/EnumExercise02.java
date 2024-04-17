package com.hspedu.enum_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("===所有的星期如下===");
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNSDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATUDAY("星期六"), SUNDAY("星期天");
    private String name;
    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

