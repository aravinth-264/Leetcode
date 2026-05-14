1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        while(left <= right)
6        {
7            int mid = (left+right) / 2 ;
8            if(nums[mid] == target)
9            {
10                return mid;
11            }
12            if(nums[mid] < target)
13            {
14                left = mid + 1;
15            }
16            else
17            {
18                right = mid - 1;
19            }
20        }
21        return -1;
22    }
23}