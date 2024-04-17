package com.hspedu.date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {
        //时间戳
        //1.通过静态方法 now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //2.通过 from 可以把 Instant转成 Date
        Date date = Date.from(now);
        System.out.println(date);
        //3.可以通过 toInstant() 转回来
        Instant instant = date.toInstant();
    }
}
