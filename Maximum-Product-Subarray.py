1class Solution:
2    def maxProduct(self, nums: List[int]) -> int:
3        n = len(nums)
4        prefix = 1
5        suffix = 1
6        ans = float('-inf')
7
8        for i in range(n):
9            if prefix == 0:
10                prefix = 1
11            if suffix == 0:
12                suffix = 1
13
14            prefix *= nums[i] 
15            suffix *= nums[n-1-i ]
16
17            ans = max(ans,prefix,suffix)
18
19        return ans