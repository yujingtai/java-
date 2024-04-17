package com.hspedu.try_;

import com.hspedu.exception_.NullPointerException_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        //1.如果try代码块有可能有多个异常
        //2.可以使用多个catch 分别捕获不同的异常，相应处理
        //！！！必须注意 子类异常必须写在前面，父类异常写在后边
        //              防止异常直接被父类异常捕获，程序会报错的

        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName()); //NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2; //ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常：" + e.getMessage());
        } catch (Exception e) {

        } finally {

        }

    }

}


class Person {
    private String name;
    public String getName() {
        return this.name;
    }
}