# Introduction to HashMap in Java

## Introduction

**HashMap** is one of the most widely used classes in the Java Collections Framework. It belongs to the **java.util** package and is used to store data in the form of **key-value pairs**.

Each key in a HashMap must be unique, while multiple keys can store the same value. HashMap provides very fast insertion, searching, updating, and deletion of data by using the **hashing** mechanism internally.

It is one of the most frequently used collections in Java applications and one of the most important interview topics for Java developers.

---

# Definition

A **HashMap** is a class that implements the **Map** interface and stores data as **key-value pairs**.

Each key maps to exactly one value.

---

# Package

```java
import java.util.HashMap;
```

---

# Syntax

```java
HashMap map = new HashMap();
```

---

# Why Use HashMap?

HashMap is used because it provides:

- Fast insertion
- Fast searching
- Fast updating
- Fast deletion
- Efficient key-value storage
- Dynamic size

---

# Key Features

- Stores data as key-value pairs.
- Implements the Map interface.
- Uses hashing internally.
- Does not maintain insertion order.
- Allows one null key.
- Allows multiple null values.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Not synchronized.
- Dynamic in size.

---

# Internal Working

HashMap internally uses:

- Hash Table
- Buckets
- hashCode()
- equals()
- Load Factor
- Rehashing

When a key is inserted:

1. Java calculates the key's `hashCode()`.
2. The bucket index is determined.
3. The key-value pair is stored in that bucket.
4. If a collision occurs, Java resolves it internally.

---

# Basic Example

```java
HashMap map = new HashMap();

map.put(101, "Rahul");
map.put(102, "Anjali");
map.put(103, "David");
```

The map stores:

```text
101 → Rahul
102 → Anjali
103 → David
```

---

# Advantages

- Fast access to data
- Efficient searching
- Dynamic resizing
- Stores key-value pairs
- Allows null values
- Widely used in Java applications

---

# Limitations

- Does not maintain insertion order.
- Duplicate keys are not allowed.
- Not thread-safe.
- Performance may decrease because of excessive collisions.

---

# Common Applications

HashMap is widely used in:

- Student management systems
- Employee management systems
- Banking applications
- Inventory systems
- E-commerce platforms
- Login systems
- Configuration settings
- Caching

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

### 1. What is HashMap?

**Answer:**

HashMap is a class that stores data as key-value pairs using hashing.

---

### 2. Which interface does HashMap implement?

**Answer:**

```text
Map
```

---

### 3. Does HashMap allow duplicate keys?

**Answer:**

No.

Duplicate keys are not allowed.

---

### 4. Does HashMap allow duplicate values?

**Answer:**

Yes.

Multiple keys can store the same value.

---

### 5. Does HashMap maintain insertion order?

**Answer:**

No.

HashMap does not guarantee insertion order.

---

### 6. Does HashMap allow null values?

**Answer:**

Yes.

It allows one null key and multiple null values.

---

### 7. Why is HashMap fast?

**Answer:**

Because it uses hashing to locate data efficiently.

---

# Key Takeaways

- HashMap stores data as key-value pairs.
- It implements the Map interface.
- Uses hashing internally.
- Allows one null key.
- Allows multiple null values.
- Duplicate keys are not allowed.
- One of the most frequently asked Java interview topics.

---

# Summary

HashMap is one of the most important classes in the Java Collections Framework. It stores data in key-value pairs and uses hashing to provide fast insertion, searching, updating, and deletion operations. Its simplicity, efficiency, and wide range of real-world applications make it an essential collection for every Java developer and a must-know topic for technical interviews.
