package com.hspedu.exception_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
