import java.util.Scanner;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[3][3];
        int i = 1;
        //使用增强for进行二维数组的输入
        for (int[] nums : grid) {
            System.out.println("输入第" + i + "行：");
            for (int num : nums) {
                num = scanner.nextInt();
            }
            ++i;
        }

//        int[][] grid = {{1,2,3}, {4,5,6}, {7,8,9}};
//        for (int[] ints : grid) {
//            for (int i : ints) {
//                i = 0; //将i修改为0
//            }
//        }

        for (int[] nums : grid) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        //输出为
        /**
         * 0 0 0
         * 0 0 0
         * 0 0 0
         */
        //也就是使用增强for循环仅仅是遍历，是只读而不能修改原数组
        //输入二维数组，请使用普通的双重循环
    }
}
