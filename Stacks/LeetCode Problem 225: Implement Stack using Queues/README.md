# Implement Stack using Queues

## Problem Link
[LeetCode - Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)

---

## Problem Description
Design a stack using only queues.

You must implement the following functions:
1. `push(x)`: Pushes element `x` onto the stack.
2. `pop()`: Removes and returns the top element.
3. `top()`: Returns the top element without removing it.
4. `empty()`: Returns `true` if the stack is empty, otherwise `false`.

### Constraints:
- `1 <= x <= 10⁹`
- At most `100` calls will be made to push, pop, top, and empty.
- All calls to `pop` and `top` are valid.

---

## Examples:

#### Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False

---
## Approach
##### Using a Single Queue
This approach uses only one queue to mimic stack behavior (LIFO - Last In, First Out).

Push(x): Add x to the queue and rotate the queue so that x becomes the front element.
Pop(): Remove and return the front element of the queue.
Top(): Return the front element of the queue without removing it.
Empty(): Check if the queue is empty.


Complexity Analysis:
Push takes O(n), since rotating the queue after adding a new element takes time.
Pop, Top, and Empty all take O(1), as they involve direct queue operations.

---
Note: This approach uses only one queue, making it more space-efficient.
Another approach is using two queues, but it introduces additional complexity.
