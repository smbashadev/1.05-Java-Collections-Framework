# Stack in Java

## Introduction

**Stack** is one of the Legacy Classes in Java that represents a **Last In First Out (LIFO)** data structure. It extends the `Vector` class and was introduced before the Java Collections Framework.

In a Stack, the last element inserted is the first element removed. This behavior is similar to a stack of books, where the book placed on the top is the first one to be removed.

Although the `Deque` interface with `ArrayDeque` is preferred for modern applications, `Stack` is still available for backward compatibility and is commonly asked in Java interviews.

---

# Definition

A **Stack** is a synchronized collection class that follows the **Last In First Out (LIFO)** principle, where elements are inserted and removed from the top of the stack.

---

# Package

```java
java.util.Stack
```

---

# Declaration

```java
Stack stack = new Stack();
```

---

# Stack Principle

```
Push 10

Top
 ↓
+------+
|  10  |
+------+

Push 20

Top
 ↓
+------+
|  20  |
+------+
|  10  |
+------+

Push 30

Top
 ↓
+------+
|  30  |
+------+
|  20  |
+------+
|  10  |
+------+

Pop

Top
 ↓
+------+
|  20  |
+------+
|  10  |
+------+
```

---

# Features of Stack

- Follows LIFO principle.
- Extends the Vector class.
- Synchronized and thread-safe.
- Allows duplicate elements.
- Allows null values.
- Dynamically resizes.
- Maintains insertion order.

---

# Internal Working

1. A Stack object is created.
2. Elements are inserted using the `push()` method.
3. New elements are always added to the top.
4. Elements are removed using the `pop()` method.
5. The most recently added element is removed first.

---

# Commonly Used Methods

| Method | Description |
|---------|-------------|
| `push()` | Adds an element to the top |
| `pop()` | Removes and returns the top element |
| `peek()` | Returns the top element without removing it |
| `search()` | Returns the position of an element |
| `empty()` | Checks whether the stack is empty |
| `size()` | Returns the number of elements |
| `clear()` | Removes all elements |

---

# Example

```java
Stack stack = new Stack();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack);

System.out.println(stack.peek());

System.out.println(stack.pop());

System.out.println(stack);
```

### Output

```
[10, 20, 30]
30
30
[10, 20]
```

---

# Advantages

- Easy implementation of LIFO operations.
- Thread-safe.
- Dynamic size.
- Simple API.
- Suitable for legacy applications.

---

# Limitations

- Slower than modern alternatives because of synchronization.
- Extends Vector, which adds unnecessary overhead.
- `ArrayDeque` is generally preferred in new applications.

---

# Stack vs ArrayDeque

| Feature | Stack | ArrayDeque |
|---------|-------|------------|
| Type | Legacy Class | Modern Collection |
| Synchronization | Yes | No |
| Performance | Slower | Faster |
| Thread Safe | Yes | No |
| Recommended for New Projects | No | Yes |

---

# Real-World Applications

Stack is used in:

- Undo and Redo operations
- Browser Back button
- Expression evaluation
- Parentheses matching
- Function call management
- Backtracking algorithms
- Depth First Search (DFS)

---

# Interview Questions

### 1. What is Stack?

**Answer:**

Stack is a Legacy Class that follows the Last In First Out (LIFO) principle.

---

### 2. Which principle does Stack follow?

**Answer:**

LIFO (Last In First Out).

---

### 3. Which class does Stack extend?

**Answer:**

Vector.

---

### 4. Is Stack synchronized?

**Answer:**

Yes.

---

### 5. Which methods are most commonly used in Stack?

**Answer:**

- `push()`
- `pop()`
- `peek()`
- `search()`
- `empty()`

---

### 6. Which is preferred in modern Java: Stack or ArrayDeque?

**Answer:**

`ArrayDeque` is preferred because it provides better performance.

---

# Quick Revision

| Property | Value |
|----------|-------|
| Package | java.util |
| Principle | LIFO |
| Parent Class | Vector |
| Thread Safe | Yes |
| Allows Duplicates | Yes |
| Allows Null | Yes |
| Modern Alternative | ArrayDeque |

---

# Key Takeaways

- Stack is a Legacy Class in Java.
- It follows the LIFO principle.
- It extends the Vector class.
- It provides methods like `push()`, `pop()`, and `peek()`.
- It is synchronized and thread-safe.
- `ArrayDeque` is the preferred replacement for Stack in modern Java applications.

---

# Summary

Stack is a synchronized legacy collection class that implements the Last In First Out (LIFO) principle. It is useful for operations such as undo functionality, expression evaluation, recursion management, and backtracking algorithms. While modern Java applications generally use `ArrayDeque` for stack operations, understanding `Stack` remains important for maintaining legacy applications and succeeding in Java technical interviews.
