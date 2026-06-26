// Time: O(n log n) Space: O(n)
public class MergeTwoSortedListsBrute {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> values = new ArrayList<>();
        while (l1 != null) { values.add(l1.val); l1 = l1.next; }
        while (l2 != null) { values.add(l2.val); l2 = l2.next; }
        Collections.sort(values);
        ListNode newHead = null, tail = null;
        for (int v : values) {
            ListNode node = new ListNode(v);
            if (newHead == null) { newHead = node; tail = node; }
            else { tail.next = node; tail = node; }
        }
        return newHead;
  public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode merged = mergeTwoLists(l1, l2);
        StringBuilder sb = new StringBuilder();
        while (merged != null) { sb.append(merged.val).append(" "); merged = merged.next; }
        System.out.println(sb.toString().trim()); // 1 1 2 3 4 4
    }
}
