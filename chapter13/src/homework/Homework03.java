package homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework03 {
    /**
     * 题目：
     * 输入形式为 Han Shun Ping的人名，以Ping,Han .S的形式打印
     * 其中.S是中间单词的首字母
     * @param args
     */
    public static void main(String[] args) {
        printName("Hang Shun Ping");
    }

    public static void printName(String name) {
        if (name == null) {
            System.out.println("名字不能为空");
            return ;
        }

        String[] names = name.split(" ");
        System.out.println(String.format("%s,%s .%c", names[2], names[0],names[1].toUpperCase().charAt(0))
);
    }
}
