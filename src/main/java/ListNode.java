import java.util.List;


public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void printList(ListNode head){
        System.out.print("{");
        while (head != null){
            System.out.print( head.val + ", ");
            head = head.next;
        }
        System.out.print("}\n");
    }

    public static ListNode createList(List<Integer> values){
        ListNode head = new ListNode(-1);
        ListNode next = head;

        for (Integer value : values){
            next.next = new ListNode(value);
            next = next.next;
        }

        next.next = null;


        return head.next;

    }

}
