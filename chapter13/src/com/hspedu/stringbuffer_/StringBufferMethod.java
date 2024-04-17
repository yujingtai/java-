package com.hspedu.stringbuffer_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringBufferMethod {
   public static void main(String[] args) {
      StringBuffer s = new StringBuffer("hello");
      //增加 --- 返回的是StringBuffer
      s = s.append("wjh").append(100);
      System.out.println(s.toString()); // hellowjh100
      //删除 --- 删除索引为>=start && <end 处的字符
      s.delete(3,5); //[3,5) 左闭右开
      System.out.println(s.toString());
      //replace(int n1, int n2, String str) --- 代替[n1, n2)为str
      String s2 = "wjjjjjj";
      StringBuffer sb = new StringBuffer(s2);
      sb = sb.replace(1, 8, "jhhhhhhhhhhh");
      System.out.println("raplace:" + sb.toString());
      //indexOf(String str) 查找指定的字串在字符串第一次出现的索引，找不到返回-1
      //insert(int n1, String str) 在下标为n1的地方插入str，原先的向后移
      //length() 返回字符串长度
   }
}
