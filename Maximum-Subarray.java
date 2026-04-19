1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum = nums[0];
4        int curSum = 0;
5
6        for(int num:nums)
7        {
8            curSum += num;
9            maxSum = Math.max(curSum,maxSum);
10
11            if(curSum < 0)
12            {
13                curSum = 0;
14            }
15        }
16        return maxSum;
17    }
18}