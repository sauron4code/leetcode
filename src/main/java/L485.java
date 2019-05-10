/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

/**

 最大连续1的个数
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (51.77%)	53	-
 Tags
 Companies
 给定一个二进制数组， 计算其中最大连续1的个数。

 示例 1:

 输入: [1,1,0,1,1,1]
 输出: 3
 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 注意：

 输入的数组只包含 0 和1。
 输入数组的长度是正整数，且不超过 10,000。

 */
public class L485 {

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxLen = 0;

        int subLen = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                subLen++;
            }else {
                if (subLen > maxLen){
                    maxLen = subLen;
                }

                subLen = 0;
            }
        }

        return maxLen > subLen ? maxLen : subLen;

    }

    public static void main(String[] args){

        int maxLen = new L485().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        System.out.println();

    }
}
