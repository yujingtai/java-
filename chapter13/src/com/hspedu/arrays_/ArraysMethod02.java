package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ArraysMethod02 {
   public static void main(String[] args) {
      Integer[] arr = {1, 2, 90, 123, 567};

      //binarySearch 通过二分搜索法进行查找，要求必须排好
      //1.使用binarySearch 二叉查找
      //2.要求数组是有序的
      //3.如果数组中不存在该元素，则return -(low + 1); 此处的low指的是原本它应该在的位置
      int index = Arrays.binarySearch(arr, 123); //3
      System.out.println(index);

      //copyOf 数组元素的复制
      //1.从arr数组中，拷贝arr.length个元素到 newArr数组中
      //2.如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
      //3.如果拷贝长度为负数，则报错NegativeArraySizeException
      Integer[] newArr = Arrays.copyOf(arr, 1);
      System.out.println(Arrays.toString(newArr));

      //fill 数组的填充 --- 相当于是全部替换，并非在后面加上新元素
      Integer[] num = new Integer[]{9, 3, 2};
      Arrays.fill(num, 99);
      System.out.println(Arrays.toString(num)); // 99，99，99

      //equals 比较两个数组元素是否完全相同
      Integer[] arr2 = {1,2,90, 123};
      boolean e = Arrays.equals(arr, arr2);
      System.out.println(e); //false

      //asList 将一组值 转换成list列表
      //1.asList方法，会将(2,3,4,5,8)数据转成List集合
      //2.返回的 asList 编译类型 List(接口)
      //3.
      int[] arr3 = {1,2,3,4,5};
      System.out.println(Arrays.toString(arr3));
      List asList = Arrays.asList(1,2,3,4,5);
      //System.out.println(Arrays.toString(arr3) == asList);
      System.out.println("asList=" + asList);
      System.out.println("asList的运行类型为" + asList.getClass());
      System.out.println("Arrays.toString(arr3)的运行类型为" + Arrays.toString(arr3).getClass());
   }
}
