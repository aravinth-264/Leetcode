1class Solution {
2    public int majorityElement(int[] nums) {
3        int count = 0;
4        int cand = 0;
5
6        for(int i = 0; i < nums.length; i++)
7        {
8            if(count == 0)
9            {
10                cand = nums[i];
11            }
12            if(cand == nums[i])
13            {
14                count++;
15            }
16            else
17            {
18                count--;
19            }
20        }
21        return cand;
22    }
23}