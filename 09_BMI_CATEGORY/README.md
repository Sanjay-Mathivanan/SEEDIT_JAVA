# Calculate BMI Category

## Problem Statement
A person's Body Mass Index (BMI) is calculated using the formula:

```
BMI = weight / (height × height)
```

You are given:
- Weight (in kilograms)
- Height (in meters)

Your task is to determine the **BMI category** based on the calculated BMI value.

---

## BMI Categories
- If BMI < 18 → return **0** (Underweight)
- If 18 ≤ BMI < 25 → return **1** (Normal)
- If 25 ≤ BMI < 30 → return **2** (Overweight)
- If 30 ≤ BMI < 40 → return **3** (Obese)
- If BMI ≥ 40 → return **4** (Severely Obese)

---

## Input Format
- First line contains an integer **weight**
- Second line contains a float **height**

---

## Output Format
Print an integer representing the BMI category.

---

## Sample Input
```
42
1.54
```

## Sample Output
```
0
```

---

## Explanation
```
BMI = 42 / (1.54 × 1.54)
    = 42 / 2.3716
    ≈ 17.70
```

Since BMI < 18, the category is **0 (Underweight)**.

---

## Time Complexity
O(1)

## Space Complexity
O(1)