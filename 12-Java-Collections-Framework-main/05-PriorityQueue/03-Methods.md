# PriorityQueue Methods

## Introduction

The **PriorityQueue** class provides several methods to insert, remove, retrieve, and examine elements based on their priority. Since it implements the **Queue** interface, it supports standard queue operations while automatically maintaining the priority order of elements.

Understanding these methods is essential for Java programming and technical interviews.

---

# Categories of PriorityQueue Methods

PriorityQueue methods can be grouped into the following categories:

- Insertion Methods
- Removal Methods
- Retrieval Methods
- Utility Methods

---

# 1. Insertion Methods

## add()

Adds an element to the PriorityQueue.

### Syntax

```java
add(element);
```

---

## offer()

Inserts an element into the PriorityQueue.

Returns **true** if the element is successfully inserted.

### Syntax

```java
offer(element);
```

---

# 2. Removal Methods

## remove()

Removes and returns the head element.

Throws an exception if the queue is empty.

### Syntax

```java
remove();
```

---

## poll()

Removes and returns the head element.

Returns **null** if the queue is empty.

### Syntax

```java
poll();
```

---

# 3. Retrieval Methods

## element()

Returns the head element without removing it.

Throws an exception if the queue is empty.

### Syntax

```java
element();
```

---

## peek()

Returns the head element without removing it.

Returns **null** if the queue is empty.

### Syntax

```java
peek();
```

---

# 4. Utility Methods

## size()

Returns the number of elements present in the PriorityQueue.

### Syntax

```java
size();
```

---

## isEmpty()

Checks whether the PriorityQueue is empty.

### Syntax

```java
isEmpty();
```

---

## clear()

Removes all elements from the PriorityQueue.

### Syntax

```java
clear();
```

---

## contains()

Checks whether the specified element exists.

### Syntax

```java
contains(element);
```

---

# Frequently Used Methods

| Method | Purpose |
|---------|---------|
| add() | Adds an element |
| offer() | Inserts an element |
| remove() | Removes the head element |
| poll() | Removes the head element safely |
| element() | Retrieves the head element |
| peek() | Retrieves the head element safely |
| size() | Returns the number of elements |
| isEmpty() | Checks whether the queue is empty |
| clear() | Removes all elements |
| contains() | Checks whether an element exists |

---

# Difference Between Similar Methods

| Method Pair | Difference |
|-------------|------------|
| add() vs offer() | Both insert elements, but offer() returns false instead of throwing an exception when insertion fails. |
| remove() vs poll() | remove() throws an exception if the queue is empty, whereas poll() returns null. |
| element() vs peek() | element() throws an exception if the queue is empty, whereas peek() returns null. |

---

# Frequently Asked Interview Questions

### 1. Which method inserts an element into a PriorityQueue?

**Answer:**

```java
add()
```

or

```java
offer()
```

---

### 2. Which method removes the head element?

**Answer:**

```java
remove()
```

or

```java
poll()
```

---

### 3. Which method safely removes the head element?

**Answer:**

```java
poll()
```

---

### 4. Which method retrieves the head element?

**Answer:**

```java
element()
```

or

```java
peek()
```

---

### 5. Which method safely retrieves the head element?

**Answer:**

```java
peek()
```

---

### 6. Which method returns the number of elements?

**Answer:**

```java
size()
```

---

### 7. Which method checks whether the queue is empty?

**Answer:**

```java
isEmpty()
```

---

### 8. Which method removes all elements?

**Answer:**

```java
clear()
```

---

### 9. Which method checks whether an element exists?

**Answer:**

```java
contains()
```

---

### 10. Which methods throw exceptions when the queue is empty?

**Answer:**

```java
remove()
element()
```

---

# Key Takeaways

- PriorityQueue provides insertion, removal, retrieval, and utility methods.
- `add()` and `offer()` are used to insert elements.
- `remove()` and `poll()` remove the head element.
- `element()` and `peek()` retrieve the head element.
- `poll()` and `peek()` are safer because they return `null` instead of throwing exceptions.
- Understanding these methods is essential for Java Collections Framework interviews.

---

# Summary

PriorityQueue provides a rich set of methods for efficiently managing elements according to their priority. These methods support insertion, removal, retrieval, and utility operations while maintaining the heap structure internally. Learning these methods helps developers write efficient Java programs and confidently answer Java Collections Framework interview questions.
