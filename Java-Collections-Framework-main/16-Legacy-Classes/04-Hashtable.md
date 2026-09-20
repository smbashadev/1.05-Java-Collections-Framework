# Hashtable in Java

## Introduction

**Hashtable** is one of the Legacy Classes in Java that stores data in the form of **key-value pairs**. It was introduced before the Java Collections Framework and later became part of it in Java 1.2.

Hashtable uses a hashing technique to store and retrieve data efficiently. It is **synchronized**, making it thread-safe for multi-threaded environments.

Although modern applications usually use **HashMap** or **ConcurrentHashMap**, Hashtable is still available for backward compatibility and is an important interview topic.

---

# Definition

A **Hashtable** is a synchronized collection class that stores data as **key-value pairs**, where each key is unique and maps to a single value.

---

# Package

```java
java.util.Hashtable
```

---

# Declaration

```java
Hashtable table = new Hashtable();
```

---

# Features of Hashtable

- Stores data as key-value pairs.
- Keys must be unique.
- Values can be duplicated.
- Synchronized and thread-safe.
- Uses hashing for fast access.
- Does **not** allow null keys.
- Does **not** allow null values.
- Implements the `Map` interface.

---

# Internal Working

1. A Hashtable object is created.
2. The hash code of the key is calculated.
3. The hash code determines the bucket location.
4. The key-value pair is stored in that bucket.
5. Data is retrieved using the key.

---

# Commonly Used Methods

| Method | Description |
|---------|-------------|
| `put()` | Adds a key-value pair |
| `get()` | Retrieves the value for a key |
| `remove()` | Removes a key-value pair |
| `containsKey()` | Checks whether a key exists |
| `containsValue()` | Checks whether a value exists |
| `size()` | Returns the number of entries |
| `isEmpty()` | Checks whether the Hashtable is empty |
| `clear()` | Removes all entries |

---

# Example

```java
Hashtable table = new Hashtable();

table.put(101, "Rahul");
table.put(102, "Anita");
table.put(103, "Kiran");

System.out.println(table);

System.out.println(table.get(102));

table.remove(101);

System.out.println(table);
```

### Output

```
{103=Kiran, 102=Anita, 101=Rahul}
Anita
{103=Kiran, 102=Anita}
```

**Note:** The display order is not guaranteed because Hashtable does not maintain insertion order.

---

# Advantages

- Thread-safe.
- Fast lookup using hashing.
- Unique keys.
- Suitable for legacy multi-threaded applications.
- Easy to use.

---

# Limitations

- Slower than HashMap because of synchronization.
- Does not maintain insertion order.
- Does not allow null keys.
- Does not allow null values.
- Mostly replaced by HashMap and ConcurrentHashMap.

---

# Hashtable vs HashMap

| Feature | Hashtable | HashMap |
|---------|-----------|---------|
| Synchronization | Yes | No |
| Thread Safe | Yes | No |
| Null Key | Not Allowed | One Allowed |
| Null Values | Not Allowed | Allowed |
| Performance | Slower | Faster |
| Introduced | Before Java 1.2 | Java 1.2 |

---

# Real-World Applications

Hashtable is used in:

- Legacy Enterprise Applications
- Banking Systems
- Government Software
- Multi-threaded Applications
- Configuration Management
- Legacy Java Projects

---

# Interview Questions

### 1. What is Hashtable?

**Answer:**

Hashtable is a synchronized collection class that stores data as key-value pairs.

---

### 2. Does Hashtable allow duplicate keys?

**Answer:**

No.

Each key must be unique.

---

### 3. Does Hashtable allow duplicate values?

**Answer:**

Yes.

---

### 4. Does Hashtable allow null keys?

**Answer:**

No.

---

### 5. Does Hashtable allow null values?

**Answer:**

No.

---

### 6. Is Hashtable synchronized?

**Answer:**

Yes.

---

### 7. Which is faster: Hashtable or HashMap?

**Answer:**

HashMap is faster because it is not synchronized.

---

# Quick Revision

| Property | Value |
|----------|-------|
| Package | java.util |
| Data Structure | Key-Value Pair |
| Thread Safe | Yes |
| Null Key | No |
| Null Value | No |
| Duplicate Keys | No |
| Duplicate Values | Yes |
| Maintains Order | No |

---

# Key Takeaways

- Hashtable is a Legacy Class.
- It stores data as key-value pairs.
- It uses hashing for efficient lookup.
- It is synchronized and thread-safe.
- It does not allow null keys or null values.
- HashMap is generally preferred in modern Java applications because of better performance.

---

# Summary

Hashtable is a synchronized legacy collection class that stores data using key-value pairs and hashing. It provides thread safety but has lower performance compared to HashMap due to synchronization. Although it is rarely used in new applications, understanding Hashtable is essential for maintaining legacy Java systems and preparing for Java technical interviews.
