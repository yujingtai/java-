package com.hspedu.try_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "wjh";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息：" + e.getMessage());
        } finally { //无论发不发生异常 都要进行finally
            System.out.println("finally代码块继续运行");
        }
    }
}
