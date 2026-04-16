1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5
6        res[0] = 1;
7        for(int i = 1; i < n; i++)
8        {
9            res[i] = res[i-1] * nums[i-1];
10        }
11
12        int rightProd = 1;
13        for(int r = n-1; r >= 0; r--)
14        {
15            res[r] = res[r] * rightProd;
16            rightProd *= nums[r];
17        }
18        return res;
19    }
20}