1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        
4        HashMap<Integer,Integer> map = new HashMap<>();
5        map.put(0,-1);
6        int prefixSum = 0;
7
8        for(int i = 0; i < nums.length; i++)
9        {
10            prefixSum += nums[i];
11            int rem = prefixSum % k;
12
13            if(map.containsKey(rem))
14            {
15                if(i - map.get(rem) >= 2)
16                {
17                    return true;
18                }
19            }
20            else
21            {
22                map.put(rem,i);
23            }
24        }
25        return false;
26    }
27}