/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 不同的子序列 II
 */

/**
 * 不同的子序列 II
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (74.94%)	38	-
 Tags
 Companies
 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。



 示例 1：

 输入：[-4,-1,0,3,10]
 输出：[0,1,9,16,100]
 示例 2：

 输入：[-7,-3,2,3,11]
 输出：[4,9,9,49,121]


 提示：

 1 <= A.length <= 10000
 -10000 <= A[i] <= 10000
 A 已按非递减顺序排序。
 */
public class L977 {

    public int[] sortedSquares(int[] A) {
        int[] sortedArray = new int[A.length];

        int i = 0;
        int j = A.length - 1;
        int lastIndex = A.length - 1;

        while (i <= j){
            int sqrt1 = A[i] * A[i];
            int sqrt2 = A[j] * A[j];
            if (sqrt1 > sqrt2){
                sortedArray[lastIndex--] = sqrt1;
                i++;
            }else{
                sortedArray[lastIndex--] = sqrt2;
                j--;
            }

        }

        return sortedArray;
    }

    public static void main(String[] args){
        int[] result = new L977().sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println();
    }
}
