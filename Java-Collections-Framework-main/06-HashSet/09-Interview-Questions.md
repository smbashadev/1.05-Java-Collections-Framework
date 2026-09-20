# HashSet Interview Questions

## Introduction

**HashSet** is one of the most frequently asked collection classes in Java interviews. It implements the **Set** interface and internally uses a **HashMap** to store unique elements efficiently.

This document contains beginner-friendly and interview-oriented questions with concise answers for quick revision.

---

# Basic Interview Questions

## 1. What is HashSet?

**Answer:**

HashSet is a class in the Java Collections Framework that stores only unique elements.

---

## 2. In which package is HashSet available?

**Answer:**

```java
java.util
```

---

## 3. Which interface does HashSet implement?

**Answer:**

Set.

---

## 4. Which class is internally used by HashSet?

**Answer:**

HashMap.

---

## 5. Does HashSet allow duplicate elements?

**Answer:**

No.

---

## 6. Does HashSet maintain insertion order?

**Answer:**

No.

---

## 7. Does HashSet maintain sorted order?

**Answer:**

No.

---

## 8. Does HashSet allow null values?

**Answer:**

Yes.

Only one null value is allowed.

---

## 9. Is HashSet synchronized?

**Answer:**

No.

---

## 10. Is HashSet thread-safe?

**Answer:**

No.

External synchronization is required for concurrent access.

---

# Constructor-Based Questions

## 11. Which constructor creates an empty HashSet?

**Answer:**

```java
HashSet()
```

---

## 12. Which constructor creates a HashSet with an initial capacity?

**Answer:**

```java
HashSet(int initialCapacity)
```

---

## 13. Which constructor specifies both initial capacity and load factor?

**Answer:**

```java
HashSet(int initialCapacity, float loadFactor)
```

---

# Method-Based Questions

## 14. Which method adds an element?

**Answer:**

```java
add()
```

---

## 15. Which method removes an element?

**Answer:**

```java
remove()
```

---

## 16. Which method checks whether an element exists?

**Answer:**

```java
contains()
```

---

## 17. Which method removes all elements?

**Answer:**

```java
clear()
```

---

## 18. Which method returns the number of elements?

**Answer:**

```java
size()
```

---

## 19. Which method checks whether the HashSet is empty?

**Answer:**

```java
isEmpty()
```

---

## 20. Which method is used to iterate through a HashSet?

**Answer:**

```java
iterator()
```

or

Enhanced for-each loop.

---

# Performance Questions

## 21. What is the average time complexity of add()?

**Answer:**

**O(1)**

---

## 22. What is the average time complexity of remove()?

**Answer:**

**O(1)**

---

## 23. What is the average time complexity of contains()?

**Answer:**

**O(1)**

---

## 24. What is the worst-case time complexity of HashSet operations?

**Answer:**

**O(n)**

---

## 25. Why is HashSet fast?

**Answer:**

Because it uses hashing internally.

---

# Internal Working Questions

## 26. How does HashSet store elements?

**Answer:**

HashSet stores every element as a key in an internal HashMap.

---

## 27. What value is stored for every key?

**Answer:**

A dummy object.

---

## 28. Which methods are used to identify duplicate elements?

**Answer:**

```java
hashCode()
equals()
```

---

## 29. What happens when a duplicate element is added?

**Answer:**

The duplicate element is ignored.

---

## 30. Why are hashCode() and equals() important?

**Answer:**

They work together to identify duplicate elements and maintain uniqueness.

---

# Comparison Questions

## 31. Which collection allows duplicate elements?

**Answer:**

ArrayList.

HashSet does not.

---

## 32. Which collection maintains insertion order?

**Answer:**

LinkedHashSet.

HashSet does not.

---

## 33. Which collection maintains sorted order?

**Answer:**

TreeSet.

HashSet does not.

---

## 34. Which collection provides the fastest average insertion?

**Answer:**

HashSet.

---

# Scenario-Based Questions

## 35. When should HashSet be used?

**Answer:**

Use HashSet when:

- Duplicate elements should not be stored.
- Fast searching is required.
- Fast insertion and deletion are required.
- Ordering is not important.

---

## 36. When should HashSet be avoided?

**Answer:**

Avoid HashSet when:

- Insertion order must be preserved.
- Elements must be sorted.
- Index-based access is required.

---

## 37. Can HashSet store custom objects?

**Answer:**

Yes.

The custom class should properly override `hashCode()` and `equals()`.

---

## 38. Can HashSet contain multiple null values?

**Answer:**

No.

Only one null value is allowed.

---

## 39. Why doesn't HashSet provide index-based access?

**Answer:**

Because elements are stored using hashing rather than indexes.

---

## 40. Name some real-world applications of HashSet.

**Answer:**

- Removing duplicate records
- User ID management
- Email validation
- Product code management
- Student registration systems
- Search history filtering
- Unique transaction IDs

---

# Frequently Asked MNC Interview Questions

### Q1. Which interface does HashSet implement?

**Answer:** Set.

---

### Q2. Which class is internally used by HashSet?

**Answer:** HashMap.

---

### Q3. Does HashSet allow duplicate elements?

**Answer:** No.

---

### Q4. Does HashSet maintain insertion order?

**Answer:** No.

---

### Q5. Which methods are used to identify duplicate objects?

**Answer:** `hashCode()` and `equals()`.

---

# Quick Revision Table

| Topic | Key Point |
|--------|-----------|
| Package | java.util |
| Interface | Set |
| Internal Structure | HashMap |
| Duplicate Elements | Not Allowed |
| Null Values | One Allowed |
| Insertion Order | Not Maintained |
| Sorted Order | Not Maintained |
| Thread Safe | No |
| add(), remove(), contains() | O(1) Average |
| Best Use | Store Unique Elements |

---

# Key Takeaways

- HashSet implements the Set interface.
- Internally uses HashMap.
- Stores only unique elements.
- Duplicate elements are automatically ignored.
- Allows one null value.
- Does not maintain insertion order.
- Provides O(1) average performance for insertion, deletion, and searching.
- Relies on `hashCode()` and `equals()` for uniqueness.
- Frequently asked in Java Collections Framework interviews.

---

# Summary

HashSet is one of the most important implementations of the Set interface in Java. It efficiently stores unique elements using hashing and provides excellent performance for insertion, deletion, and searching operations. Its internal working, performance characteristics, and real-world applications make HashSet an essential topic for Java developers and technical interview preparation.
