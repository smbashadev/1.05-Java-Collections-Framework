# hashCode() Method in Java

## Introduction

The **hashCode()** method is one of the most important methods in Java because it plays a vital role in the **Hashing** mechanism used by the Java Collections Framework.

Whenever an object is stored in a collection such as **HashMap**, **HashSet**, **LinkedHashMap**, or **Hashtable**, Java internally calls the **hashCode()** method to determine where the object should be stored.

Understanding `hashCode()` is essential for writing efficient Java programs and succeeding in Java interviews.

---

# Definition

The **hashCode()** method returns an integer value that represents the hash code of an object.

This integer value is used by Java to determine the bucket in which the object should be stored.

---

# Method Signature

```java
public int hashCode()
```

---

# Why is hashCode() Needed?

Without `hashCode()`, Java would have to compare every object one by one during searching.

Using `hashCode()` helps Java:

- Find objects quickly
- Store objects efficiently
- Improve search performance
- Reduce unnecessary comparisons

---

# How hashCode() Works

The hashing process follows these steps:

1. An object is created.
2. Java calls the `hashCode()` method.
3. An integer hash code is generated.
4. The hash code determines the bucket location.
5. The object is stored in that bucket.

During searching:

1. Java again calls `hashCode()`.
2. Finds the correct bucket.
3. Uses `equals()` if multiple objects exist in the same bucket.

---

# Working Diagram

```text
Object
   │
   ▼
hashCode()
   │
   ▼
Integer Hash Code
   │
   ▼
Bucket Number
   │
   ▼
Store Object
```

---

# Example

```java
String name = "Java";

System.out.println(name.hashCode());
```

### Sample Output

```text
2301506
```

The actual hash code depends on the object's contents.

---

# Default hashCode()

Every Java class inherits the `hashCode()` method from the **Object** class.

If it is not overridden, Java generates a hash code based on the object's memory-related identity.

---

# Overriding hashCode()

When creating custom classes, it is recommended to override `hashCode()` along with `equals()`.

This ensures that logically equal objects produce the same hash code.

---

# Rules of hashCode()

## Rule 1

If two objects are equal according to `equals()`, they must have the same hash code.

---

## Rule 2

If two objects have the same hash code, they may or may not be equal.

---

## Rule 3

Different objects can produce the same hash code.

This situation is called a **Collision**.

---

# Advantages

- Fast searching
- Efficient storage
- Improves collection performance
- Used by HashMap and HashSet
- Reduces search time

---

# Limitations

- Same hash code does not guarantee object equality.
- Poor hash code implementation increases collisions.
- Performance decreases when collisions are high.

---

# Collections That Use hashCode()

The following classes internally call `hashCode()`:

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet
- Hashtable

---

# Real-World Applications

The `hashCode()` method is used in:

- Login systems
- Database indexing
- Search engines
- Caching
- Banking applications
- Student management systems
- Employee record systems

---

# Frequently Asked Interview Questions

### 1. What is hashCode()?

**Answer:**

It returns an integer hash value representing an object.

---

### 2. Which class defines hashCode()?

**Answer:**

Object class.

---

### 3. What is the return type of hashCode()?

**Answer:**

```java
int
```

---

### 4. Why is hashCode() used?

**Answer:**

To determine the bucket location for storing objects.

---

### 5. Which collections use hashCode()?

**Answer:**

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet
- Hashtable

---

### 6. Can two different objects have the same hash code?

**Answer:**

Yes.

This is called a collision.

---

### 7. Should hashCode() and equals() be overridden together?

**Answer:**

Yes.

Whenever `equals()` is overridden, `hashCode()` should also be overridden.

---

# Key Takeaways

- `hashCode()` returns an integer value.
- It is inherited from the Object class.
- Used to determine bucket locations.
- Improves searching performance.
- Works together with `equals()`.
- Essential for HashMap, HashSet, and other hash-based collections.
- Frequently asked in Java interviews.

---

# Summary

The `hashCode()` method is the backbone of Java's hashing mechanism. It enables fast storage and retrieval by converting objects into integer hash values that determine bucket locations. Understanding how `hashCode()` works and its relationship with `equals()` is essential for mastering the Java Collections Framework and performing well in technical interviews.
