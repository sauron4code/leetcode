/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

/**
 * 字符串相加
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (42.77%)	67	-
 Tags
 Companies
 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。

 注意：

 num1 和num2 的长度都小于 5100.
 num1 和num2 都只包含数字 0-9.
 num1 和num2 都不包含任何前导零。
 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 */

/**
 * 模拟加法，从个位开始相加
 */
public class L415 {

    public String addStrings(String num1, String num2) {

        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;

        int maxLen = num1.length() > num2.length() ? num1.length() + 1 : num2.length() + 1;
        char[] result = new char[maxLen];
        int resultIndex = maxLen - 1;

        while (i >= 0 && j >= 0) {
            int sum = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            carry = (sum >= 10) ? 1 : 0;
            result[resultIndex] = (char) (sum % 10 + '0');
            i--;
            j--;
            resultIndex--;

        }

        while (i >= 0) {
            int sum = (num1.charAt(i) - '0') + carry;
            carry = (sum >= 10) ? 1 : 0;
            result[resultIndex] = (char) (sum % 10 + '0');
            i--;
            resultIndex--;

        }

        while (j >= 0) {
            int sum = (num2.charAt(j) - '0') + carry;
            carry = (sum >= 10) ? 1 : 0;
            result[resultIndex] = (char) (sum % 10 + '0');
            j--;
            resultIndex--;

        }

        StringBuilder sb = new StringBuilder();


        if (carry != 0) {
            sb.append(carry);
        }

        for (int k = 1; k < maxLen; k++) {
            sb.append(result[k]);
        }
        return sb.toString();


    }

    public static void main(String[] args) {
        String result = new L415().addStrings("1", "9");
        System.out.println();
    }
}
