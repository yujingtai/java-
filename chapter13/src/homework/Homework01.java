package homework;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        String str = null;
        try {
            str = reverse("abcdef", 44, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(str);
    }

    //反转"abcdef" 为 "aedcbf"
    public static String reverse(String str, int start, int end) {
        //对输入的参数要进行一个校验
        //重要的编程思想，正难则反
        //可以得到正确的条件，然后对其取反
        if (!(str != null && end > start && end < str.length())) {
            throw new RuntimeException("参数有误");
        }
        char[] chars = str.toCharArray();
        for (int i = start, j = end; i < j; ++i, --j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
