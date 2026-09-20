# TreeSet Methods

## Introduction

The **TreeSet** class provides several methods to add, remove, search, retrieve, and navigate elements in sorted order. Since TreeSet internally uses a **Red-Black Tree**, all elements remain automatically sorted.

Understanding these methods is essential for Java programming and technical interviews.

---

# Categories of TreeSet Methods

TreeSet methods can be grouped into the following categories:

- Insertion Methods
- Removal Methods
- Search Methods
- Utility Methods
- Navigational Methods
- Traversal Methods

---

# 1. Insertion Methods

## add()

Adds an element to the TreeSet.

If the element already exists, it is ignored.

### Syntax

```java
add(element);
```

### Example

```java
TreeSet set = new TreeSet();

set.add(30);
set.add(10);
set.add(20);

System.out.println(set);
```

### Output

```text
[10, 20, 30]
```

---

# 2. Removal Methods

## remove()

Removes the specified element from the TreeSet.

Returns **true** if the element is removed successfully.

### Syntax

```java
remove(element);
```

---

## clear()

Removes all elements from the TreeSet.

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

Returns the number of elements present in the TreeSet.

### Syntax

```java
size();
```

---

## isEmpty()

Checks whether the TreeSet is empty.

### Syntax

```java
isEmpty();
```

---

# 5. Navigational Methods

## first()

Returns the first (smallest) element.

### Syntax

```java
first();
```

---

## last()

Returns the last (largest) element.

### Syntax

```java
last();
```

---

## higher()

Returns the smallest element greater than the specified element.

### Syntax

```java
higher(element);
```

---

## lower()

Returns the greatest element smaller than the specified element.

### Syntax

```java
lower(element);
```

---

## ceiling()

Returns the specified element if present; otherwise, returns the next greater element.

### Syntax

```java
ceiling(element);
```

---

## floor()

Returns the specified element if present; otherwise, returns the next smaller element.

### Syntax

```java
floor(element);
```

---

# 6. Traversal Methods

## iterator()

Returns an Iterator for traversing the TreeSet in ascending order.

### Syntax

```java
iterator();
```

---

## enhanced for-each loop

Traverses all elements in ascending order.

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
| first() | Returns the first element |
| last() | Returns the last element |
| higher() | Returns the next higher element |
| lower() | Returns the next lower element |
| ceiling() | Returns the ceiling element |
| floor() | Returns the floor element |
| size() | Returns the number of elements |
| isEmpty() | Checks whether the TreeSet is empty |
| clear() | Removes all elements |
| iterator() | Traverses the TreeSet |

---

# Time Complexity

| Method | Average Time Complexity |
|---------|------------------------|
| add() | O(log n) |
| remove() | O(log n) |
| contains() | O(log n) |
| first() | O(log n) |
| last() | O(log n) |
| higher() | O(log n) |
| lower() | O(log n) |
| ceiling() | O(log n) |
| floor() | O(log n) |

---

# Frequently Asked Interview Questions

### 1. Which method inserts an element into a TreeSet?

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

### 5. Which method returns the smallest element?

**Answer:**

```java
first()
```

---

### 6. Which method returns the largest element?

**Answer:**

```java
last()
```

---

### 7. Which method returns the next greater element?

**Answer:**

```java
higher()
```

---

### 8. Which method returns the next smaller element?

**Answer:**

```java
lower()
```

---

### 9. Which methods return the nearest matching elements?

**Answer:**

```java
ceiling()
floor()
```

---

### 10. Which method is used to traverse a TreeSet?

**Answer:**

```java
iterator()
```

or

```java
Enhanced for-each loop
```

---

# Key Takeaways

- TreeSet provides methods for insertion, deletion, searching, navigation, traversal, and utility operations.
- `add()` inserts only unique elements.
- `remove()` deletes a specified element.
- `contains()` checks whether an element exists.
- `first()` and `last()` return the smallest and largest elements.
- `higher()`, `lower()`, `ceiling()`, and `floor()` support navigation.
- Most operations have an average time complexity of **O(log n)**.
- These methods are frequently asked in Java Collections Framework interviews.

---

# Summary

TreeSet provides a rich collection of methods for managing sorted unique elements efficiently. Its navigational methods make it more powerful than other Set implementations when ordered data is required. Mastering these methods is essential for writing efficient Java programs and succeeding in Java Collections Framework interviews.
