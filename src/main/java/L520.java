
/**
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 *
 *
 *
检测大写字母

给定一个单词，你需要判断单词的大写使用是否正确。

我们定义，在以下情况时，单词的大写用法是正确的：

全部字母都是大写，比如"USA"。
单词中所有字母都不是大写，比如"leetcode"。
如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
否则，我们定义这个单词没有正确使用大写字母。

示例 1:

输入: "USA"
输出: True
示例 2:

输入: "FlaG"
输出: False
注意: 输入是由大写和小写拉丁字母组成的非空单词。
 */

/**
 * 根据以下规则
 * len <= 1 --->  { true }
 * len >= 2 ---> {
 *  word[0,1] == [Upper, Upper] && word[2~len-1] == [Upper~Upper]
 *  word[0,1] == ([Upper, Lower] || [Lower, Lower]) && word[2~len-1] == [Lower~Lower]
 * }
 * */
public class L520 {

        public boolean detectCapitalUse(String word) {
            if (word.length() <= 1){
                return true;
            }

            boolean isUpper = true;
            boolean isLower = true;

            for ( int i = 2 ; i < word.length(); i++){
                char c = word.charAt(i);
                if (Character.isUpperCase(c)){
                    isLower = false;
                }
                if (Character.isLowerCase(c)){
                    isUpper = false;
                }
            }

            char c1 = word.charAt(0);
            char c2 = word.charAt(1);
            return (Character.isUpperCase(c1) && Character.isUpperCase(c2) && isUpper)
                    || (Character.isUpperCase(c1) && Character.isLowerCase(c2) && isLower)
                    || (Character.isLowerCase(c1) && Character.isLowerCase(c2) && isLower);

        }

}
