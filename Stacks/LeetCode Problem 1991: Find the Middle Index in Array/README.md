# Find the Middle Index in Array
### Problem Link: [LeetCode 1991](https://leetcode.com/problems/find-the-middle-index-in-array/)

## Problem Statement
Given an integer array `nums`, return the **0-based index** of the **first** element in the array such that the sum of the elements to the left of it is equal to the sum of the elements to the right of it. If no such index exists, return `-1`.

If there are multiple valid answers, return the smallest one.

## Constraints
- `1 <= nums.length <= 1000`
- `-1000 <= nums[i] <= 1000`

## Examples

### Example 1:
#### Input: nums = [2,3,-1,8,4]
## Output: 3
'Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4'
'The sum of the numbers after index 3 is: 4 = 4'

### Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0

### Example 3:
Input: nums = [2,5]
Output: -1
Explanation: There is no valid middleIndex.

## Approach

1. **Prefix and Suffix Arrays**  
   - Use two arrays, `pre` and `post`, to store the cumulative sums of elements from the left and right side, respectively.
   - `pre[i]` will store the sum of elements from the start of the array to index `i-1`.
   - `post[i]` will store the sum of elements from index `i+1` to the end of the array.

2. **Calculate the Cumulative Sums**  
   - Loop through the array to fill the `pre` and `post` arrays by updating the values accordingly.

3. **Check the Middle Index**  
   - Loop through the array and check if the sum of elements on the left of the index (from `pre[]`) is equal to the sum on the right (from `post[]`).
   - If they match, return the index.
   - If no such index is found, return `-1`.

---

## Time Complexity
- **Precomputing the Prefix and Suffix Arrays:** `O(N)`, where `N` is the length of the array.
- **Iterating to find the Middle Index:** `O(N)`.
- **Overall Complexity:** `O(N)`, as both operations are linear in the size of the array.

---

## Space Complexity
- **Two arrays `pre[]` and `post[]` of size `N`:** `O(N)` space is used.
- **Total Space Complexity:** `O(N)`.

