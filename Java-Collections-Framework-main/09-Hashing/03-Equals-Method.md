# equals() Method in Java

## Introduction

The **equals()** method is one of the most important methods in Java. It is used to compare two objects and determine whether they are logically equal.

The `equals()` method plays a major role in the Java Collections Framework. Collections such as **HashSet**, **HashMap**, **LinkedHashSet**, **LinkedHashMap**, and **Hashtable** use the `equals()` method along with the `hashCode()` method to identify duplicate objects.

Understanding `equals()` is essential for writing efficient Java programs and performing well in technical interviews.

---

# Definition

The **equals()** method compares two objects for logical equality.

It returns:

- `true` if both objects are considered equal.
- `false` otherwise.

---

# Method Signature

```java
public boolean equals(Object obj)
```

---

# Why is equals() Needed?

Without `equals()`, Java would compare only object references instead of object contents.

Using `equals()` allows Java to:

- Compare object data
- Identify duplicate objects
- Remove duplicate entries from collections
- Improve collection accuracy

---

# How equals() Works

The comparison process follows these steps:

1. Two objects are compared.
2. Java calls the `equals()` method.
3. The object data is compared.
4. If both objects contain the same logical data, the method returns `true`.
5. Otherwise, it returns `false`.

---

# Working Diagram

```text
Object A
      │
      ▼
equals()
      ▲
      │
Object B
      │
      ▼
true / false
```

---

# Example

```java
String str1 = "Java";
String str2 = "Java";

System.out.println(str1.equals(str2));
```

### Output

```text
true
```

Both objects contain the same text, so `equals()` returns `true`.

---

# Default equals()

Every Java class inherits the `equals()` method from the **Object** class.

By default, it compares object references.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();

System.out.println(s1.equals(s2));
```

### Output

```text
false
```

Although both objects belong to the same class, they are different objects.

---

# Overriding equals()

For custom classes, developers usually override the `equals()` method to compare object data instead of object references.

Whenever `equals()` is overridden, `hashCode()` should also be overridden.

---

# Relationship Between equals() and hashCode()

Both methods work together in hash-based collections.

- `hashCode()` identifies the bucket.
- `equals()` identifies the exact object inside that bucket.

---

# Rules of equals()

## Rule 1

Every object must be equal to itself.

```java
x.equals(x) == true
```

---

## Rule 2

If `x.equals(y)` is true, then `y.equals(x)` must also be true.

---

## Rule 3

If two objects are equal, they must produce the same hash code.

---

## Rule 4

If two objects are not equal, they may still have the same hash code.

---

## Rule 5

Repeated calls to `equals()` should return the same result if the objects do not change.

---

# Advantages

- Compares object contents
- Helps identify duplicate objects
- Used internally by hash-based collections
- Improves collection accuracy
- Supports logical equality

---

# Limitations

- Incorrect implementation may produce unexpected results.
- Should always be consistent with `hashCode()`.
- Default implementation compares references only.

---

# Collections That Use equals()

The following classes internally use `equals()`:

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet
- Hashtable

---

# Real-World Applications

The `equals()` method is commonly used in:

- Login systems
- Student record comparison
- Employee management
- Banking applications
- Product comparison
- Database applications
- Search systems

---

# Frequently Asked Interview Questions

### 1. What is equals()?

**Answer:**

It compares two objects for logical equality.

---

### 2. Which class defines equals()?

**Answer:**

Object class.

---

### 3. What is the return type of equals()?

**Answer:**

```java
boolean
```

---

### 4. What is the parameter of equals()?

**Answer:**

```java
Object obj
```

---

### 5. Why is equals() used?

**Answer:**

To compare object contents instead of object references.

---

### 6. Which collections use equals()?

**Answer:**

- HashMap
- HashSet
- LinkedHashMap
- LinkedHashSet
- Hashtable

---

### 7. Should equals() and hashCode() be overridden together?

**Answer:**

Yes.

Both methods should be overridden together to maintain the contract required by hash-based collections.

---

# Key Takeaways

- `equals()` compares object contents.
- It is inherited from the Object class.
- Returns a boolean value.
- Used to identify logically equal objects.
- Works together with `hashCode()`.
- Essential for HashMap, HashSet, and other hash-based collections.
- Frequently asked in Java interviews.

---

# Summary

The `equals()` method is a fundamental part of Java's object comparison mechanism. It enables logical comparison of objects and works together with `hashCode()` to ensure the correct behavior of hash-based collections. Understanding `equals()`, its rules, and its relationship with `hashCode()` is essential for mastering the Java Collections Framework and succeeding in Java technical interviews.
