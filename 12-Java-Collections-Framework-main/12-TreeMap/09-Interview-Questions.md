# TreeMap Interview Questions and Answers

## Introduction

TreeMap is one of the most frequently asked topics in Java Collections Framework interviews. It stores data as **key-value pairs** and automatically maintains the keys in **ascending sorted order**. TreeMap implements the **NavigableMap** interface and internally uses a **Red-Black Tree**.

This document contains commonly asked TreeMap interview questions with simple and beginner-friendly answers.

---

# 1. What is TreeMap?

**Answer:**

TreeMap is a class in the Java Collections Framework that stores data as key-value pairs and automatically sorts the keys in ascending order.

---

# 2. Which package contains TreeMap?

**Answer:**

```java
java.util
```

---

# 3. Which interface is implemented by TreeMap?

**Answer:**

TreeMap implements:

- Map
- SortedMap
- NavigableMap

---

# 4. Which data structure is used internally by TreeMap?

**Answer:**

TreeMap internally uses a **Red-Black Tree**.

---

# 5. Does TreeMap maintain insertion order?

**Answer:**

No.

It maintains **sorted order of keys**, not insertion order.

---

# 6. Does TreeMap sort values?

**Answer:**

No.

Only the **keys** are sorted automatically.

---

# 7. Are duplicate keys allowed?

**Answer:**

No.

Duplicate keys replace the old value.

---

# 8. Are duplicate values allowed?

**Answer:**

Yes.

Multiple keys can have the same value.

---

# 9. Does TreeMap allow null keys?

**Answer:**

No.

TreeMap does not allow null keys.

Attempting to insert a null key throws a **NullPointerException**.

---

# 10. Does TreeMap allow null values?

**Answer:**

Yes.

Multiple null values are allowed.

---

# 11. Is TreeMap synchronized?

**Answer:**

No.

TreeMap is not synchronized.

---

# 12. Which method inserts data?

**Answer:**

```java
put()
```

---

# 13. Which method retrieves data?

**Answer:**

```java
get()
```

---

# 14. Which method removes an entry?

**Answer:**

```java
remove()
```

---

# 15. Which method checks whether a key exists?

**Answer:**

```java
containsKey()
```

---

# 16. Which method checks whether a value exists?

**Answer:**

```java
containsValue()
```

---

# 17. Which method returns the first key?

**Answer:**

```java
firstKey()
```

---

# 18. Which method returns the last key?

**Answer:**

```java
lastKey()
```

---

# 19. Which method returns the next higher key?

**Answer:**

```java
higherKey()
```

---

# 20. Which method returns the next lower key?

**Answer:**

```java
lowerKey()
```

---

# 21. Which method returns the equal or next higher key?

**Answer:**

```java
ceilingKey()
```

---

# 22. Which method returns the equal or next lower key?

**Answer:**

```java
floorKey()
```

---

# 23. How do you iterate through a TreeMap?

**Answer:**

Using:

- entrySet()
- keySet()
- values()
- for-each loop
- Iterator

---

# 24. What is the default sorting order of TreeMap?

**Answer:**

Ascending order of keys.

---

# 25. Can TreeMap store custom objects as keys?

**Answer:**

Yes.

The custom class must implement the **Comparable** interface or a **Comparator** must be provided.

---

# 26. What is the time complexity of TreeMap operations?

| Operation | Time Complexity |
|-----------|-----------------|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |
| containsKey() | O(log n) |

---

# 27. Difference between HashMap and TreeMap

| Feature | HashMap | TreeMap |
|---------|----------|----------|
| Ordering | No ordering | Sorted keys |
| Data Structure | Hash Table | Red-Black Tree |
| Null Key | One allowed | Not allowed |
| Performance | Faster | Slightly slower |
| Interfaces | Map | NavigableMap |

---

# 28. Difference between LinkedHashMap and TreeMap

| Feature | LinkedHashMap | TreeMap |
|---------|---------------|----------|
| Ordering | Insertion order | Sorted keys |
| Internal Structure | Hash Table + Linked List | Red-Black Tree |
| Performance | Faster | Slower |
| Navigation Methods | No | Yes |

---

# 29. When should TreeMap be used?

**Answer:**

TreeMap is suitable when:

- Sorted data is required
- Searching based on ordered keys
- Range-based operations
- Leaderboards
- Ranking systems
- Dictionary applications

---

# 30. What are the advantages of TreeMap?

**Answer:**

- Automatically sorts keys
- Fast searching
- Fast insertion
- Fast deletion
- Powerful navigational methods
- Supports range-based operations

---

# Quick Revision

| Question | Answer |
|----------|--------|
| Stores data as | Key-Value Pair |
| Internal Structure | Red-Black Tree |
| Implements | NavigableMap |
| Duplicate Keys | Not Allowed |
| Duplicate Values | Allowed |
| Null Key | Not Allowed |
| Null Values | Allowed |
| Sorted Order | Yes |
| Thread Safe | No |
| Insert Method | put() |
| Retrieve Method | get() |
| Delete Method | remove() |
| First Key | firstKey() |
| Last Key | lastKey() |

---

# Key Takeaways

- TreeMap stores key-value pairs in sorted order.
- It internally uses a Red-Black Tree.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Null keys are not allowed.
- TreeMap provides several navigational methods for efficient key-based operations.
- TreeMap is one of the most important interview topics in the Java Collections Framework.

---

# Summary

TreeMap is a sorted implementation of the Map interface that offers efficient insertion, deletion, searching, and navigation operations. Understanding its internal working, methods, characteristics, and interview questions is essential for Java developers and technical interviews.
