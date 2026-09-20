# ArrayDeque Methods

## Introduction

The **ArrayDeque** class provides numerous methods to insert, remove, retrieve, and examine elements from both the front and rear of the deque. Since it implements the **Deque** interface, it supports operations as both a **Queue** and a **Stack**.

Understanding these methods is essential for Java programming and technical interviews.

---

# Categories of ArrayDeque Methods

ArrayDeque methods can be grouped into the following categories:

- Insertion Methods
- Removal Methods
- Retrieval Methods
- Utility Methods
- Stack Methods

---

# 1. Insertion Methods

## add()

Adds an element at the rear of the deque.

### Syntax

```java
add(element);
```

---

## offer()

Inserts an element at the rear.

### Syntax

```java
offer(element);
```

---

## addFirst()

Adds an element at the front.

### Syntax

```java
addFirst(element);
```

---

## addLast()

Adds an element at the rear.

### Syntax

```java
addLast(element);
```

---

## offerFirst()

Inserts an element at the front.

### Syntax

```java
offerFirst(element);
```

---

## offerLast()

Inserts an element at the rear.

### Syntax

```java
offerLast(element);
```

---

# 2. Removal Methods

## remove()

Removes the first element.

### Syntax

```java
remove();
```

---

## poll()

Removes and returns the first element.

Returns **null** if the deque is empty.

### Syntax

```java
poll();
```

---

## removeFirst()

Removes the first element.

### Syntax

```java
removeFirst();
```

---

## removeLast()

Removes the last element.

### Syntax

```java
removeLast();
```

---

## pollFirst()

Removes and returns the first element.

Returns **null** if empty.

### Syntax

```java
pollFirst();
```

---

## pollLast()

Removes and returns the last element.

Returns **null** if empty.

### Syntax

```java
pollLast();
```

---

# 3. Retrieval Methods

## getFirst()

Returns the first element.

### Syntax

```java
getFirst();
```

---

## getLast()

Returns the last element.

### Syntax

```java
getLast();
```

---

## peek()

Returns the first element without removing it.

Returns **null** if empty.

### Syntax

```java
peek();
```

---

## peekFirst()

Returns the first element.

### Syntax

```java
peekFirst();
```

---

## peekLast()

Returns the last element.

### Syntax

```java
peekLast();
```

---

# 4. Utility Methods

## size()

Returns the number of elements.

### Syntax

```java
size();
```

---

## isEmpty()

Checks whether the deque is empty.

### Syntax

```java
isEmpty();
```

---

## clear()

Removes all elements.

### Syntax

```java
clear();
```

---

## contains()

Checks whether a specified element exists.

### Syntax

```java
contains(element);
```

---

# 5. Stack Methods

ArrayDeque can also be used as a Stack.

## push()

Adds an element to the top of the stack.

### Syntax

```java
push(element);
```

---

## pop()

Removes and returns the top element.

### Syntax

```java
pop();
```

---

## peek()

Returns the top element without removing it.

### Syntax

```java
peek();
```

---

# Frequently Used Methods

| Method | Purpose |
|---------|---------|
| add() | Adds element at rear |
| offer() | Inserts element at rear |
| addFirst() | Adds element at front |
| addLast() | Adds element at rear |
| remove() | Removes first element |
| poll() | Removes first element safely |
| getFirst() | Retrieves first element |
| getLast() | Retrieves last element |
| peek() | Retrieves first element without removal |
| push() | Pushes element onto stack |
| pop() | Removes top stack element |
| size() | Returns number of elements |
| isEmpty() | Checks whether deque is empty |
| clear() | Removes all elements |
| contains() | Checks for an element |

---

# Frequently Asked Interview Questions

### 1. Which method adds an element at the front?

**Answer:** `addFirst()`

---

### 2. Which method adds an element at the rear?

**Answer:** `addLast()`

---

### 3. Which method retrieves the first element?

**Answer:** `getFirst()` or `peekFirst()`

---

### 4. Which method retrieves the last element?

**Answer:** `getLast()` or `peekLast()`

---

### 5. Which method removes the first element safely?

**Answer:** `poll()`

---

### 6. Which method removes the last element?

**Answer:** `removeLast()` or `pollLast()`

---

### 7. Which method checks whether the deque is empty?

**Answer:** `isEmpty()`

---

### 8. Which method returns the number of elements?

**Answer:** `size()`

---

### 9. Which methods are used for stack operations?

**Answer:** `push()`, `pop()`, and `peek()`

---

### 10. Which method removes all elements?

**Answer:** `clear()`

---

# Key Takeaways

- ArrayDeque supports both Queue and Stack operations.
- Methods are available for insertion, removal, retrieval, and utility operations.
- It provides efficient operations at both the front and rear.
- `poll()` and `peek()` are safer alternatives because they return `null` instead of throwing an exception when the deque is empty.
- ArrayDeque is the recommended replacement for the legacy Stack class.

---

# Summary

ArrayDeque provides a rich set of methods for efficiently managing elements from both ends of a collection. It supports Queue and Stack operations through dedicated insertion, removal, retrieval, and utility methods. Learning these methods is essential for writing efficient Java programs and performing well in Java Collections Framework interviews.
