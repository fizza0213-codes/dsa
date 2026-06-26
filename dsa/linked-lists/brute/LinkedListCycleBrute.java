// Time: O(n) Space: O(n)
public class LinkedListCycleBrute {
   public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (visited.contains(curr)) return true;
            visited.add(curr);
            curr = curr.next;
        }
        return false;
    }
public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = head.next; // cycle
        System.out.println(hasCycle(head)); // true
    }
}
