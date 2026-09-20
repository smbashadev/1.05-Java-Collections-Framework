# LinkedList vs ArrayList

## Introduction

**LinkedList** and **ArrayList** are the two most commonly used implementations of the **List** interface in the Java Collections Framework. Although both maintain insertion order, allow duplicate elements, and support dynamic resizing, they differ significantly in their internal implementation and performance.

Choosing the right collection depends on the application's requirements, such as fast retrieval, frequent insertion, memory usage, and traversal.

Understanding the differences between LinkedList and ArrayList is one of the most frequently asked topics in Java technical interviews.

---

# Overview

## ArrayList

- Implements the List interface.
- Internally uses a **dynamic array**.
- Provides fast random access.
- Best suited for read-intensive applications.

---

## LinkedList

- Implements both **List** and **Deque** interfaces.
- Internally uses a **doubly linked list**.
- Provides efficient insertion and deletion.
- Best suited for applications with frequent modifications.

---

# Comparison Table

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| Internal Data Structure | Dynamic Array | Doubly Linked List |
| Memory Storage | Contiguous | Non-Contiguous Nodes |
| Random Access | Fast | Slow |
| Insertion at Beginning | Slow | Fast |
| Insertion in Middle | Slow | Fast |
| Insertion at End | Fast | Fast |
| Deletion at Beginning | Slow | Fast |
| Deletion in Middle | Slow | Fast |
| Deletion at End | Fast | Fast |
| Searching | Sequential | Sequential |
| Memory Usage | Less | More |
| Cache Performance | Better | Lower |
| Traversal | Forward | Forward and Backward |
| Implements | List | List, Deque |
| Thread Safe | No | No |
| Duplicate Elements | Allowed | Allowed |
| Null Values | Allowed | Allowed |
| Dynamic Size | Yes | Yes |

---

# Internal Working

## ArrayList

Stores elements inside a dynamically growing array.

```text
+------+------+------+------+
| Java | HTML | CSS | SQL  |
+------+------+------+------+
```

Elements are stored in contiguous memory locations.

---

## LinkedList

Stores elements as interconnected nodes.

```text
NULL
  │
  ▼
+------+------+------+     +------+------+------+     +------+------+------+
| Prev | Java | Next | --> | Prev | HTML | Next | --> | Prev | CSS  | Next |
+------+------+------+     +------+------+------+     +------+------+------+
```

Each node stores references to the previous and next nodes.

---

# Performance Comparison

| Operation | ArrayList | LinkedList |
|-----------|-----------|------------|
| get(index) | O(1) | O(n) |
| add(element) | O(1) (Amortized) | O(1) |
| add(index, element) | O(n) | O(n) |
| remove(index) | O(n) | O(n) |
| Search | O(n) | O(n) |

---

# Advantages of ArrayList

- Fast random access.
- Less memory consumption.
- Better cache performance.
- Simple internal implementation.
- Suitable for read-heavy applications.

---

# Advantages of LinkedList

- Fast insertion.
- Fast deletion.
- No element shifting.
- Efficient node manipulation.
- Supports Deque operations.

---

# Disadvantages of ArrayList

- Slow insertion in the middle.
- Slow deletion in the middle.
- Elements must be shifted.
- Resizing may require copying elements.

---

# Disadvantages of LinkedList

- Slow random access.
- Higher memory usage.
- Sequential traversal.
- Lower cache efficiency.

---

# When to Use ArrayList

Choose ArrayList when:

- Frequent reading of elements.
- Random access is required.
- Insertions and deletions are less frequent.
- Memory efficiency is important.

---

# When to Use LinkedList

Choose LinkedList when:

- Frequent insertion is required.
- Frequent deletion is required.
- Queue or Deque operations are needed.
- Data changes continuously.

---

# Real-World Examples

| Application | Recommended Collection |
|-------------|------------------------|
| Student Records | ArrayList |
| Product Catalog | ArrayList |
| Browser History | LinkedList |
| Music Playlist | LinkedList |
| Undo/Redo Feature | LinkedList |
| Queue Processing | LinkedList |
| Employee Directory | ArrayList |
| Navigation System | LinkedList |

---

# Frequently Asked Interview Questions

### 1. Which is faster for random access?

**Answer:** ArrayList.

---

### 2. Which is faster for insertion?

**Answer:** LinkedList.

---

### 3. Which is faster for deletion?

**Answer:** LinkedList.

---

### 4. Which consumes more memory?

**Answer:** LinkedList.

---

### 5. Which internally uses a dynamic array?

**Answer:** ArrayList.

---

### 6. Which internally uses a doubly linked list?

**Answer:** LinkedList.

---

### 7. Which supports the Deque interface?

**Answer:** LinkedList.

---

### 8. Which is preferred for read-intensive applications?

**Answer:** ArrayList.

---

### 9. Which is preferred for frequently changing data?

**Answer:** LinkedList.

---

### 10. Do both allow duplicate and null values?

**Answer:** Yes.

---

# Key Points

- ArrayList uses a dynamic array.
- LinkedList uses a doubly linked list.
- ArrayList provides faster random access.
- LinkedList provides faster insertion and deletion.
- ArrayList consumes less memory.
- LinkedList supports both List and Deque interfaces.
- Both maintain insertion order.
- Both allow duplicate and null values.

---

# Summary

ArrayList and LinkedList are two important implementations of the List interface, each designed for different use cases. ArrayList is ideal for applications that require fast random access and frequent read operations, while LinkedList is better suited for applications involving frequent insertion and deletion of elements. Understanding their internal implementation, performance characteristics, advantages, limitations, and real-world applications enables developers to choose the most appropriate collection and prepares them for Java technical interviews.
