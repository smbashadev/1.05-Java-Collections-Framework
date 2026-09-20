# Introduction to Hashing

## Introduction

**Hashing** is one of the most fundamental concepts in the Java Collections Framework. It is a technique used to **store, search, insert, and delete data efficiently** by converting an object into a unique integer value called a **hash code**.

Many Java collection classes such as **HashSet**, **LinkedHashSet**, **HashMap**, and **Hashtable** rely on hashing to provide fast data access.

Understanding hashing is essential for writing efficient Java programs and performing well in Java interviews.

---

# Definition

**Hashing** is the process of converting an object into a fixed integer value (hash code) that is used to determine where the object should be stored in memory.

---

# Why Hashing is Needed?

Without hashing, searching for an element requires checking each element one by one.

For example:

```text
10
20
30
40
50
```

To search for **50**, every previous element may need to be checked.

Hashing allows Java to calculate the storage location directly, making searching much faster.

---

# How Hashing Works

The hashing process consists of the following steps:

1. An object is created.
2. Java generates a hash code using the `hashCode()` method.
3. The hash code determines the bucket location.
4. The object is stored inside that bucket.
5. During searching, Java generates the same hash code and directly checks the corresponding bucket.

---

# Basic Hashing Process

```text
Object
   │
   ▼
hashCode()
   │
   ▼
Hash Code
   │
   ▼
Bucket
   │
   ▼
Store Object
```

---

# Components of Hashing

Hashing mainly consists of:

- Object
- hashCode()
- Bucket
- Hash Table
- Collision
- Load Factor
- Rehashing

Each of these concepts is discussed in the following sections of this repository.

---

# Advantages of Hashing

- Very fast searching
- Fast insertion
- Fast deletion
- Efficient memory usage
- Suitable for large amounts of data
- Used by many Java collection classes

---

# Limitations of Hashing

- Collisions may occur.
- Performance depends on a good hash function.
- Poor hash codes reduce efficiency.
- Additional memory is required for buckets.

---

# Collections That Use Hashing

The following Java collection classes internally use hashing:

- HashSet
- LinkedHashSet
- HashMap
- LinkedHashMap
- Hashtable

---

# Real-World Applications

Hashing is used in:

- Login systems
- Password verification
- Database indexing
- Caching
- Search engines
- Compiler symbol tables
- Banking systems
- Student management systems

---

# Time Complexity

| Operation | Average Time |
|-----------|--------------|
| Insert | O(1) |
| Search | O(1) |
| Delete | O(1) |

Worst-case performance may become **O(n)** if many collisions occur.

---

# Frequently Asked Interview Questions

### 1. What is hashing?

**Answer:**

Hashing is the process of converting an object into a hash code for fast storage and retrieval.

---

### 2. Why is hashing used?

**Answer:**

To perform insertion, searching, and deletion efficiently.

---

### 3. Which Java collections use hashing?

**Answer:**

- HashSet
- LinkedHashSet
- HashMap
- LinkedHashMap
- Hashtable

---

### 4. Which method generates a hash code?

**Answer:**

```java
hashCode()
```

---

### 5. What is the average time complexity of hashing operations?

**Answer:**

O(1)

---

# Key Takeaways

- Hashing provides fast data access.
- Objects are stored using hash codes.
- Java uses buckets to organize hashed data.
- Hashing is the foundation of HashMap and HashSet.
- Average insertion, searching, and deletion take O(1) time.
- Collision handling is an important part of hashing.

---

# Summary

Hashing is one of the most important concepts behind the Java Collections Framework. It enables extremely fast insertion, searching, and deletion by converting objects into hash codes and storing them in buckets. A strong understanding of hashing is essential for mastering HashMap, HashSet, LinkedHashMap, Hashtable, and for succeeding in Java technical interviews.
