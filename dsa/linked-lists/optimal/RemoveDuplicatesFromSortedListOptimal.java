// Time: O(n) Space: O(1)
public class RemoveDuplicatesFromSortedListOptimal {
public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }
   public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode outputValue = deleteDuplicates(head);
        StringBuilder sb = new StringBuilder();
        while (outputValue != null) { sb.append(outputValue.val).append(" "); outputValue = outputValue.next; }
        System.out.println(sb.toString().trim()); // 1 2
    }
}
