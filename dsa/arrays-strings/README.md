# Arrays & Strings

## Problem List
| Problem | Difficulty | LeetCode Link |
|---|---|---|
| Find Closest Number to Zero | Easy |(https://leetcode.com/problems/find-closest-number-to-zero/?envType=problem-list-v2&envId=array) |
| Is Subsequence | Easy | (https://leetcode.com/problems/is-subsequence/?envType=problem-list-v2&envId=string) |
| Summary Ranges | Easy | https://leetcode.com/problems/summary-ranges/?envType=problem-list-v2&envId=array |
| Longest Common Prefix | Easy | (https://leetcode.com/problems/longest-common-prefix/?envType=problem-list-v2&envId=string) |
| Best Time to Buy and Sell Stock | Easy | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/2046080313/?envType=problem-list-v2&envId=array |

## Approach
**Find Closest Number to Zero:** Brute force scans linearly tracking the smallest absolute value seen, without handling ties. Optimal does the same single pass but breaks ties in favor of the positive number.

**Is Subsequence:** Brute force searches for each character of `s` within `t` from the last matched position. Optimal advances two independent pointers through `s` and `t` simultaneously.

**Summary Ranges:** Brute force repeatedly re-scans the array to extend the current range. Optimal uses a single pass with a start pointer, extending the range only while consecutive.

**Longest Common Prefix:** Brute force shrinks a candidate prefix by comparing it against each string. Optimal sorts the strings first, so only the first and last strings (the most different ones) need comparing.

**Best Time to Buy and Sell Stock:** Brute force checks profit for every buy/sell pair. Optimal tracks the running minimum price in one pass.

## Complexity Table
| Problem | Brute Time | Brute Space | Optimal Time | Optimal Space |
|---|---|---|---|---|
| Find Closest Number to Zero | O(n) | O(1) | O(n) | O(1) |
| Is Subsequence | O(n*m) | O(1) | O(n+m) | O(1) |
| Summary Ranges | O(n^2) | O(n) | O(n) | O(n) |
| Longest Common Prefix | O(n*m) | O(1) | O(n log n) | O(1) |
| Best Time to Buy and Sell Stock | O(n^2) | O(1) | O(n) | O(1) |
