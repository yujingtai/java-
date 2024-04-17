package com.hspedu.system_;

import java.util.Arrays;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class System_ {
    public static void main(String[] args) {

//        //exit 退出当前程序
//        System.out.println("ok1");
//        //0表示一个正常的状态
//        System.exit(0);
//        System.out.println("ok2"); //不会输出

        //arraycopy: 复制数组元素，比较适合底层调用
        //但在应用中，通常使用Arrays.copyOf完成复制数组
        int[] src = {1,2,3};
        int[] dest = new int[3];
        //        @param      src      the source array.
        //        @param      srcPos   starting position in the source array.
        //        @param      dest     the destination array.
        //        @param      destPos  starting position in the destination data.
        //        @param      length   the number of array elements to be copied.
        //length(要复制的元素个数)必须小于原数组长度&&目标数组长度
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println(Arrays.toString(dest));

        //currentTimeMillens 返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());

        //gc 运行垃圾回收机制 System.gc();
        System.gc();
    }
}
