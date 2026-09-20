# Features of LinkedHashSet

## Introduction

**LinkedHashSet** is one of the most useful implementations of the **Set** interface in the Java Collections Framework. It combines the advantages of **HashSet** and a **Linked List** by storing only unique elements while preserving their insertion order.

Understanding the features of LinkedHashSet is important for Java programming and technical interviews.

---

# Features of LinkedHashSet

## 1. Stores Only Unique Elements

LinkedHashSet does not allow duplicate elements.

If the same element is added multiple times, only the first occurrence is stored.

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

## 2. Maintains Insertion Order

LinkedHashSet preserves the order in which elements are inserted.

### Example

Inserted Order:

```text
50
10
40
20
```

Output:

```text
[50, 10, 40, 20]
```

---

## 3. Does Not Maintain Sorted Order

Elements remain in insertion order.

They are not automatically sorted in ascending or descending order.

---

## 4. Allows One Null Value

LinkedHashSet allows only one null element.

### Example

```java
LinkedHashSet set = new LinkedHashSet();

set.add(null);
set.add(null);

System.out.println(set);
```

### Output

```text
[null]
```

---

## 5. Uses Hashing Internally

LinkedHashSet internally uses a **LinkedHashMap**.

Hashing provides efficient insertion, deletion, and searching operations.

---

## 6. Maintains a Doubly Linked List

Along with hashing, LinkedHashSet maintains a linked list to preserve insertion order.

---

## 7. Fast Performance

Average time complexity for common operations:

| Operation | Time Complexity |
|-----------|-----------------|
| add() | O(1) |
| remove() | O(1) |
| contains() | O(1) |

---

## 8. Dynamic Size

LinkedHashSet automatically grows as new elements are added.

No manual resizing is required.

---

## 9. Not Synchronized

LinkedHashSet is not synchronized.

Multiple threads should not modify the same LinkedHashSet simultaneously without external synchronization.

---

## 10. Not Thread-Safe

LinkedHashSet is not safe for concurrent modifications.

External synchronization is required in multithreaded applications.

---

## 11. No Index-Based Access

LinkedHashSet does not support index-based operations.

Example:

```java
set.get(0); // Invalid
```

---

## 12. Implements the Set Interface

LinkedHashSet is an implementation of the **Set** interface.

It follows all Set rules regarding uniqueness.

---

## Advantages

- Stores only unique elements
- Preserves insertion order
- Fast insertion
- Fast deletion
- Fast searching
- Allows one null value
- Dynamic size
- Easy to iterate in insertion order

---

## Limitations

- Does not sort elements
- Slightly slower than HashSet
- No index-based access
- Not synchronized
- Not thread-safe

---

# Frequently Asked Interview Questions

### 1. Does LinkedHashSet allow duplicate elements?

**Answer:**

No.

---

### 2. Does LinkedHashSet maintain insertion order?

**Answer:**

Yes.

---

### 3. Does LinkedHashSet maintain sorted order?

**Answer:**

No.

---

### 4. Does LinkedHashSet allow null values?

**Answer:**

Yes, only one null value.

---

### 5. Which class is internally used by LinkedHashSet?

**Answer:**

LinkedHashMap.

---

### 6. Is LinkedHashSet synchronized?

**Answer:**

No.

---

### 7. Is LinkedHashSet thread-safe?

**Answer:**

No.

---

### 8. Can LinkedHashSet grow dynamically?

**Answer:**

Yes.

---

### 9. Does LinkedHashSet support index-based access?

**Answer:**

No.

---

### 10. What is the average time complexity of add(), remove(), and contains()?

**Answer:**

O(1)

---

# Key Takeaways

- LinkedHashSet stores only unique elements.
- Duplicate values are automatically ignored.
- Maintains insertion order.
- Does not maintain sorted order.
- Allows one null value.
- Internally uses LinkedHashMap.
- Provides O(1) average performance for add(), remove(), and contains().
- Frequently used when uniqueness and insertion order are both required.

---

# Summary

LinkedHashSet is an efficient implementation of the Set interface that combines hashing with a linked list to provide unique element storage while preserving insertion order. It offers excellent performance for insertion, deletion, and searching operations, making it a popular choice in Java applications and an important topic for Java Collections Framework interview preparation.
