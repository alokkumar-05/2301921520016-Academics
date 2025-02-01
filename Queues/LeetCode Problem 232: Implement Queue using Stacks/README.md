# Implement Queue using Stacks
### Problem Link: [LeetCode 232](https://leetcode.com/problems/implement-queue-using-stacks/)

## Problem Statement
Implement a first in, first out (FIFO) queue using only two stacks.  
The implemented queue should support all the functions of a normal queue (`push`, `pop`, `peek`, and `empty`).

You must use only standard operations of a stack (`push to top`, `pop from top`, `peek at top`, `size`, etc.).

## Constraints
- `1 <= x <= 10^9` (for `push(x)`)
- At most `100` calls will be made to `push`, `pop`, `peek`, and `empty`.
- All calls to `pop` and `peek` are valid (i.e., the queue is not empty).

## Examples

### Example 1:
#### Input:["MyQueue", "push", "push", "peek", "pop", "empty"]
           [[], [1], [2], [], [], []]
### Output: [null, null, null, 1, 1, false]

### Explanation:
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue: [1]
myQueue.push(2); // queue: [1, 2]
myQueue.peek();  // returns 1
myQueue.pop();   // returns 1, queue: [2]
myQueue.empty(); // returns false

---

## Approach

### Using Two Stacks
- We maintain two stacks: `input` (for pushing new elements) and `output` (for popping and peeking elements).
- The first element pushed into the queue is stored separately as `peekEl` to allow quick access for `peek()`.

### Steps:
1. **Push Operation (`push(x)`)**  
   - If `input` is empty, update `peekEl` with `x`.
   - Push `x` onto the `input` stack.

2. **Pop Operation (`pop()`)**  
   - If `output` is empty, transfer all elements from `input` to `output` to reverse their order.
   - Pop from `output` (which now holds the queue elements in correct order).

3. **Peek Operation (`peek()`)**  
   - If `output` is empty, return `peekEl` (which stores the front of the queue).
   - Otherwise, return the top of `output`.

4. **Empty Check (`empty()`)**  
   - Return `true` if both stacks (`input` and `output`) are empty.

---

## Time Complexity
- **Push Operation (`push(x)`)** → `O(1)`
- **Pop Operation (`pop()`)** → `O(1)` (amortized)
- **Peek Operation (`peek()`)** → `O(1)`
- **Empty Check (`empty()`)** → `O(1)`

### Explanation:
- The `pop()` operation may take `O(n)` time in the worst case (when transferring elements from `input` to `output`), but since each element is moved at most once, the amortized time complexity remains `O(1)`.

---

## Space Complexity
- **Extra space for `input` and `output` stacks** → `O(N)`, where `N` is the number of elements in the queue.


