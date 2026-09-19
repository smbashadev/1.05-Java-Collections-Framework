# Unboxing in Java

## Introduction

**Unboxing** is a feature introduced in **Java 5** that automatically converts a **Wrapper Class object** into its corresponding **primitive data type**.

Before Java 5, developers had to manually extract primitive values from Wrapper objects by calling methods such as `intValue()`, `doubleValue()`, and `booleanValue()`. With Unboxing, the Java compiler performs this conversion automatically, resulting in cleaner and more readable code.

Unboxing is widely used in Java Collections Framework, JDBC, Spring, Hibernate, Java Streams, and enterprise applications.

---

# Definition

Unboxing is the **automatic conversion of a Wrapper Class object into its corresponding primitive data type**.

---

# Syntax

```java
Integer obj = Integer.valueOf(100);

int number = obj;
```

The Java compiler automatically converts it into:

```java
int number = obj.intValue();
```

---

# Wrapper to Primitive Conversion

| Wrapper Class | Primitive Data Type |
|---------------|---------------------|
| Byte | byte |
| Short | short |
| Integer | int |
| Long | long |
| Float | float |
| Double | double |
| Character | char |
| Boolean | boolean |

---

# How Unboxing Works

### Step 1

Create a Wrapper object.

```java
Integer obj = Integer.valueOf(100);
```

---

### Step 2

Assign the Wrapper object to a primitive variable.

```java
int number = obj;
```

---

### Step 3

The compiler automatically converts it into:

```java
int number = obj.intValue();
```

---

# Basic Example

```java
Integer marks = Integer.valueOf(95);

int score = marks;

System.out.println(score);
```

### Output

```
95
```

---

# Unboxing with Collections

Elements stored in collections are Wrapper objects.

Example:

```java
ArrayList list = new ArrayList();

list.add(100);
list.add(200);

int value = (Integer) list.get(0);

System.out.println(value);
```

The retrieved `Integer` object is automatically unboxed into the primitive `int`.

### Output

```
100
```

---

# Advantages

- Automatic conversion from Wrapper objects to primitive values.
- Reduces manual coding.
- Improves code readability.
- Makes programs shorter and cleaner.
- Simplifies working with Collections Framework.

---

# Limitations

- Cannot unbox a `null` Wrapper object.
- Unboxing a `null` value causes a `NullPointerException`.
- Excessive boxing and unboxing may reduce performance.

---

# Real-World Applications

Unboxing is commonly used in:

- Java Collections Framework
- JDBC Applications
- Spring Framework
- Hibernate
- Java Streams
- Banking Applications
- Employee Management Systems
- Enterprise Software

---

# Interview Questions

### 1. What is Unboxing?

**Answer:**

Unboxing is the automatic conversion of a Wrapper Class object into its corresponding primitive data type.

---

### 2. In which Java version was Unboxing introduced?

**Answer:**

Java 5.

---

### 3. Which method is internally used during Unboxing?

**Answer:**

The corresponding `xxxValue()` method.

Examples:

```java
intValue()
doubleValue()
charValue()
booleanValue()
```

---

### 4. What happens if a null Wrapper object is unboxed?

**Answer:**

A `NullPointerException` is thrown.

---

### 5. Where is Unboxing commonly used?

**Answer:**

It is commonly used in the Java Collections Framework and other object-oriented APIs.

---

# Quick Revision

| Wrapper Object | Primitive Value |
|----------------|-----------------|
| Integer | int |
| Double | double |
| Character | char |
| Boolean | boolean |
| Automatic Conversion | Unboxing |
| Internal Method | xxxValue() |
| Introduced In | Java 5 |

---

# Key Takeaways

- Unboxing converts Wrapper objects into primitive values automatically.
- Introduced in Java 5.
- Internally uses `xxxValue()` methods.
- Frequently used with Collections Framework.
- Avoid unboxing `null` Wrapper objects because it throws `NullPointerException`.
- Makes Java programs simpler and more readable.

---

# Summary

Unboxing automatically converts Wrapper Class objects into their corresponding primitive data types, eliminating the need for manual conversion methods. It improves code readability, simplifies programming, and is extensively used throughout the Java Collections Framework and enterprise Java applications. Understanding Unboxing is essential for Java development and technical interviews.
