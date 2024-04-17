package com.hspedu.try_;

import com.hspedu.exception_.NullPointerException_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class TryCatchDetail04 {
   public static void main(String[] args) {
      System.out.println(method()); //4
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
         return ++i; //同样不会直接返回，但i回自增1
      } finally {
         return ++i; //必须进行的fianlly 返回最后的值
      }
   }
}


