/**
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字

缺失数字

给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。

示例 1:

输入: [3,0,1]
输出: 2
示例 2:

输入: [9,6,4,2,3,5,7,0,1]
输出: 8
说明:
你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */

/**
 * 使用求和方法，sum(nums[0..nums.lenght-1]) - sum(0...n)
 */
public class L268 {

    public int missingNumber(int[] nums) {

        // a = a ^ b ^ b;
//        int result = nums.length;
//
//        for (int i = 0; i  < nums.length; i++){
//            result = result ^ i ^ nums[i];
//        }
//
//        return result;

        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return nums.length * (nums.length + 1) / 2 - sum;
    }



    public static void main(String[] args){
        int rs = new L268().missingNumber(new int[]{3, 2, 0});
        System.out.println();
    }


}
