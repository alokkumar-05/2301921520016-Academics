// LeetCode Problem 53: Maximum Subarray
// Difficulty: Medium
// Link: https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        long n = nums.length;
        long max = Long.MIN_VALUE; // Maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) max;
    }
}
