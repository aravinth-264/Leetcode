1class Solution {
2    public int strStr(String haystack, String needle) {
3        int hl = haystack.length();
4        int nl = needle.length();
5
6        for(int i = 0; i < hl-nl+1; i++)
7        {
8            if(haystack.charAt(i) == needle.charAt(0))
9            {
10                if(haystack.substring(i,i+nl).equals(needle))
11                {
12                    return i;
13                }
14            }
15        }
16        return -1;
17    }
18}