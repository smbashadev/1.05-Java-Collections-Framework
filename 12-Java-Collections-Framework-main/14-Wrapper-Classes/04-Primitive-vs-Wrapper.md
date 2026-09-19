# Primitive Data Types vs Wrapper Classes in Java

## Introduction

Java provides **primitive data types** for efficient memory usage and fast execution. It also provides **Wrapper Classes**, which represent primitive data types as objects.

Primitive data types and Wrapper Classes have different purposes. Primitive data types are used for storing simple values, whereas Wrapper Classes are used when objects are required, especially in the Java Collections Framework and other object-oriented APIs.

Understanding the differences between them is important for Java programming and technical interviews.

---

# Primitive Data Types

Primitive data types are built-in data types provided by Java.

They directly store values in memory.

Examples:

- byte
- short
- int
- long
- float
- double
- char
- boolean

---

# Wrapper Classes

Wrapper Classes are predefined classes that convert primitive data types into objects.

Examples:

- Byte
- Short
- Integer
- Long
- Float
- Double
- Character
- Boolean

---

# Comparison Table

| Feature | Primitive Data Type | Wrapper Class |
|---------|----------------------|---------------|
| Type | Basic Data Type | Object |
| Package | Language Keyword | java.lang |
| Stores | Actual Value | Object Representation |
| Default Value | Depends on Variable Type | null |
| Can Store null | No | Yes |
| Memory Usage | Less | More |
| Performance | Faster | Slightly Slower |
| Utility Methods | Not Available | Available |
| Used in Collections | No | Yes |
| Supports Methods | No | Yes |
| Immutable | Not Applicable | Yes |

---

# Example

## Primitive

```java
int number = 100;

System.out.println(number);
```

### Output

```
100
```

---

## Wrapper Class

```java
Integer number = Integer.valueOf(100);

System.out.println(number);
```

### Output

```
100
```

---

# When to Use Primitive Data Types

Use primitive data types when:

- High performance is required.
- Only simple values need to be stored.
- Memory optimization is important.
- Object features are not required.

---

# When to Use Wrapper Classes

Use Wrapper Classes when:

- Working with Collections Framework.
- Using Java Streams.
- Working with JDBC.
- Using Hibernate or Spring.
- Null values are required.
- Utility methods are needed.

---

# Advantages of Primitive Data Types

- Faster execution.
- Less memory consumption.
- Simple to use.
- Better performance.

---

# Advantages of Wrapper Classes

- Converts primitives into objects.
- Required for Collections Framework.
- Supports null values.
- Provides useful utility methods.
- Supports Autoboxing and Unboxing.

---

# Limitations

## Primitive Data Types

- Cannot store null.
- Cannot call methods.
- Cannot be stored directly in Collections.

## Wrapper Classes

- Consume more memory.
- Slightly slower.
- Object creation increases overhead.

---

# Real-World Applications

Primitive Data Types:

- Mathematical calculations
- Loops
- Performance-critical applications
- Embedded systems

Wrapper Classes:

- Java Collections Framework
- JDBC
- Spring Framework
- Hibernate
- Java Streams
- Enterprise Applications

---

# Interview Questions

### 1. What is the main difference between primitive data types and Wrapper Classes?

**Answer:**

Primitive data types store values directly, whereas Wrapper Classes store values as objects.

---

### 2. Which one is faster?

**Answer:**

Primitive data types.

---

### 3. Which one uses more memory?

**Answer:**

Wrapper Classes.

---

### 4. Which one can store null values?

**Answer:**

Wrapper Classes.

---

### 5. Which one is required in the Collections Framework?

**Answer:**

Wrapper Classes.

---

# Quick Revision

| Primitive | Wrapper |
|-----------|----------|
| int | Integer |
| char | Character |
| double | Double |
| boolean | Boolean |
| Faster | Primitive |
| Less Memory | Primitive |
| Supports null | Wrapper |
| Used in Collections | Wrapper |

---

# Key Takeaways

- Primitive data types store values directly.
- Wrapper Classes represent primitive values as objects.
- Primitive data types are faster and consume less memory.
- Wrapper Classes support object-oriented programming.
- Wrapper Classes are required for the Java Collections Framework.
- Wrapper Classes provide many built-in utility methods.

---

# Summary

Primitive data types and Wrapper Classes serve different purposes in Java. Primitive data types offer better performance and lower memory usage, while Wrapper Classes provide object-oriented features, utility methods, and compatibility with the Java Collections Framework. Choosing the appropriate type depends on the application's requirements.
