# Internal Working of LinkedList

## Introduction

Understanding the internal working of **LinkedList** is essential for writing efficient Java programs. Unlike ArrayList, which stores elements in a continuous memory block, LinkedList stores elements as individual nodes connected using references.

This unique structure makes insertion and deletion operations efficient while making random access comparatively slower.

---

# What is the Internal Working of LinkedList?

A LinkedList stores elements in the form of **nodes**.

Each node contains:

- Reference to the previous node
- Actual data
- Reference to the next node

The nodes are connected together to form a chain.

---

# Structure of a Node

Each node consists of three parts.

```text
+----------+-----------+----------+
| Previous |   Data    |   Next   |
+----------+-----------+----------+
```

Where:

- **Previous** → Points to the previous node.
- **Data** → Stores the actual element.
- **Next** → Points to the next node.

---

# Example Representation

Suppose the LinkedList contains:

```text
Java
HTML
CSS
JavaScript
```

Internally it is represented as:

```text
NULL
  │
  ▼
+------+------+------+     +------+------+------+     +------+------+------+     +------+------+------+
| Prev | Java | Next | --> | Prev | HTML | Next | --> | Prev | CSS  | Next | --> | Prev | JavaScript |
+------+------+------+     +------+------+------+     +------+------+------+     +------+------+------+
     ▲                                                                   │
     └-------------------------------------------------------------------┘
                                                              Next → NULL
```

---

# Important References

LinkedList internally maintains two important references.

## Head (First Node)

Points to the first node.

```text
Head
 │
 ▼
Java
```

---

## Tail (Last Node)

Points to the last node.

```text
JavaScript
     ▲
     │
   Tail
```

These references help perform insertion and deletion efficiently at both ends.

---

# How Insertion Works

Suppose the LinkedList contains:

```text
Java → HTML → CSS
```

Now insert:

```text
Python
```

After insertion:

```text
Java → HTML → CSS → Python
```

Only the node references are updated.

Existing elements are **not shifted**.

---

# How Deletion Works

Suppose:

```text
Java → HTML → CSS → Python
```

Delete:

```text
HTML
```

After deletion:

```text
Java → CSS → Python
```

The references of the surrounding nodes are updated.

The remaining elements are not moved.

---

# How Searching Works

To find an element:

1. Start from the first node.
2. Compare each node.
3. Move to the next node.
4. Continue until the element is found or the list ends.

Example:

Searching for:

```text
CSS
```

Traversal:

```text
Java → HTML → CSS
```

---

# How Access by Index Works

Suppose:

```text
Index : 0   1    2     3

Data  : Java HTML CSS JavaScript
```

To retrieve index **2**:

```text
Head
 ↓
Java → HTML → CSS
```

The LinkedList must traverse node by node until the required index is reached.

Unlike ArrayList, direct memory access is not possible.

---

# Memory Allocation

Unlike arrays:

- Memory is not allocated in one continuous block.
- Each node is created independently.
- Nodes are connected using references.

This provides dynamic memory utilization.

---

# Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Add at Beginning | O(1) |
| Add at End | O(1) |
| Add in Middle | O(n) |
| Remove at Beginning | O(1) |
| Remove at End | O(1) |
| Remove in Middle | O(n) |
| Search | O(n) |
| Get by Index | O(n) |

---

# Advantages of Internal Structure

- Dynamic memory allocation
- No shifting of elements
- Fast insertion
- Fast deletion
- Efficient manipulation of nodes
- Suitable for frequently changing data

---

# Limitations

- Additional memory required for node references
- Random access is slow
- Sequential traversal is necessary
- More memory consumption than ArrayList

---

# Real-World Applications

The internal structure of LinkedList is useful in:

- Browser history
- Music playlists
- Undo and Redo operations
- Queue implementation
- Stack implementation
- Navigation systems
- Task scheduling
- Job processing systems

---

# Frequently Asked Interview Questions

### 1. Which data structure is used internally by LinkedList?

A doubly linked list.

---

### 2. What does each node contain?

- Previous reference
- Data
- Next reference

---

### 3. Why is insertion faster in LinkedList?

Because nodes are connected through references, and existing elements do not need to be shifted.

---

### 4. Why is random access slower in LinkedList?

Because nodes must be traversed sequentially from the beginning or end.

---

### 5. Does LinkedList store elements in contiguous memory?

No.

---

### 6. Which references are maintained internally?

- Head
- Tail

---

### 7. What is the time complexity of searching?

**O(n)**

---

### 8. Which operation is faster in LinkedList than ArrayList?

Insertion and deletion.

---

# Key Points

- LinkedList internally uses a doubly linked list.
- Every node stores previous reference, data, and next reference.
- Head and tail references improve operations at both ends.
- Memory is allocated dynamically.
- Insertion and deletion require updating references instead of shifting elements.
- Random access is slower than ArrayList.
- Understanding internal working is essential for Java interviews.

---

# Summary

LinkedList internally stores elements as interconnected nodes using a doubly linked list structure. Each node contains references to both the previous and next nodes along with the actual data. This design enables efficient insertion and deletion operations without shifting elements, although random access requires sequential traversal. A clear understanding of its internal working helps developers choose the appropriate collection for different use cases and is an important topic in Java technical interviews.
