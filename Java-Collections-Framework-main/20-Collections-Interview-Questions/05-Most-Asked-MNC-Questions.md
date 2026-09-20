# Java Collections Framework - Most Asked MNC Interview Questions

## Introduction

The Java Collections Framework (JCF) is one of the most important topics in Java technical interviews. Almost every MNC and product-based company asks multiple questions related to collections because they test a candidate's understanding of data structures, algorithms, performance, and real-world problem-solving.

This document contains some of the most frequently asked Java Collections Framework interview questions in companies such as TCS, Infosys, Wipro, Accenture, Cognizant, Capgemini, IBM, Deloitte, HCL, Tech Mahindra, Oracle, Amazon, Microsoft, Google, Adobe, SAP, ServiceNow, VMware, Flipkart, Walmart Global Tech, Zoho, and many other organizations.

---

# 1. What is the Java Collections Framework?

**Answer:**

The Java Collections Framework (JCF) is a set of interfaces, classes, and utility methods used to store, manipulate, and process groups of objects efficiently.

---

# 2. What is the difference between Collection and Collections?

**Answer:**

| Collection | Collections |
|------------|-------------|
| Interface | Utility Class |
| Stores objects | Performs operations on collections |
| Contains instance methods | Contains static methods |

---

# 3. What is the difference between ArrayList and LinkedList?

**Answer:**

| ArrayList | LinkedList |
|-----------|------------|
| Dynamic Array | Doubly Linked List |
| Fast Random Access | Fast Insert/Delete |
| Slower Insert/Delete | Faster Insert/Delete |

---

# 4. What is the difference between HashSet and TreeSet?

**Answer:**

| HashSet | TreeSet |
|----------|----------|
| No Order | Sorted Order |
| Faster | Slower |
| Uses Hashing | Uses Tree Structure |

---

# 5. What is the difference between HashMap and Hashtable?

**Answer:**

| HashMap | Hashtable |
|----------|-----------|
| Not Synchronized | Synchronized |
| Allows One Null Key | No Null Key |
| Allows Null Values | No Null Values |
| Faster | Slower |

---

# 6. How does HashMap work internally?

**Answer:**

- Computes the hash code of the key.
- Determines the bucket index.
- Stores key-value pairs in buckets.
- Handles collisions when multiple keys map to the same bucket.
- Retrieves values using hashing.

---

# 7. What is Hashing?

**Answer:**

Hashing is the process of converting a key into a bucket index for efficient storage and retrieval.

---

# 8. What is Collision?

**Answer:**

A collision occurs when two different keys produce the same bucket index.

---

# 9. What is Load Factor?

**Answer:**

Load Factor determines when a HashMap should resize.

Default value:

```
0.75
```

---

# 10. What is Rehashing?

**Answer:**

Rehashing is the process of increasing the size of the hash table and redistributing existing entries.

---

# 11. Why is HashMap faster than Hashtable?

**Answer:**

HashMap is not synchronized, resulting in lower overhead and better performance.

---

# 12. Why is TreeSet sorted?

**Answer:**

TreeSet internally uses TreeMap, which stores elements in sorted order.

---

# 13. What is the difference between Comparable and Comparator?

**Answer:**

| Comparable | Comparator |
|------------|------------|
| compareTo() | compare() |
| Natural Sorting | Custom Sorting |
| Inside Class | Separate Class |

---

# 14. What is Fail-Fast Iterator?

**Answer:**

A Fail-Fast Iterator throws a `ConcurrentModificationException` if a collection is structurally modified during iteration.

---

# 15. What is Fail-Safe Iterator?

**Answer:**

A Fail-Safe Iterator works on a copy of the collection and does not throw `ConcurrentModificationException`.

---

# 16. Which collection is best for fast random access?

**Answer:**

ArrayList.

---

# 17. Which collection is best for frequent insertion and deletion?

**Answer:**

LinkedList.

---

# 18. Which collection stores unique elements?

**Answer:**

HashSet.

---

# 19. Which collection stores sorted unique elements?

**Answer:**

TreeSet.

---

# 20. Which collection stores key-value pairs?

**Answer:**

Map implementations such as:

- HashMap
- LinkedHashMap
- TreeMap
- Hashtable

---

# 21. Which collection maintains insertion order?

**Answer:**

- ArrayList
- LinkedList
- LinkedHashSet
- LinkedHashMap

---

# 22. Which collection automatically sorts elements?

**Answer:**

- TreeSet
- TreeMap

---

# 23. Which collection should be used for FIFO processing?

**Answer:**

Queue.

---

# 24. Which collection should be used for LIFO processing?

**Answer:**

Stack.

---

# 25. Which class provides utility methods like sort(), reverse(), and binarySearch()?

**Answer:**

Collections.

---

# 26. What is the root interface of the Java Collections Framework?

**Answer:**

Collection.

---

# 27. Is Map a child of Collection?

**Answer:**

No.

Map belongs to a separate hierarchy.

---

# 28. Which collection classes are synchronized?

**Answer:**

- Vector
- Stack
- Hashtable

---

# 29. What is the default capacity of ArrayList?

**Answer:**

10.

---

# 30. What is the default capacity of Vector?

**Answer:**

10.

---

# Quick Revision

| Interview Topic | Key Answer |
|-----------------|------------|
| Root Interface | Collection |
| Parent Interface | Iterable |
| Utility Class | Collections |
| Fast Random Access | ArrayList |
| Frequent Insert/Delete | LinkedList |
| Unique Elements | HashSet |
| Sorted Elements | TreeSet |
| Fast Key-Value Lookup | HashMap |
| Ordered Key-Value Storage | LinkedHashMap |
| Sorted Key-Value Storage | TreeMap |
| FIFO | Queue |
| LIFO | Stack |
| Default Load Factor | 0.75 |
| Default ArrayList Capacity | 10 |
| Default Vector Capacity | 10 |

---

# Key Takeaways

- Java Collections Framework is one of the highest-weightage Java interview topics.
- HashMap, ArrayList, LinkedList, HashSet, TreeSet, and TreeMap are frequently discussed in interviews.
- Understanding internal working, performance, ordering, synchronization, and hashing is essential.
- Scenario-based and comparison questions are very common in MNC interviews.
- Strong knowledge of Collections significantly improves Java interview performance.

---

# Summary

The Java Collections Framework is a core component of Java programming and an essential topic for technical interviews. Mastering the concepts of Collection interfaces, implementation classes, hashing, ordering, utility algorithms, and performance characteristics enables developers to solve real-world problems efficiently and confidently answer interview questions asked by service-based and product-based companies.
