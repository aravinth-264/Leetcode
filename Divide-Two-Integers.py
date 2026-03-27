1class Solution:
2    def divide(self, dividend: int, divisor: int) -> int:
3        if dividend == -2**31 and divisor == -1:
4            return 2**31 - 1
5        if dividend == -2**31 and divisor == 1:
6            return -2**31
7
8        negative = (dividend < 0) ^ (divisor < 0)
9
10        absDividend, absDivisor = abs(dividend), abs(divisor)
11
12        quotient = 0
13
14        while absDividend >= absDivisor:
15            tempDivisor, multiple = absDivisor, 1
16            while absDividend >= (tempDivisor << 1):
17                tempDivisor <<= 1
18                multiple <<= 1
19            absDividend -= tempDivisor
20            quotient += multiple
21
22        return -quotient if negative else quotient