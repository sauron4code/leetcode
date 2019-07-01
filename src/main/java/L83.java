import java.util.Arrays;



/**
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class L83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode prev = head;
        ListNode next = head.next;

        while (prev != null && next != null){
            if (prev.val == next.val){
                prev.next = next.next;
                next = prev.next == null ? null : prev.next;
            }else{
                prev = prev.next;
                next = next.next;
            }
        }


        return head;
    }

    public static void main(String[] args){
        ListNode head = ListNode.createList(Arrays.asList(1, 1, 2, 3, 3));

        new L83().deleteDuplicates(head);
    }
}
