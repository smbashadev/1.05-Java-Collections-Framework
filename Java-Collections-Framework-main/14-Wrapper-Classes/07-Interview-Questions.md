# Wrapper Classes Interview Questions and Answers

## Introduction

Wrapper Classes are one of the most important topics in Java and are frequently asked in technical interviews. They convert primitive data types into objects, making them compatible with the Java Collections Framework and other object-oriented APIs.

This document contains commonly asked Wrapper Class interview questions with simple, beginner-friendly answers.

---

# 1. What is a Wrapper Class?

**Answer:**

A Wrapper Class is a predefined Java class that converts a primitive data type into an object.

---

# 2. Why are Wrapper Classes required?

**Answer:**

Wrapper Classes are required because many Java APIs, including the Java Collections Framework, work only with objects.

---

# 3. Which package contains Wrapper Classes?

**Answer:**

```java
java.lang
```

---

# 4. How many Wrapper Classes are available in Java?

**Answer:**

There are **eight** Wrapper Classes.

---

# 5. List all Wrapper Classes.

| Primitive | Wrapper Class |
|-----------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# 6. Which Wrapper Class represents the int data type?

**Answer:**

```java
Integer
```

---

# 7. Which Wrapper Class represents the char data type?

**Answer:**

```java
Character
```

---

# 8. Which Wrapper Class represents the boolean data type?

**Answer:**

```java
Boolean
```

---

# 9. Are Wrapper Classes immutable?

**Answer:**

Yes.

Wrapper Class objects are immutable.

---

# 10. Can Wrapper Classes store null values?

**Answer:**

Yes.

Example:

```java
Integer number = null;
```

---

# 11. Can primitive data types store null values?

**Answer:**

No.

Primitive variables cannot store `null`.

---

# 12. Which method creates a Wrapper object?

**Answer:**

```java
valueOf()
```

Example:

```java
Integer.valueOf(100);
```

---

# 13. Which method converts a String into an int?

**Answer:**

```java
Integer.parseInt()
```

---

# 14. Which method converts a Wrapper object into a primitive value?

**Answer:**

The `xxxValue()` methods.

Example:

```java
intValue()
doubleValue()
booleanValue()
```

---

# 15. Which method converts a value into a String?

**Answer:**

```java
toString()
```

---

# 16. Which method compares two Wrapper objects?

**Answer:**

```java
compareTo()
```

---

# 17. Which method compares two primitive values?

**Answer:**

```java
compare()
```

---

# 18. Which method checks equality?

**Answer:**

```java
equals()
```

---

# 19. Which method returns the hash code?

**Answer:**

```java
hashCode()
```

---

# 20. Why are Wrapper Classes used in the Collections Framework?

**Answer:**

Because Collections Framework stores only objects.

---

# 21. Which Java feature automatically converts primitive values into Wrapper objects?

**Answer:**

Autoboxing.

---

# 22. Which Java feature automatically converts Wrapper objects into primitive values?

**Answer:**

Unboxing.

---

# 23. Which Wrapper Class provides the parseInt() method?

**Answer:**

```java
Integer
```

---

# 24. What are the advantages of Wrapper Classes?

**Answer:**

- Converts primitive values into objects.
- Required for Collections Framework.
- Supports null values.
- Provides utility methods.
- Supports Autoboxing and Unboxing.

---

# 25. What are the limitations of Wrapper Classes?

**Answer:**

- Consume more memory.
- Slightly slower than primitive data types.
- Object creation increases overhead.

---

# Comparison Table

| Feature | Primitive Data Type | Wrapper Class |
|---------|----------------------|---------------|
| Type | Basic Data Type | Object |
| Stores | Value | Object |
| Can Store null | No | Yes |
| Memory Usage | Less | More |
| Performance | Faster | Slightly Slower |
| Utility Methods | No | Yes |
| Collections Support | No | Yes |

---

# Quick Revision

| Question | Answer |
|----------|--------|
| Number of Wrapper Classes | 8 |
| Package | java.lang |
| int Wrapper | Integer |
| char Wrapper | Character |
| boolean Wrapper | Boolean |
| Primitive → Object | valueOf() |
| String → Primitive | parseXXX() |
| Wrapper → Primitive | xxxValue() |
| Compare Objects | compareTo() |
| Compare Values | compare() |
| Equality | equals() |
| Hash Code | hashCode() |

---

# Key Takeaways

- Java provides eight Wrapper Classes.
- Wrapper Classes convert primitive data types into objects.
- They belong to the `java.lang` package.
- They are immutable.
- They provide many built-in utility methods.
- They support Autoboxing and Unboxing.
- They are essential for the Java Collections Framework.
- Wrapper Classes are one of the most frequently asked Java interview topics.

---

# Summary

Wrapper Classes provide object representations of Java primitive data types, enabling their use with the Java Collections Framework and other object-oriented APIs. They also offer powerful utility methods, support automatic conversions through Autoboxing and Unboxing, and are indispensable for modern Java development and technical interviews.
