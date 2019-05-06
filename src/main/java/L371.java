/**
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 *
两整数之和

不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。

示例 1:

输入: a = 1, b = 2
输出: 3
示例 2:

输入: a = -2, b = 3
输出: 1
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


    public static void main(String args[]){
        System.out.println(new L371().getSum(3, -1));
    }
}
