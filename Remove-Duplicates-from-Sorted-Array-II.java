1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i = 0;
4        
5        for(int n:nums)
6        {
7            if(i < 2 || n!=nums[i - 2])
8            {
9                nums[i++] = n;
10            }
11        }
12        return i;
13    }
14}