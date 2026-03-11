# Least Absolute Difference

## Problem Statement
You are given an integer array `arr` of size `length` and an integer `n`.  
Implement the function `LeastDifference(arr, length, n)` to find and return the element in the array having the **least absolute difference** with the given number `n`.

Absolute difference means ignoring the sign of the difference.

Assumption:
- Only one integer will have the least absolute difference.
- n ≥ 0

## Input Format
First line contains an integer `length` representing the size of the array.  
Second line contains an integer `n`.  
Third line contains `length` integers representing the array elements.

## Output Format
Print the element having the least absolute difference with `n`.

## Sample Input

12
27
1 2 12 13 15 17 26 30 38 45 64 72


## Sample Output

26


## Explanation
Absolute difference between 27 and each element is calculated.

| Element | Absolute Difference |
|--------|---------------------|
|1|26|
|2|25|
|12|15|
|13|14|
|15|12|
|17|10|
|26|1|
|30|3|
|38|11|
|45|18|
|64|37|
|72|45|

The smallest absolute difference is **1**, which occurs with **26**.  
Therefore, the output is **26**.
