# Features of LinkedHashMap in Java

## Introduction

**LinkedHashMap** is one of the most useful classes in the Java Collections Framework. It combines the fast performance of **HashMap** with the ability to **maintain insertion order**.

It internally uses both a **Hash Table** and a **Doubly Linked List**, making it suitable for applications where the order of elements is important.

Understanding the features of LinkedHashMap helps developers choose the right collection for storing ordered key-value pairs.

---

# Major Features of LinkedHashMap

## 1. Stores Data as Key-Value Pairs

LinkedHashMap stores every element as a combination of a unique key and its corresponding value.

Example:

```text
101 → Rahul
102 → Anjali
103 → David
```

Each key maps to exactly one value.

---

## 2. Implements the Map Interface

LinkedHashMap is an implementation of the **Map** interface.

It follows all the rules defined by the Map interface.

---

## 3. Maintains Insertion Order

The biggest advantage of LinkedHashMap is that it preserves the order in which entries are inserted.

Example:

```text
Inserted Order

101 → Rahul
102 → Anjali
103 → David
```

The same order is maintained while displaying the entries.

---

## 4. Uses Hashing Internally

LinkedHashMap internally uses hashing for fast insertion, searching, updating, and deletion.

Whenever a key is inserted:

- `hashCode()` is calculated.
- The bucket is identified.
- The key-value pair is stored.

---

## 5. Uses a Doubly Linked List

Along with hashing, LinkedHashMap maintains a **doubly linked list** connecting all entries.

This linked list preserves the insertion order.

---

## 6. Unique Keys

Duplicate keys are not allowed.

Example:

```java
map.put(101, "Rahul");
map.put(101, "Anjali");
```

Result:

```text
101 → Anjali
```

The old value is replaced.

---

## 7. Duplicate Values are Allowed

Different keys can contain the same value.

Example:

```text
101 → Rahul
102 → Rahul
103 → Rahul
```

---

## 8. Allows One Null Key

LinkedHashMap allows one null key.

Example:

```java
map.put(null, "Admin");
```

---

## 9. Allows Multiple Null Values

Multiple keys can store null values.

Example:

```text
101 → null
102 → null
103 → null
```

---

## 10. Dynamic Size

LinkedHashMap automatically grows as more entries are inserted.

No manual resizing is required.

---

## 11. Automatic Rehashing

When the load factor exceeds the threshold, LinkedHashMap automatically performs rehashing to maintain good performance.

---

## 12. Not Synchronized

LinkedHashMap is not synchronized.

If multiple threads modify it simultaneously, external synchronization is required.

---

# Advantages

- Maintains insertion order
- Fast searching
- Fast insertion
- Fast deletion
- Easy iteration
- Allows null values
- Dynamic resizing

---

# Limitations

- Slightly slower than HashMap because of maintaining a linked list.
- Duplicate keys are not allowed.
- Not thread-safe.
- Consumes slightly more memory than HashMap.

---

# Real-World Applications

LinkedHashMap is commonly used in:

- Student management systems
- Employee databases
- Banking applications
- Shopping cart applications
- Inventory management
- Report generation
- Configuration management
- Cache implementations

---

# Frequently Asked Interview Questions

### 1. Does LinkedHashMap maintain insertion order?

**Answer:**

Yes.

---

### 2. Which interface does LinkedHashMap implement?

**Answer:**

```text
Map
```

---

### 3. Does LinkedHashMap allow duplicate keys?

**Answer:**

No.

---

### 4. Does LinkedHashMap allow duplicate values?

**Answer:**

Yes.

---

### 5. Does LinkedHashMap allow null keys?

**Answer:**

Yes.

Only one null key is allowed.

---

### 6. Does LinkedHashMap allow multiple null values?

**Answer:**

Yes.

---

### 7. Is LinkedHashMap synchronized?

**Answer:**

No.

---

### 8. What is the main advantage of LinkedHashMap over HashMap?

**Answer:**

It maintains insertion order while still providing efficient key-value storage.

---

# Key Takeaways

- LinkedHashMap stores key-value pairs.
- Maintains insertion order.
- Uses hashing and a doubly linked list internally.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Allows one null key.
- Allows multiple null values.
- Automatically performs rehashing.
- Frequently asked in Java interviews.

---

# Summary

LinkedHashMap extends the capabilities of HashMap by preserving the insertion order of entries while maintaining efficient performance through hashing. Its support for predictable iteration, dynamic resizing, null handling, and key-value storage makes it an ideal choice for applications where the order of data matters. Understanding these features is essential for mastering the Java Collections Framework and preparing for Java technical interviews.
