Beautiful Days at the Movies

Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse.

For example:

Given the number 12, its reverse is 21. Their difference is 9.

The number 120 reversed is 21, and their difference is 99.

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days [i … j] and a number k, determine the number of days in the range that are beautiful.

A number is defined as beautiful if the absolute difference between the number and its reverse is evenly divisible by k.

If a day’s value is a beautiful number, it is a beautiful day.

Return the number of beautiful days in the range.

Function Description

Complete the beautifulDays function in the editor below.

Parameters:

int i: the starting day number

int j: the ending day number

int k: the divisor

Returns:

int: the number of beautiful days in the given range

Input Format

A single line of three space-separated integers:

i j k

Constraints

1 ≤ i ≤ j ≤ 2 × 10^6

1 ≤ k ≤ 2 × 10^6

Example
Input
20 23 6

Explanation

Day 20 → reverse = 02 → |20 − 2| = 18 → divisible by 6 ✔

Day 21 → reverse = 12 → |21 − 12| = 9 → not divisible by 6 ✘

Day 22 → reverse = 22 → |22 − 22| = 0 → divisible by 6 ✔

Day 23 → reverse = 32 → |23 − 32| = 9 → not divisible by 6 ✘

Output
2
