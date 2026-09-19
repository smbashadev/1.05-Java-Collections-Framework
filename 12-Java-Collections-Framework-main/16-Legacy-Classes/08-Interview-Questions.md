# Legacy Classes Interview Questions and Answers

## Introduction

Legacy Classes are an important topic in Java interviews because they explain how collections were implemented before the Java Collections Framework (JCF). Although modern Java applications primarily use the Collections Framework, Legacy Classes are still available for backward compatibility and are frequently discussed in technical interviews.

This document contains commonly asked interview questions with simple and beginner-friendly answers.

---

# 1. What are Legacy Classes in Java?

**Answer:**

Legacy Classes are the collection classes that existed before the Java Collections Framework (Java 1.2) and were later integrated into the framework for backward compatibility.

---

# 2. Name the commonly used Legacy Classes.

**Answer:**

- Vector
- Stack
- Hashtable
- Dictionary
- Enumeration

---

# 3. In which package are Legacy Classes available?

**Answer:**

```java
java.util
```

---

# 4. What is Vector?

**Answer:**

Vector is a synchronized, dynamically resizable array that implements the List interface.

---

# 5. Is Vector synchronized?

**Answer:**

Yes.

Vector is synchronized and thread-safe.

---

# 6. What is the default capacity of Vector?

**Answer:**

10 elements.

---

# 7. What is Stack?

**Answer:**

Stack is a Legacy Class that follows the **LIFO (Last In First Out)** principle.

---

# 8. Which class does Stack extend?

**Answer:**

```java
Vector
```

---

# 9. What are the commonly used Stack methods?

**Answer:**

- `push()`
- `pop()`
- `peek()`
- `search()`
- `empty()`

---

# 10. What is Hashtable?

**Answer:**

Hashtable is a synchronized collection class that stores data as key-value pairs.

---

# 11. Does Hashtable allow duplicate keys?

**Answer:**

No.

Keys must be unique.

---

# 12. Does Hashtable allow duplicate values?

**Answer:**

Yes.

---

# 13. Does Hashtable allow null keys?

**Answer:**

No.

---

# 14. Does Hashtable allow null values?

**Answer:**

No.

---

# 15. What is Dictionary?

**Answer:**

Dictionary is an abstract Legacy Class used to store key-value pairs.

---

# 16. Can Dictionary be instantiated directly?

**Answer:**

No.

Dictionary is an abstract class.

---

# 17. Which class extends Dictionary?

**Answer:**

```java
Hashtable
```

---

# 18. What is Enumeration?

**Answer:**

Enumeration is a legacy interface used to traverse elements of legacy collections.

---

# 19. Which methods are available in Enumeration?

**Answer:**

- `hasMoreElements()`
- `nextElement()`

---

# 20. Can Enumeration remove elements?

**Answer:**

No.

Enumeration supports only read-only traversal.

---

# 21. Which interface replaced Enumeration?

**Answer:**

Iterator.

---

# 22. Which collection classes commonly use Enumeration?

**Answer:**

- Vector
- Hashtable

---

# 23. Why are Legacy Classes slower than modern collections?

**Answer:**

Because most Legacy Classes are synchronized, which introduces additional overhead.

---

# 24. Are Legacy Classes still supported?

**Answer:**

Yes.

They are maintained for backward compatibility.

---

# 25. Which collection classes are preferred in modern Java?

**Answer:**

- ArrayList
- LinkedList
- HashMap
- LinkedHashMap
- TreeMap
- HashSet
- LinkedHashSet
- TreeSet
- ArrayDeque

---

# Comparison Table

| Feature | Legacy Classes | Modern Collections |
|---------|----------------|-------------------|
| Introduced | Before Java 1.2 | Java 1.2 |
| Synchronization | Mostly Yes | Mostly No |
| Performance | Slower | Faster |
| Thread Safety | Built-in | Optional |
| Preferred Today | Rarely | Yes |
| Examples | Vector, Stack, Hashtable | ArrayList, HashMap, TreeMap |

---

# Quick Revision

| Question | Answer |
|----------|--------|
| Package | java.util |
| Vector Default Capacity | 10 |
| Stack Principle | LIFO |
| Hashtable Null Key | Not Allowed |
| Hashtable Null Value | Not Allowed |
| Dictionary Type | Abstract Class |
| Enumeration Methods | hasMoreElements(), nextElement() |
| Enumeration Replacement | Iterator |
| Thread Safe | Most Legacy Classes |

---

# Key Takeaways

- Legacy Classes existed before the Java Collections Framework.
- Vector is a synchronized dynamic array.
- Stack follows the LIFO principle.
- Hashtable stores synchronized key-value pairs.
- Dictionary is an abstract class.
- Enumeration is a read-only traversal interface.
- Modern Java applications prefer the Collections Framework.
- Legacy Classes are important for interviews and maintaining older applications.

---

# Summary

Legacy Classes form the foundation of Java's original collection architecture. While modern Java development relies on the Java Collections Framework, understanding Legacy Classes such as Vector, Stack, Hashtable, Dictionary, and Enumeration is essential for maintaining older applications and performing well in Java technical interviews.
