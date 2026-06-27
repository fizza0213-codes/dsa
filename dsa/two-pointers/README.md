# Hash Tables

## Problem List
| Problem | Difficulty | LeetCode Link |
|---|---|---|
| Contains Duplicate | Easy | https://leetcode.com/problems/contains-duplicate/submissions/2047771372/
https://leetcode.com/problems/contains-duplicate/submissions/2047773748/ |
| Two Sum | Easy | https://leetcode.com/problems/two-sum/submissions/2047775711/
https://leetcode.com/problems/two-sum/submissions/2047780730/ |
| Maximum Number of Balloons | Easy |https://leetcode.com/problems/maximum-number-of-balloons/submissions/2047786454/
https://leetcode.com/problems/maximum-number-of-balloons/submissions/2047789715/  |
| Valid Anagram | Easy |https://leetcode.com/problems/valid-anagram/submissions/2047792653/
https://leetcode.com/problems/valid-anagram/submissions/2047795052/  |
| Group Anagrams | Medium |https://leetcode.com/problems/group-anagrams/submissions/2047799678/
https://leetcode.com/problems/group-anagrams/submissions/2047803990/ |

## Approach
**Contains Duplicate:** Brute force sorts the array and compares adjacent elements. Optimal uses a HashSet to detect a repeat in a single pass.

**Two Sum:** Brute force checks every pair of numbers. Optimal stores each number's complement in a HashMap so the matching pair is found in one pass.

**Maximum Number of Balloons:** Brute force counts each required letter with separate counters. Optimal uses a 26-size frequency array for a cleaner one-pass count.

**Valid Anagram:** Brute force sorts both strings and compares them. Optimal uses a frequency array, incrementing for one string and decrementing for the other.

**Group Anagrams:** Brute force compares every pair of strings for anagram equality. Optimal sorts each word's characters to form a canonical key and groups words in a HashMap.

## Complexity Table
| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---|---|---|---|---|
| Contains Duplicate | O(n log n) | O(n) | O(n) | O(n) |
| Two Sum | O(n^2) | O(1) | O(n) | O(n) |
| Maximum Number of Balloons | O(n) | O(1) | O(n) | O(1) |
| Valid Anagram | O(n log n) | O(n) | O(n) | O(1) |
| Group Anagrams | O(n^2 * k) | O(n*k) | O(n*k log k) | O(n*k) |
