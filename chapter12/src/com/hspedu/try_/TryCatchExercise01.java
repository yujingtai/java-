package com.hspedu.try_;

import com.hspedu.exception_.NullPointerException_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class TryCatchExercise01 {
    public static void main(String[] args) {
        System.out.println(method()); //返回4
    }

    public static int method() {
        try {
            String[] names = new String[3]; //初值为 null
            if (names[1].equals("wjh")) { // 先捕获：NullPointerException
                System.out.println(names[1]);
            } else {
                names[3] = "wjh"; // ArrayOutOfIndexException
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally { //!!!fianlly是必须执行的，即使异常已经被前面的子类异常捕获并且有返回值，也要跳转过来执行fianlly
            //return 4;
            System.out.println("4");
        }
    }
}
