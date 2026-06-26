
// Time: O(n) Space: O(n)
public class RemoveDuplicatesFromSortedListBrute {
   public ListNode deleteDuplicates(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            if (values.isEmpty() || values.get(values.size() - 1) != curr.val) values.add(curr.val);
            curr = curr.next;
        }
        ListNode newHead = null, tail = null;
        for (int v : values) {
            ListNode node = new ListNode(v);
            if (newHead == null) { newHead = node; tail = node; }
            else { tail.next = node; tail = node; }
        }
        return newHead;
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
