/**
 * program: leetcode
 * <p>
 * author: 黎海明
 * <p>
 * email: laughing@jollycorp.com
 * <p>
 * create: 2019-04-30 14:53
 **/

/**
 * 比较简单，nums1 nums2从后往前进行合并
 */
public class L88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length - 1;
        int indexM = m - 1;
        int indexN = n - 1;

        while (indexM >= 0 && indexN >= 0){
            if (nums1[indexM] > nums2[indexN]){
                nums1[len1] = nums1[indexM];
                indexM = indexM - 1;
            }else{
                nums1[len1] = nums2[indexN];
                indexN = indexN - 1;
            }

            len1 = len1 -1;
        }

        while (indexM >= 0){
            nums1[len1] = nums1[indexM];
            indexM = indexM - 1;
            len1 = len1 -1;
        }

        while (indexN >= 0){
            nums1[len1] = nums2[indexN];
            indexN = indexN - 1;
            len1 = len1 -1;
        }
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        new L88().merge(nums1, 0, nums2, 1);
        System.out.println();

    }
}
