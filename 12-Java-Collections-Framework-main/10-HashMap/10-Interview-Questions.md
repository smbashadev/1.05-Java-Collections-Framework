# HashMap Interview Questions and Answers

## Introduction

**HashMap** is one of the most important and frequently asked topics in Java interviews. Almost every Java developer is expected to understand how HashMap stores data, handles collisions, retrieves values, and performs efficiently.

This document contains beginner-friendly and interview-oriented questions with simple answers for quick revision.

---

# Basic Interview Questions

## 1. What is HashMap?

**Answer:**

HashMap is a class in the Java Collections Framework that stores data in the form of **key-value pairs**.

---

## 2. Which package contains HashMap?

**Answer:**

```java
java.util
```

---

## 3. Which interface does HashMap implement?

**Answer:**

```text
Map
```

---

## 4. Does HashMap allow duplicate keys?

**Answer:**

No.

If the same key is inserted again, the old value is replaced with the new value.

---

## 5. Does HashMap allow duplicate values?

**Answer:**

Yes.

Multiple keys can have the same value.

---

## 6. Does HashMap allow null keys?

**Answer:**

Yes.

Only one null key is allowed.

---

## 7. Does HashMap allow null values?

**Answer:**

Yes.

Multiple null values are allowed.

---

## 8. Does HashMap maintain insertion order?

**Answer:**

No.

HashMap does not guarantee insertion order.

---

## 9. Is HashMap synchronized?

**Answer:**

No.

HashMap is not synchronized.

---

## 10. Which technique does HashMap use internally?

**Answer:**

Hashing.

---

## 11. Which method is used to insert elements into a HashMap?

**Answer:**

```java
put()
```

---

## 12. Which method is used to retrieve a value?

**Answer:**

```java
get()
```

---

## 13. Which method removes a key-value pair?

**Answer:**

```java
remove()
```

---

## 14. Which method checks whether a key exists?

**Answer:**

```java
containsKey()
```

---

## 15. Which method checks whether a value exists?

**Answer:**

```java
containsValue()
```

---

## 16. Which method returns the number of entries?

**Answer:**

```java
size()
```

---

## 17. Which method removes all entries from a HashMap?

**Answer:**

```java
clear()
```

---

## 18. Which method returns all keys?

**Answer:**

```java
keySet()
```

---

## 19. Which method returns all values?

**Answer:**

```java
values()
```

---

## 20. Which method returns all key-value pairs?

**Answer:**

```java
entrySet()
```

---

## 21. Which methods are used internally to locate an object?

**Answer:**

- `hashCode()`
- `equals()`

---

## 22. What is a collision?

**Answer:**

A collision occurs when two different keys are assigned to the same bucket.

---

## 23. How does HashMap handle collisions?

**Answer:**

HashMap stores multiple entries in the same bucket and uses `equals()` to identify the required key.

---

## 24. What is the default load factor of HashMap?

**Answer:**

```text
0.75
```

---

## 25. What is the default initial capacity of HashMap?

**Answer:**

```text
16
```

---

## 26. What is rehashing?

**Answer:**

Rehashing is the process of increasing the size of the hash table and redistributing all existing entries into new buckets.

---

## 27. When does rehashing occur?

**Answer:**

When the load factor exceeds the threshold.

---

## 28. What is the average time complexity of HashMap operations?

**Answer:**

| Operation | Time Complexity |
|-----------|-----------------|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |

---

## 29. What is the worst-case time complexity?

**Answer:**

```text
O(n)
```

---

## 30. Where is HashMap commonly used?

**Answer:**

- Banking applications
- Student management systems
- Employee databases
- E-commerce websites
- Inventory systems
- Login systems
- Caching
- Configuration management

---

# Interview Tips

- Understand the relationship between `hashCode()` and `equals()`.
- Remember the default initial capacity (**16**) and default load factor (**0.75**).
- Know how collisions occur and how HashMap handles them.
- Practice methods like `put()`, `get()`, `remove()`, `keySet()`, `values()`, and `entrySet()`.
- Learn the average and worst-case time complexities.

---

# Quick Revision Table

| Concept | Key Point |
|----------|-----------|
| Storage | Key-Value Pairs |
| Interface | Map |
| Package | java.util |
| Duplicate Keys | Not Allowed |
| Duplicate Values | Allowed |
| Null Key | One Allowed |
| Null Values | Multiple Allowed |
| Order | Not Maintained |
| Synchronization | Not Synchronized |
| Internal Technique | Hashing |
| Default Capacity | 16 |
| Default Load Factor | 0.75 |
| Average Time Complexity | O(1) |
| Worst Time Complexity | O(n) |

---

# Key Takeaways

- HashMap stores data as key-value pairs.
- Uses hashing for efficient data retrieval.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Allows one null key and multiple null values.
- Does not maintain insertion order.
- Not synchronized.
- Frequently asked in Java technical interviews.

---

# Summary

HashMap is one of the most widely used classes in the Java Collections Framework because of its speed, flexibility, and efficient key-value storage. Understanding its features, internal working, methods, performance, and interview concepts is essential for Java development and technical interview success.
