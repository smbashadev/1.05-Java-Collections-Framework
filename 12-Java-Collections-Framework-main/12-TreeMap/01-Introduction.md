# Introduction to TreeMap in Java

## Introduction

**TreeMap** is a class in the Java Collections Framework that stores data in the form of **key-value pairs**. It automatically stores the entries in **sorted order based on the keys**.

Unlike **HashMap**, which does not maintain any order, and **LinkedHashMap**, which maintains insertion order, **TreeMap maintains natural ascending order of keys** by default.

TreeMap internally uses a **Red-Black Tree**, which is a self-balancing binary search tree. Because of this, searching, insertion, and deletion operations are performed efficiently while keeping the keys sorted.

TreeMap is widely used when sorted data and fast searching are both required.

---

# Definition

A **TreeMap** is a class that implements the **NavigableMap** interface and stores data as key-value pairs in **sorted order of keys**.

---

# Package

```java
import java.util.TreeMap;
```

---

# Syntax

```java
TreeMap map = new TreeMap();
```

---

# Why Use TreeMap?

TreeMap is used because it provides:

- Automatic key sorting
- Fast searching
- Fast insertion
- Fast deletion
- Navigational methods
- Dynamic size

---

# Key Features

- Stores data as key-value pairs.
- Implements the NavigableMap interface.
- Maintains keys in ascending order.
- Uses a Red-Black Tree internally.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Does not allow null keys.
- Allows multiple null values.
- Not synchronized.
- Automatically resizes as data grows.

---

# Internal Working

TreeMap internally uses a **Red-Black Tree**.

Whenever a new entry is inserted:

1. The key is compared with existing keys.
2. The correct position is identified.
3. The entry is inserted.
4. The tree automatically balances itself.
5. Keys remain sorted in ascending order.

---

# Basic Example

```java
TreeMap map = new TreeMap();

map.put(103, "David");
map.put(101, "Rahul");
map.put(104, "Priya");
map.put(102, "Anjali");
```

Stored entries:

```text
101 → Rahul
102 → Anjali
103 → David
104 → Priya
```

Notice that the keys are automatically sorted.

---

# Advantages

- Automatically sorts keys.
- Fast searching.
- Fast insertion.
- Fast deletion.
- Provides navigational methods.
- Suitable for sorted data.

---

# Limitations

- Slower than HashMap for basic operations.
- Does not allow null keys.
- Not synchronized.
- Uses more memory than HashMap.

---

# Real-World Applications

TreeMap is commonly used in:

- Student ranking systems
- Banking applications
- Employee records
- Dictionary applications
- Phone directories
- Report generation
- Leaderboards
- Data analysis systems

---

# Time Complexity

| Operation | Average Time |
|-----------|--------------|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |
| containsKey() | O(log n) |

---

# Frequently Asked Interview Questions

### 1. What is TreeMap?

**Answer:**

TreeMap is a class that stores key-value pairs in sorted order based on keys.

---

### 2. Which interface does TreeMap implement?

**Answer:**

```text
NavigableMap
```

---

### 3. Does TreeMap maintain insertion order?

**Answer:**

No.

It maintains **sorted order of keys**.

---

### 4. Does TreeMap allow duplicate keys?

**Answer:**

No.

Duplicate keys are replaced with the new value.

---

### 5. Does TreeMap allow duplicate values?

**Answer:**

Yes.

---

### 6. Does TreeMap allow null keys?

**Answer:**

No.

A null key causes a `NullPointerException`.

---

### 7. Which data structure is used internally?

**Answer:**

Red-Black Tree.

---

# Key Takeaways

- TreeMap stores data as key-value pairs.
- Keys are automatically sorted.
- Implements the NavigableMap interface.
- Uses a Red-Black Tree internally.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Null keys are not allowed.
- Frequently asked in Java interviews.

---

# Summary

TreeMap is one of the most important implementations of the Map interface for storing sorted key-value pairs. By using a Red-Black Tree internally, it provides efficient searching, insertion, deletion, and automatic key sorting. Understanding TreeMap is essential for Java development and technical interview preparation.
