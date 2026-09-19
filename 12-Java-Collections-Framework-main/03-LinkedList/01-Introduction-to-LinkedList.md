# Introduction to LinkedList

## Introduction

**LinkedList** is one of the most important implementation classes in the **Java Collections Framework**. It implements the **List** interface and stores elements in the form of a **doubly linked list**.

Unlike ArrayList, which internally uses a dynamic array, LinkedList stores elements as interconnected nodes. Each node contains the actual data along with references to both the previous and next nodes.

LinkedList is best suited for applications where elements are frequently inserted or removed because these operations are performed efficiently without shifting existing elements.

Understanding LinkedList is essential for Java developers because it is widely used in real-world applications and is one of the most frequently asked interview topics.

---

# What is LinkedList?

A **LinkedList** is a linear data structure in which elements are stored as **nodes** connected using links (references).

Each node contains:

- Previous node reference
- Data
- Next node reference

Unlike arrays, LinkedList does not store elements in contiguous memory locations.

---

# Definition

**LinkedList** is a class available in the **java.util** package that implements the **List** and **Deque** interfaces and internally stores elements using a **doubly linked list**.

---

# Package

```java
java.util
```

---

# Syntax

```java
LinkedList list = new LinkedList();
```

---

# Internal Structure

Each node in a LinkedList contains three parts.

```text
+----------+-----------+----------+
| Previous |   Data    |   Next   |
+----------+-----------+----------+
```

Example:

```text
NULL
  │
  ▼
+------+------+------+     +------+------+------+     +------+------+------+
| Prev | Java | Next | --> | Prev | HTML | Next | --> | Prev | CSS  | Next |
+------+------+------+     +------+------+------+     +------+------+------+
                                                              │
                                                             NULL
```

---

# Characteristics of LinkedList

- Implements the List interface.
- Implements the Deque interface.
- Internally uses a doubly linked list.
- Maintains insertion order.
- Allows duplicate elements.
- Allows multiple null values.
- Dynamic in size.
- Not synchronized.
- Efficient for insertion and deletion operations.
- Supports bidirectional traversal.

---

# Why Do We Need LinkedList?

Although ArrayList is useful, it has limitations.

Whenever an element is inserted or removed from the beginning or middle of an ArrayList, existing elements must be shifted.

LinkedList solves this problem because elements are connected through nodes rather than stored in contiguous memory.

This makes insertion and deletion operations more efficient.

---

# How LinkedList Works

The working of LinkedList can be summarized as follows:

1. A node is created.
2. The node stores data.
3. The node stores references to the previous and next nodes.
4. Nodes are connected together.
5. Elements can be inserted or removed by updating the links.

---

# Real-World Applications

LinkedList is commonly used in:

- Music playlist applications
- Browser history
- Undo and Redo functionality
- Task scheduling systems
- Navigation systems
- Queue implementation
- Stack implementation
- Job processing systems

---

# Advantages of LinkedList

- Dynamic size
- Fast insertion
- Fast deletion
- No shifting of elements
- Efficient memory allocation for dynamic data
- Supports bidirectional traversal

---

# Limitations of LinkedList

- Slower random access
- Higher memory usage due to node references
- Sequential traversal is required
- Retrieval is slower than ArrayList

---

# LinkedList vs ArrayList (Quick Overview)

| Feature | LinkedList | ArrayList |
|---------|------------|-----------|
| Internal Data Structure | Doubly Linked List | Dynamic Array |
| Random Access | Slow | Fast |
| Insertion | Fast | Slow |
| Deletion | Fast | Slow |
| Memory Usage | More | Less |
| Best For | Frequent Insert/Delete | Frequent Read Operations |

---

# Interview Questions

### 1. What is LinkedList?

A LinkedList is a class in the Java Collections Framework that stores elements using a doubly linked list.

---

### 2. Which package contains LinkedList?

```java
java.util
```

---

### 3. Which interfaces does LinkedList implement?

- List
- Deque

---

### 4. Which data structure is used internally by LinkedList?

A doubly linked list.

---

### 5. Does LinkedList maintain insertion order?

Yes.

---

### 6. Does LinkedList allow duplicate elements?

Yes.

---

### 7. Does LinkedList allow null values?

Yes.

---

### 8. Is LinkedList synchronized?

No.

---

### 9. Is LinkedList dynamic?

Yes.

---

### 10. When should LinkedList be used?

When applications require frequent insertion and deletion of elements.

---

# Key Points

- LinkedList is an implementation of the List interface.
- It internally uses a doubly linked list.
- It maintains insertion order.
- Duplicate and null values are allowed.
- It is dynamic in size.
- Insertion and deletion are efficient.
- Random access is slower than ArrayList.
- It is widely used in enterprise Java applications.

---

# Summary

LinkedList is a dynamic implementation of the List interface that internally uses a doubly linked list to store elements. It provides efficient insertion and deletion operations by connecting elements through nodes instead of storing them in contiguous memory locations. Although random access is slower compared to ArrayList, LinkedList is an excellent choice for applications involving frequent structural modifications, making it an essential topic for Java programming and technical interviews.
