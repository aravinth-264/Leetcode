1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int r = 0;
7        int c = n - 1;
8
9        while(r < m && c >= 0)
10        {
11            if(matrix[r][c] == target)
12            {
13                return true;
14            }
15            else if(matrix[r][c] > target)
16            {
17                c -= 1;
18            }
19            else
20            {
21                r += 1;
22            }
23        }
24        return false;
25    }
26}