# Maximum Subarray

## Problem Description
Given an integer array `nums`, find the subarray with the largest sum and return its sum.

A **subarray** is a contiguous non-empty sequence of elements within an array.

---

**Example 1:**
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6 Explanation: [4,-1,2,1] has the largest sum = 6

**Example 2:**
Input: nums = [1] 
Output: 1

**Example 3:**
Input: nums = [5,4,-1,7,8] 
Output: 23

---

## Constraints
- `1 <= nums.length <= 10⁵`
- `-10⁴ <= nums[i] <= 10⁴`

---

## Solution Explanation
The algorithm uses **Kadane's Algorithm** to efficiently find the maximum subarray sum.  
1. Iterate through the array.
2. Keep a running `sum` of the current subarray.
3. Update the `max` whenever the `sum` is greater.
4. Reset the `sum` to 0 if it becomes negative.

### Time Complexity
- **O(n)**: The algorithm iterates through the array once.

### Space Complexity
- **O(1)**: The solution uses only a few variables to keep track of sums and the maximum.

---

## Notes
This solution is optimized for large input sizes and uses type casting (`long`) to handle edge cases with large numbers.

