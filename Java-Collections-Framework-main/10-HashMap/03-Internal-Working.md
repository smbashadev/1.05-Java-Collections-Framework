# Internal Working of HashMap in Java

## Introduction

Understanding the internal working of **HashMap** is one of the most important topics in the Java Collections Framework. It is also one of the most frequently asked interview questions.

HashMap stores data as **key-value pairs** and uses the **hashing** mechanism to perform insertion, searching, updating, and deletion efficiently.

Whenever a key-value pair is inserted, Java calculates the hash code of the key, determines the appropriate bucket, and stores the entry in that bucket.

---

# How HashMap Works Internally

The internal working of HashMap can be divided into the following steps:

1. Create a HashMap.
2. Insert a key-value pair.
3. Calculate the hash code.
4. Determine the bucket index.
5. Store the entry in the bucket.
6. Handle collisions if necessary.
7. Perform rehashing when the load factor exceeds the threshold.

---

# Step 1: Create a HashMap

Example:

```java
HashMap map = new HashMap();
```

Initially, an empty HashMap is created.

---

# Step 2: Insert a Key-Value Pair

Example:

```java
map.put(101, "Rahul");
```

The key is **101** and the value is **Rahul**.

---

# Step 3: Calculate the Hash Code

Java calls the `hashCode()` method on the key.

Example:

```text
Key = 101

hashCode() = 101
```

The generated hash code is used to identify the bucket.

---

# Step 4: Calculate the Bucket Index

The bucket index is calculated using the hash code.

Example:

```text
Bucket Index = Hash Code % Number of Buckets
```

Suppose:

```text
Hash Code = 101

Buckets = 16
```

Then,

```text
101 % 16 = 5
```

The entry is stored in **Bucket 5**.

---

# Step 5: Store the Entry

The key-value pair is stored in the calculated bucket.

Example:

```text
Bucket 5

101 → Rahul
```

---

# Step 6: Handle Collision

Suppose another key also maps to Bucket 5.

Example:

```text
101 → Rahul

117 → David
```

Both entries are stored in the same bucket.

During searching, Java uses:

- `hashCode()` to locate the bucket.
- `equals()` to identify the correct key.

---

# Step 7: Rehashing

As more entries are added, the load factor increases.

Default values:

```text
Initial Capacity = 16

Load Factor = 0.75
```

Threshold:

```text
16 × 0.75 = 12
```

When the **13th entry** is inserted:

- A larger hash table is created.
- Existing entries are redistributed.
- Performance is maintained.

---

# Internal Working Diagram

```text
Key + Value
     │
     ▼
hashCode()
     │
     ▼
Hash Code
     │
     ▼
Bucket Index
     │
     ▼
Bucket
     │
     ▼
Store Entry
     │
     ▼
Collision?
     │
 ┌───┴────┐
 │        │
No       Yes
 │        │
 ▼        ▼
Store   Use equals()
             │
             ▼
        Correct Entry
```

---

# Example

```java
HashMap map = new HashMap();

map.put(101, "Rahul");
map.put(102, "Anjali");
map.put(103, "David");
```

Stored entries:

```text
101 → Rahul
102 → Anjali
103 → David
```

Each key is stored in a bucket based on its hash code.

---

# Advantages

- Very fast insertion
- Very fast searching
- Efficient key-value storage
- Automatic resizing
- Collision handling
- Dynamic memory allocation

---

# Limitations

- Does not maintain insertion order.
- Duplicate keys are not allowed.
- Performance decreases if excessive collisions occur.
- Not synchronized.

---

# Time Complexity

| Operation | Average Time | Worst Time |
|-----------|--------------|------------|
| put() | O(1) | O(n) |
| get() | O(1) | O(n) |
| remove() | O(1) | O(n) |
| containsKey() | O(1) | O(n) |

---

# Real-World Applications

HashMap is used in:

- Banking systems
- Student management systems
- Employee databases
- Product catalogs
- E-commerce applications
- Configuration management
- Caching
- Session management

---

# Frequently Asked Interview Questions

### 1. How does HashMap store data?

**Answer:**

HashMap stores data as key-value pairs inside buckets using hashing.

---

### 2. Which method determines the bucket location?

**Answer:**

```java
hashCode()
```

---

### 3. Which method identifies the correct key inside a bucket?

**Answer:**

```java
equals()
```

---

### 4. What happens if two keys map to the same bucket?

**Answer:**

A collision occurs, and HashMap stores both entries in the same bucket. During retrieval, `equals()` is used to identify the required key.

---

### 5. What is the default load factor of HashMap?

**Answer:**

```text
0.75
```

---

### 6. When does rehashing occur?

**Answer:**

When the load factor exceeds the threshold.

---

### 7. Why is HashMap fast?

**Answer:**

Because hashing allows direct access to the appropriate bucket instead of searching every entry.

---

# Key Takeaways

- HashMap stores data as key-value pairs.
- Uses hashing internally.
- `hashCode()` determines the bucket.
- `equals()` identifies the correct key.
- Handles collisions automatically.
- Performs automatic rehashing.
- Provides O(1) average time complexity for common operations.
- One of the most important Java interview topics.

---

# Summary

HashMap achieves high performance by combining hashing, buckets, `hashCode()`, `equals()`, collision handling, and automatic rehashing. These mechanisms allow fast insertion, retrieval, updating, and deletion of key-value pairs. Understanding the internal working of HashMap is essential for mastering the Java Collections Framework and answering technical interview questions with confidence.
