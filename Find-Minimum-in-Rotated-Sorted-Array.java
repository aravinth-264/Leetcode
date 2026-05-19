1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while(left < right)
7        {
8            int mid = left + (right - left) / 2;
9            if(nums[mid] <= nums[right])
10            {
11                right = mid;
12            }
13            else
14            {
15                left = mid + 1;
16            }
17        } 
18        return nums[right];
19    }
20}