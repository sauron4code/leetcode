import java.util.Arrays;
import java.util.List;

/**
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 *
回文链表

请判断一个链表是否为回文链表。

示例 1:

输入: 1->2
输出: false
示例 2:

输入: 1->2->2->1
输出: true
进阶：
你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * step 1 寻找中间 结点
 * step 2 中间结点右边的链表反转
 * step 3 中间结点的左链表 与 右链表 进行比较
 */
public class L234 {

    private ListNode findMiddleNode(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

        //  bad code
//        ListNode p = head;
//        ListNode q = head;

//        while (p.next != null  && q.next != null){
//            // 偶数情况
//            if (q.next.next == null){
//                return p;
//            }
//            p = p.next;
//            q = q.next.next;
//        }

//        return p;

    }


    private ListNode revertList(ListNode head){
        if (head == null | head.next == null){
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

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }

        ListNode middle = findMiddleNode(head);
        ListNode right = revertList(middle);
        ListNode left = head;

        while (left != middle){
            if (left.val != right.val){
                return false;
            }else{
                right = right.next;
                left = left.next;
            }
        }

        return left.val == right.val;
    }


    public static void main(String[] args){

        ListNode list = ListNode.createList(Arrays.asList(1, 2, 2, 1));

        System.out.println(new L234().isPalindrome(list));

    }
}
