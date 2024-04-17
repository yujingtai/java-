package homework;
import java.util.Scanner;
/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework02 {
    /**
     * 输入用户名、密码、邮箱，如果信息录入正确，则提示这侧成功，否则生成异常对象
     * 要求：
     *      1、用户名长度为2或3或4
     *      2、密码长度为6，要求全是数字
     *      3、邮箱中包含@和. 并且@在.前面
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名：");
        String userName = scanner.next();
        System.out.println("输入密码：");
        String pwd = scanner.next();
        System.out.println("输入邮箱");
        String mailbox = scanner.next();
        try {
            register(userName, pwd, mailbox);
            System.out.println("注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    //注册方法 传入 userName, pwd, mailbox
    public static void register(String userName, String pwd, String mailbox) {
        //名字是否满足要求
        int n = userName.length();
        if (!(n > 1 && n < 5)) {
            throw new RuntimeException("姓名的长度只能为2、3、4");
        }

        //密码是否满足要求
        //这里要额外写一个方法，判断是否都为数字
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码格式有误");
        }

        //邮箱是否满足要求
        //不要忘记了String类中自带的方法
        int index1 = mailbox.indexOf('@');
        int index2 = mailbox.indexOf('.');
        if (!(mailbox.length() == 6 && index1 > -1 && index2 > -1 && index1 < index2)) {
            throw new RuntimeException("邮箱格式有误");
        }
    }

    public static boolean isDigital(String pwd) {
        boolean flag = true;
        try {
            int num = Integer.parseInt(pwd);
        } catch(Exception e) {
            //如果捕捉到异常，就表示密码中不全是数字
            flag = false;
        }
        return flag;
    }

}
