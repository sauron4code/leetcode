/**
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组

合并两个有序数组

给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]


 */

/**
 * 比较简单，nums1 nums2从后往前进行合并
 */
public class L88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length - 1;
        int indexM = m - 1;
        int indexN = n - 1;

        while (indexM >= 0 && indexN >= 0){
            if (nums1[indexM] > nums2[indexN]){
                nums1[len1] = nums1[indexM];
                indexM = indexM - 1;
            }else{
                nums1[len1] = nums2[indexN];
                indexN = indexN - 1;
            }

            len1 = len1 -1;
        }

        while (indexM >= 0){
            nums1[len1] = nums1[indexM];
            indexM = indexM - 1;
            len1 = len1 -1;
        }

        while (indexN >= 0){
            nums1[len1] = nums2[indexN];
            indexN = indexN - 1;
            len1 = len1 -1;
        }
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        new L88().merge(nums1, 0, nums2, 1);
        System.out.println();

    }
}
