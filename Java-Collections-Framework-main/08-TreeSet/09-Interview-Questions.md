# TreeSet Interview Questions

## Introduction

**TreeSet** is one of the most frequently asked collection classes in Java interviews. It stores **unique elements** and automatically arranges them in **ascending sorted order**. Internally, it uses a **Red-Black Tree**, providing efficient searching, insertion, and deletion operations.

This document contains beginner-friendly and interview-oriented questions with concise answers for quick revision.

---

# Basic Interview Questions

## 1. What is TreeSet?

**Answer:**

TreeSet is a class in the Java Collections Framework that stores unique elements in ascending sorted order.

---

## 2. In which package is TreeSet available?

**Answer:**

```java
java.util
```

---

## 3. Which interface does TreeSet implement?

**Answer:**

NavigableSet.

---

## 4. Which interfaces are extended by NavigableSet?

**Answer:**

- SortedSet
- Set
- Collection
- Iterable

---

## 5. Does TreeSet allow duplicate elements?

**Answer:**

No.

---

## 6. Does TreeSet maintain insertion order?

**Answer:**

No.

---

## 7. Does TreeSet maintain sorted order?

**Answer:**

Yes.

Ascending order by default.

---

## 8. Does TreeSet allow null values?

**Answer:**

No.

Adding a null value throws a **NullPointerException**.

---

## 9. Is TreeSet synchronized?

**Answer:**

No.

---

## 10. Is TreeSet thread-safe?

**Answer:**

No.

External synchronization is required.

---

# Internal Working Questions

## 11. Which data structure is internally used by TreeSet?

**Answer:**

Red-Black Tree.

---

## 12. Why does TreeSet automatically sort elements?

**Answer:**

Because it stores elements using a Red-Black Tree.

---

## 13. How are duplicate elements identified?

**Answer:**

Using comparison through the natural ordering or a Comparator.

---

## 14. Can TreeSet store custom objects?

**Answer:**

Yes.

The objects should implement the Comparable interface or a Comparator should be provided.

---

## 15. What happens if duplicate elements are added?

**Answer:**

Duplicate elements are ignored.

---

# Method-Based Questions

## 16. Which method adds an element?

**Answer:**

```java
add()
```

---

## 17. Which method removes an element?

**Answer:**

```java
remove()
```

---

## 18. Which method checks whether an element exists?

**Answer:**

```java
contains()
```

---

## 19. Which method returns the first element?

**Answer:**

```java
first()
```

---

## 20. Which method returns the last element?

**Answer:**

```java
last()
```

---

## 21. Which method returns the next greater element?

**Answer:**

```java
higher()
```

---

## 22. Which method returns the next smaller element?

**Answer:**

```java
lower()
```

---

## 23. Which method returns the ceiling element?

**Answer:**

```java
ceiling()
```

---

## 24. Which method returns the floor element?

**Answer:**

```java
floor()
```

---

## 25. Which method is used to iterate through a TreeSet?

**Answer:**

```java
iterator()
```

or

Enhanced for-each loop.

---

# Performance Questions

## 26. What is the average time complexity of add()?

**Answer:**

**O(log n)**

---

## 27. What is the average time complexity of remove()?

**Answer:**

**O(log n)**

---

## 28. What is the average time complexity of contains()?

**Answer:**

**O(log n)**

---

## 29. Why is TreeSet slower than HashSet?

**Answer:**

Because TreeSet maintains sorted order using a Red-Black Tree, while HashSet uses hashing.

---

## 30. Which is faster for searching: HashSet or TreeSet?

**Answer:**

HashSet.

---

# Comparison Questions

## 31. TreeSet vs HashSet

**Answer:**

| TreeSet | HashSet |
|----------|----------|
| Maintains sorted order | Does not maintain order |
| Uses Red-Black Tree | Uses Hash Table |
| O(log n) | O(1) Average |
| No null values | One null value allowed |

---

## 32. TreeSet vs LinkedHashSet

**Answer:**

| TreeSet | LinkedHashSet |
|----------|---------------|
| Sorted order | Insertion order |
| Red-Black Tree | LinkedHashMap |
| O(log n) | O(1) Average |

---

## 33. Which collection should be used for sorted unique data?

**Answer:**

TreeSet.

---

## 34. Which collection should be used for insertion order?

**Answer:**

LinkedHashSet.

---

# Scenario-Based Questions

## 35. When should TreeSet be used?

**Answer:**

Use TreeSet when:

- Sorted data is required.
- Duplicate elements should not be stored.
- Navigational methods are needed.
- Automatic ordering is important.

---

## 36. When should TreeSet be avoided?

**Answer:**

Avoid TreeSet when:

- Fastest insertion is required.
- Insertion order must be maintained.
- Null values need to be stored.
- Index-based access is required.

---

## 37. Name some real-world applications of TreeSet.

**Answer:**

- Student ranking systems
- Employee salary lists
- Dictionary applications
- Product catalogs
- Leaderboards
- Sorted reports
- Contact directories

---

## 38. What is the biggest advantage of TreeSet?

**Answer:**

Automatic sorting of unique elements.

---

## 39. What is the biggest limitation of TreeSet?

**Answer:**

It is slower than HashSet because it maintains sorted order.

---

## 40. Which TreeSet topic is most frequently asked in interviews?

**Answer:**

- Red-Black Tree
- Sorted order
- Navigational methods
- TreeSet vs HashSet
- Time complexity

---

# Frequently Asked MNC Interview Questions

### Q1. Which data structure is internally used by TreeSet?

**Answer:** Red-Black Tree.

---

### Q2. Does TreeSet allow duplicate elements?

**Answer:** No.

---

### Q3. Does TreeSet maintain insertion order?

**Answer:** No.

---

### Q4. Does TreeSet maintain sorted order?

**Answer:** Yes.

---

### Q5. What is the time complexity of add(), remove(), and contains()?

**Answer:** O(log n)

---

# Quick Revision Table

| Topic | Key Point |
|--------|-----------|
| Package | java.util |
| Interface | NavigableSet |
| Internal Structure | Red-Black Tree |
| Duplicate Elements | Not Allowed |
| Null Values | Not Allowed |
| Insertion Order | Not Maintained |
| Sorted Order | Maintained |
| Thread Safe | No |
| add(), remove(), contains() | O(log n) |
| Best Use | Unique Sorted Elements |

---

# Key Takeaways

- TreeSet implements the NavigableSet interface.
- Internally uses a Red-Black Tree.
- Stores only unique elements.
- Automatically maintains ascending sorted order.
- Does not allow duplicate or null elements.
- Provides powerful navigational methods.
- Most operations have O(log n) time complexity.
- Frequently asked in Java Collections Framework interviews.

---

# Summary

TreeSet is a powerful implementation of the Set interface for storing unique elements in sorted order. Its Red-Black Tree implementation provides efficient navigation and searching while maintaining automatic sorting. Because of these features, TreeSet is one of the most important topics in Java Collections Framework interviews and real-world Java applications.
