1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findFirst(nums , target);
4        int last = findLast(nums , target);
5        return new int[] {first , last};
6    }
7
8    private int findFirst(int[] nums, int target)
9    {
10        int left = 0;
11        int right = nums.length - 1;
12        int ans = -1;
13        while(left <= right)
14        {
15            int mid = left + (right - left) / 2;
16
17            if(nums[mid] == target)
18            {
19                ans = mid;
20                right = mid - 1;
21            }
22            else if(nums[mid] < target)
23            {
24                left = mid + 1;
25            }
26            else
27            {
28                right = mid - 1;
29            }
30        }
31        return ans;
32    }
33
34    private int findLast(int[] nums ,int target)
35    {
36        int left = 0;
37        int right = nums.length - 1;
38        int ans = -1;
39        while(left <= right)
40        {
41            int mid = left + (right - left) / 2;
42            if(nums[mid] == target)
43            {
44                ans = mid;
45                left = mid + 1;
46            }
47            else if(nums[mid] < target)
48            {
49                left = mid + 1;
50            }
51            else
52            {
53                right = mid - 1;
54            }
55        }
56        return ans;
57    }
58}