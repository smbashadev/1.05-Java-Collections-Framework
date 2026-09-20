# LinkedHashSet Methods

## Introduction

The **LinkedHashSet** class provides several methods to add, remove, search, and manipulate unique elements while preserving their insertion order. Since LinkedHashSet internally uses a **LinkedHashMap**, it provides efficient performance along with predictable iteration order.

Understanding these methods is essential for Java programming and technical interviews.

---

# Categories of LinkedHashSet Methods

LinkedHashSet methods can be grouped into the following categories:

- Insertion Methods
- Removal Methods
- Search Methods
- Utility Methods
- Traversal Methods

---

# 1. Insertion Methods

## add()

Adds an element to the LinkedHashSet.

If the element already exists, it is ignored.

### Syntax

```java
add(element);
```

### Example

```java
LinkedHashSet set = new LinkedHashSet();

set.add(10);
set.add(20);
set.add(10);

System.out.println(set);
```

### Output

```text
[10, 20]
```

---

# 2. Removal Methods

## remove()

Removes the specified element from the LinkedHashSet.

Returns **true** if the element is removed successfully.

### Syntax

```java
remove(element);
```

---

## clear()

Removes all elements from the LinkedHashSet.

### Syntax

```java
clear();
```

---

# 3. Search Methods

## contains()

Checks whether the specified element exists.

Returns **true** if the element is found.

### Syntax

```java
contains(element);
```

---

# 4. Utility Methods

## size()

Returns the number of elements present in the LinkedHashSet.

### Syntax

```java
size();
```

---

## isEmpty()

Checks whether the LinkedHashSet is empty.

### Syntax

```java
isEmpty();
```

---

# 5. Traversal Methods

## iterator()

Returns an Iterator for traversing the LinkedHashSet.

### Syntax

```java
iterator();
```

---

## enhanced for-each loop

Traverses all elements while maintaining insertion order.

### Syntax

```java
for (Object obj : set)
{
    // statements
}
```

---

# Frequently Used Methods

| Method | Purpose |
|---------|---------|
| add() | Adds an element |
| remove() | Removes an element |
| contains() | Checks whether an element exists |
| size() | Returns the number of elements |
| isEmpty() | Checks whether the LinkedHashSet is empty |
| clear() | Removes all elements |
| iterator() | Traverses the LinkedHashSet |

---

# Time Complexity

| Method | Average Time Complexity |
|---------|------------------------|
| add() | O(1) |
| remove() | O(1) |
| contains() | O(1) |
| size() | O(1) |
| isEmpty() | O(1) |
| clear() | O(n) |

---

# Frequently Asked Interview Questions

### 1. Which method inserts an element into a LinkedHashSet?

**Answer:**

```java
add()
```

---

### 2. Which method removes an element?

**Answer:**

```java
remove()
```

---

### 3. Which method removes all elements?

**Answer:**

```java
clear()
```

---

### 4. Which method checks whether an element exists?

**Answer:**

```java
contains()
```

---

### 5. Which method returns the number of elements?

**Answer:**

```java
size()
```

---

### 6. Which method checks whether the LinkedHashSet is empty?

**Answer:**

```java
isEmpty()
```

---

### 7. Which method is used to traverse a LinkedHashSet?

**Answer:**

```java
iterator()
```

or

```java
Enhanced for-each loop
```

---

### 8. Which method automatically ignores duplicate elements?

**Answer:**

```java
add()
```

---

### 9. Which method returns a boolean value after removing an element?

**Answer:**

```java
remove()
```

---

### 10. Which methods are most frequently used in Java projects?

**Answer:**

```java
add()
remove()
contains()
size()
isEmpty()
iterator()
clear()
```

---

# Key Takeaways

- LinkedHashSet provides methods for insertion, deletion, searching, traversal, and utility operations.
- `add()` inserts only unique elements.
- `remove()` deletes a specified element.
- `contains()` checks whether an element exists.
- `iterator()` and the enhanced for-each loop preserve insertion order during traversal.
- Most operations have an average time complexity of **O(1)**.
- These methods are frequently asked in Java Collections Framework interviews.

---

# Summary

LinkedHashSet provides a simple and efficient set of methods for managing unique elements while preserving insertion order. By internally using a LinkedHashMap, it combines fast performance with predictable iteration order. Mastering these methods is essential for writing efficient Java programs and succeeding in Java Collections Framework interviews.
