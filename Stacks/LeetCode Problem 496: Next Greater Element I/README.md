# Next Greater Element I
### Problem Link: [LeetCode 496](https://leetcode.com/problems/next-greater-element-i/)

## Problem Statement
You are given two arrays `nums1` and `nums2`, where `nums1` is a subset of `nums2`.  
For each element in `nums1`, find the **next greater element** in `nums2`.  

The **next greater element** of a number `x` in `nums2` is the first greater number that appears to the right of `x` in `nums2`. If no greater number exists, return `-1`.

## Constraints
- `1 <= nums1.length <= 1000`
- `1 <= nums2.length <= 1000`
- `-10^4 <= nums1[i], nums2[i] <= 10^4`
- All elements in `nums1` and `nums2` are unique.
- `nums1` is a subset of `nums2`.

## Examples

### Example 1:
#### Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

## Approach
1. **Use a Monotonic Stack**  
   - Maintain a stack while iterating through `nums2`.
   - If the stack's top element is smaller than the current element, pop it and store its next greater element in a HashMap.
   - Push the current element onto the stack.

2. **Use a HashMap for Fast Lookup**  
   - The map stores the next greater element for each number in `nums2`.
   - Iterate through `nums1` and use the map to get the result.

---

## Time Complexity
- **Building the map:** `O(N)`, where `N` is the size of `nums2`.
- **Finding results for `nums1`:** `O(M)`, where `M` is the size of `nums1`.
- **Overall Complexity:** `O(N + M)`, since we process each element only once.

---

## Space Complexity
- **HashMap stores up to `N` elements:** `O(N)`.
- **Stack stores up to `N` elements in the worst case:** `O(N)`.
- **Total Space Complexity:** `O(N)`.
