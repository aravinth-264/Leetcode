1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5
6        reverseNum(nums, 0, n-1);
7        reverseNum(nums, 0, k-1);
8        reverseNum(nums, k, n-1);
9    }
10    public void reverseNum(int[] nums, int start, int end)
11    {
12        while(start < end)
13        {
14            int temp = nums[end];
15            nums[end] = nums[start];
16            nums[start] = temp;
17            start++;
18            end--;
19        }
20    }
21}