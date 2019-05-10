/*
 * @lc app=leetcode.cn id=961 lang=java
 *
 * [961] 长按键入
 */

/**
 * 长按键入
 * Category	Difficulty	Likes	Dislikes
 * algorithms	Easy (69.66%)	28	-
 * Tags
 * Companies
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * <p>
 * 返回重复了 N 次的那个元素。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 * <p>
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 * <p>
 * <p>
 * 提示：
 * <p>
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 */
public class L961 {

    public int repeatedNTimes(int[] A) {

        int[] countArray = new int[10000];
        int repeatNum = -1;

        for (int i = 0; i < A.length; i++) {
            int count = countArray[A[i]];
            if (count > 0) {
                repeatNum = A[i];
                break;
            } else {
                countArray[A[i]] = count + 1;
            }

        }
        return repeatNum;
    }

    public static void main(String[] args) {
        int result = new L961().repeatedNTimes(new int[]{1, 2, 3, 3});
        System.out.println();
    }

}
