# Problem

Erica wrote an increasing sequence of n numbers (a[0], a[1],...,a[n-1]) in her notebook. She considers a triplet (a[i],a[j],a[k]) to be beautiful if:
- i < j < k
- a[j] -a[i] = a[k] - a[j] = d

Given the sequence and the value of d, can you help Erica count the number of beautiful triplets in the sequence?

###Input Format

The first line contains 2 space-separated integers n and d, the length of the sequence and the beautiful difference.
The second line contains n space-separated integers .

###Output Format

Print a single line denoting the number of beautiful triplets in the sequence.

###Sample Input
```
7 3
1 2 4 5 7 8 10
```
###Sample Output
```
3
```