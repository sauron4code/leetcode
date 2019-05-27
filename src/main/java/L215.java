/**
 *
 *
 数组中的第K个最大元素
 Category	Difficulty	Likes	Dislikes
 algorithms	Medium (55.79%)	166	-
 Tags
 Companies
 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

 示例 1:

 输入: [3,2,1,5,6,4] 和 k = 2
 输出: 5
 示例 2:

 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 输出: 4
 说明:

 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。

 */


/**
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */


/**
 * 分治法
 */
public class L215 {

    // public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> queue = new PriorityQueue<>();
    //     for (int i = 0; i  < k; i++){
    //         queue.add(nums[i]);
    //     }

    //     for (int i = k; i  < nums.length; i++){
    //         if (nums[i] > queue.peek()){
    //             queue.poll();
    //             queue.add(nums[i]);
    //         }


    //     }

    //     return queue.peek();

    // }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private int partition(int nums[], int left, int right, int pivot){
        int pivotValue = nums[pivot];
        int pivotIndex = left;


        swap(nums, pivotIndex, right);

        for ( ; left < right; left++){
            if (nums[left] > pivotValue){
                swap(nums,pivotIndex, left);
                pivotIndex++;
            }
        }

        swap(nums, pivotIndex, right);
        return pivotIndex;
    }


    private int findKth(int nums[], int left, int right, int k){


        int ret = partition(nums, left, right, left);


        if (ret > k){
            return findKth(nums, left, ret-1, k);
        }else  if (ret < k){
            return findKth(nums, left+1, right, k);
        }else {
            return ret;
        }


    }



    public int findKthLargest(int[] nums, int k) {

        int pivotIndex = findKth(nums, 0, nums.length-1, k-1);
        return  nums[pivotIndex];

    }

    public static void main(String[] args){
        int result = new L215().findKthLargest(new int[]{3,2,1,5,6,4}, 2);

        System.out.println(result);
    }



}
