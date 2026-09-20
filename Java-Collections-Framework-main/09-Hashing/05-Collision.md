# Collision in Hashing

## Introduction

A **Collision** is one of the most important concepts in Java Hashing. It occurs when **two or more different objects produce the same bucket index** in a hash table.

Collisions are common in hash-based collections because the number of possible objects is much larger than the number of available buckets.

Java provides efficient mechanisms to handle collisions, ensuring that collections like **HashMap**, **HashSet**, **LinkedHashMap**, and **LinkedHashSet** continue to perform efficiently.

---

# Definition

A **Collision** occurs when multiple different objects are assigned to the same bucket during the hashing process.

---

# Why Does Collision Occur?

A collision occurs because:

- The number of objects can be very large.
- The number of buckets is limited.
- Different objects may generate the same bucket index.
- Hash codes can map to the same bucket.

---

# Example of Collision

Suppose a hash table has **10 buckets**.

### Object A

```text
Hash Code = 25
Bucket Index = 25 % 10 = 5
```

---

### Object B

```text
Hash Code = 35
Bucket Index = 35 % 10 = 5
```

Both objects are stored in **Bucket 5**.

This situation is called a **Collision**.

---

# Collision Diagram

```text
Object A
Hash Code = 25
        │
        ▼
     Bucket 5
        ▲
        │
Hash Code = 35
Object B
```

---

# How Java Handles Collisions

When multiple objects belong to the same bucket:

1. Java stores all objects in that bucket.
2. During searching, Java calculates the bucket index.
3. Java compares objects using the `equals()` method.
4. The correct object is identified and returned.

---

# Relationship Between hashCode() and equals()

Both methods work together to resolve collisions.

### hashCode()

- Determines the bucket location.

### equals()

- Identifies the correct object inside the bucket.

---

# Example Scenario

Suppose the following objects are inserted:

```text
Student A
Hash Code = 105
```

```text
Student B
Hash Code = 205
```

If the bucket size is **10**:

```text
105 % 10 = 5
205 % 10 = 5
```

Both students are stored in Bucket 5.

When searching for **Student B**, Java:

1. Calculates the bucket index.
2. Goes to Bucket 5.
3. Uses `equals()` to find Student B.

---

# Effects of Collision

Collisions may:

- Increase searching time.
- Increase insertion time.
- Increase deletion time.
- Reduce overall collection performance.

---

# How to Reduce Collisions

Collisions can be minimized by:

- Writing a good `hashCode()` implementation.
- Using an appropriate initial capacity.
- Maintaining a proper load factor.
- Avoiding poor hash functions.

---

# Collections That Handle Collisions

The following Java collections handle collisions internally:

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet
- Hashtable

---

# Real-World Applications

Collision handling is important in:

- Banking systems
- Student databases
- Employee management
- Search engines
- Login systems
- Caching
- Inventory management

---

# Time Complexity

| Operation | Average Time | Worst Time |
|-----------|--------------|------------|
| Insert | O(1) | O(n) |
| Search | O(1) | O(n) |
| Delete | O(1) | O(n) |

Frequent collisions may increase the time complexity to **O(n)**.

---

# Frequently Asked Interview Questions

### 1. What is a collision?

**Answer:**

A collision occurs when two or more different objects are mapped to the same bucket.

---

### 2. Why do collisions occur?

**Answer:**

Because multiple hash codes may produce the same bucket index.

---

### 3. Which method determines the bucket location?

**Answer:**

```java
hashCode()
```

---

### 4. Which method identifies the correct object inside a bucket?

**Answer:**

```java
equals()
```

---

### 5. Can collisions be completely avoided?

**Answer:**

No.

Collisions can only be minimized, not completely eliminated.

---

### 6. Which Java collections handle collisions?

**Answer:**

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet
- Hashtable

---

### 7. How can collisions be reduced?

**Answer:**

By implementing a good `hashCode()`, maintaining a proper load factor, and choosing an appropriate initial capacity.

---

# Key Takeaways

- A collision occurs when multiple objects share the same bucket.
- Collisions are a normal part of hashing.
- `hashCode()` determines the bucket location.
- `equals()` identifies the correct object.
- Good hash functions reduce collisions.
- Frequent collisions reduce performance.
- Collision handling is a common Java interview topic.

---

# Summary

Collision is an unavoidable part of the hashing process in Java. It occurs when multiple objects are assigned to the same bucket. Java efficiently handles collisions using a combination of `hashCode()` and `equals()`, ensuring that hash-based collections continue to provide fast data access. Understanding collisions is essential for mastering HashMap, HashSet, and other hash-based collections, as well as for succeeding in Java technical interviews.
