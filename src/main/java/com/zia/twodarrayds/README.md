# The Time in Words
## Problem
Give a 6 x 6 2D array, arr:
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```
We define an hourglass to be a subset of values with indices falling in this pattern in arr's graphical representation:
```
a b c
  d
e f g
```
There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
## Input Format
Each of the 6 lines of inputs arr[i] contains 6 space-separated integers arr[i][j].
## Constraints
- -9 <= arr[i][j] <= 9
- 0 <= i,j <= 5
## Output Format
Print the largest (maximum) hourglass sum found in arr.
## Sample Input
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```
## Sample Output
```
19
```