package com.hspedu.stringbuffer_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringAndStringBuffer {
   public static void main(String[] args) {
      // String->StringBuffer
      String str = "hello tom";
      //1.使用StringBuffer的构造器
      StringBuffer stringBuffer = new StringBuffer(str);
      //2.使用append方法
      StringBuffer stringBuffer1 = new StringBuffer();
      stringBuffer1 = stringBuffer1.append(str);

      //StringBuffer -> String
      StringBuffer stringBuffer2 = new StringBuffer("wjh");
      //1.toString()
      String s = stringBuffer2.toString();
      //2.使用Stirng的构造器
      String s1 = new String(stringBuffer2);
   }
}
