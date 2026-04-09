# LC-73  
This is the **first problem** I solved.

Today, I solved the **Set Matrix Zeroes** problem.

## 🧩 Problem Statement
- You are given a matrix of size **m × n**.  
- If any element is `0`, mark **all elements in its corresponding row and column as `0`**.

---

## 💡 Approaches Used
I solved this problem in **two ways**:
1. Brute Force
2. Better Approach

---

## 🔹 Brute Force Approach
In the brute force approach, I iterated over **each element** of the matrix.  
Whenever I found an element equal to `0`, I marked all its corresponding **rows and columns as `-1`**.

### ❓ Why not mark them as `0` directly?
- Because it may cause a **chain reaction** (unexpected effect), where newly set `0`s wrongly affect other rows and columns.

After the first traversal, I iterated over the matrix again and:
- If `matrix[i][j] == -1`, I set it to `0`.

### ⏱️ Complexity
- **Time Complexity:** `O(m × n × (m + n))`
- **Space Complexity:** `O(1)`

---

## 🔹 Better Approach
In the better approach, I used **two extra arrays** for marking (initialized with `0` by default):

1. `row[]` array of length `n`  
   - where `n = matrix[0].length`
2. `col[]` array of length `m`  
   - where `m = matrix.length`

### 📝 How to mark?
- Traverse the matrix.
- Whenever an element `0` is found:
  - Mark `row[i] = 1`
  - Mark `col[j] = 1`

### 🧮 How to get the final answer?
- Traverse the matrix again.
- If `row[i] == 1` **or** `col[j] == 1`, then set:
