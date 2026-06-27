# Heaps (Priority Queues)

## Problem List
| Problem | Difficulty | LeetCode Link |
|---|---|---|
| Last Stone Weight | Easy | https://leetcode.com/problems/last-stone-weight/submissions/2047722596/
https://leetcode.com/problems/last-stone-weight/submissions/2047726070/ |
| Kth Largest Element in an Array | Medium |https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/2047729204/
https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/2047732825/  |
| Top K Frequent Elements | Medium |https://leetcode.com/problems/top-k-frequent-elements/submissions/2047736025/
https://leetcode.com/problems/top-k-frequent-elements/submissions/2047752515/  |

## Approach
**Last Stone Weight:** Brute force sorts the list on every single iteration to find the two heaviest stones. Optimal uses a max-heap (PriorityQueue with reverse order), so the two heaviest stones are always at the top with O(log n) removal.

**Kth Largest Element:** Brute force sorts the whole array and indexes from the end. Optimal maintains a min-heap of size k — the root of that heap is always the k-th largest.

**Top K Frequent Elements:** Brute force counts frequencies then sorts all distinct elements by frequency. Optimal counts frequencies, then keeps only the top k using a min-heap of size k, which is cheaper than a full sort.

## Complexity Table
| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---|---|---|---|---|
| Last Stone Weight | O(n^2 log n) | O(n) | O(n log n) | O(n) |
| Kth Largest Element | O(n log n) | O(1) | O(n log k) | O(k) |
| Top K Frequent Elements | O(n log n) | O(n) | O(n log k) | O(n) |
