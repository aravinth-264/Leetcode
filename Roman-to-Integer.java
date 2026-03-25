1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
4        
5        hm.put('I',1);
6        hm.put('V',5);
7        hm.put('X',10);
8        hm.put('L',50);
9        hm.put('C',100);
10        hm.put('D',500);
11        hm.put('M',1000);
12
13        int result = hm.get(s.charAt(s.length()-1));
14
15        for(int i = s.length()-2 ; i >= 0 ; i--)
16        {
17            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1)))
18            {
19                result = result - hm.get(s.charAt(i));
20            }
21            else
22            {
23                result = result + hm.get(s.charAt(i));
24            }
25        }
26        return result;
27    }
28}