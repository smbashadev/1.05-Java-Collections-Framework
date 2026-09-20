# Methods of LinkedList

## Introduction

The **LinkedList** class provides a rich collection of predefined methods that simplify storing, accessing, inserting, updating, removing, and traversing elements.

Since LinkedList implements both the **List** and **Deque** interfaces, it offers methods for list operations as well as queue and double-ended queue (Deque) operations.

These built-in methods reduce programming effort, improve code readability, and help developers build efficient Java applications.

---

# Why are LinkedList Methods Important?

Without built-in methods, developers would need to manually implement operations such as:

- Adding elements
- Removing elements
- Updating values
- Searching elements
- Accessing first and last elements
- Traversing the list
- Clearing the list

LinkedList provides ready-made methods to perform all these operations efficiently.

---

# Commonly Used LinkedList Methods

| Method | Description |
|---------|-------------|
| add() | Adds an element to the end of the LinkedList |
| addFirst() | Inserts an element at the beginning |
| addLast() | Inserts an element at the end |
| get() | Retrieves an element using its index |
| getFirst() | Retrieves the first element |
| getLast() | Retrieves the last element |
| set() | Updates an existing element |
| remove() | Removes an element |
| removeFirst() | Removes the first element |
| removeLast() | Removes the last element |
| contains() | Checks whether an element exists |
| size() | Returns the number of elements |
| isEmpty() | Checks whether the LinkedList is empty |
| clear() | Removes all elements |
| indexOf() | Returns the first occurrence of an element |
| lastIndexOf() | Returns the last occurrence of an element |
| clone() | Creates a copy of the LinkedList |
| toArray() | Converts the LinkedList into an array |
| iterator() | Returns an Iterator for traversal |
| listIterator() | Returns a ListIterator for traversal |

---

# 1. add()

## Purpose

Adds an element to the end of the LinkedList.

### Syntax

```java
list.add(element);
```

---

# 2. addFirst()

## Purpose

Adds an element at the beginning.

### Syntax

```java
list.addFirst(element);
```

---

# 3. addLast()

## Purpose

Adds an element at the end.

### Syntax

```java
list.addLast(element);
```

---

# 4. get()

## Purpose

Retrieves an element using its index.

### Syntax

```java
list.get(index);
```

---

# 5. getFirst()

## Purpose

Returns the first element.

### Syntax

```java
list.getFirst();
```

---

# 6. getLast()

## Purpose

Returns the last element.

### Syntax

```java
list.getLast();
```

---

# 7. set()

## Purpose

Updates an existing element.

### Syntax

```java
list.set(index, element);
```

---

# 8. remove()

## Purpose

Removes an element by index or object.

### Syntax

```java
list.remove(index);
```

or

```java
list.remove(element);
```

---

# 9. removeFirst()

## Purpose

Removes the first element.

### Syntax

```java
list.removeFirst();
```

---

# 10. removeLast()

## Purpose

Removes the last element.

### Syntax

```java
list.removeLast();
```

---

# 11. contains()

## Purpose

Checks whether an element exists.

### Syntax

```java
list.contains(element);
```

---

# 12. size()

## Purpose

Returns the number of elements.

### Syntax

```java
list.size();
```

---

# 13. isEmpty()

## Purpose

Checks whether the LinkedList contains any elements.

### Syntax

```java
list.isEmpty();
```

---

# 14. clear()

## Purpose

Removes all elements.

### Syntax

```java
list.clear();
```

---

# 15. indexOf()

## Purpose

Returns the first occurrence of an element.

### Syntax

```java
list.indexOf(element);
```

---

# 16. lastIndexOf()

## Purpose

Returns the last occurrence of an element.

### Syntax

```java
list.lastIndexOf(element);
```

---

# 17. clone()

## Purpose

Creates a shallow copy of the LinkedList.

### Syntax

```java
list.clone();
```

---

# 18. toArray()

## Purpose

Converts the LinkedList into an array.

### Syntax

```java
list.toArray();
```

---

# 19. iterator()

## Purpose

Returns an Iterator for forward traversal.

### Syntax

```java
list.iterator();
```

---

# 20. listIterator()

## Purpose

Returns a ListIterator for both forward and backward traversal.

### Syntax

```java
list.listIterator();
```

---

# Method Categories

## Insertion Methods

- add()
- addFirst()
- addLast()

---

## Retrieval Methods

- get()
- getFirst()
- getLast()

---

## Update Methods

- set()

---

## Removal Methods

- remove()
- removeFirst()
- removeLast()
- clear()

---

## Search Methods

- contains()
- indexOf()
- lastIndexOf()

---

## Information Methods

- size()
- isEmpty()

---

## Conversion Methods

- clone()
- toArray()

---

## Traversal Methods

- iterator()
- listIterator()

---

# Real-World Example

Consider a **Browser History Application**.

| Requirement | Method |
|-------------|--------|
| Visit New Page | addLast() |
| Open First Saved Page | getFirst() |
| Open Latest Page | getLast() |
| Delete First Page | removeFirst() |
| Delete Latest Page | removeLast() |
| Search Page | contains() |
| Count Pages | size() |
| Clear History | clear() |

---

# Advantages of LinkedList Methods

- Easy to understand
- Rich API
- Simplifies coding
- Efficient insertion and deletion
- Supports List and Deque operations
- Improves code maintainability

---

# Frequently Asked Interview Questions

### 1. Which method adds an element to the beginning?

```java
addFirst()
```

---

### 2. Which method adds an element to the end?

```java
addLast()
```

---

### 3. Which method retrieves the first element?

```java
getFirst()
```

---

### 4. Which method retrieves the last element?

```java
getLast()
```

---

### 5. Which method removes the first element?

```java
removeFirst()
```

---

### 6. Which method removes the last element?

```java
removeLast()
```

---

### 7. Which method checks whether an element exists?

```java
contains()
```

---

### 8. Which method returns the size of a LinkedList?

```java
size()
```

---

### 9. Which method removes all elements?

```java
clear()
```

---

### 10. Which method supports bidirectional traversal?

```java
listIterator()
```

---

# Key Points

- LinkedList provides numerous built-in methods.
- It supports both List and Deque operations.
- It offers specialized methods such as addFirst(), addLast(), getFirst(), and getLast().
- Insertion and deletion operations are efficient.
- Understanding these methods is essential for Java programming and technical interviews.

---

# Summary

The LinkedList class provides a comprehensive collection of methods for insertion, retrieval, modification, deletion, searching, conversion, and traversal of elements. Since it implements both the List and Deque interfaces, it supports additional operations such as adding and removing elements from both ends of the list. Mastering these methods enables developers to build efficient Java applications and strengthens their preparation for Java technical interviews.
