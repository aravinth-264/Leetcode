1class Solution:
2    def addDigits(self, num: int) -> int:
3        if num == 0:
4            return 0
5        return 1+ (num-1) % 9