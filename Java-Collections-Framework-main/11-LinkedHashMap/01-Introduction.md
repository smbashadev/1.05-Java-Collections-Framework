# Introduction to LinkedHashMap in Java

## Introduction

**LinkedHashMap** is a class in the Java Collections Framework that stores data in the form of **key-value pairs**. It is a combination of a **HashMap** and a **Linked List**, providing both fast data access and predictable iteration order.

Unlike HashMap, LinkedHashMap **maintains the insertion order** of elements. It internally uses a **hash table** for fast lookup and a **doubly linked list** to preserve the order in which entries are inserted.

LinkedHashMap is widely used in Java applications whenever both **efficient performance** and **ordered iteration** are required.

---

# Definition

A **LinkedHashMap** is a class that implements the **Map** interface and stores data as **key-value pairs** while maintaining the insertion order of entries.

---

# Package

```java
import java.util.LinkedHashMap;
```

---

# Syntax

```java
LinkedHashMap map = new LinkedHashMap();
```

---

# Why Use LinkedHashMap?

LinkedHashMap is used because it provides:

- Fast insertion
- Fast searching
- Fast deletion
- Predictable insertion order
- Efficient key-value storage
- Dynamic size

---

# Key Features

- Stores data as key-value pairs.
- Implements the Map interface.
- Maintains insertion order.
- Uses hashing internally.
- Uses a doubly linked list to preserve order.
- Allows one null key.
- Allows multiple null values.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Not synchronized.
- Automatically resizes when required.

---

# Internal Working

LinkedHashMap internally uses:

- Hash Table
- Buckets
- hashCode()
- equals()
- Doubly Linked List
- Load Factor
- Rehashing

Whenever an entry is inserted:

1. Java calculates the key's `hashCode()`.
2. The appropriate bucket is determined.
3. The key-value pair is stored.
4. A doubly linked list maintains the insertion order.
5. Existing entries remain linked in the order they were added.

---

# Basic Example

```java
LinkedHashMap map = new LinkedHashMap();

map.put(101, "Rahul");
map.put(102, "Anjali");
map.put(103, "David");
```

Stored entries:

```text
101 → Rahul
102 → Anjali
103 → David
```

The insertion order is preserved.

---

# Advantages

- Maintains insertion order
- Fast searching
- Fast insertion
- Fast deletion
- Allows null values
- Easy to iterate
- Suitable for ordered key-value storage

---

# Limitations

- Slightly slower than HashMap because of maintaining the linked list.
- Duplicate keys are not allowed.
- Not synchronized.
- Uses slightly more memory than HashMap.

---

# Real-World Applications

LinkedHashMap is commonly used in:

- Student management systems
- Employee databases
- Banking applications
- Configuration management
- Report generation
- Inventory management
- Shopping cart applications
- Caching mechanisms

---

# Time Complexity

| Operation | Average Time | Worst Time |
|-----------|--------------|------------|
| put() | O(1) | O(n) |
| get() | O(1) | O(n) |
| remove() | O(1) | O(n) |
| containsKey() | O(1) | O(n) |

---

# Frequently Asked Interview Questions

### 1. What is LinkedHashMap?

**Answer:**

LinkedHashMap is a class that stores data as key-value pairs while maintaining insertion order.

---

### 2. Which interface does LinkedHashMap implement?

**Answer:**

```text
Map
```

---

### 3. Does LinkedHashMap maintain insertion order?

**Answer:**

Yes.

LinkedHashMap preserves the order in which entries are inserted.

---

### 4. Does LinkedHashMap allow duplicate keys?

**Answer:**

No.

Duplicate keys are not allowed.

---

### 5. Does LinkedHashMap allow duplicate values?

**Answer:**

Yes.

---

### 6. Does LinkedHashMap allow null keys and null values?

**Answer:**

Yes.

It allows one null key and multiple null values.

---

### 7. How is LinkedHashMap different from HashMap?

**Answer:**

LinkedHashMap maintains insertion order, whereas HashMap does not.

---

# Key Takeaways

- LinkedHashMap stores data as key-value pairs.
- Implements the Map interface.
- Maintains insertion order.
- Uses hashing and a doubly linked list internally.
- Allows one null key.
- Allows multiple null values.
- Duplicate keys are not allowed.
- Frequently asked in Java interviews.

---

# Summary

LinkedHashMap combines the fast performance of HashMap with the ability to maintain insertion order. By using both a hash table and a doubly linked list internally, it provides efficient key-value storage along with predictable iteration. Understanding LinkedHashMap is essential for Java developers and is a common topic in Java Collections Framework interviews.
