# Features of TreeSet

## Introduction

**TreeSet** is one of the most important implementations of the **Set** interface in the Java Collections Framework. It stores **unique elements** and automatically arranges them in **ascending (sorted) order**.

TreeSet internally uses a **Red-Black Tree**, making it suitable for applications where sorted data is required.

Understanding the features of TreeSet is essential for Java programming and technical interviews.

---

# Features of TreeSet

## 1. Stores Only Unique Elements

TreeSet does not allow duplicate elements.

If the same element is added multiple times, only the first occurrence is stored.

### Example

```java
TreeSet set = new TreeSet();

set.add(10);
set.add(20);
set.add(10);

System.out.println(set);
```

### Output

```text
[10, 20]
```

---

## 2. Maintains Sorted Order

TreeSet automatically stores elements in ascending order.

### Example

Inserted Order:

```text
50
10
40
20
```

Output:

```text
[10, 20, 40, 50]
```

---

## 3. Does Not Maintain Insertion Order

TreeSet ignores the insertion order.

Elements are always displayed in sorted order.

---

## 4. Does Not Allow Null Values

TreeSet does not allow null elements.

Adding a null value throws a **NullPointerException**.

### Example

```java
TreeSet set = new TreeSet();

set.add(null);
```

---

## 5. Uses Red-Black Tree Internally

TreeSet internally uses a self-balancing **Red-Black Tree**.

This keeps the elements sorted automatically.

---

## 6. Supports Navigational Methods

TreeSet provides methods such as:

- first()
- last()
- higher()
- lower()
- ceiling()
- floor()

These methods help navigate sorted elements efficiently.

---

## 7. Dynamic Size

TreeSet automatically grows as new elements are added.

No manual resizing is required.

---

## 8. Not Synchronized

TreeSet is not synchronized.

Multiple threads should not modify the same TreeSet simultaneously without external synchronization.

---

## 9. Not Thread-Safe

TreeSet is not safe for concurrent modifications.

External synchronization is required in multithreaded applications.

---

## 10. No Index-Based Access

TreeSet does not support index-based operations.

Example:

```java
set.get(0); // Invalid
```

---

## 11. Implements the NavigableSet Interface

TreeSet implements the **NavigableSet** interface.

It also supports the features of the **SortedSet** interface.

---

## 12. Stores Comparable Elements

Elements stored in a TreeSet should implement the **Comparable** interface, or a **Comparator** should be provided for custom sorting.

---

# Performance

Average time complexity for common operations:

| Operation | Time Complexity |
|-----------|-----------------|
| add() | O(log n) |
| remove() | O(log n) |
| contains() | O(log n) |

---

# Advantages

- Stores only unique elements
- Automatically sorts elements
- Supports navigational methods
- Dynamic size
- Suitable for sorted data
- Efficient searching

---

# Limitations

- Slower than HashSet
- Does not maintain insertion order
- Does not allow null values
- No index-based access
- Not synchronized
- Not thread-safe

---

# Frequently Asked Interview Questions

### 1. Does TreeSet allow duplicate elements?

**Answer:**

No.

---

### 2. Does TreeSet maintain insertion order?

**Answer:**

No.

---

### 3. Does TreeSet maintain sorted order?

**Answer:**

Yes.

---

### 4. Does TreeSet allow null values?

**Answer:**

No.

---

### 5. Which data structure is internally used by TreeSet?

**Answer:**

Red-Black Tree.

---

### 6. Is TreeSet synchronized?

**Answer:**

No.

---

### 7. Is TreeSet thread-safe?

**Answer:**

No.

---

### 8. Can TreeSet grow dynamically?

**Answer:**

Yes.

---

### 9. Does TreeSet support index-based access?

**Answer:**

No.

---

### 10. What is the average time complexity of add(), remove(), and contains()?

**Answer:**

O(log n)

---

# Key Takeaways

- TreeSet stores only unique elements.
- Duplicate values are automatically ignored.
- Maintains ascending sorted order.
- Does not maintain insertion order.
- Does not allow null values.
- Internally uses a Red-Black Tree.
- Provides O(log n) performance for add(), remove(), and contains().
- Supports powerful navigational methods.

---

# Summary

TreeSet is a sorted implementation of the Set interface that automatically arranges unique elements using a Red-Black Tree. Its navigational capabilities and automatic sorting make it ideal for applications that require ordered data, making it an essential topic for Java Collections Framework interview preparation.
