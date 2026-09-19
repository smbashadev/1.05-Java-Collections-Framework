# List of Wrapper Classes in Java

## Introduction

Java provides **eight Wrapper Classes**, one for each primitive data type. These classes are predefined and belong to the **java.lang** package.

Wrapper Classes convert primitive values into objects, making them compatible with the Java Collections Framework and other object-oriented APIs.

Knowing the Wrapper Classes is a fundamental requirement for Java programming and technical interviews.

---

# What is a Wrapper Class?

A Wrapper Class is a predefined Java class that represents a primitive data type as an object.

Each primitive data type has a corresponding Wrapper Class.

---

# Complete List of Wrapper Classes

| Primitive Data Type | Wrapper Class | Size | Default Value |
|---------------------|---------------|------|---------------|
| byte | Byte | 1 Byte | null |
| short | Short | 2 Bytes | null |
| int | Integer | 4 Bytes | null |
| long | Long | 8 Bytes | null |
| float | Float | 4 Bytes | null |
| double | Double | 8 Bytes | null |
| char | Character | 2 Bytes | null |
| boolean | Boolean | JVM Dependent | null |

---

# Primitive to Wrapper Mapping

```text
byte      → Byte
short     → Short
int       → Integer
long      → Long
float     → Float
double    → Double
char      → Character
boolean   → Boolean
```

---

# Wrapper Classes Package

All Wrapper Classes belong to:

```java
java.lang
```

No import statement is required.

---

# Example

```java
Byte b = Byte.valueOf((byte)10);
Short s = Short.valueOf((short)20);
Integer i = Integer.valueOf(30);
Long l = Long.valueOf(40L);
Float f = Float.valueOf(50.5f);
Double d = Double.valueOf(60.25);
Character c = Character.valueOf('A');
Boolean bool = Boolean.valueOf(true);

System.out.println(i);
System.out.println(c);
System.out.println(bool);
```

### Output

```
30
A
true
```

---

# Common Utility Methods

Most Wrapper Classes provide useful methods such as:

- valueOf()
- parseXXX()
- toString()
- compare()
- compareTo()
- equals()
- hashCode()

Example:

```java
Integer.valueOf("100");
Integer.parseInt("100");
Integer.toString(100);
```

---

# Characteristics

- One Wrapper Class exists for every primitive type.
- Wrapper Classes are immutable.
- They belong to the `java.lang` package.
- They support Autoboxing and Unboxing.
- They provide several utility methods.
- They are widely used in Java applications.

---

# Advantages

- Converts primitive values into objects.
- Required for Java Collections Framework.
- Provides built-in utility methods.
- Supports automatic conversion.
- Improves compatibility with Java APIs.

---

# Real-World Applications

Wrapper Classes are used in:

- Java Collections Framework
- JDBC Applications
- Hibernate
- Spring Framework
- Spring Boot
- Java Streams
- Enterprise Applications
- Banking Systems

---

# Interview Questions

### 1. How many Wrapper Classes are available in Java?

**Answer:**

Eight.

---

### 2. Which Wrapper Class represents the int data type?

**Answer:**

```java
Integer
```

---

### 3. Which Wrapper Class represents the char data type?

**Answer:**

```java
Character
```

---

### 4. Which Wrapper Class represents the boolean data type?

**Answer:**

```java
Boolean
```

---

### 5. Which package contains Wrapper Classes?

**Answer:**

```java
java.lang
```

---

# Quick Revision

| Primitive | Wrapper |
|-----------|----------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# Key Takeaways

- Java provides eight Wrapper Classes.
- Every primitive data type has one corresponding Wrapper Class.
- Wrapper Classes belong to the `java.lang` package.
- They are immutable.
- They support Autoboxing and Unboxing.
- They are essential for the Java Collections Framework.

---

# Summary

Java provides eight Wrapper Classes to represent primitive data types as objects. These classes enable primitive values to work with object-oriented APIs, especially the Java Collections Framework. They also provide numerous utility methods and support automatic conversion through Autoboxing and Unboxing, making them indispensable for Java development and technical interviews.
