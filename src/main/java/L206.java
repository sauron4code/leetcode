/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

import java.util.Arrays;
import java.util.List;

/**
 * 反转链表
 Category	Difficulty	Likes	Dislikes
 algorithms	Easy (57.32%)	421	-
 Tags
 Companies
 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class L206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }


        ListNode prev = head;
        ListNode next = head.next;
        head.next = null;

        while (next != null){
            ListNode nextNext = next.next;
            next.next = prev;
            prev = next;
            next = nextNext;
        }

        return prev;
    }

    public static void main(String[] args){
        ListNode head = ListNode.createList(Arrays.asList(1, 2));
        ListNode.printList(head);
        ListNode revert = new L206().reverseList(head);
        ListNode.printList(revert);

    }
}
