# LinkedHashMap Interview Questions and Answers

## Introduction

**LinkedHashMap** is one of the most frequently asked topics in Java interviews. It combines the fast performance of **HashMap** with the ability to **maintain insertion order**.

This document contains beginner-friendly and interview-oriented questions with simple explanations for quick revision.

---

# Basic Interview Questions

## 1. What is LinkedHashMap?

**Answer:**

LinkedHashMap is a class in the Java Collections Framework that stores data as **key-value pairs** while maintaining the insertion order.

---

## 2. Which package contains LinkedHashMap?

**Answer:**

```java
java.util
```

---

## 3. Which interface does LinkedHashMap implement?

**Answer:**

```text
Map
```

---

## 4. Does LinkedHashMap maintain insertion order?

**Answer:**

Yes.

LinkedHashMap always preserves the order in which entries are inserted.

---

## 5. Does LinkedHashMap allow duplicate keys?

**Answer:**

No.

If a duplicate key is inserted, the old value is replaced with the new value.

---

## 6. Does LinkedHashMap allow duplicate values?

**Answer:**

Yes.

Multiple keys can have the same value.

---

## 7. Does LinkedHashMap allow null keys?

**Answer:**

Yes.

Only one null key is allowed.

---

## 8. Does LinkedHashMap allow null values?

**Answer:**

Yes.

Multiple null values are allowed.

---

## 9. Is LinkedHashMap synchronized?

**Answer:**

No.

LinkedHashMap is not synchronized.

---

## 10. Which data structure does LinkedHashMap use internally?

**Answer:**

It uses:

- Hash Table
- Doubly Linked List

---

## 11. Which method inserts entries?

**Answer:**

```java
put()
```

---

## 12. Which method retrieves a value?

**Answer:**

```java
get()
```

---

## 13. Which method removes an entry?

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

## 17. Which method removes all entries?

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

## 21. Does LinkedHashMap use hashing?

**Answer:**

Yes.

It uses hashing for fast searching, insertion, and deletion.

---

## 22. Why is LinkedHashMap slower than HashMap?

**Answer:**

Because LinkedHashMap maintains a **doubly linked list** to preserve insertion order.

---

## 23. What is the default initial capacity of LinkedHashMap?

**Answer:**

```text
16
```

---

## 24. What is the default load factor?

**Answer:**

```text
0.75
```

---

## 25. Does LinkedHashMap maintain sorted order?

**Answer:**

No.

It maintains **insertion order**, not sorted order.

---

## 26. What happens if the same key is inserted again?

**Answer:**

The existing value is replaced.

---

## 27. Can LinkedHashMap be used in multithreaded applications?

**Answer:**

Yes, but external synchronization is required because LinkedHashMap is not thread-safe.

---

## 28. What is the average time complexity of LinkedHashMap operations?

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

## 30. Where is LinkedHashMap commonly used?

**Answer:**

- Banking applications
- Employee management systems
- Student management systems
- Shopping cart applications
- Inventory management
- Configuration management
- Cache implementations
- Report generation

---

# Interview Tips

- Remember that LinkedHashMap preserves insertion order.
- Understand the difference between HashMap and LinkedHashMap.
- Learn the purpose of the doubly linked list.
- Remember the default capacity (**16**) and load factor (**0.75**).
- Practice methods such as `put()`, `get()`, `remove()`, `keySet()`, `values()`, and `entrySet()`.

---

# Quick Revision Table

| Concept | Key Point |
|----------|-----------|
| Storage | Key-Value Pairs |
| Interface | Map |
| Package | java.util |
| Order | Insertion Order Maintained |
| Duplicate Keys | Not Allowed |
| Duplicate Values | Allowed |
| Null Key | One Allowed |
| Null Values | Multiple Allowed |
| Synchronization | Not Synchronized |
| Internal Structure | Hash Table + Doubly Linked List |
| Default Capacity | 16 |
| Default Load Factor | 0.75 |
| Average Time Complexity | O(1) |
| Worst Time Complexity | O(n) |

---

# Key Takeaways

- LinkedHashMap stores key-value pairs.
- Maintains insertion order.
- Uses both a hash table and a doubly linked list internally.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Allows one null key and multiple null values.
- Not synchronized.
- Frequently asked in Java technical interviews.

---

# Summary

LinkedHashMap is an enhanced version of HashMap that preserves insertion order while providing efficient key-value storage using hashing. Its predictable iteration order, support for null values, and excellent performance make it suitable for many real-world applications. A solid understanding of LinkedHashMap is essential for Java development and technical interview success.
