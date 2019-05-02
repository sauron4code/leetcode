/**
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
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
