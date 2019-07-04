import java.util.Arrays;
import java.util.Comparator;

/**
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 */

/**
 * 最大数
 * Category	Difficulty	Likes	Dislikes
 * algorithms	Medium (29.28%)	121	-
 * Tags
 * Companies
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [10,2]
 * 输出: 210
 * 示例 2:
 * <p>
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 * 说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 */
public class L179 {

    public String largestNumber(int[] nums) {

        String[] strArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strArray, new Comparator<String>() {

            public int compare(String o1, String o2) {

                String s1 = o1 + o2;
                String s2 = o2 + o1;
                long i1 = Long.parseLong(s1);
                long i2 = Long.parseLong(s2);

                if (i1 < i2) {
                    return 1;
                } else if (i1 == i2) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for (String str : strArray) {
            sb.append(str);
        }

        String resultStr = sb.toString();


        // 处理0000000的情况
        int endZeroIndex = -1;
        for (int i = 0; i < resultStr.length() - 1; i++) {
            if (resultStr.charAt(i) == '0') {
                endZeroIndex = i;
            } else {
                break;
            }
        }
        if (endZeroIndex == -1) {
            return resultStr;
        } else {
            return resultStr.substring(endZeroIndex + 1);
        }

    }

    public static void main(String[] args) {
        String result = new L179().largestNumber(new int[]{
                3, 30, 34, 5, 9

        });

        System.out.println();
    }
}
