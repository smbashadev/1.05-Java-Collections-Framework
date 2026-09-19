# Features of HashSet

## Introduction

**HashSet** is one of the most widely used classes in the Java Collections Framework for storing **unique elements**. It provides high performance by internally using a **HashMap** and is commonly used when duplicate values should not be stored.

Understanding the features of HashSet is essential for Java programming and technical interviews.

---

# Features of HashSet

## 1. Stores Only Unique Elements

HashSet does not allow duplicate elements.

If the same element is added multiple times, only the first occurrence is stored.

### Example

```java
HashSet set = new HashSet();

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

## 2. Does Not Maintain Insertion Order

HashSet does not preserve the order in which elements are inserted.

### Example

Inserted Order:

```text
50
10
40
20
```

Possible Output:

```text
[20, 50, 10, 40]
```

The order may vary.

---

## 3. Does Not Maintain Sorted Order

HashSet does not arrange elements in ascending or descending order.

---

## 4. Allows One Null Value

HashSet permits only one null element.

### Example

```java
HashSet set = new HashSet();

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

HashSet internally uses a **HashMap** and stores elements based on their hash code.

This provides efficient insertion, deletion, and searching.

---

## 6. Fast Performance

Average time complexity for common operations:

| Operation | Time Complexity |
|-----------|-----------------|
| add() | O(1) |
| remove() | O(1) |
| contains() | O(1) |

---

## 7. Dynamic Size

HashSet automatically increases its capacity as more elements are added.

No manual resizing is required.

---

## 8. Not Synchronized

HashSet is not synchronized.

Multiple threads should not modify the same HashSet simultaneously without external synchronization.

---

## 9. Not Thread-Safe

HashSet is not safe for concurrent modifications.

External synchronization is required in multithreaded applications.

---

## 10. No Index-Based Access

Unlike ArrayList, HashSet does not support index-based operations.

Example:

```java
set.get(0); // Invalid
```

---

## 11. Implements the Set Interface

HashSet is an implementation of the **Set** interface.

It follows all Set rules regarding uniqueness.

---

## 12. Allows Different Data Types

A raw HashSet can store different types of objects.

Example:

```java
HashSet set = new HashSet();

set.add(100);
set.add("Java");
set.add('A');
set.add(99.5);
```

---

# Advantages

- Removes duplicate elements automatically
- Fast insertion
- Fast deletion
- Fast searching
- Allows one null value
- Dynamic in size
- Easy to use

---

# Limitations

- Does not maintain insertion order
- Does not sort elements
- No index-based access
- Not synchronized
- Not thread-safe

---

# Frequently Asked Interview Questions

### 1. Does HashSet allow duplicate elements?

**Answer:**

No.

---

### 2. Does HashSet maintain insertion order?

**Answer:**

No.

---

### 3. Does HashSet maintain sorted order?

**Answer:**

No.

---

### 4. Does HashSet allow null values?

**Answer:**

Yes, only one null value.

---

### 5. Which class is internally used by HashSet?

**Answer:**

HashMap.

---

### 6. Is HashSet synchronized?

**Answer:**

No.

---

### 7. Is HashSet thread-safe?

**Answer:**

No.

---

### 8. Can HashSet grow dynamically?

**Answer:**

Yes.

---

### 9. Does HashSet support index-based access?

**Answer:**

No.

---

### 10. What is the average time complexity of add(), remove(), and contains()?

**Answer:**

O(1)

---

# Key Takeaways

- HashSet stores only unique elements.
- Duplicate values are automatically ignored.
- Insertion order is not maintained.
- Sorted order is not maintained.
- One null value is allowed.
- HashMap is used internally.
- Provides O(1) average performance for add(), remove(), and contains().
- Dynamic in size.
- Frequently used in Java applications and interviews.

---

# Summary

HashSet is an efficient implementation of the Set interface designed for storing unique elements. Its hashing mechanism provides excellent performance for insertion, deletion, and searching operations. Because of its simplicity, speed, and automatic duplicate removal, HashSet is one of the most frequently used collection classes in Java and an important topic for Java Collections Framework interview preparation.
