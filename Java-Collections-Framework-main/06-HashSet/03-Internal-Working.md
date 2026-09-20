# Internal Working of HashSet

## Introduction

One of the most important interview topics in the Java Collections Framework is the **internal working of HashSet**. Although HashSet appears to store only unique elements, it internally uses a **HashMap** to manage and store those elements efficiently.

Understanding how HashSet works internally helps developers write better Java programs and answer technical interview questions with confidence.

---

# How HashSet Works Internally

HashSet does **not** store elements directly.

Instead, it internally creates a **HashMap** and stores every element as a **key** in that HashMap.

A dummy object is used as the value for every key.

```text
HashSet
     │
     ▼
 HashMap
 ┌──────────────┐
 │ Key  │ Value │
 ├──────────────┤
 │ 10   │ Dummy │
 │ 20   │ Dummy │
 │ 30   │ Dummy │
 └──────────────┘
```

---

# Steps Performed When add() is Called

Suppose the following code is executed:

```java
HashSet set = new HashSet();

set.add(10);
set.add(20);
set.add(30);
```

HashSet performs the following steps internally.

---

## Step 1: Calculate Hash Code

The hash code of the object is calculated.

```text
10 → hashCode()
20 → hashCode()
30 → hashCode()
```

The hash code determines where the element should be stored.

---

## Step 2: Find the Bucket

The hash code is converted into a bucket index.

```text
Hash Code
     │
     ▼
Bucket Number
```

Each bucket stores one or more elements.

---

## Step 3: Check for Duplicate

Before inserting a new element, HashSet checks whether the same element already exists.

It uses:

- hashCode()
- equals()

If an equal element is already present, insertion is ignored.

---

## Step 4: Store the Element

If the element is unique, it is stored as the **key** in the internal HashMap.

```text
Key     Value
10      Dummy
20      Dummy
30      Dummy
```

---

# What Happens When a Duplicate is Added?

Example:

```java
HashSet set = new HashSet();

set.add(100);
set.add(100);
```

### Internal Process

- Hash code is calculated.
- Bucket is located.
- equals() checks for an existing element.
- Duplicate is detected.
- The second element is ignored.

### Output

```text
[100]
```

---

# What Happens During contains()?

Example:

```java
set.contains(20);
```

Internal steps:

1. Calculate hash code.
2. Locate the bucket.
3. Compare using equals().
4. Return true if found.

---

# What Happens During remove()?

Example:

```java
set.remove(20);
```

Internal steps:

1. Calculate hash code.
2. Find the bucket.
3. Locate the matching element.
4. Remove the element.

---

# Why is HashSet Fast?

HashSet is fast because it uses **hashing**.

Average time complexity:

| Operation | Time Complexity |
|-----------|-----------------|
| add() | O(1) |
| contains() | O(1) |
| remove() | O(1) |

Worst case:

```text
O(n)
```

This occurs when many elements are stored in the same bucket because of hash collisions.

---

# Internal Structure

```text
HashSet
    │
    ▼
HashMap
    │
    ├── Bucket 0
    ├── Bucket 1
    ├── Bucket 2
    ├── Bucket 3
    ├── Bucket 4
    └── ...
```

Each bucket stores elements based on their hash codes.

---

# Role of hashCode() and equals()

## hashCode()

- Calculates the hash value.
- Determines the bucket.

---

## equals()

- Compares two objects.
- Prevents duplicate elements.

Both methods work together to maintain uniqueness.

---

# Advantages of Internal Hashing

- Very fast insertion
- Very fast searching
- Very fast deletion
- Efficient memory usage
- Automatic duplicate checking

---

# Frequently Asked Interview Questions

### 1. Which class is internally used by HashSet?

**Answer:**

HashMap.

---

### 2. Does HashSet store values directly?

**Answer:**

No.

It stores elements as keys in an internal HashMap.

---

### 3. What value is stored for every key?

**Answer:**

A dummy object.

---

### 4. Which methods are used to identify duplicate elements?

**Answer:**

```java
hashCode()
equals()
```

---

### 5. Why is HashSet faster than many other collections?

**Answer:**

Because it uses hashing for insertion, searching, and deletion.

---

### 6. What is the average time complexity of add()?

**Answer:**

O(1)

---

### 7. What is the worst-case time complexity?

**Answer:**

O(n)

---

# Key Takeaways

- HashSet internally uses a HashMap.
- Every element is stored as a key.
- A dummy object is stored as the value.
- hashCode() determines the bucket.
- equals() checks for duplicates.
- Average insertion, deletion, and searching take O(1) time.
- Understanding the internal working of HashSet is a common Java interview topic.

---

# Summary

HashSet achieves high performance by internally using a HashMap and storing elements as keys. It relies on hashing to quickly locate buckets and uses the hashCode() and equals() methods to ensure uniqueness. This design makes HashSet one of the fastest collection classes for storing unique elements and a fundamental topic in Java Collections Framework interviews.
