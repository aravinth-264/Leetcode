1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while(left <= right)
7        {
8            int mid = left+((right - left)/2);
9
10            if(nums[mid] == target)
11            {
12                return mid;
13            }
14            else if(nums[mid] < target)
15            {
16                left = mid + 1;
17            }
18            else
19            {
20                right = mid - 1;
21            }
22        }
23        return left;
24    }
25}