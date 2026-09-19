# Frequently Asked Questions (FAQ)

Welcome to the **Frequently Asked Questions (FAQ)** section of the **Java Collections Framework** repository.

This document answers some of the most common questions asked by students, beginners, job seekers, and Java developers while learning the Java Collections Framework.

---

# Table of Contents

- General Questions
- Collection Interfaces
- List
- Set
- Queue
- Map
- Wrapper Classes
- Collections Utility Class
- Performance
- Interview Preparation
- Repository Questions

---

# General Questions

## 1. What is the Java Collections Framework?

The Java Collections Framework (JCF) is a unified architecture consisting of interfaces, implementation classes, and utility methods used to store, organize, manipulate, and process groups of objects efficiently.

---

## 2. Why should I learn Java Collections?

Java Collections are one of the most frequently used features in Java applications.

Learning Collections helps you:

- Write efficient Java programs.
- Store and process data effectively.
- Crack Java technical interviews.
- Understand advanced Java frameworks such as Spring and Hibernate.

---

## 3. Is this repository beginner-friendly?

Yes.

The repository is designed for:

- Beginners
- College students
- Freshers
- Java developers
- Interview preparation

Each topic is explained step by step using simple language and practical examples.

---

## 4. Are all examples written in Java?

Yes.

Every source code example in this repository is written in Java.

---

## Collection Interfaces

## 5. What is the root interface of the Collections Framework?

The root interface is:

```
Collection
```

---

## 6. Is Map part of the Collection interface?

No.

Map belongs to a separate hierarchy because it stores key-value pairs instead of individual elements.

---

## 7. What are the major Collection interfaces?

- Collection
- List
- Set
- Queue
- Deque

---

# List

## 8. When should I use ArrayList?

Use ArrayList when:

- Fast random access is required.
- Duplicate elements are allowed.
- Frequent reading operations are performed.

---

## 9. When should I use LinkedList?

Use LinkedList when:

- Frequent insertion is required.
- Frequent deletion is required.
- Random access is not the primary requirement.

---

# Set

## 10. Which Set implementation stores unique elements?

All Set implementations store unique elements.

Common implementations include:

- HashSet
- LinkedHashSet
- TreeSet

---

## 11. Which Set maintains insertion order?

LinkedHashSet.

---

## 12. Which Set stores sorted elements?

TreeSet.

---

# Queue

## 13. What is the difference between Queue and Deque?

Queue supports insertion and deletion from one end, whereas Deque supports operations from both ends.

---

## 14. When should I use PriorityQueue?

Use PriorityQueue when elements need to be processed based on priority rather than insertion order.

---

# Map

## 15. Which Map implementation provides the fastest lookup?

HashMap.

---

## 16. Which Map maintains insertion order?

LinkedHashMap.

---

## 17. Which Map keeps keys sorted?

TreeMap.

---

## 18. Which Map is synchronized?

Hashtable.

---

# Wrapper Classes

## 19. Why are Wrapper Classes needed?

Collections store objects rather than primitive data types.

Wrapper Classes allow primitive values to be stored as objects.

---

## 20. What are Autoboxing and Unboxing?

- Autoboxing is the automatic conversion of primitive values into Wrapper Objects.
- Unboxing is the automatic conversion of Wrapper Objects back into primitive values.

---

# Collections Utility Class

## 21. What is the Collections class?

Collections is a utility class that provides static methods for performing operations on collections.

Common methods include:

- sort()
- reverse()
- shuffle()
- binarySearch()
- max()
- min()

---

# Performance

## 22. Which collection is best for random access?

ArrayList.

---

## 23. Which collection is best for frequent insertion and deletion?

LinkedList.

---

## 24. Which collection automatically sorts data?

TreeSet and TreeMap.

---

## 25. Which collection should I use for key-value pairs?

Use Map implementations such as:

- HashMap
- LinkedHashMap
- TreeMap
- Hashtable

---

# Interview Preparation

## 26. Is Java Collections important for interviews?

Yes.

Java Collections Framework is one of the most frequently asked topics in Java technical interviews for both service-based and product-based companies.

---

## 27. Which topics should I revise before an interview?

Focus on:

- Collection Hierarchy
- List
- Set
- Queue
- Map
- HashMap Internals
- Hashing
- Load Factor
- Rehashing
- Comparable vs Comparator
- Iterator
- Collections Utility Class
- Time Complexity

---

## 28. Are interview questions included in this repository?

Yes.

The repository includes:

- Beginner-Level Questions
- Intermediate-Level Questions
- Advanced-Level Questions
- Scenario-Based Questions
- Most Asked MNC Questions

---

# Repository Questions

## 29. Can I contribute to this repository?

Yes.

Please read **CONTRIBUTING.md** before submitting contributions.

---

## 30. Under which license is this repository released?

This repository is distributed under the **MIT License**.

Please refer to the **LICENSE** file for complete details.

---

# Quick Revision

| Question | Answer |
|----------|--------|
| Root Interface | Collection |
| Fast Random Access | ArrayList |
| Frequent Insert/Delete | LinkedList |
| Unique Elements | HashSet |
| Sorted Elements | TreeSet |
| Fast Lookup | HashMap |
| Ordered Map | LinkedHashMap |
| Sorted Map | TreeMap |
| Synchronized Map | Hashtable |
| Utility Class | Collections |

---

# Need More Help?

If your question is not answered here:

- Check the README.
- Explore the relevant topic folder.
- Open a GitHub Issue.
- Submit a discussion or suggestion.

---

# Conclusion

This FAQ is intended to provide quick answers to the most common Java Collections Framework questions.

As the repository grows, this document will continue to be updated with additional questions, explanations, and interview-focused guidance.

Happy Learning and Keep Coding!
