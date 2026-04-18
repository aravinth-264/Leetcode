1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n = nums.length;
4        int totalSum = 0; 
5        for(int num : nums)
6        {
7            totalSum += num;
8        }
9
10        int leftSum = 0;
11        for(int i = 0; i < n; i++)
12        {
13            int rightSum = totalSum - leftSum - nums[i];
14            if(rightSum == leftSum)
15            {
16                return i;
17            } 
18            leftSum += nums[i];
19        }
20        return -1;
21    }
22}