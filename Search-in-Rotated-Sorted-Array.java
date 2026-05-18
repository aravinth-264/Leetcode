1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while(left <= right)
7        {
8            int mid = left + ((right - left) / 2);
9
10            if(nums[mid] == target)
11            {
12                return mid;
13            }
14            if(nums[mid] >= nums[left])
15            {
16                if(nums[left] <= target && target < nums[mid])
17                {
18                    right = mid - 1;
19                }
20                else
21                {
22                    left = mid + 1;
23                }
24            }
25            else
26            {
27                if(target > nums[mid] && nums[right] >= target)
28                {
29                    left = mid + 1;
30                }
31                else
32                {
33                    right = mid - 1;
34                }
35            }
36        }
37        return -1;
38    }
39}