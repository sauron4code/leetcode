/**
 * program: leetcode
 * <p>
 * author: laughing
 * <p>
 * create: 2019-05-09 22:19
 **/
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
