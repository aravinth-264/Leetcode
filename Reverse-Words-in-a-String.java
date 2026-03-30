1class Solution {
2    public String reverseWords(String s) {
3        String[] words= s.split(" +");//this means any number of spaces
4        StringBuilder sb = new StringBuilder();//used to mutate string
5
6        for(int i = words.length-1; i >= 0;i--)
7        {
8            sb.append(words[i]);
9            sb.append(" ");
10        }
11        return sb.toString().trim();//convert array to string 
12    }
13}