/**
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
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
