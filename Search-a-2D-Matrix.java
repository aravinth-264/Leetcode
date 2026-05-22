1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int top = 0, bottom = m - 1;
7        int row = -1;
8
9        while(top <= bottom)
10        {
11            int mid = (top + bottom) / 2;
12
13            if (target >= matrix[mid][0] && target <= matrix[mid][n - 1])
14            {
15                row = mid;
16                break;
17            }
18            else if (target < matrix[mid][0])
19            {
20                bottom = mid - 1;
21            }
22            else
23            {
24                top = mid + 1;
25            }
26        } 
27
28        if (row == -1) return false;
29
30        int left = 0, right = n - 1;
31
32        while (left <= right)
33        {
34            int mid = (left + right) / 2;
35
36            if (matrix[row][mid] == target)
37            {
38                return true;
39            }
40            else if (matrix[row][mid] < target)
41            {
42                left = mid + 1;
43            }
44            else
45            {
46                right = mid - 1;
47            }
48        }
49        return false;
50    }
51}