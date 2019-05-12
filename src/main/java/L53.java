/**
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

/**
 *

 最大子序和
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (41.73%)	912	-
 Tags
 Companies
 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

 示例:

 输入: [-2,1,-3,4,-1,2,1,-5,4],
 输出: 6
 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 进阶:

 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */

/**
 * 分治算法
 */
public class L53 {

    private int allMax(int left, int right, int mid, int[] nums){
        int allSum = 0;

        int leftSum = Integer.MIN_VALUE;

        for (int i = mid; i >= left; i--){
            allSum += nums[i];
            leftSum = allSum > leftSum ? allSum : leftSum;

        }

        allSum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = mid+1; i <= right; i++){
            allSum += nums[i];
            rightSum = allSum > rightSum ? allSum : rightSum;
        }

        return  leftSum + rightSum;
    }


    private int divide(int left, int right, int[] nums){
        if (left == right){
            return nums[left];
        }

        int mid = (left + right) / 2;

        int leftMax = divide(left, mid, nums);
        int rightMax = divide(mid+1, right, nums);

        int all = allMax(left, right, mid, nums);


        return (all > leftMax && all > rightMax) ? all : (leftMax > rightMax) ? leftMax : rightMax;


    }

    public int maxSubArray(int[] nums) {

        return divide(0, nums.length-1, nums);

    }

    public static void main(String[] args){
        int result  = new L53().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4} );
        System.out.println();
    }
}
