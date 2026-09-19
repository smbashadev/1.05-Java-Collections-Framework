# Introduction to TreeSet

## Introduction

**TreeSet** is one of the most important implementations of the **Set** interface in the Java Collections Framework. It stores **unique elements** and automatically arranges them in **ascending (sorted) order** by default.

TreeSet internally uses a **Red-Black Tree**, which is a self-balancing binary search tree. Because of this, TreeSet is an excellent choice when sorted data is required.

---

# Definition

**TreeSet** is a class that implements the **NavigableSet** interface and stores only unique elements in sorted order.

---

# Package

```java
import java.util.TreeSet;
```

---

# Class Declaration

```java
public class TreeSet<E>
```

---

# Hierarchy

```text
Iterable
    │
Collection
    │
Set
    │
SortedSet
    │
NavigableSet
    │
TreeSet
```

---

# Why Use TreeSet?

TreeSet is used because it:

- Stores only unique elements
- Automatically sorts elements
- Provides navigational methods
- Supports efficient searching
- Dynamically grows as elements are added
- Is suitable for sorted data

---

# Key Characteristics

- Implements the NavigableSet interface
- Stores only unique elements
- Duplicate elements are not allowed
- Maintains ascending sorted order by default
- Does not maintain insertion order
- Does not allow null values
- Uses a Red-Black Tree internally
- Not synchronized
- Not thread-safe
- Dynamic in size

---

# Internal Working

TreeSet internally uses a **Red-Black Tree**.

When an element is added:

1. The element is compared with existing elements.
2. The correct position is identified.
3. Duplicate elements are rejected.
4. The Red-Black Tree is automatically balanced.
5. Elements remain sorted.

---

# Syntax

```java
TreeSet set = new TreeSet();
```

---

# Example

```java
import java.util.TreeSet;

public class Example {

    public static void main(String[] args) {

        TreeSet set = new TreeSet();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }

}
```

### Output

```text
[10, 20, 30]
```

The duplicate value **10** is ignored, and the remaining elements are automatically sorted.

---

# Real-World Applications

TreeSet is commonly used in:

- Student ranking systems
- Leaderboards
- Dictionary applications
- Contact lists
- Product catalogs
- Employee records
- Sorted report generation
- Search suggestion systems

---

# Advantages

- Stores unique elements
- Automatically sorts elements
- Fast searching
- Provides navigational methods
- Dynamic size

---

# Disadvantages

- Slower than HashSet for insertion and searching
- Does not maintain insertion order
- Does not allow null values
- Not synchronized
- Not thread-safe
- No index-based access

---

# Frequently Asked Interview Questions

### 1. What is TreeSet?

A TreeSet is a Set implementation that stores unique elements in sorted order.

---

### 2. Which interface does TreeSet implement?

NavigableSet.

---

### 3. Can TreeSet store duplicate elements?

No.

---

### 4. Does TreeSet maintain insertion order?

No.

---

### 5. Does TreeSet maintain sorted order?

Yes.

---

### 6. Which data structure is internally used by TreeSet?

Red-Black Tree.

---

# Key Takeaways

- TreeSet implements the NavigableSet interface.
- Stores only unique elements.
- Maintains ascending sorted order.
- Duplicate elements are automatically ignored.
- Internally uses a Red-Black Tree.
- Does not allow null values.
- Provides efficient navigational operations.

---

# Summary

TreeSet is one of the most powerful Set implementations in Java. It automatically stores unique elements in sorted order using a Red-Black Tree, making it ideal for applications that require ordered data. Because of its sorting capability and navigational features, TreeSet is a frequently asked topic in Java Collections Framework interviews.
