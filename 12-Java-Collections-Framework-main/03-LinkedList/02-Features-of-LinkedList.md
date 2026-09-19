# Features of LinkedList

## Introduction

**LinkedList** is one of the most widely used classes in the **Java Collections Framework**. It provides several powerful features that make it suitable for applications requiring frequent insertion and deletion of elements.

Unlike ArrayList, which internally uses a dynamic array, LinkedList stores elements as interconnected nodes. This design allows efficient modifications while maintaining flexibility and dynamic memory allocation.

Understanding the features of LinkedList helps developers choose the appropriate Collection implementation based on application requirements.

---

# Major Features of LinkedList

The LinkedList class provides the following important features:

- Dynamic Size
- Doubly Linked List Implementation
- Maintains Insertion Order
- Allows Duplicate Elements
- Allows Multiple Null Values
- Efficient Insertion
- Efficient Deletion
- Bidirectional Traversal
- Implements List Interface
- Implements Deque Interface
- Not Synchronized
- Rich Collection Methods

---

# 1. Dynamic Size

LinkedList grows and shrinks automatically.

Developers do not need to specify the size during object creation.

Example:

```java
LinkedList list = new LinkedList();
```

The list expands automatically whenever new elements are added.

---

# 2. Doubly Linked List Implementation

LinkedList internally uses a **doubly linked list**.

Each node stores:

- Previous node reference
- Data
- Next node reference

Example:

```text
NULL
  │
  ▼
+------+------+------+     +------+------+------+
| Prev | Java | Next | --> | Prev | HTML | Next |
+------+------+------+     +------+------+------+
```

This structure enables efficient insertion and deletion.

---

# 3. Maintains Insertion Order

LinkedList preserves the order in which elements are inserted.

Example:

```text
Java
HTML
CSS
JavaScript
```

The same order is maintained during traversal.

---

# 4. Allows Duplicate Elements

Duplicate values are allowed.

Example:

```text
Java
HTML
Java
CSS
Java
```

This is useful when repeated data is valid.

---

# 5. Allows Multiple Null Values

LinkedList allows storing multiple **null** values.

Example:

```text
Java
null
HTML
null
CSS
```

---

# 6. Efficient Insertion

New elements can be inserted efficiently without shifting existing elements.

This makes LinkedList suitable for applications with frequent insert operations.

---

# 7. Efficient Deletion

Elements can be removed efficiently by updating node references.

Existing elements do not need to be shifted.

---

# 8. Bidirectional Traversal

Since LinkedList is implemented as a doubly linked list, it supports traversal in both directions.

Developers can move:

- Forward
- Backward

This feature is useful in navigation-based applications.

---

# 9. Implements List Interface

LinkedList implements the **List** interface.

Therefore, it supports:

- Ordered elements
- Index-based operations
- Duplicate elements

---

# 10. Implements Deque Interface

LinkedList also implements the **Deque** interface.

This allows it to function as:

- Queue
- Double-ended Queue (Deque)
- Stack

---

# 11. Not Synchronized

LinkedList is not synchronized.

Multiple threads modifying the same LinkedList require external synchronization.

---

# 12. Rich Collection Methods

LinkedList provides many useful methods.

Examples include:

- add()
- remove()
- get()
- set()
- addFirst()
- addLast()
- removeFirst()
- removeLast()
- getFirst()
- getLast()
- contains()
- size()
- clear()

These methods simplify application development.

---

# Real-World Applications

LinkedList is commonly used in:

- Browser history
- Music playlists
- Undo and Redo operations
- Navigation systems
- Task scheduling
- Queue implementation
- Stack implementation
- Job processing systems

---

# Advantages of LinkedList Features

- Dynamic memory allocation
- Fast insertion
- Fast deletion
- Maintains insertion order
- Supports bidirectional traversal
- Rich API
- Flexible data storage

---

# Frequently Asked Interview Questions

### 1. Which data structure is used internally by LinkedList?

A doubly linked list.

---

### 2. Does LinkedList maintain insertion order?

Yes.

---

### 3. Does LinkedList allow duplicate elements?

Yes.

---

### 4. Does LinkedList allow null values?

Yes.

---

### 5. Is LinkedList synchronized?

No.

---

### 6. Which interfaces are implemented by LinkedList?

- List
- Deque

---

### 7. Why is insertion faster in LinkedList?

Because elements are connected using node references, and existing elements do not need to be shifted.

---

### 8. Why is deletion faster in LinkedList?

Because deleting a node only requires updating the surrounding node references.

---

# Key Points

- LinkedList uses a doubly linked list internally.
- It grows dynamically.
- It maintains insertion order.
- Duplicate and null values are allowed.
- Insertion and deletion are efficient.
- It supports forward and backward traversal.
- It implements both List and Deque interfaces.
- It provides a rich collection of predefined methods.

---

# Summary

LinkedList offers several powerful features that make it suitable for applications involving frequent insertion and deletion of elements. Its doubly linked list implementation, dynamic size, bidirectional traversal, insertion-order preservation, and rich API provide flexibility and efficiency for many real-world applications. Understanding these features helps developers choose the appropriate Collection implementation and prepares them for Java technical interviews.
