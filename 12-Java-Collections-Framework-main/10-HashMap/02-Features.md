# Features of HashMap in Java

## Introduction

**HashMap** is one of the most commonly used classes in the Java Collections Framework because of its fast performance and flexibility. It stores data as **key-value pairs** and provides efficient insertion, searching, updating, and deletion operations.

Understanding the features of HashMap helps developers decide when it is the right collection to use in real-world applications and technical interviews.

---

# Major Features of HashMap

## 1. Stores Data as Key-Value Pairs

HashMap stores every element as a combination of a unique key and its corresponding value.

Example:

```text
101 → Rahul
102 → Anjali
103 → David
```

Each key is associated with exactly one value.

---

## 2. Implements the Map Interface

HashMap is an implementation of the **Map** interface.

It follows all the rules defined by the Map interface for storing key-value pairs.

---

## 3. Uses Hashing Internally

HashMap internally uses the **hashing** technique.

Whenever a key is inserted:

- `hashCode()` is calculated.
- The bucket location is identified.
- The key-value pair is stored in that bucket.

This makes operations very fast.

---

## 4. Unique Keys

HashMap does not allow duplicate keys.

Example:

```java
map.put(101, "Rahul");
map.put(101, "Anjali");
```

Result:

```text
101 → Anjali
```

The previous value is replaced.

---

## 5. Duplicate Values are Allowed

Different keys can store the same value.

Example:

```text
101 → Rahul
102 → Rahul
103 → Rahul
```

This is completely valid.

---

## 6. Allows One Null Key

HashMap allows only one null key.

Example:

```java
map.put(null, "Admin");
```

If another null key is inserted, the existing value is replaced.

---

## 7. Allows Multiple Null Values

Multiple keys can contain null values.

Example:

```java
101 → null
102 → null
103 → null
```

---

## 8. Does Not Maintain Insertion Order

HashMap does not guarantee the order in which elements are stored or displayed.

The output order may change.

---

## 9. Not Synchronized

HashMap is not synchronized.

Multiple threads modifying the same HashMap simultaneously may produce inconsistent results unless external synchronization is used.

---

## 10. Dynamic Size

HashMap automatically grows as more elements are added.

Developers do not need to manually increase its size.

---

## 11. Automatic Rehashing

When the load factor exceeds the threshold, HashMap automatically performs **rehashing** by increasing its capacity and redistributing existing entries.

---

## 12. High Performance

HashMap provides excellent average performance.

| Operation | Average Time |
|-----------|--------------|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| containsKey() | O(1) |

---

# Advantages

- Fast insertion
- Fast searching
- Fast deletion
- Efficient key-value storage
- Dynamic resizing
- Allows null values
- Easy to use

---

# Limitations

- Does not maintain insertion order.
- Duplicate keys are not allowed.
- Not thread-safe.
- Performance decreases if many collisions occur.

---

# Real-World Applications

HashMap is commonly used in:

- Student management systems
- Employee databases
- Banking applications
- Product catalogs
- Shopping carts
- Configuration management
- User session management
- Caching systems

---

# Frequently Asked Interview Questions

### 1. How does HashMap store data?

**Answer:**

As key-value pairs.

---

### 2. Does HashMap allow duplicate keys?

**Answer:**

No.

Duplicate keys are not allowed.

---

### 3. Does HashMap allow duplicate values?

**Answer:**

Yes.

---

### 4. Does HashMap allow null keys?

**Answer:**

Yes.

Only one null key is allowed.

---

### 5. Does HashMap allow null values?

**Answer:**

Yes.

Multiple null values are allowed.

---

### 6. Does HashMap maintain insertion order?

**Answer:**

No.

---

### 7. Is HashMap synchronized?

**Answer:**

No.

---

### 8. Which technique is used internally by HashMap?

**Answer:**

Hashing.

---

# Key Takeaways

- HashMap stores key-value pairs.
- Uses hashing internally.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Allows one null key.
- Allows multiple null values.
- Does not maintain insertion order.
- Not synchronized.
- Automatically performs rehashing.
- Frequently asked in Java interviews.

---

# Summary

HashMap is a powerful and efficient collection class that stores data as key-value pairs using hashing. Its support for fast operations, dynamic resizing, null values, and automatic rehashing makes it one of the most widely used classes in Java. Understanding its features is essential for writing efficient Java applications and succeeding in technical interviews.
