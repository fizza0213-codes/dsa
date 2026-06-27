# Binary Trees

## Problem List
| Problem | Difficulty | LeetCode Link |
|---|---|---|
| Invert Binary Tree | Easy |(https://leetcode.com/problems/invert-binary-tree/submissions/2046335709/?envType=problem-list-v2&envId=binary-tree
https://leetcode.com/problems/invert-binary-tree/?envType=problem-list-v2&envId=binary-tree) |
| Maximum Depth of Binary Tree | Easy | (https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/2047750539/) |
| Kth Smallest Element in a BST | Medium | https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/2046353354/?envType=problem-list-v2&envId=binary-tree
https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/2046355555/?envType=problem-list-v2&envId=binary-tree |
| Diameter of Binary Tree | Easy | https://leetcode.com/problems/diameter-of-binary-tree/submissions/2046358531/?envType=problem-list-v2&envId=binary-tree
https://leetcode.com/problems/diameter-of-binary-tree/submissions/2046360584/?envType=problem-list-v2&envId=binary-tree |
| Validate Binary Search Tree | Medium | https://leetcode.com/problems/validate-binary-search-tree/submissions/2046408703/?envType=problem-list-v2&envId=binary-tree
https://leetcode.com/problems/validate-binary-search-tree/submissions/2046413515/?envType=problem-list-v2&envId=binary-tree |
| Implement Trie (Prefix Tree) | Medium | https://leetcode.com/problems/implement-trie-prefix-tree/submissions/2046419283/
https://leetcode.com/problems/implement-trie-prefix-tree/submissions/2046423177/|
| Minimum Absolute Difference in BST | Easy | https://leetcode.com/problems/minimum-absolute-difference-in-bst/submissions/2046427716/
https://leetcode.com/problems/minimum-absolute-difference-in-bst/submissions/2046434503/
 |

## Approach
**Invert Binary Tree:** Brute force uses iterative BFS with a queue to swap children level by level. Optimal uses recursive DFS, swapping children at each call.

**Maximum Depth:** Brute force counts levels using BFS. Optimal uses DFS recursion: `1 + max(left depth, right depth)`.

**Kth Smallest in BST:** Brute force collects the full inorder traversal then indexes `k-1`. Optimal uses an iterative inorder traversal with a stack, stopping as soon as the k-th node is reached.

**Diameter of Binary Tree:** Brute force recomputes height for every node, which is wasteful. Optimal computes height once via a single DFS pass while updating a global max diameter.

**Validate BST:** Brute force collects an inorder traversal and checks it's sorted. Optimal does DFS while passing down min/max valid bounds for each node.

**Implement Trie:** Brute force stores all words in a list and checks `startsWith` against every word. Optimal builds a tree of TrieNodes with a children map, so lookups only cost the length of the word.

**Minimum Absolute Difference in BST:** Brute force collects inorder values and compares every pair. Optimal does a single inorder traversal keeping a `prev` pointer, since inorder of a BST is already sorted.

## Complexity Table
| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---|---|---|---|---|
| Invert Binary Tree | O(n) | O(n) | O(n) | O(h) |
| Maximum Depth | O(n) | O(n) | O(n) | O(h) |
| Kth Smallest in BST | O(n) | O(n) | O(k) | O(h) |
| Diameter of Binary Tree | O(n^2) | O(h) | O(n) | O(h) |
| Validate BST | O(n) | O(n) | O(n) | O(h) |
| Implement Trie | O(L) per op (n words) | O(n*L) | O(L) per op | O(total chars) |
| Min Absolute Difference in BST | O(n^2) | O(n) | O(n) | O(h) |
