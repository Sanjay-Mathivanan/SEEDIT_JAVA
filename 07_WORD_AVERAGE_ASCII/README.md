# Word Average (ASCII)

## Problem Statement
You are given a string `str` of length `len`.  
Implement a function to calculate the **word average**.

Word Average is defined as the **average of the ASCII values of all characters in the word**.

Notes:
- The string contains only **lowercase English letters**.
- ASCII value of `'a'` = 97 and `'z'` = 122.
- Do **not manually round** the result. The output should display **2 decimal places**.

---

## Input Format
- First line contains an integer `len` representing the length of the string.
- Second line contains the string `str`.

---

## Output Format
Print the **word average** of the ASCII values of the characters in the string.

---

## Sample Input
```
6
source
```

## Sample Output
```
109.50
```

---

## Explanation

| Character | ASCII Value |
|-----------|-------------|
| s | 115 |
| o | 111 |
| u | 117 |
| r | 114 |
| c | 99 |
| e | 101 |

Sum of ASCII values:

```
115 + 111 + 117 + 114 + 99 + 101 = 657
```

Average:

```
657 / 6 = 109.50
```

Therefore the output is:

```
109.50
```

---

## Time Complexity
O(n)

## Space Complexity
O(1)