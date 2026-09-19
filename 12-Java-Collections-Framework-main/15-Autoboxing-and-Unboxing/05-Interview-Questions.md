# Autoboxing and Unboxing Interview Questions and Answers

## Introduction

Autoboxing and Unboxing are among the most frequently asked Java interview topics. They simplify the conversion between primitive data types and Wrapper Class objects, making Java code cleaner and easier to maintain.

This document contains commonly asked interview questions with simple and beginner-friendly answers.

---

# 1. What is Autoboxing?

**Answer:**

Autoboxing is the automatic conversion of a primitive data type into its corresponding Wrapper Class object.

Example:

```java
int number = 100;

Integer obj = number;
```

---

# 2. What is Unboxing?

**Answer:**

Unboxing is the automatic conversion of a Wrapper Class object into its corresponding primitive data type.

Example:

```java
Integer obj = Integer.valueOf(100);

int number = obj;
```

---

# 3. In which Java version were Autoboxing and Unboxing introduced?

**Answer:**

Java 5.

---

# 4. Why were Autoboxing and Unboxing introduced?

**Answer:**

To eliminate manual conversion between primitive data types and Wrapper objects, making Java code simpler and more readable.

---

# 5. Which method is internally used during Autoboxing?

**Answer:**

```java
valueOf()
```

Example:

```java
Integer.valueOf(100);
```

---

# 6. Which method is internally used during Unboxing?

**Answer:**

The corresponding `xxxValue()` method.

Examples:

```java
intValue()
doubleValue()
booleanValue()
charValue()
```

---

# 7. What is the main advantage of Autoboxing?

**Answer:**

It automatically converts primitive values into Wrapper objects, reducing manual coding.

---

# 8. What is the main advantage of Unboxing?

**Answer:**

It automatically converts Wrapper objects into primitive values.

---

# 9. Why is Autoboxing important in the Collections Framework?

**Answer:**

Because the Java Collections Framework stores only objects, not primitive data types.

---

# 10. Can primitive data types be stored directly in an ArrayList?

**Answer:**

No.

Primitive values are automatically converted into Wrapper objects through Autoboxing.

---

# 11. What happens if a null Wrapper object is unboxed?

**Answer:**

A `NullPointerException` is thrown.

Example:

```java
Integer number = null;

int value = number;
```

---

# 12. Does Autoboxing create Wrapper objects?

**Answer:**

Yes.

The compiler automatically creates Wrapper objects.

---

# 13. Does Unboxing create new objects?

**Answer:**

No.

It extracts the primitive value from an existing Wrapper object.

---

# 14. Can Autoboxing affect performance?

**Answer:**

Yes.

Frequent creation of Wrapper objects can increase memory usage and slightly reduce performance.

---

# 15. Where are Autoboxing and Unboxing commonly used?

**Answer:**

- Java Collections Framework
- JDBC
- Spring Framework
- Hibernate
- Java Streams
- Enterprise Applications

---

# 16. Which Wrapper Class corresponds to the int data type?

**Answer:**

```java
Integer
```

---

# 17. Which Wrapper Class corresponds to the double data type?

**Answer:**

```java
Double
```

---

# 18. Which Wrapper Class corresponds to the boolean data type?

**Answer:**

```java
Boolean
```

---

# 19. Which Wrapper Class corresponds to the char data type?

**Answer:**

```java
Character
```

---

# 20. Are Autoboxing and Unboxing performed manually?

**Answer:**

No.

The Java compiler performs them automatically.

---

# Comparison Table

| Feature | Autoboxing | Unboxing |
|---------|------------|-----------|
| Conversion | Primitive → Wrapper | Wrapper → Primitive |
| Introduced In | Java 5 | Java 5 |
| Internal Method | valueOf() | xxxValue() |
| Returns | Wrapper Object | Primitive Value |
| Used In | Collections Framework | Retrieving Primitive Values |

---

# Quick Revision

| Question | Answer |
|----------|--------|
| Primitive → Wrapper | Autoboxing |
| Wrapper → Primitive | Unboxing |
| Java Version | Java 5 |
| Autoboxing Method | valueOf() |
| Unboxing Method | xxxValue() |
| Collections Store | Objects |
| Null Unboxing | NullPointerException |

---

# Key Takeaways

- Autoboxing automatically converts primitive values into Wrapper objects.
- Unboxing automatically converts Wrapper objects into primitive values.
- Both features were introduced in Java 5.
- Autoboxing internally uses `valueOf()`.
- Unboxing internally uses `xxxValue()` methods.
- Collections Framework relies heavily on Autoboxing.
- Avoid unboxing `null` Wrapper objects.
- These are important Java interview topics.

---

# Summary

Autoboxing and Unboxing simplify Java programming by automatically converting between primitive data types and Wrapper Class objects. They improve code readability, reduce manual conversion, and are extensively used in the Java Collections Framework and enterprise applications. Understanding these concepts is essential for Java development and technical interviews.
