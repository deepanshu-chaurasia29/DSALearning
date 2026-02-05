# LC- 73       This is the first problem i solved

Today i solved set matrix zeroes problem
## Problem Statement
 - > you have given a matrix (m*n), If you found an element as 0, mark 
all its corresponding rows and cols elements as 0.

I solved this in two ways:-
1. brute force
2. better way


### Brute Force Approach
In brute force I iterates over the each elements and whenever i found element as "0", I made its corresponding rows and cols as "-1"

""Why not 0 directly ?""
- > because it can cause chain reaction and mark wrong elements as 0.

After that again iterate over each elements and compared, if(elem == -1) set it as 0;
- time complexity => O(m*n) * (m+n)
- space complexity => O(1)


### Better Approach
In better way, I used two extra arrays for marking-
(initially all elements are 0 by default).
1. row array of length n, where n = matrix[0].length
2. col array of length m, where m = matrix.length

""How to mark?""

Iterate over the elements and when "0" is encountered make row and col array index as 1, (make both array as "1")

"how to find final answer?""
Now, iterate over the elements and check either of row or column array contains "1" , if yes then mark M[i][j] = 0.


- Time complexity => O(m*n)
- Space complexity => O(m+n)


