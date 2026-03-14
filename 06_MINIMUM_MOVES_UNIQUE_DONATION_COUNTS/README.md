# Minimum Moves to Make Donation Counts Unique

## Problem Statement
You are organizing a charity event where people donate various items.  
The number of donations for each type of item is stored in an array called `donationCounts`.

Sometimes multiple people donate the same type of item at the same time, which leads to **duplicate counts** in the array.

To fix this, you can increment the value of any element in the array by **1** in a single move.

Your task is to determine the **minimum number of moves required** so that every value in the `donationCounts` array becomes **unique**.

---

## Input Format
- First line contains an integer **n**, representing the number of donation types.
- Second line contains **n integers**, representing the donation counts.

---

## Output Format
Print a single integer representing the **minimum number of moves** required to make all counts unique.

---

## Sample Input
```
3
1 2 2
```

## Sample Output
```
1
```

---

## Explanation
Initial array:

```
[1, 2, 2]
```

The value **2** appears twice.  
To make the counts unique, increment the second `2` by **1**.

```
[1, 2, 3]
```

Number of moves required = **1**

---

## Time Complexity
O(n log n)

## Space Complexity
O(1)