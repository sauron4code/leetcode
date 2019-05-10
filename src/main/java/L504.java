/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */


/**
 * 七进制数
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (41.41%)	14	-
 Tags
 Companies
 给定一个整数，将其转化为7进制，并以字符串形式输出。

 示例 1:

 输入: 100
 输出: "202"
 示例 2:

 输入: -7
 输出: "-10"
 注意: 输入范围是 [-1e7, 1e7] 。
 */
public class L504 {

    public String convertToBase7(int num) {
        if (num == 0){
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        boolean flag = false;
        if (num < 0){
            num = -num;
            flag = true;
        }

        while (num > 0){
            int c = num % 7;
            num = num / 7;
            sb.append(c);
        }

        if (flag){
            sb.append("-");
        }

        return sb.reverse().toString();

    }


    public static void main(String[] args){
        System.out.println(new L504().convertToBase7(-7));

    }
}
