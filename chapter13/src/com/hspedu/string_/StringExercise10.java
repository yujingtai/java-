package com.hspedu.string_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringExercise10 {

}

class Test1 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char[] ch) {
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.change(test1.str, test1.ch);
        System.out.print(test1.str + " and ");
        System.out.println(test1.ch);
        //输出 hsp and hava
        //没什么好说的，不要死记结论，在脑子里画jvm内存图
        //那些创建在堆中，又有哪些实在栈中存在的，通过所指得到答案
    }
}
