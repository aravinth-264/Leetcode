1class Solution {
2    public int lengthOfLastWord(String s) {
3        s = s.trim();
4        int count = 0;
5        
6        for(int i = s.length() - 1; i >= 0; i--)
7        {
8            if(s.charAt(i) != ' ')
9            {
10                count++;
11            }
12            else
13            {
14                break;
15            }
16        }
17        return count;
18    }
19}