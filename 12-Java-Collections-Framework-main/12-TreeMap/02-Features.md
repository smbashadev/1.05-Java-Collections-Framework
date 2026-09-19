# Features of TreeMap in Java

## Introduction

**TreeMap** is one of the most important classes in the Java Collections Framework. It stores data as **key-value pairs** and automatically keeps the keys in **sorted order**.

Unlike **HashMap**, which does not maintain any order, and **LinkedHashMap**, which maintains insertion order, **TreeMap maintains keys in ascending order by default**.

TreeMap internally uses a **Red-Black Tree**, making it suitable for applications where sorted data is required.

---

# Major Features of TreeMap

## 1. Stores Data as Key-Value Pairs

TreeMap stores every element as a combination of a unique key and its corresponding value.

Example:

```text
101 → Rahul
102 → Anjali
103 → David
```

---

## 2. Implements the NavigableMap Interface

TreeMap implements the **NavigableMap** interface, which extends the **SortedMap** interface.

It provides methods for navigation, searching, and sorting.

---

## 3. Automatically Sorts Keys

TreeMap automatically stores keys in their natural ascending order.

Example:

```text
Inserted Order

104
101
103
102
```

Stored Order

```text
101
102
103
104
```

No manual sorting is required.

---

## 4. Uses a Red-Black Tree

TreeMap internally uses a **Red-Black Tree**, which is a self-balancing binary search tree.

This provides efficient insertion, searching, and deletion.

---

## 5. Duplicate Keys are Not Allowed

Each key must be unique.

Example:

```java
map.put(101, "Rahul");
map.put(101, "Anjali");
```

Result:

```text
101 → Anjali
```

The previous value is replaced.

---

## 6. Duplicate Values are Allowed

Different keys can have the same value.

Example:

```text
101 → Rahul
102 → Rahul
103 → Rahul
```

---

## 7. Null Keys are Not Allowed

TreeMap does not allow null keys.

Example:

```java
map.put(null, "Admin");
```

Result:

```text
NullPointerException
```

---

## 8. Null Values are Allowed

Multiple keys can contain null values.

Example:

```text
101 → null
102 → null
103 → null
```

---

## 9. Dynamic Size

TreeMap automatically grows as new entries are inserted.

No manual resizing is required.

---

## 10. Provides Navigational Methods

TreeMap provides several useful methods for navigation.

Examples:

- firstKey()
- lastKey()
- higherKey()
- lowerKey()
- ceilingKey()
- floorKey()

These methods make TreeMap very useful for sorted data.

---

## 11. Not Synchronized

TreeMap is not synchronized.

If multiple threads access it simultaneously, external synchronization is required.

---

# Advantages

- Automatically sorts keys
- Fast searching
- Fast insertion
- Fast deletion
- Provides navigational methods
- Suitable for sorted data

---

# Limitations

- Slower than HashMap for basic operations
- Does not allow null keys
- Not thread-safe
- Uses more memory than HashMap

---

# Real-World Applications

TreeMap is commonly used in:

- Student ranking systems
- Banking applications
- Employee databases
- Dictionary applications
- Phone directories
- Report generation
- Leaderboards
- Data analytics systems

---

# Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |
| containsKey() | O(log n) |

---

# Frequently Asked Interview Questions

### 1. Does TreeMap maintain insertion order?

**Answer:**

No.

It maintains sorted order of keys.

---

### 2. Which interface does TreeMap implement?

**Answer:**

```text
NavigableMap
```

---

### 3. Which data structure is used internally?

**Answer:**

Red-Black Tree.

---

### 4. Does TreeMap allow duplicate keys?

**Answer:**

No.

---

### 5. Does TreeMap allow duplicate values?

**Answer:**

Yes.

---

### 6. Does TreeMap allow null keys?

**Answer:**

No.

---

### 7. Does TreeMap allow null values?

**Answer:**

Yes.

---

### 8. What is the biggest advantage of TreeMap?

**Answer:**

It automatically stores keys in sorted order.

---

# Key Takeaways

- TreeMap stores key-value pairs.
- Automatically sorts keys.
- Uses a Red-Black Tree internally.
- Implements the NavigableMap interface.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Null keys are not allowed.
- Provides powerful navigational methods.
- Frequently asked in Java interviews.

---

# Summary

TreeMap is an excellent choice whenever automatically sorted key-value storage is required. Its Red-Black Tree implementation provides efficient searching, insertion, deletion, and navigation while keeping keys in ascending order. Understanding TreeMap features is essential for mastering the Java Collections Framework and preparing for Java technical interviews.
