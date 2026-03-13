# Check Power Of Two

## Problem Statement
The power of a number indicates how many times that number is multiplied by itself.  

You are given an integer **n**. Implement the function **CheckPowerOfTwo(n)** to determine whether the given number is a **power of 2**.

- If **n** is a power of 2, return the **power value**.
- Otherwise, return **-1**.

### Assumption
n > 0

---

## Input Format
A single integer **n**.

---

## Output Format
Return the **power of 2** if the number is a power of two, otherwise return **-1**.

---

## Sample Input
```
36
```

## Sample Output
```
-1
```

---

## Explanation
36 cannot be expressed as **2ᵏ**.

Example powers of 2:

| Number | Power |
|------|------|
|2|1|
|4|2|
|8|3|
|16|4|
|32|5|

Since **36 is not a power of 2**, the output is **-1**.

---

## Time Complexity
O(log n)

## Space Complexity
O(1)