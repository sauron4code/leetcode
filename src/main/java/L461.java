/**
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 *
 * https://leetcode-cn.com/problems/hamming-distance/description/
 *
 * algorithms
 * Easy (67.16%)
 * Total Accepted:    16.7K
 * Total Submissions: 24.1K
 * Testcase Example:  '1\n4'
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 2^31.
 *
 * 示例:
 *
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ⁠      ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 *
 */
public class L461 {

    public int hammingDistance(int x, int y) {
        int tmp = x ^ y;

        int[] table =
                {
                        0, 1, 1, 2,
                        1, 2, 2, 3,
                        1, 2, 2, 3,
                        2, 3, 3, 4
                } ;


        return  table[tmp & 0xf] + table[ (tmp >> 4) & 0xf] +
                table[(tmp >> 8) & 0xf] + table[(tmp >> 12)  & 0xf]+
                table[(tmp >> 16) & 0xf] + table[(tmp >> 20) & 0xf]+
                table[(tmp >> 24) & 0xf] + table[(tmp >> 28) & 0xf];

    }

    public static void main(String[] args){
        System.out.println(new L461().hammingDistance(1, 4));
    }
}
