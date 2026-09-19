# Introduction to HashSet

## Introduction

**HashSet** is one of the most commonly used classes in the Java Collections Framework. It is used to store a collection of **unique elements**, meaning duplicate values are not allowed.

HashSet internally uses a **HashMap** to store data and provides fast insertion, deletion, and searching operations.

It is the preferred choice when uniqueness is more important than maintaining insertion order.

---

# Definition

**HashSet** is a class that implements the **Set** interface and stores only unique elements. It does not maintain insertion order and internally uses a hashing mechanism for efficient data storage and retrieval.

---

# Package

```java
import java.util.HashSet;
```

---

# Class Declaration

```java
public class HashSet<E>
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
HashSet
```

---

# Why Use HashSet?

HashSet is used because it:

- Stores only unique elements
- Automatically removes duplicate values
- Provides fast insertion and deletion
- Offers efficient searching
- Allows a single null value
- Dynamically grows as elements are added

---

# Key Characteristics

- Implements the Set interface
- Stores only unique elements
- Duplicate elements are not allowed
- Does not maintain insertion order
- Does not maintain sorted order
- Allows one null value
- Not synchronized
- Not thread-safe
- Uses hashing internally
- Dynamic in size

---

# Internal Working

HashSet internally stores elements using a **HashMap**.

When an element is added:

1. The hash code of the element is calculated.
2. The hash code determines the bucket.
3. If no duplicate exists, the element is stored.
4. If the element already exists, it is ignored.

---

# Syntax

```java
HashSet set = new HashSet();
```

---

# Example

```java
import java.util.HashSet;

public class Example {

    public static void main(String[] args) {

        HashSet set = new HashSet();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);
    }

}
```

### Output

```text
[10, 20, 30]
```

The duplicate value **20** is automatically ignored.

---

# Real-World Applications

HashSet is commonly used in:

- Removing duplicate values
- User ID management
- Email address validation
- Student registration systems
- Product code management
- Unique transaction IDs
- Search history management
- Data filtering

---

# Advantages

- Fast insertion
- Fast deletion
- Fast searching
- Automatically removes duplicates
- Allows one null value
- Dynamic size

---

# Disadvantages

- Does not preserve insertion order
- Does not sort elements
- Not thread-safe
- Index-based access is not available

---

# Frequently Asked Interview Questions

### 1. What is HashSet?

A HashSet is a class that stores unique elements.

---

### 2. Which interface does HashSet implement?

Set.

---

### 3. Can HashSet store duplicate elements?

No.

---

### 4. Does HashSet maintain insertion order?

No.

---

### 5. Does HashSet allow null values?

Yes, only one null value.

---

### 6. Which class is internally used by HashSet?

HashMap.

---

# Key Takeaways

- HashSet implements the Set interface.
- Duplicate elements are not allowed.
- Insertion order is not maintained.
- HashMap is used internally.
- One null value is allowed.
- Provides fast insertion, deletion, and searching.

---

# Summary

HashSet is one of the most important Set implementations in Java. It is designed to store unique elements efficiently using hashing. Because of its high performance and automatic duplicate removal, HashSet is widely used in Java applications and is a frequently asked topic in Java Collections Framework interviews.
