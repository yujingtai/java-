package com.hspedu.stringbuilder;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class StringBuilderInsert {
   //实现剪切
   public static void main(String[] args) {
      StringBuilder stringBuilder = new StringBuilder("wjjjjjjhhhhhjjjj,jhhhh,jhh");
      //选择要减去的片段
      String str = new String(stringBuilder);
      String subStr = str.substring(1, 7); //包括1到6（不包括7）
      //在容器中删除该片段
      stringBuilder.delete(1, 7);
      //System.out.println(stringBuilder.toString());
      //准备插入到"," 与"jh"之间，如果有多个可插入的地方，选择第一个
      String s1 = ",";
      String s2 = "jh";
      int indexSub = stringBuilder.indexOf(s1 + s2);
      //System.out.println(indexSub);
      int insertPos = indexSub + s1.length(); //插入的位置
      stringBuilder.insert(insertPos, subStr);
      System.out.println(stringBuilder.toString());
   }
}
