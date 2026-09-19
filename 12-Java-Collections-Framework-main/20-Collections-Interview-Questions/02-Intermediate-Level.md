# Java Collections Framework Interview Questions (Intermediate Level)

## Introduction

This document contains **Intermediate-Level Java Collections Framework (JCF)** interview questions frequently asked in technical interviews for Java Developers with basic knowledge of collections.

These questions focus on the internal working, differences between collection classes, performance, ordering, synchronization, and real-world usage.

---

# 1. What is the difference between ArrayList and LinkedList?

**Answer:**

| ArrayList | LinkedList |
|-----------|------------|
| Uses a dynamic array | Uses a doubly linked list |
| Fast random access | Fast insertion and deletion |
| Slower insertion in the middle | Faster insertion in the middle |
| Better for searching | Better for frequent modifications |

---

# 2. What is the difference between HashSet and LinkedHashSet?

**Answer:**

| HashSet | LinkedHashSet |
|----------|---------------|
| Does not maintain insertion order | Maintains insertion order |
| Faster | Slightly slower |
| Uses HashMap | Uses LinkedHashMap internally |

---

# 3. What is the difference between HashSet and TreeSet?

**Answer:**

| HashSet | TreeSet |
|----------|----------|
| No ordering | Sorted order |
| Faster | Slower |
| Uses HashMap | Uses TreeMap |

---

# 4. What is the difference between HashMap and LinkedHashMap?

**Answer:**

| HashMap | LinkedHashMap |
|----------|---------------|
| No insertion order | Maintains insertion order |
| Faster | Slightly slower |
| Uses hashing | Uses hashing + linked list |

---

# 5. What is the difference between HashMap and TreeMap?

**Answer:**

| HashMap | TreeMap |
|----------|----------|
| Unordered | Sorted |
| Allows one null key | Does not allow null keys |
| Faster | Slower |

---

# 6. What is the difference between HashMap and Hashtable?

**Answer:**

| HashMap | Hashtable |
|----------|-----------|
| Not synchronized | Synchronized |
| Allows one null key | Null keys not allowed |
| Allows null values | Null values not allowed |
| Faster | Slower |

---

# 7. Why is HashMap faster than Hashtable?

**Answer:**

HashMap is not synchronized, so it has less overhead and provides better performance.

---

# 8. Why does TreeSet store elements in sorted order?

**Answer:**

Because TreeSet internally uses a TreeMap, which stores elements according to their natural ordering.

---

# 9. Why does HashSet not allow duplicate elements?

**Answer:**

HashSet uses hashing and checks equality before inserting an element. Duplicate elements are ignored.

---

# 10. Which collection should be used when duplicate elements are required?

**Answer:**

List implementations such as:

- ArrayList
- LinkedList
- Vector

---

# 11. Which collection should be used for unique elements?

**Answer:**

Set implementations such as:

- HashSet
- LinkedHashSet
- TreeSet

---

# 12. Which collection is best for frequent insertion and deletion?

**Answer:**

LinkedList.

---

# 13. Which collection is best for fast random access?

**Answer:**

ArrayList.

---

# 14. Which collection automatically sorts elements?

**Answer:**

TreeSet and TreeMap.

---

# 15. What is the difference between Queue and Deque?

**Answer:**

Queue processes elements from one end, whereas Deque supports insertion and deletion from both ends.

---

# 16. What is the purpose of the Collections utility class?

**Answer:**

It provides predefined static methods such as:

- sort()
- reverse()
- shuffle()
- binarySearch()
- max()
- min()

---

# 17. Why should binarySearch() be used only on sorted collections?

**Answer:**

Binary Search works by repeatedly dividing a sorted collection into halves. It does not produce correct results on unsorted data.

---

# 18. What is the purpose of Iterator?

**Answer:**

Iterator is used to traverse collection elements one by one.

---

# 19. What is Enumeration?

**Answer:**

Enumeration is a legacy interface used for traversing Vector and Hashtable.

---

# 20. What is the difference between Iterator and Enumeration?

**Answer:**

| Iterator | Enumeration |
|-----------|-------------|
| Modern interface | Legacy interface |
| Supports remove() | Read-only traversal |
| Used with all collections | Mainly used with Vector and Hashtable |

---

# 21. What is the purpose of Wrapper Classes in Collections?

**Answer:**

Collections store objects, so Wrapper Classes allow primitive values to be stored as objects.

---

# 22. What is Autoboxing?

**Answer:**

Autoboxing is the automatic conversion of primitive data types into their corresponding Wrapper Objects.

---

# 23. What is Unboxing?

**Answer:**

Unboxing is the automatic conversion of Wrapper Objects back to primitive data types.

---

# 24. Which collection should be used for key-value pairs?

**Answer:**

Map implementations such as HashMap, LinkedHashMap, TreeMap, and Hashtable.

---

# 25. Why are Java Collections important?

**Answer:**

They provide reusable data structures, efficient algorithms, better performance, dynamic storage, and simplified programming.

---

# Quick Revision

| Topic | Best Choice |
|--------|-------------|
| Fast Random Access | ArrayList |
| Frequent Insert/Delete | LinkedList |
| Unique Elements | HashSet |
| Sorted Elements | TreeSet |
| Key-Value Storage | HashMap |
| Thread Safe Map | Hashtable |
| Utility Methods | Collections |
| Traversal | Iterator |

---

# Key Takeaways

- ArrayList is best for random access.
- LinkedList is best for frequent modifications.
- HashSet stores unique elements.
- TreeSet maintains sorted order.
- HashMap provides fast key-value storage.
- Collections provides utility algorithms.
- Iterator is preferred over Enumeration.
- These questions are commonly asked in Java developer interviews.

---

# Summary

Intermediate-level Java Collections interview questions focus on choosing the appropriate collection, understanding internal behavior, comparing implementations, and using utility methods effectively. Mastering these concepts is essential for cracking Java developer interviews and writing efficient Java applications.
