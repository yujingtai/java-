package com.hspedu.annotation_;

import java.util.ArrayList;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class SuppressWarnings {
    //用来抑制警告
    //可以精确，也可以直接all
    @java.lang.SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");

        //作用范围 和 @SuppressWarnings 放置的位置有关
        //比如 @SuppressWarnings 放在main上面，那么作用范围就是main

    }
}
