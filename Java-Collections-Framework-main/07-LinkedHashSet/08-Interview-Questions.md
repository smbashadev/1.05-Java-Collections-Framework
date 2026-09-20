# LinkedHashSet Interview Questions

## Introduction

**LinkedHashSet** is one of the most frequently asked Set implementations in Java interviews. It combines the uniqueness of **HashSet** with the predictable iteration order of a **Linked List** by internally using a **LinkedHashMap**.

This document contains beginner-friendly and interview-oriented questions with concise answers for quick revision.

---

# Basic Interview Questions

## 1. What is LinkedHashSet?

**Answer:**

LinkedHashSet is a class in the Java Collections Framework that stores only unique elements while maintaining insertion order.

---

## 2. In which package is LinkedHashSet available?

**Answer:**

```java
java.util
```

---

## 3. Which interface does LinkedHashSet implement?

**Answer:**

Set.

---

## 4. Which class is internally used by LinkedHashSet?

**Answer:**

LinkedHashMap.

---

## 5. Does LinkedHashSet allow duplicate elements?

**Answer:**

No.

---

## 6. Does LinkedHashSet maintain insertion order?

**Answer:**

Yes.

---

## 7. Does LinkedHashSet maintain sorted order?

**Answer:**

No.

---

## 8. Does LinkedHashSet allow null values?

**Answer:**

Yes.

Only one null value is allowed.

---

## 9. Is LinkedHashSet synchronized?

**Answer:**

No.

---

## 10. Is LinkedHashSet thread-safe?

**Answer:**

No.

External synchronization is required for concurrent access.

---

# Constructor-Based Questions

## 11. Which constructor creates an empty LinkedHashSet?

**Answer:**

```java
LinkedHashSet()
```

---

## 12. Which constructor creates a LinkedHashSet from another collection?

**Answer:**

```java
LinkedHashSet(Collection c)
```

---

# Method-Based Questions

## 13. Which method adds an element?

**Answer:**

```java
add()
```

---

## 14. Which method removes an element?

**Answer:**

```java
remove()
```

---

## 15. Which method checks whether an element exists?

**Answer:**

```java
contains()
```

---

## 16. Which method removes all elements?

**Answer:**

```java
clear()
```

---

## 17. Which method returns the number of elements?

**Answer:**

```java
size()
```

---

## 18. Which method checks whether the LinkedHashSet is empty?

**Answer:**

```java
isEmpty()
```

---

## 19. Which method is used to iterate through a LinkedHashSet?

**Answer:**

```java
iterator()
```

or

Enhanced for-each loop.

---

# Performance Questions

## 20. What is the average time complexity of add()?

**Answer:**

**O(1)**

---

## 21. What is the average time complexity of remove()?

**Answer:**

**O(1)**

---

## 22. What is the average time complexity of contains()?

**Answer:**

**O(1)**

---

## 23. What is the worst-case time complexity?

**Answer:**

**O(n)**

---

## 24. Why is LinkedHashSet efficient?

**Answer:**

Because it combines hashing with a linked list.

---

# Internal Working Questions

## 25. How does LinkedHashSet store elements?

**Answer:**

It stores elements using an internal LinkedHashMap.

---

## 26. How is insertion order maintained?

**Answer:**

By maintaining a doubly linked list of elements.

---

## 27. Which methods are used to identify duplicate elements?

**Answer:**

```java
hashCode()
equals()
```

---

## 28. What happens when a duplicate element is added?

**Answer:**

The duplicate element is ignored.

---

## 29. Can LinkedHashSet store custom objects?

**Answer:**

Yes.

The custom class should properly override `hashCode()` and `equals()`.

---

## 30. Can LinkedHashSet contain multiple null values?

**Answer:**

No.

Only one null value is allowed.

---

# Comparison Questions

## 31. Which collection maintains insertion order?

**Answer:**

LinkedHashSet.

---

## 32. Which collection is faster?

**Answer:**

HashSet is slightly faster because it does not maintain insertion order.

---

## 33. Which collection maintains sorted order?

**Answer:**

TreeSet.

LinkedHashSet does not.

---

## 34. Which collection should be used when insertion order is important?

**Answer:**

LinkedHashSet.

---

# Scenario-Based Questions

## 35. When should LinkedHashSet be used?

**Answer:**

Use LinkedHashSet when:

- Duplicate elements should not be stored.
- Insertion order must be preserved.
- Fast searching is required.
- Predictable iteration order is needed.

---

## 36. When should LinkedHashSet be avoided?

**Answer:**

Avoid LinkedHashSet when:

- Elements must be sorted.
- Index-based access is required.
- Thread-safe operations are required.

---

## 37. Why is LinkedHashSet preferred over HashSet in some applications?

**Answer:**

Because it preserves insertion order while still preventing duplicate elements.

---

## 38. Why is LinkedHashSet preferred over TreeSet in some applications?

**Answer:**

Because it provides faster average performance and preserves insertion order instead of sorting elements.

---

## 39. Name some real-world applications of LinkedHashSet.

**Answer:**

- Browser history
- Playlist management
- Recently viewed products
- Ordered search history
- Student registration systems
- Ordered unique records

---

## 40. What is the biggest advantage of LinkedHashSet?

**Answer:**

It stores unique elements while preserving insertion order.

---

# Frequently Asked MNC Interview Questions

### Q1. Which interface does LinkedHashSet implement?

**Answer:** Set.

---

### Q2. Which class is internally used by LinkedHashSet?

**Answer:** LinkedHashMap.

---

### Q3. Does LinkedHashSet allow duplicate elements?

**Answer:** No.

---

### Q4. Does LinkedHashSet maintain insertion order?

**Answer:** Yes.

---

### Q5. Which methods are used to identify duplicate objects?

**Answer:** `hashCode()` and `equals()`.

---

# Quick Revision Table

| Topic | Key Point |
|--------|-----------|
| Package | java.util |
| Interface | Set |
| Internal Structure | LinkedHashMap |
| Duplicate Elements | Not Allowed |
| Null Values | One Allowed |
| Insertion Order | Maintained |
| Sorted Order | Not Maintained |
| Thread Safe | No |
| add(), remove(), contains() | O(1) Average |
| Best Use | Unique Elements with Insertion Order |

---

# Key Takeaways

- LinkedHashSet implements the Set interface.
- Internally uses LinkedHashMap.
- Stores only unique elements.
- Maintains insertion order.
- Allows one null value.
- Provides O(1) average performance for insertion, deletion, and searching.
- Uses `hashCode()` and `equals()` to maintain uniqueness.
- Frequently asked in Java Collections Framework interviews.

---

# Summary

LinkedHashSet is an important implementation of the Set interface that combines the efficiency of hashing with predictable insertion order. It is an excellent choice for applications that require unique elements while preserving the order of insertion. Because of its performance characteristics and practical applications, LinkedHashSet is a common topic in Java Collections Framework interviews.
