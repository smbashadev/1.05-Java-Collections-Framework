# ArrayDeque Interview Questions

## Introduction

**ArrayDeque** is one of the most efficient classes in the **Java Collections Framework**. It implements the **Deque** interface and internally uses a **resizable circular array**. It supports operations at both the front and rear of the collection, making it suitable for implementing both **Queue** and **Stack**.

This document contains beginner-friendly and interview-oriented questions that are frequently asked in Java technical interviews.

---

# Basic Interview Questions

## 1. What is ArrayDeque?

**Answer:**

ArrayDeque is a class in the Java Collections Framework that implements the **Deque** interface using a resizable circular array.

---

## 2. In which package is ArrayDeque available?

**Answer:**

```java
java.util
```

---

## 3. Which interface does ArrayDeque implement?

**Answer:**

Deque.

---

## 4. Which data structure is used internally?

**Answer:**

A resizable circular array.

---

## 5. Does ArrayDeque maintain insertion order?

**Answer:**

Yes.

---

## 6. Does ArrayDeque allow duplicate elements?

**Answer:**

Yes.

---

## 7. Does ArrayDeque allow null values?

**Answer:**

No.

Attempting to insert a null element throws a **NullPointerException**.

---

## 8. Is ArrayDeque synchronized?

**Answer:**

No.

---

## 9. Is ArrayDeque thread-safe?

**Answer:**

No.

External synchronization is required when multiple threads modify the same deque.

---

## 10. Is ArrayDeque dynamically resizable?

**Answer:**

Yes.

Its internal array automatically grows when needed.

---

# Method-Based Questions

## 11. Which method adds an element at the front?

**Answer:**

```java
addFirst()
```

---

## 12. Which method adds an element at the rear?

**Answer:**

```java
addLast()
```

---

## 13. Which method safely inserts an element at the front?

**Answer:**

```java
offerFirst()
```

---

## 14. Which method safely inserts an element at the rear?

**Answer:**

```java
offerLast()
```

---

## 15. Which method removes the first element?

**Answer:**

```java
removeFirst()
```

---

## 16. Which method removes the last element?

**Answer:**

```java
removeLast()
```

---

## 17. Which method safely removes the first element?

**Answer:**

```java
pollFirst()
```

---

## 18. Which method safely removes the last element?

**Answer:**

```java
pollLast()
```

---

## 19. Which method retrieves the first element?

**Answer:**

```java
getFirst()
```

or

```java
peekFirst()
```

---

## 20. Which method retrieves the last element?

**Answer:**

```java
getLast()
```

or

```java
peekLast()
```

---

## 21. Which method checks whether the deque contains an element?

**Answer:**

```java
contains()
```

---

## 22. Which method returns the number of elements?

**Answer:**

```java
size()
```

---

## 23. Which method removes all elements?

**Answer:**

```java
clear()
```

---

## 24. Which method checks whether the deque is empty?

**Answer:**

```java
isEmpty()
```

---

# Stack-Based Questions

## 25. Can ArrayDeque be used as a Stack?

**Answer:**

Yes.

---

## 26. Which method pushes an element onto the stack?

**Answer:**

```java
push()
```

---

## 27. Which method removes the top stack element?

**Answer:**

```java
pop()
```

---

## 28. Which method views the top stack element without removing it?

**Answer:**

```java
peek()
```

---

# Performance Questions

## 29. Why is ArrayDeque faster than Stack?

**Answer:**

Because it is not synchronized and internally uses a resizable circular array.

---

## 30. Why is ArrayDeque faster than LinkedList for most Deque operations?

**Answer:**

Because it stores elements in a contiguous array, reducing memory overhead and improving cache performance.

---

## 31. Is random index access supported?

**Answer:**

No.

---

## 32. Does ArrayDeque automatically increase its capacity?

**Answer:**

Yes.

---

# Comparison Questions

## 33. Which is preferred for Stack implementation?

**Answer:**

ArrayDeque.

---

## 34. Which class is considered a legacy Stack implementation?

**Answer:**

Stack.

---

## 35. Which consumes less memory in most cases?

**Answer:**

ArrayDeque.

---

# Scenario-Based Questions

## 36. When should ArrayDeque be used?

**Answer:**

Use ArrayDeque when:

- Fast insertion and deletion are required.
- Queue operations are needed.
- Stack operations are needed.
- Double-ended access is required.

---

## 37. When should ArrayDeque be avoided?

**Answer:**

Avoid ArrayDeque when:

- Null values must be stored.
- Thread safety is required.
- Random index access is needed.

---

## 38. Why doesn't ArrayDeque allow null values?

**Answer:**

Because null is used internally to indicate an empty deque during certain operations.

---

## 39. Why is ArrayDeque recommended over Stack?

**Answer:**

Because it provides better performance and is part of the modern Java Collections Framework.

---

## 40. Can elements be inserted and removed from both ends?

**Answer:**

Yes.

This is the primary purpose of the Deque interface.

---

# Frequently Asked MNC Interview Questions

### Q1. Which interface is implemented by ArrayDeque?

**Answer:** Deque.

---

### Q2. Which data structure is used internally?

**Answer:** Resizable circular array.

---

### Q3. Does ArrayDeque allow duplicate elements?

**Answer:** Yes.

---

### Q4. Does ArrayDeque allow null values?

**Answer:** No.

---

### Q5. What is the biggest advantage of ArrayDeque?

**Answer:** Fast insertion and deletion at both ends with better performance than Stack.

---

# Quick Revision Table

| Topic | Key Point |
|--------|-----------|
| Package | java.util |
| Interface | Deque |
| Internal Structure | Resizable Circular Array |
| Dynamic Size | Yes |
| Duplicates | Allowed |
| Null Values | Not Allowed |
| Thread Safe | No |
| Queue Support | Yes |
| Stack Support | Yes |
| Random Access | No |
| Best Use | Queue & Stack Implementation |

---

# Key Takeaways

- ArrayDeque implements the Deque interface.
- Internally uses a resizable circular array.
- Supports Queue and Stack operations.
- Allows duplicate elements.
- Does not allow null values.
- Dynamic in size.
- Not synchronized.
- Faster than the legacy Stack class.
- Suitable for high-performance Queue and Stack implementations.

---

# Summary

ArrayDeque is a modern, high-performance implementation of the Deque interface. It provides efficient insertion, deletion, and retrieval operations at both ends while supporting both Queue and Stack functionality. Its internal resizable circular array, dynamic resizing, and superior performance make it the preferred choice over the legacy Stack class. Mastering ArrayDeque concepts, methods, performance characteristics, and interview questions is essential for Java Collections Framework learning and technical interview preparation.
