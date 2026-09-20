# Rehashing in Java

## Introduction

**Rehashing** is an important concept in Java Hashing. It is the process of **increasing the capacity of a hash table and redistributing all existing elements into new buckets** when the load factor exceeds a predefined threshold.

Rehashing helps maintain fast insertion, searching, and deletion operations by reducing collisions and distributing elements more evenly across buckets.

Java collections such as **HashMap**, **HashSet**, **LinkedHashMap**, and **LinkedHashSet** automatically perform rehashing whenever necessary.

Understanding rehashing is essential for mastering the internal working of Java's hash-based collections.

---

# Definition

**Rehashing** is the process of creating a larger hash table and recalculating the bucket locations of all existing elements using their hash codes.

---

# Why is Rehashing Needed?

As more elements are added:

- The hash table becomes crowded.
- More collisions occur.
- Searching becomes slower.
- Insertion becomes slower.
- Performance decreases.

To maintain efficient performance, Java increases the table size and redistributes all elements.

---

# When Does Rehashing Occur?

Rehashing occurs when:

```text
Load Factor > Threshold
```

Example:

```text
Initial Capacity = 16

Load Factor = 0.75

Threshold = 16 × 0.75 = 12
```

When the **13th element** is inserted, Java performs rehashing.

---

# How Rehashing Works

The rehashing process follows these steps:

1. Objects are inserted into the hash table.
2. Java calculates the current load factor.
3. The load factor exceeds the threshold.
4. A larger hash table is created.
5. The capacity is increased.
6. All existing elements are rehashed.
7. Elements are placed into their new bucket locations.

---

# Rehashing Diagram

```text
Old Hash Table
      │
      ▼
Load Factor Exceeds Threshold
      │
      ▼
Create Larger Hash Table
      │
      ▼
Recalculate Hash Codes
      │
      ▼
Move Elements to New Buckets
```

---

# Example

Suppose a HashMap has:

```text
Capacity = 16

Load Factor = 0.75
```

Threshold:

```text
16 × 0.75 = 12
```

After inserting the 13th element:

- Java creates a larger hash table.
- Existing elements are redistributed.
- Collisions are reduced.

---

# Benefits of Rehashing

- Reduces collisions
- Improves searching speed
- Improves insertion performance
- Maintains efficient hashing
- Distributes elements more evenly
- Supports dynamic growth

---

# Limitations

- Rehashing requires additional processing.
- Existing elements must be redistributed.
- Temporary performance decreases during rehashing.
- Additional memory is required for the new hash table.

---

# Collections That Perform Rehashing

The following Java collections automatically perform rehashing:

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet

---

# Real-World Applications

Rehashing is important in:

- Banking applications
- Student management systems
- Employee management systems
- Database indexing
- Search engines
- Inventory management
- Caching systems
- E-commerce platforms

---

# Frequently Asked Interview Questions

### 1. What is rehashing?

**Answer:**

Rehashing is the process of increasing the size of a hash table and redistributing existing elements into new buckets.

---

### 2. Why is rehashing required?

**Answer:**

To reduce collisions and maintain efficient performance.

---

### 3. When does rehashing occur?

**Answer:**

When the load factor exceeds the threshold.

---

### 4. Which collections automatically perform rehashing?

**Answer:**

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet

---

### 5. Does rehashing improve performance?

**Answer:**

Yes.

By reducing collisions and distributing elements more evenly, overall performance improves.

---

### 6. Does rehashing happen manually?

**Answer:**

No.

Java performs rehashing automatically when required.

---

### 7. What happens to existing elements during rehashing?

**Answer:**

They are redistributed into new bucket locations based on the resized hash table.

---

# Key Takeaways

- Rehashing increases the capacity of a hash table.
- It occurs when the load factor exceeds the threshold.
- Existing elements are redistributed into new buckets.
- Rehashing reduces collisions.
- It improves insertion, searching, and deletion performance.
- Java performs rehashing automatically.
- Frequently asked in Java Collections Framework interviews.

---

# Summary

Rehashing is an important optimization technique used by Java's hash-based collections to maintain efficient performance as the number of stored elements grows. By increasing the hash table's capacity and redistributing existing elements, Java reduces collisions and ensures fast data access. A solid understanding of rehashing is essential for mastering HashMap, HashSet, LinkedHashMap, and other hash-based collections, making it a key topic for Java technical interviews.
