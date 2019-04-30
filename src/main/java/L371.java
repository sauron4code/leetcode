/**
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */

/**
 * 不能使用加减运算符，那就使用 位运算
 */
public class L371 {

    public int getSum(int a, int b) {
        int tmp ;

        while( b != 0) {
            tmp = a ^ b;
            b = (a & b) << 1;
            a = tmp;
        }

        return a;
    }


}
