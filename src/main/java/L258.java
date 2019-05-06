/**
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

/**
 * 暴力破解
 */
public class L258 {

    public int addDigits(int num) {
        int result = 0;

        while (true){
            result += num % 10;
            num = num / 10;
            if (num == 0 ){
                if (result >= 10){
                    num = result;
                    result = 0;
                }else{
                    return result;
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println(new L258().addDigits(38));
    }
}
