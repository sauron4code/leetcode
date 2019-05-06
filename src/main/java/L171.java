/**
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号

Excel表列序号

给定一个Excel表格中的列名称，返回其相应的列序号。

例如，

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
示例 1:

输入: "A"
输出: 1
示例 2:

输入: "AB"
输出: 28
示例 3:

输入: "ZY"
输出: 701
致谢：
特别感谢 @ts 添加此问题并创建所有测试用例。

 */

/**
 * 26 进制 转 10 进制
 */
public class L171 {

    public int titleToNumber(String s) {
        int result = 0;
        int factor = 1;
        for (int i = s.length() - 1; i >= 0; i-- ){
            result = (s.charAt(i) - 'A' + 1) * factor + result ;
            factor = factor * 26;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(new L171().titleToNumber("AA"));
    }
}
