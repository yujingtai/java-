import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Test01 {

    public int count = 0;
    private static int[] coins = {1,2,5};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int res = new Test01().change(5, coins);
        System.out.println(res);
        scan.close();
    }

    public int change(int amount, int[] coins) {
        this.coins = coins;
        dfs(amount, 0);
        return count;
    }

    public void dfs(int amount, int temp) { //temp记录上一个硬币的面额，
        //边界条件
        if (amount < 0) return ;
        if (amount == 0) {
            ++count;
            return ;
        }

        //非边界条件
        for (int coin : coins) {
            if (coin < temp) continue;
            amount -= coin;
            dfs(amount, coin);
            amount += coin;
        }
        return;
    }

}