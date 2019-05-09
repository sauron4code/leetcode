import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

/**
 * 找不同
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (53.82%)	67	-
 Tags
 Companies
 给定两个字符串 s 和 t，它们只包含小写字母。

 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

 请找出在 t 中被添加的字母。



 示例:

 输入：
 s = "abcd"
 t = "abcde"

 输出：
 e

 解释：
 'e' 是那个被添加的字母。
 */

/**
 * 使用map 做计数器
 */
public class L389 {
    public char findTheDifference(String s, String t) {
        Character result = null ;
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            Character c = t.charAt(i);
            if (map.containsKey(c)){

                int count = map.get(c);
                if (count == 0){
                    result =  c;
                    break;
                } else{
                    map.put(c, count-1);
                }
            }else {
                result =  c;
                break;
            }
        }

        return result;

    }

    public static void main(String[] args){
        char c = new L389().findTheDifference("abc", "abce");
        System.out.println();
    }
}
