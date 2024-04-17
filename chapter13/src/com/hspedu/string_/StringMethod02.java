package com.hspedu.string_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringMethod02 {
   public static void main(String[] args) {
      //1.toUpperCase 字符串全部转为大写
      //2.toLowerCase 字符串全部小写
      //3.concat 拼接字符串 ---- 返回一个字符串对象，调用时并不会改变调用的对象
      String s1 = "wjh";
      s1 = s1.concat("dsg").concat("yes");
      System.out.println(s1);
      //4.replace 替换字符串中的字符(全部替换) --- 返回一个字符串对象 调用时并不会改变调用的对象
      //  使用replace不会改变s1 它返回一个对象，下例让s1接收替换后的对象，从而修改了s1
      s1 = "jjjjjjjjjj";
      s1 = s1.replace("j", "h");
      System.out.println(s1);
      //5.spilt 分割字符串 对于有特殊字符，需要加入转义符 \
      String s3 = "1,2,3,4,5";
      String[] s = s3.split(",");
      System.out.println("split:" + s[0]);
      //6.toCharArray() 将字符串转变为字符数组
      //7.compareTo() 比较两个字符串的大小，如果前者大返回正数，如果后者大返回负数，相等则返回0
      //  两个字符串怎么比大小
      String a = "jack";
      String b = "jacc";
      System.out.println(a.compareTo(b)); // 'k' - 'c' = 8
      //  如果长度不一致，就返回前者长度-后者长度


   }
}
