# Introduction to LinkedHashSet

## Introduction

**LinkedHashSet** is an implementation of the **Set** interface in the Java Collections Framework. It stores **unique elements** like HashSet but also **maintains the insertion order** of elements.

LinkedHashSet internally combines the features of **HashSet** and a **Linked List**, making it suitable when both uniqueness and insertion order are important.

---

# Definition

**LinkedHashSet** is a class that implements the **Set** interface and stores unique elements while preserving the order in which they are inserted.

---

# Package

```java
import java.util.LinkedHashSet;
```

---

# Class Declaration

```java
public class LinkedHashSet<E>
```

---

# Hierarchy

```text
Iterable
    │
Collection
    │
Set
    │
HashSet
    │
LinkedHashSet
```

---

# Why Use LinkedHashSet?

LinkedHashSet is used because it:

- Stores only unique elements
- Maintains insertion order
- Provides fast insertion, deletion, and searching
- Allows one null value
- Dynamically grows as elements are added
- Is easy to iterate in insertion order

---

# Key Characteristics

- Implements the Set interface
- Stores only unique elements
- Duplicate elements are not allowed
- Maintains insertion order
- Does not maintain sorted order
- Allows one null value
- Uses hashing internally
- Maintains a linked list of elements
- Not synchronized
- Not thread-safe
- Dynamic in size

---

# Internal Working

LinkedHashSet internally uses a **LinkedHashMap**.

When an element is added:

1. The hash code is calculated.
2. The appropriate bucket is located.
3. Duplicate elements are checked.
4. The element is stored.
5. A linked list maintains the insertion order.

---

# Syntax

```java
LinkedHashSet set = new LinkedHashSet();
```

---

# Example

```java
import java.util.LinkedHashSet;

public class Example {

    public static void main(String[] args) {

        LinkedHashSet set = new LinkedHashSet();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }

}
```

### Output

```text
[30, 10, 20]
```

The duplicate value **10** is ignored, and insertion order is preserved.

---

# Real-World Applications

LinkedHashSet is commonly used in:

- Removing duplicate records while preserving order
- Browser history management
- Playlist management
- Student registration systems
- Ordered product catalogs
- Recently viewed items
- Ordered search history
- Unique log entries

---

# Advantages

- Stores unique elements
- Maintains insertion order
- Fast insertion
- Fast deletion
- Fast searching
- Allows one null value
- Dynamic size

---

# Disadvantages

- Does not sort elements
- Slightly slower than HashSet due to maintaining insertion order
- Not synchronized
- Not thread-safe
- No index-based access

---

# Frequently Asked Interview Questions

### 1. What is LinkedHashSet?

A LinkedHashSet is a Set implementation that stores unique elements while maintaining insertion order.

---

### 2. Which interface does LinkedHashSet implement?

Set.

---

### 3. Can LinkedHashSet store duplicate elements?

No.

---

### 4. Does LinkedHashSet maintain insertion order?

Yes.

---

### 5. Does LinkedHashSet allow null values?

Yes, only one null value.

---

### 6. Which class is internally used by LinkedHashSet?

LinkedHashMap.

---

# Key Takeaways

- LinkedHashSet implements the Set interface.
- Stores only unique elements.
- Preserves insertion order.
- Duplicate elements are automatically ignored.
- Internally uses LinkedHashMap.
- Allows one null value.
- Provides fast insertion, deletion, and searching.

---

# Summary

LinkedHashSet is an important implementation of the Set interface that combines the uniqueness of HashSet with the predictable iteration order of a linked list. It is an excellent choice when duplicate elements must be avoided while preserving insertion order, making it a commonly used collection in Java applications and technical interviews.
