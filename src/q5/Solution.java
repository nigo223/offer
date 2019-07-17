package q5;

/*
    将一个字符串中的空格替换成 "%20"。

    Input:
    "A B"

    Output:
    "A%20B"

    要求：只能用同一个StringBuffer，不能用多余的空间

*/

/*
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (' ' == ch) {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
 */

/*
    思路：（双指针法）先把该字符串设成和增长的字符串等长，然后从后往前遍历：
        如果不是空格，就直接添加到末尾，如果是空格，就在末尾添加%20

*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        int p = str.length(); // 原来的长度
        for (int i = 0; i < str.length(); i++) {
            if (' ' == str.charAt(i)) {
                str.append("##"); // 如果是空格，补上两位
            }
        }
        int q = str.length(); // 增长后的长度

        while (--p >= 0) {
            if (' ' == str.charAt(p)) { // 当前字符是空格
                str.setCharAt(--q, '0');
                str.setCharAt(--q, '2');
                str.setCharAt(--q, '%');
            } else {
                str.setCharAt(--q, str.charAt(p));
            }
        }

        return str.toString();

    }
}