# Linked Lists

## Problem List
| Problem | Difficulty | LeetCode Link |
|---|---|---|
| Remove Duplicates from Sorted List | Easy | https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/2046554854/
https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/2046559177/|
| Linked List Cycle | Easy |https://leetcode.com/problems/linked-list-cycle/submissions/2046562383/
https://leetcode.com/problems/linked-list-cycle/submissions/2046564703/|
| Merge Two Sorted Lists | Easy |https://leetcode.com/problems/merge-two-sorted-lists/submissions/2046567828/
https://leetcode.com/problems/merge-two-sorted-lists/submissions/2046570125/  |

## Approach
**Remove Duplicates from Sorted List:** Brute force converts the list to an ArrayList, deduplicates, then rebuilds a new linked list. Optimal uses a single pointer that skips over duplicate nodes in place, no extra structure needed.

**Linked List Cycle:** Brute force stores every visited node in a HashSet and checks for repeats. Optimal uses Floyd's fast/slow pointer technique — if a cycle exists, the fast pointer eventually meets the slow pointer.

**Merge Two Sorted Lists:** Brute force collects all values into a list, sorts them, then rebuilds. Optimal merges both lists directly using a dummy head and two pointers, since both inputs are already sorted.

## Complexity Table
| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---|---|---|---|---|
| Remove Duplicates from Sorted List | O(n) | O(n) | O(n) | O(1) |
| Linked List Cycle | O(n) | O(n) | O(n) | O(1) |
| Merge Two Sorted Lists | O(n log n) | O(n) | O(n) | O(1) |
