# Vector in Java

## Introduction

**Vector** is one of the oldest collection classes in Java. It was introduced before the Java Collections Framework and later became part of the framework in Java 1.2.

Vector is a **dynamic array** that automatically grows or shrinks as elements are added or removed. Unlike `ArrayList`, `Vector` is **synchronized**, making it thread-safe for multi-threaded applications.

Although modern applications usually prefer `ArrayList` for better performance, `Vector` is still available for backward compatibility and is occasionally used in legacy applications.

---

# Definition

A **Vector** is a synchronized, resizable array implementation that stores objects in insertion order and allows duplicate as well as null elements.

---

# Package

```java
java.util.Vector
```

---

# Declaration

```java
Vector vector = new Vector();
```

---

# Constructors of Vector

| Constructor | Description |
|-------------|-------------|
| `Vector()` | Creates an empty Vector with default capacity |
| `Vector(int initialCapacity)` | Creates a Vector with specified initial capacity |
| `Vector(int initialCapacity, int capacityIncrement)` | Creates a Vector with specified capacity and increment value |
| `Vector(Collection c)` | Creates a Vector containing elements of another collection |

---

# Features of Vector

- Dynamic in size.
- Maintains insertion order.
- Allows duplicate elements.
- Allows one or more null values.
- Synchronized and thread-safe.
- Supports random access using indexes.
- Part of the `java.util` package.
- Implements the `List` interface.

---

# Internal Working

1. A Vector object is created.
2. Elements are stored in a dynamic array.
3. If the capacity becomes full, Vector automatically increases its size.
4. Since methods are synchronized, only one thread can modify the Vector at a time.
5. Elements are accessed using indexes.

---

# Default Capacity

| Property | Value |
|----------|-------|
| Default Capacity | 10 |
| Growth Strategy | Usually doubles its capacity when required |

---

# Commonly Used Methods

| Method | Description |
|---------|-------------|
| `add()` | Adds an element |
| `addElement()` | Adds an element to the Vector |
| `get()` | Returns an element |
| `set()` | Updates an element |
| `remove()` | Removes an element |
| `size()` | Returns the number of elements |
| `isEmpty()` | Checks whether the Vector is empty |
| `contains()` | Checks if an element exists |
| `clear()` | Removes all elements |

---

# Advantages

- Thread-safe.
- Dynamic resizing.
- Easy to use.
- Maintains insertion order.
- Supports duplicate elements.
- Suitable for legacy applications.

---

# Limitations

- Slower than ArrayList due to synchronization.
- Higher memory overhead.
- Rarely used in modern applications.
- Lower performance in single-threaded environments.

---

# Vector vs ArrayList

| Feature | Vector | ArrayList |
|---------|--------|-----------|
| Synchronization | Yes | No |
| Thread Safe | Yes | No |
| Performance | Slower | Faster |
| Introduced | Before Java 1.2 | Java 1.2 |
| Preferred Today | Rarely | Yes |

---

# Real-World Applications

Vector can be found in:

- Legacy Java Applications
- Banking Software
- Government Systems
- Desktop Applications
- Multi-threaded Programs
- Enterprise Maintenance Projects

---

# Interview Questions

### 1. What is Vector?

**Answer:**

Vector is a synchronized dynamic array implementation in Java.

---

### 2. Is Vector synchronized?

**Answer:**

Yes.

All major methods of Vector are synchronized.

---

### 3. Does Vector allow duplicate elements?

**Answer:**

Yes.

---

### 4. Does Vector allow null values?

**Answer:**

Yes.

---

### 5. Which is faster: Vector or ArrayList?

**Answer:**

ArrayList is faster because it is not synchronized.

---

# Quick Revision

| Property | Value |
|----------|-------|
| Package | java.util |
| Default Capacity | 10 |
| Thread Safe | Yes |
| Allows Duplicates | Yes |
| Allows Null | Yes |
| Maintains Order | Yes |
| Implements | List |

---

# Key Takeaways

- Vector is a synchronized dynamic array.
- It automatically resizes when needed.
- It maintains insertion order.
- It allows duplicate and null elements.
- It is slower than ArrayList because of synchronization.
- It is mainly used in legacy Java applications.

---

# Summary

Vector is a legacy collection class that provides a thread-safe, dynamically resizable array implementation. While it has largely been replaced by `ArrayList` in modern Java applications due to performance advantages, it remains an important class for understanding legacy code, backward compatibility, and Java interview concepts.
