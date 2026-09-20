# PriorityQueue Interview Questions

## Introduction

**PriorityQueue** is one of the most frequently asked collection classes in Java interviews. It implements the **Queue** interface and internally uses a **Binary Heap** to store elements according to their priority rather than their insertion order.

This document contains beginner-friendly and interview-oriented questions with concise answers for quick revision.

---

# Basic Interview Questions

## 1. What is PriorityQueue?

**Answer:**

PriorityQueue is a class in the Java Collections Framework that stores elements according to their priority.

---

## 2. In which package is PriorityQueue available?

**Answer:**

```java
java.util
```

---

## 3. Which interface does PriorityQueue implement?

**Answer:**

Queue.

---

## 4. Which data structure is used internally?

**Answer:**

Binary Heap (Min Heap).

---

## 5. Does PriorityQueue maintain insertion order?

**Answer:**

No.

---

## 6. Does PriorityQueue maintain sorted order while iterating?

**Answer:**

No.

Iteration follows the internal heap structure, not a fully sorted order.

---

## 7. Does PriorityQueue allow duplicate elements?

**Answer:**

Yes.

---

## 8. Does PriorityQueue allow null values?

**Answer:**

No.

Adding a null element throws a **NullPointerException**.

---

## 9. Is PriorityQueue synchronized?

**Answer:**

No.

---

## 10. Is PriorityQueue thread-safe?

**Answer:**

No.

External synchronization is required when multiple threads access it.

---

# Constructor-Based Questions

## 11. How many commonly used constructors does PriorityQueue provide?

**Answer:**

Some commonly used constructors are:

- PriorityQueue()
- PriorityQueue(int initialCapacity)
- PriorityQueue(Collection c)

---

## 12. Which constructor creates an empty PriorityQueue?

**Answer:**

```java
PriorityQueue()
```

---

## 13. Which constructor creates a PriorityQueue with an initial capacity?

**Answer:**

```java
PriorityQueue(int initialCapacity)
```

---

## 14. Can PriorityQueue use a custom Comparator?

**Answer:**

Yes.

A Comparator can be provided to define custom ordering.

---

# Method-Based Questions

## 15. Which method inserts an element?

**Answer:**

```java
add()
```

or

```java
offer()
```

---

## 16. Which method removes the head element?

**Answer:**

```java
remove()
```

or

```java
poll()
```

---

## 17. Which method safely removes the head element?

**Answer:**

```java
poll()
```

---

## 18. Which method retrieves the head element?

**Answer:**

```java
element()
```

or

```java
peek()
```

---

## 19. Which method safely retrieves the head element?

**Answer:**

```java
peek()
```

---

## 20. Which method returns the number of elements?

**Answer:**

```java
size()
```

---

## 21. Which method removes all elements?

**Answer:**

```java
clear()
```

---

## 22. Which method checks whether the queue is empty?

**Answer:**

```java
isEmpty()
```

---

## 23. Which method checks whether an element exists?

**Answer:**

```java
contains()
```

---

# Performance Questions

## 24. What is the time complexity of insertion?

**Answer:**

**O(log n)**

---

## 25. What is the time complexity of deletion?

**Answer:**

**O(log n)**

---

## 26. What is the time complexity of peek()?

**Answer:**

**O(1)**

---

## 27. What is the time complexity of searching?

**Answer:**

**O(n)**

---

## 28. Why is insertion efficient?

**Answer:**

Because PriorityQueue internally maintains a Binary Heap.

---

# Comparison Questions

## 29. Which maintains insertion order?

**Answer:**

LinkedList Queue.

PriorityQueue does not.

---

## 30. Which processes elements based on priority?

**Answer:**

PriorityQueue.

---

## 31. Which data structure is internally used?

**Answer:**

Binary Heap.

---

## 32. Which collection is preferred for scheduling applications?

**Answer:**

PriorityQueue.

---

# Scenario-Based Questions

## 33. When should PriorityQueue be used?

**Answer:**

Use PriorityQueue when:

- Tasks have different priorities.
- Scheduling is required.
- Graph algorithms are implemented.
- The smallest or highest-priority element must always be retrieved first.

---

## 34. When should PriorityQueue be avoided?

**Answer:**

Avoid PriorityQueue when:

- Insertion order must be preserved.
- Random index access is required.
- Null values must be stored.

---

## 35. Why doesn't PriorityQueue allow null values?

**Answer:**

Because null is used internally by queue methods to indicate the absence of an element.

---

## 36. Why is PriorityQueue widely used in graph algorithms?

**Answer:**

Because it efficiently retrieves the next highest-priority element.

---

## 37. Can PriorityQueue store custom objects?

**Answer:**

Yes.

The objects must implement Comparable or a Comparator must be provided.

---

## 38. Which element is always available at the head?

**Answer:**

The element with the highest priority (smallest element in natural ordering).

---

## 39. Does PriorityQueue automatically reorder elements after insertion?

**Answer:**

Yes.

It maintains the heap property automatically.

---

## 40. Name some real-world applications of PriorityQueue.

**Answer:**

- CPU Scheduling
- Task Scheduling
- Printer Scheduling
- Dijkstra's Algorithm
- Prim's Algorithm
- Event Simulation
- Network Routing

---

# Frequently Asked MNC Interview Questions

### Q1. Which interface is implemented by PriorityQueue?

**Answer:** Queue.

---

### Q2. Which data structure is used internally?

**Answer:** Binary Heap (Min Heap).

---

### Q3. Does PriorityQueue allow duplicate elements?

**Answer:** Yes.

---

### Q4. Does PriorityQueue maintain insertion order?

**Answer:** No.

---

### Q5. What is the biggest advantage of PriorityQueue?

**Answer:** Automatic priority-based ordering with efficient insertion and deletion.

---

# Quick Revision Table

| Topic | Key Point |
|--------|-----------|
| Package | java.util |
| Interface | Queue |
| Internal Structure | Binary Heap (Min Heap) |
| Ordering | Priority Based |
| Duplicate Elements | Allowed |
| Null Values | Not Allowed |
| Thread Safe | No |
| Dynamic Size | Yes |
| Peek Complexity | O(1) |
| Insert/Delete Complexity | O(log n) |
| Best Use | Scheduling & Graph Algorithms |

---

# Key Takeaways

- PriorityQueue implements the Queue interface.
- Internally uses a Binary Heap.
- Stores elements according to priority.
- Duplicate elements are allowed.
- Null values are not allowed.
- Does not maintain insertion order.
- Supports custom ordering using Comparator.
- Widely used in scheduling and graph algorithms.
- Frequently asked in Java interviews.

---

# Summary

PriorityQueue is one of the most important Queue implementations in the Java Collections Framework. It automatically orders elements according to their priority using a Binary Heap, providing efficient insertion, deletion, and retrieval operations. Its performance characteristics and real-world applications make it an essential topic for Java developers and technical interview preparation.
