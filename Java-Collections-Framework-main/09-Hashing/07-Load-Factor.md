# Load Factor in Java Hashing

## Introduction

A **Load Factor** is one of the most important concepts in Java Hashing. It determines **how full a hash table is allowed to become before its capacity is increased**.

The load factor helps Java maintain efficient insertion, searching, and deletion operations by deciding when to resize the hash table.

Collections such as **HashMap**, **HashSet**, **LinkedHashMap**, and **LinkedHashSet** internally use the load factor to maintain good performance.

Understanding the load factor is essential for mastering the internal working of Java's hash-based collections.

---

# Definition

A **Load Factor** is the ratio between the number of stored elements and the total number of buckets in a hash table.

---

# Formula

```text
Load Factor = Number of Elements / Number of Buckets
```

---

# Example

Suppose a hash table has:

```text
Number of Elements = 12

Number of Buckets = 16
```

Load Factor:

```text
12 / 16 = 0.75
```

The load factor is **0.75**.

---

# Default Load Factor

The default load factor used by Java's **HashMap** is:

```text
0.75
```

This value provides a good balance between memory usage and performance.

---

# Why is Load Factor Important?

The load factor helps Java:

- Maintain fast searching
- Reduce collisions
- Improve insertion performance
- Decide when resizing is required
- Optimize memory usage

---

# Working of Load Factor

The working process is:

1. Objects are inserted into the hash table.
2. Java counts the number of stored elements.
3. Java calculates the load factor.
4. If the load factor exceeds the predefined threshold, the hash table is resized.
5. Existing elements are redistributed into the new buckets.

---

# Working Diagram

```text
Insert Elements
       │
       ▼
Calculate Load Factor
       │
       ▼
Load Factor > Threshold?
       │
   Yes │ No
       ▼
Resize Hash Table
       │
       ▼
Rehash Elements
```

---

# Threshold Calculation

The threshold is calculated as:

```text
Threshold = Capacity × Load Factor
```

Example:

```text
Capacity = 16

Load Factor = 0.75

Threshold = 16 × 0.75 = 12
```

When the 13th element is inserted, Java resizes the hash table.

---

# Advantages

- Improves searching performance
- Reduces collisions
- Maintains efficient hashing
- Balances memory usage
- Supports automatic resizing

---

# Limitations

- Very high load factor increases collisions.
- Very low load factor wastes memory.
- Resizing takes additional processing time.

---

# Collections That Use Load Factor

The following Java collections use the load factor internally:

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet

---

# Real-World Applications

Load factor is important in:

- Banking applications
- Search engines
- Database indexing
- Caching systems
- Student management systems
- Inventory systems
- Employee management systems

---

# Frequently Asked Interview Questions

### 1. What is a load factor?

**Answer:**

It is the ratio of the number of stored elements to the total number of buckets.

---

### 2. What is the formula for calculating the load factor?

**Answer:**

```text
Load Factor = Number of Elements / Number of Buckets
```

---

### 3. What is the default load factor in HashMap?

**Answer:**

```text
0.75
```

---

### 4. Why is the load factor important?

**Answer:**

It helps maintain efficient performance by deciding when to resize the hash table.

---

### 5. What happens when the load factor exceeds the threshold?

**Answer:**

Java automatically resizes the hash table and rehashes the existing elements.

---

### 6. Which Java collections use the load factor?

**Answer:**

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet

---

### 7. Can a higher load factor affect performance?

**Answer:**

Yes.

A higher load factor increases collisions, which may reduce performance.

---

# Key Takeaways

- Load factor measures how full a hash table is.
- Formula: **Elements / Buckets**.
- Default load factor is **0.75**.
- Helps reduce collisions.
- Determines when resizing occurs.
- Improves overall hashing performance.
- Frequently asked in Java Collections Framework interviews.

---

# Summary

The load factor is a key concept in Java hashing that controls when a hash table should be resized. By maintaining an appropriate balance between the number of stored elements and available buckets, Java ensures efficient insertion, searching, and deletion operations. Understanding the load factor is essential for mastering the internal working of HashMap, HashSet, LinkedHashMap, and other hash-based collections, making it an important topic for Java technical interviews.
