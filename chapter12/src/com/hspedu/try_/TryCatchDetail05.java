package com.hspedu.try_;

/**
 * @author 吴金辉
 * @version 1.0
 */

/**
 * try-catch-finally小结：
 * ！！在try或者catch中返回时，要优先执行finally！！
 * 1.如果没有出现异常，则执行try块中所有的语句，不执行catch块中语句，
 *   如果有finally，最后还要执行finally里面的语句
 * 2.如果出现异常，则try块中异常发生后，try剩下的语句不再执行，将执行catch中的语句，
 *   如果有finally，最后还需要执行finally里面的语句
 *
 */
public class TryCatchDetail05 {

    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            names[3] = "wjh"; //先碰到NullPointerException,跳转到相应的catch
            if (names[1] == "wjh") {
                return 1;
            }
            return ++i;
        } catch (ArrayIndexOutOfBoundsException e) {
            return ++i;
        } catch (NullPointerException e) {
            return ++i; //finally中没有返回，所以会在NullPointerException中返回，但是！并不是返回i本身，而是一个临时变量temp = 3
        } finally {
            ++i;
            System.out.println("i = " + i);
        }
    }
}


