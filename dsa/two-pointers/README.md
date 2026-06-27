# Two Pointers

## Problem List
| Problem | Difficulty | LeetCode Link |
|---|---|---|
| Reverse String | Easy |https://leetcode.com/problems/reverse-string/submissions/2047879283/
https://leetcode.com/problems/reverse-string/submissions/2047919101/ |
| Valid Palindrome | Easy |https://leetcode.com/problems/valid-palindrome/submissions/2047942830/
https://leetcode.com/problems/valid-palindrome/submissions/2047946081/ |
| Container With Most Water | Medium |https://leetcode.com/problems/container-with-most-water/submissions/2047952698/
https://leetcode.com/problems/container-with-most-water/submissions/2047965150/|

## Approach
**Reverse String:** Brute force builds a reversed copy in a new array. Optimal swaps characters in place using two pointers moving toward the center.

**Valid Palindrome:** Brute force builds a cleaned string and compares it to its reverse. Optimal uses two pointers from both ends, skipping non-alphanumeric characters as it goes.

**Container With Most Water:** Brute force checks every pair of heights. Optimal uses two pointers from both ends, always moving the pointer at the shorter height inward.

## Complexity Table
| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---|---|---|---|---|
| Reverse String | O(n) | O(n) | O(n) | O(1) |
| Valid Palindrome | O(n) | O(n) | O(n) | O(1) |
| Container With Most Water | O(n^2) | O(1) | O(n) | O(1) |
