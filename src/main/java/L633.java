/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */


/**
 * 平方数之和
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (28.59%)	52	-
 Tags
 Companies
 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。

 示例1:

 输入: 5
 输出: True
 解释: 1 * 1 + 2 * 2 = 5


 示例2:

 输入: 3
 输出: False
 */
public class L633 {

    public boolean judgeSquareSum(int c) {

        for (int i = (int)Math.sqrt(c); i >= 0; i--){
            double tmp = Math.sqrt(c - i*i );
            if (tmp - (int)tmp  == 0.0){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        new L633().judgeSquareSum(5);
    }
}
