1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low = 1;
4        int high = 0;
5
6        for (int pile : piles)
7        {
8            high = Math.max(high, pile);
9        }
10        int ans = high;
11        while(low <= high)
12        {
13            int mid = low + (high - low) / 2;
14            if(canEat(piles, h, mid))
15            {
16                ans = mid;
17                high = mid - 1;
18            }
19            else
20            {
21                low = mid + 1;
22            }
23        }
24        return ans;
25    }
26
27    private boolean canEat(int[] piles, int h, int k)
28    {
29        long hours = 0;
30        for(int pile : piles)
31        {
32            hours += (pile + k - 1) / k;
33        }
34        return hours <= h;
35    }
36}