public class EightQueen {//还是没有解决，不知道哪里出了问题，希望未来的你可以找出来
    public static void main(String[] args) {


        Tools tools = new Tools();
        tools.put(0);
        tools.show();
    }
}

//八皇后问题，与栈的思想有关，最后结果是准备返回一个数组，里面是 每个皇后的所在列
//使用一维数组,a[0] 可以表示第一个皇后，同样是第一行；并且arr[0]的值可以表示所在列

class Tools {
    int[] arr = new int[8];

    //判断能否压入栈（能不能把皇后放下去）
    public boolean judge(int n) {
        for(int i = 0; i < n; i++) {//与前面的每一个queen作比较
            //不能处在同列，同一斜线上
            if(arr[i] == arr[n] || Math.abs(i - n) == Math.abs(arr[i] - arr[n])) {
                return false;
            }
        }
        return true;
    }


    //压入栈
    public void put(int n) {//传进来第 n+1 个queen
        if(n == 8) {
            return;
        }else {
            for(int i = 0; i < 8; i++) {
                arr[n] = i;
                if(judge(n)) {
                    put(n + 1);
                }

            }
        }

    }

    //输出数组arr
//    public void show() {
//        for(int a : arr) {
//            System.out.print(a + "\t");
//        }
//    }

    public void show() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

