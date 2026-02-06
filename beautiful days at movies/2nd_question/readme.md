Circular Array Rotation

John Watson knows of an operation called a right circular rotation on an array of integers.
One rotation operation moves the last array element to the first position and shifts all remaining elements one position to the right.

To test Sherlock’s abilities, Watson provides Sherlock with an array of integers. Sherlock is required to perform the rotation operation a given number of times and then determine the value of the element at specified positions.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

Example
a = [3, 4, 5]
k = 2
queries = [1, 2]


Here:

k is the number of rotations performed on array a

queries contains the list of indices to report

Perform the rotations:

[3, 4, 5] → [5, 3, 4] → [4, 5, 3]


Now return the values at the zero-based indices 1 and 2:

a[1] = 5
a[2] = 3

Function Description

Complete the circularArrayRotation function.

Parameters:

int a[n]: the array to rotate

int k: the number of right rotations

int queries[q]: the indices of elements to return

Returns:

int[q]: the values in the rotated array corresponding to the query indices

Input Format

The first line contains three space-separated integers n, k, and q

n = number of elements in the array

k = number of rotations

q = number of queries

The second line contains n space-separated integers representing the array elements

Each of the next q lines contains a single integer queries[i], an index to query

Constraints

1 ≤ n ≤ 10^5

1 ≤ a[i] ≤ 10^5

1 ≤ k ≤ 10^5

1 ≤ q ≤ 500

0 ≤ queries[i] < n

Sample Input
3 2 3
1 2 3
0
1
2

Sample Output
2
3
1
