# Introduction to PriorityQueue

## Introduction

**PriorityQueue** is one of the important classes in the **Java Collections Framework**. It is available in the **java.util** package and is used to store elements according to their **priority** rather than their insertion order.

By default, PriorityQueue arranges elements in **ascending (natural) order**. The element with the highest priority (smallest element in natural ordering) is always available at the front of the queue.

PriorityQueue is widely used in scheduling algorithms, graph algorithms, operating systems, task management, and many real-world applications where processing order depends on priority.

---

# What is PriorityQueue?

**PriorityQueue** is a class that implements the **Queue** interface and stores elements according to their priority.

Unlike normal queues, elements are not processed based on insertion order.

---

# Definition

**PriorityQueue** is a queue implementation that orders its elements according to their natural ordering or a custom comparator.

---

# Package

```java
java.util
```

---

# Syntax

```java
PriorityQueue queue = new PriorityQueue();
```

---

# Internal Data Structure

PriorityQueue internally uses a **Binary Heap (Min Heap)**.

This allows insertion and deletion operations to be performed efficiently.

---

# How PriorityQueue Works

By default, the smallest element has the highest priority.

Example:

```text
Elements Inserted

40
10
30
20
50

Stored Internally (Heap)

        10
      /    \
    20      30
   /  \
 40   50

Front Element

10
```

Removing the front element automatically reorganizes the heap.

---

# Characteristics of PriorityQueue

- Implements the Queue interface.
- Internally uses a Binary Heap.
- Stores elements based on priority.
- Does not maintain insertion order.
- Does not allow null elements.
- Duplicate elements are allowed.
- Dynamic in size.
- Not synchronized.
- By default, follows ascending order.

---

# Why Do We Need PriorityQueue?

Normal queues process elements in FIFO order.

Sometimes applications require processing based on priority instead of insertion order.

PriorityQueue solves this problem by automatically arranging elements according to their priority.

---

# Real-World Applications

PriorityQueue is commonly used in:

- CPU scheduling
- Task scheduling
- Job scheduling
- Printer scheduling
- Dijkstra's shortest path algorithm
- Prim's Minimum Spanning Tree algorithm
- Event-driven systems
- Simulation systems

---

# Advantages of PriorityQueue

- Automatic sorting based on priority.
- Fast insertion and deletion.
- Dynamic resizing.
- Efficient heap implementation.
- Suitable for scheduling applications.
- Supports duplicate elements.

---

# Limitations of PriorityQueue

- Does not maintain insertion order.
- Does not allow null values.
- Not synchronized.
- Does not support random index access.

---

# Frequently Asked Interview Questions

### 1. What is PriorityQueue?

PriorityQueue is a queue implementation that processes elements according to their priority.

---

### 2. Which package contains PriorityQueue?

```java
java.util
```

---

### 3. Which interface does PriorityQueue implement?

Queue.

---

### 4. Which data structure is used internally?

Binary Heap (Min Heap).

---

### 5. Does PriorityQueue maintain insertion order?

No.

---

### 6. Does PriorityQueue allow duplicate elements?

Yes.

---

### 7. Does PriorityQueue allow null values?

No.

---

### 8. Is PriorityQueue synchronized?

No.

---

### 9. What is the default ordering?

Ascending (Natural Ordering).

---

### 10. When should PriorityQueue be used?

Whenever elements need to be processed based on priority instead of insertion order.

---

# Key Points

- PriorityQueue implements the Queue interface.
- Internally uses a Binary Heap.
- Elements are automatically arranged by priority.
- Duplicate elements are allowed.
- Null values are not allowed.
- Dynamic in size.
- Not synchronized.
- Widely used in scheduling and graph algorithms.

---

# Summary

PriorityQueue is a powerful Queue implementation in the Java Collections Framework that stores elements according to their priority instead of insertion order. Internally, it uses a Binary Heap to provide efficient insertion and deletion operations. Its automatic ordering mechanism makes it ideal for scheduling systems, graph algorithms, simulations, and other applications where processing order depends on priority. Understanding PriorityQueue is essential for Java programming and technical interview preparation.
