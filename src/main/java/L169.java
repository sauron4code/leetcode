/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 求众数
 */

/**
 *
 * 求众数
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (56.23%)	239	-
 Tags
 Companies
 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

 你可以假设数组是非空的，并且给定的数组总是存在众数。

 示例 1:

 输入: [3,2,3]
 输出: 3
 示例 2:

 输入: [2,2,1,1,1,2,2]
 输出: 2
 */
public class L169 {

    private int divide(int left, int right, int[] nums){
        if (left == right){
            return nums[left];
        }

        int mid = (left + right) / 2;
        int leftMajority = divide(left, mid, nums);
        int rightMajority = divide(mid+1, right, nums);

        if (leftMajority == rightMajority){
            return leftMajority;
        }else {
            int leftMajorityCount = 0;
            int righMajorityCount = 0;

            for (int i = left; i <= mid; i++){
                if (nums[i] == leftMajority){
                    leftMajorityCount++;
                }
            }

            for (int i = mid+1; i <= right; i++){
                if (nums[i] == rightMajority ){
                    righMajorityCount++;
                }
            }

            return leftMajorityCount > righMajorityCount ?
                    leftMajority : rightMajority;
        }
    }

    public int majorityElement(int[] nums) {

        return divide(0, nums.length-1, nums);

    }

}
