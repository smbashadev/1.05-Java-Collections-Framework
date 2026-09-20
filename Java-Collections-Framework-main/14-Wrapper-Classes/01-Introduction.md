# Introduction to Wrapper Classes in Java

## Introduction

Wrapper Classes are one of the fundamental concepts in Java. They provide a way to convert **primitive data types** into **objects**. Since the Java Collections Framework works only with objects, wrapper classes play a vital role in storing primitive values inside collections such as `ArrayList`, `LinkedList`, `HashSet`, and `HashMap`.

Wrapper classes are part of the **java.lang** package and are automatically available without importing any package.

Understanding wrapper classes is essential for Java programming, Collections Framework, Exception Handling, JDBC, and technical interviews.

---

# Definition

A **Wrapper Class** is a predefined Java class that wraps a primitive data type into an object.

In simple words, a wrapper class converts primitive values into objects.

---

# Why Wrapper Classes?

Primitive data types are not objects.

Many Java APIs and classes work only with objects.

Wrapper classes bridge the gap between primitive data types and objects.

---

# Wrapper Classes in Java

| Primitive Data Type | Wrapper Class |
|---------------------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# Package

All wrapper classes belong to the following package:

```java
java.lang
```

No import statement is required.

---

# Basic Example

```java
int number = 100;

Integer obj = Integer.valueOf(number);

System.out.println(obj);
```

### Output

```
100
```

---

# Characteristics

- Converts primitive data into objects.
- Belongs to the `java.lang` package.
- Used extensively in the Collections Framework.
- Provides useful utility methods.
- Supports Autoboxing and Unboxing.
- Immutable in nature.

---

# Where Wrapper Classes Are Used

Wrapper classes are commonly used in:

- Java Collections Framework
- JDBC
- Hibernate
- Spring Framework
- File Handling
- Exception Handling
- Java Streams
- Enterprise Applications

---

# Advantages

- Converts primitives into objects.
- Required for Collections Framework.
- Provides built-in utility methods.
- Supports automatic conversion through Autoboxing and Unboxing.
- Improves compatibility with Java APIs.

---

# Limitations

- Uses more memory than primitive data types.
- Slightly slower because objects are created.
- Excessive object creation may affect performance.

---

# Real-World Applications

Wrapper classes are widely used in:

- Student Management Systems
- Banking Applications
- Employee Management Systems
- E-Commerce Applications
- Inventory Management
- Healthcare Systems
- Financial Applications
- Enterprise Software

---

# Interview Questions

### 1. What is a Wrapper Class?

**Answer:**

A Wrapper Class is a predefined Java class that converts a primitive data type into an object.

---

### 2. Why are Wrapper Classes required?

**Answer:**

Because many Java APIs and the Collections Framework work only with objects.

---

### 3. Which package contains Wrapper Classes?

**Answer:**

```java
java.lang
```

---

### 4. Are Wrapper Classes immutable?

**Answer:**

Yes.

Wrapper class objects are immutable.

---

### 5. Which Wrapper Class represents the int data type?

**Answer:**

```java
Integer
```

---

# Key Takeaways

- Wrapper Classes convert primitive data types into objects.
- They belong to the `java.lang` package.
- They are required for the Java Collections Framework.
- They support Autoboxing and Unboxing.
- Wrapper Classes are immutable.

---

# Summary

Wrapper Classes provide object representations of Java primitive data types, enabling their use in object-oriented APIs such as the Java Collections Framework. They also offer numerous utility methods and support automatic conversions through Autoboxing and Unboxing, making them an essential concept for Java developers and technical interviews.
