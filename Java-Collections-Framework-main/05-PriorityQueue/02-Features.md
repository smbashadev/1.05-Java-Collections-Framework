# Features of PriorityQueue

## Introduction

**PriorityQueue** is one of the most efficient Queue implementations in the Java Collections Framework. Unlike a normal queue, it stores elements according to their **priority** instead of the order in which they are inserted.

Understanding the features of PriorityQueue helps developers choose it for applications that require automatic ordering and priority-based processing.

---

# Features of PriorityQueue

## 1. Implements the Queue Interface

PriorityQueue implements the **Queue** interface.

It follows the queue concept but processes elements according to priority.

---

## 2. Internally Uses a Binary Heap

PriorityQueue internally uses a **Binary Heap (Min Heap)**.

This enables efficient insertion and deletion operations.

---

## 3. Stores Elements Based on Priority

Elements are automatically arranged according to their priority.

By default, the smallest element has the highest priority.

Example:

```text
Inserted Elements

40 20 10 50 30

Priority Order

10 20 30 40 50
```

---

## 4. Natural Ordering by Default

PriorityQueue stores elements in **ascending order** unless a custom Comparator is provided.

---

## 5. Supports Custom Ordering

Developers can define their own ordering by using a **Comparator**.

This allows elements to be sorted in descending order or according to custom business logic.

---

## 6. Dynamic Size

PriorityQueue grows automatically as new elements are added.

There is no need to specify a fixed size.

---

## 7. Allows Duplicate Elements

Duplicate values are permitted.

Example:

```text
10
20
20
30
30
40
```

---

## 8. Does Not Allow Null Elements

PriorityQueue does not permit null values.

Adding a null element throws a **NullPointerException**.

---

## 9. Does Not Maintain Insertion Order

Elements are processed according to priority.

Insertion order is not preserved.

---

## 10. Not Synchronized

PriorityQueue is not synchronized.

If multiple threads modify the queue simultaneously, external synchronization is required.

---

## 11. Efficient Performance

PriorityQueue provides efficient operations:

- Insertion → O(log n)
- Deletion → O(log n)
- Peek → O(1)

---

## 12. No Random Access

PriorityQueue does not support index-based access like ArrayList.

Elements are accessed only from the front of the queue.

---

## 13. Head Element Always Has Highest Priority

The element at the head of the queue is always the smallest element according to natural ordering.

---

## 14. Suitable for Scheduling Algorithms

PriorityQueue is ideal for applications where tasks must be processed based on priority.

Examples include:

- CPU Scheduling
- Task Scheduling
- Graph Algorithms
- Event Processing

---

# Advantages of These Features

- Automatic priority ordering
- Dynamic resizing
- Fast insertion
- Fast deletion
- Efficient heap implementation
- Supports duplicate elements
- Suitable for real-time scheduling

---

# Limitations

- Does not maintain insertion order
- Does not allow null values
- Not synchronized
- No index-based access

---

# Frequently Asked Interview Questions

### 1. Which interface is implemented by PriorityQueue?

Queue.

---

### 2. Which internal data structure is used?

Binary Heap (Min Heap).

---

### 3. Does PriorityQueue maintain insertion order?

No.

---

### 4. Does PriorityQueue allow duplicate elements?

Yes.

---

### 5. Does PriorityQueue allow null values?

No.

---

### 6. What is the default ordering?

Ascending (Natural Ordering).

---

### 7. Is PriorityQueue synchronized?

No.

---

### 8. Can PriorityQueue grow dynamically?

Yes.

---

### 9. Does PriorityQueue support random access?

No.

---

### 10. Which element is always available at the head?

The element with the highest priority (smallest element in natural ordering).

---

# Quick Revision Table

| Feature | Supported |
|---------|-----------|
| Queue Interface | Yes |
| Binary Heap | Yes |
| Dynamic Size | Yes |
| Duplicate Elements | Yes |
| Null Elements | No |
| Insertion Order | No |
| Natural Ordering | Yes |
| Custom Comparator | Yes |
| Thread Safe | No |
| Random Access | No |

---

# Key Takeaways

- PriorityQueue implements the Queue interface.
- Internally uses a Binary Heap.
- Elements are stored according to priority.
- Duplicate elements are allowed.
- Null values are not allowed.
- Dynamic in size.
- Supports custom ordering using Comparator.
- Suitable for scheduling and graph algorithms.

---

# Summary

PriorityQueue is a high-performance Queue implementation that automatically arranges elements according to their priority. Its Binary Heap implementation provides efficient insertion and deletion while supporting dynamic resizing and duplicate elements. Because of its automatic ordering and efficient performance, PriorityQueue is widely used in scheduling systems, graph algorithms, and many real-world Java applications.
