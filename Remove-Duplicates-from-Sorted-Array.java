1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int count = 0;
4
5        for(int i = 0; i < nums.length; i++)
6        {
7            if(i < nums.length - 1 && nums[i] == nums[i+1])
8            {
9                continue;
10            }
11            else
12            {
13                nums[count] = nums[i];
14                count++;
15            }
16        } 
17        return count;
18    }
19}