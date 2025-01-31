/**
 * LeetCode Problem 1991: Find the Middle Index in Array
 * Problem Link: https://leetcode.com/problems/find-the-middle-index-in-array/
 */

class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        pre[0] = 0;
        post[nums.length - 1] = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }

        for (int j = nums.length - 1; j > 0; j--) {
            post[j - 1] = post[j] + nums[j];
        }

        for (int k = 0; k < nums.length; k++) {
            if (pre[k] == post[k]) {
                return k;
            }
        }

        return -1;
    }
}
