1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while(left < right)
7        {
8            int mid = left + (right - left) / 2;
9
10            if(nums[mid] > nums[mid + 1])
11            {
12                right = mid;
13            }
14            else
15            {
16                left = mid + 1;
17            }
18        }
19        return left;   
20    }
21}