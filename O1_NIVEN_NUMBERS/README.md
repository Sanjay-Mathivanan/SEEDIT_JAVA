# Niven Number Checker

## Problem Statement
A Niven number is a positive integer greater than 0 that is divisible by the sum of its digits.

You are given a function:

int CheckNivenNumber(int n);

The function accepts an integer 'n' as its argument.

If 'n' is a Niven number, return the quotient (n / sum_of_digits).
Otherwise, return 0.

Assume that n > 0.

--------------------------------------------------

Input Format
Integer

Output Format
Integer

--------------------------------------------------

Sample Input 0
36

Sample Output 0
4

Explanation 0
Sum of digits = 3 + 6 = 9
36 / 9 = 4
So, output is 4.

--------------------------------------------------

Sample Input 1
57

Sample Output 1
0

Explanation 1
Sum of digits = 5 + 7 = 12
57 is not divisible by 12.
So, output is 0.

--------------------------------------------------

Algorithm
1. Read integer n.
2. Find sum of digits of n.
3. If n % sum == 0, return n / sum.
4. Else return 0.

--------------------------------------------------

Conclusion
If the number is divisible by the sum of its digits, return the quotient.
Otherwise, return 0.