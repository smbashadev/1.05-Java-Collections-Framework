# Hashing Interview Questions and Answers

## Introduction

Hashing is one of the most frequently asked topics in Java Collections Framework interviews. Interviewers often ask about concepts such as **hashCode()**, **equals()**, **Hash Table**, **Bucket**, **Collision**, **Load Factor**, and **Rehashing**.

This document provides commonly asked interview questions with simple and easy-to-understand answers for beginners and freshers.

---

# Basic Interview Questions

## 1. What is Hashing?

**Answer:**

Hashing is a technique used to store and retrieve data efficiently by converting an object into an integer value called a **hash code**.

---

## 2. Why is Hashing used?

**Answer:**

Hashing provides:

- Fast insertion
- Fast searching
- Fast deletion
- Efficient data retrieval

---

## 3. Which Java collections use hashing?

**Answer:**

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet
- Hashtable

---

## 4. What is hashCode()?

**Answer:**

`hashCode()` is a method of the `Object` class that returns an integer hash value used to determine the bucket location of an object.

---

## 5. What is equals()?

**Answer:**

`equals()` compares two objects for logical equality.

---

## 6. What is the relationship between hashCode() and equals()?

**Answer:**

- `hashCode()` determines the bucket.
- `equals()` identifies the correct object inside that bucket.

---

## 7. What is a Hash Table?

**Answer:**

A Hash Table is a data structure that stores objects in buckets using their hash codes.

---

## 8. What is a Bucket?

**Answer:**

A bucket is a storage location inside a hash table where one or more objects are stored.

---

## 9. What is a Collision?

**Answer:**

A collision occurs when two or more different objects are assigned to the same bucket.

---

## 10. Can collisions be avoided completely?

**Answer:**

No.

Collisions cannot be completely avoided, but they can be minimized using a good `hashCode()` implementation.

---

## 11. How does Java handle collisions?

**Answer:**

Java stores the colliding objects in the same bucket and uses the `equals()` method to identify the required object.

---

## 12. What is a Load Factor?

**Answer:**

Load Factor is the ratio between the number of stored elements and the total number of buckets.

```text
Load Factor = Number of Elements / Number of Buckets
```

---

## 13. What is the default load factor of HashMap?

**Answer:**

```text
0.75
```

---

## 14. What is a Threshold?

**Answer:**

The threshold is the maximum number of elements that can be stored before rehashing occurs.

```text
Threshold = Capacity × Load Factor
```

---

## 15. What is Rehashing?

**Answer:**

Rehashing is the process of increasing the size of a hash table and redistributing all existing elements into new buckets.

---

## 16. When does rehashing occur?

**Answer:**

When the load factor exceeds the threshold.

---

## 17. Why is rehashing important?

**Answer:**

It reduces collisions and maintains efficient insertion, searching, and deletion performance.

---

## 18. Which method returns the hash value of an object?

**Answer:**

```java
hashCode()
```

---

## 19. Which method compares two objects?

**Answer:**

```java
equals()
```

---

## 20. Which class defines hashCode() and equals()?

**Answer:**

The **Object** class.

---

## 21. What happens if two equal objects return different hash codes?

**Answer:**

It violates the contract between `equals()` and `hashCode()` and may cause incorrect behavior in hash-based collections.

---

## 22. Can two different objects have the same hash code?

**Answer:**

Yes.

This situation is called a collision.

---

## 23. What is the average time complexity of HashMap operations?

**Answer:**

| Operation | Average Time |
|-----------|--------------|
| Insert | O(1) |
| Search | O(1) |
| Delete | O(1) |

---

## 24. What is the worst-case time complexity?

**Answer:**

```text
O(n)
```

This usually occurs when many collisions happen.

---

## 25. Why are hash-based collections faster?

**Answer:**

Because hashing allows Java to directly locate the bucket instead of searching every object one by one.

---

# Interview Tips

- Understand the difference between `hashCode()` and `equals()`.
- Remember the default HashMap load factor (**0.75**).
- Know the threshold formula.
- Learn how collisions occur and how Java handles them.
- Understand when rehashing takes place.
- Practice explaining buckets with simple examples.

---

# Quick Revision Table

| Concept | Key Point |
|----------|-----------|
| Hashing | Fast storage and retrieval |
| hashCode() | Determines bucket location |
| equals() | Compares object contents |
| Bucket | Storage location in a hash table |
| Collision | Multiple objects in the same bucket |
| Load Factor | Elements ÷ Buckets |
| Threshold | Capacity × Load Factor |
| Rehashing | Resize and redistribute elements |

---

# Key Takeaways

- Hashing is the foundation of Java's hash-based collections.
- `hashCode()` and `equals()` work together.
- Buckets store objects efficiently.
- Collisions are normal and handled internally.
- Load factor controls when resizing occurs.
- Rehashing maintains collection performance.
- These concepts are among the most frequently asked Java interview topics.

---

# Summary

Hashing is one of the core concepts of the Java Collections Framework and an essential interview topic. A clear understanding of `hashCode()`, `equals()`, buckets, collisions, load factor, threshold, and rehashing helps developers write efficient Java applications and confidently answer technical interview questions.
