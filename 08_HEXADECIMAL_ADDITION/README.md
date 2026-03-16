# Hexadecimal Addition

## Problem Statement
You are given two hexadecimal numbers as **strings**.  
Your task is to **add the two hexadecimal numbers** without converting them into decimal.

The result should also be printed in **hexadecimal format**.

---

## Input Format
- The first line contains an integer **T** representing the number of test cases.
- The next **T lines** contain two hexadecimal strings **S1** and **S2** separated by space.

---

## Constraints
- Length(S1), Length(S2) > 0

---

## Output Format
Print the **sum of the two hexadecimal numbers** for each test case.

---

## Sample Input
```
3
A12 FF3
FFA 7A0
DDD CCC
```

## Sample Output
```
1A05
179A
1AA9
```

---

## Sample Input
```
1
999 111
```

## Sample Output
```
AAA
```

---

## Explanation

Example:

```
FFA + 7A0
```

Hexadecimal addition:

```
  F F A
+ 7 A 0
-------
1 7 9 A
```

Therefore, the result is:

```
179A
```

---

## Time Complexity
O(max(n, m))

## Space Complexity
O(max(n, m))