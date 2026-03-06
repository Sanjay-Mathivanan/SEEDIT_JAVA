# Counting on Fingers

## Problem
A girl counts numbers on her fingers in the following pattern:

1 → Thumb  
2 → Index  
3 → Middle  
4 → Ring  
5 → Little  

Then she reverses the direction:

6 → Ring  
7 → Middle  
8 → Index  
9 → Thumb  

This pattern repeats continuously.

You are given a number **n**.  
Determine which finger the girl will be on when she reaches count **n**.

Finger Mapping:

1 → Thumb  
2 → Index  
3 → Middle  
4 → Ring  
5 → Little

## Approach

The counting pattern repeats every **8 numbers**.

Sequence pattern:

1 2 3 4 5 4 3 2

So we use:

n % 8

and map the remainder to the corresponding finger.

## Example

Input
32

Output
2

Explanation:

32 % 8 = 0 → corresponds to index finger.

## Language
Java

## Platform
SEED-IT (HackerRank Integrated)