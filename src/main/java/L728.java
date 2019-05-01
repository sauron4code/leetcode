import java.util.ArrayList;
import java.util.List;

/**
 * @lc app=leetcode.cn id=728 lang=java
 *
 * [728] 自除数
 */


/**
 * 按照题目意思，暴力破解
 */
public class L728 {


    private boolean selfNum(int num){

        int tmp  =  num;
        while (tmp != 0){
            int t = tmp % 10;
            if (t != 0 && num % t == 0){
                tmp /= 10;
            }else {
                return false;
            }
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for ( ; left <= right; left++){
            if (selfNum(left)){
                result.add(left);
            }
        }

        return result;
    }
    public static void main(String[] args){
        new L728().selfDividingNumbers(20, 28);
    }
}
