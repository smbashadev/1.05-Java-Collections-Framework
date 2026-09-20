# Wrapper Class Methods in Java

## Introduction

Wrapper Classes provide several built-in methods that simplify working with primitive data types and objects. These methods allow developers to convert data, compare values, parse strings, and perform various utility operations.

Learning these methods is essential for Java programming, the Java Collections Framework, JDBC, Spring, Hibernate, and technical interviews.

---

# Commonly Used Wrapper Class Methods

| Method | Description |
|---------|-------------|
| valueOf() | Converts a primitive value or String into a Wrapper object |
| parseXXX() | Converts a String into a primitive data type |
| xxxValue() | Converts a Wrapper object into a primitive value |
| toString() | Converts a value into a String |
| compare() | Compares two primitive values |
| compareTo() | Compares two Wrapper objects |
| equals() | Checks whether two Wrapper objects are equal |
| hashCode() | Returns the hash code of the object |

---

# 1. valueOf()

## Purpose

Converts a primitive value or String into a Wrapper object.

## Syntax

```java
Integer obj = Integer.valueOf(100);

Integer obj2 = Integer.valueOf("200");
```

---

# 2. parseXXX()

## Purpose

Converts a String into its corresponding primitive data type.

## Syntax

```java
int number = Integer.parseInt("100");

double value = Double.parseDouble("25.75");

boolean status = Boolean.parseBoolean("true");
```

---

# 3. xxxValue()

## Purpose

Converts a Wrapper object into its corresponding primitive data type.

## Syntax

```java
Integer obj = Integer.valueOf(100);

int number = obj.intValue();
```

---

# 4. toString()

## Purpose

Converts a primitive value or Wrapper object into a String.

## Syntax

```java
String str = Integer.toString(100);
```

---

# 5. compare()

## Purpose

Compares two primitive values.

## Syntax

```java
Integer.compare(20, 30);
```

### Return Values

| Result | Meaning |
|--------|---------|
| Negative | First value is smaller |
| Zero | Both values are equal |
| Positive | First value is greater |

---

# 6. compareTo()

## Purpose

Compares two Wrapper objects.

## Syntax

```java
Integer a = Integer.valueOf(20);
Integer b = Integer.valueOf(30);

a.compareTo(b);
```

---

# 7. equals()

## Purpose

Checks whether two Wrapper objects contain equal values.

## Syntax

```java
Integer a = Integer.valueOf(100);
Integer b = Integer.valueOf(100);

a.equals(b);
```

---

# 8. hashCode()

## Purpose

Returns the hash code of the Wrapper object.

## Syntax

```java
Integer obj = Integer.valueOf(100);

obj.hashCode();
```

---

# Example

```java
Integer number = Integer.valueOf("100");

System.out.println(number);

System.out.println(Integer.parseInt("200"));

System.out.println(number.intValue());

System.out.println(Integer.toString(300));

System.out.println(Integer.compare(10, 20));
```

### Output

```
100
200
100
300
-1
```

---

# Advantages

- Simplifies data conversion.
- Provides built-in utility methods.
- Improves code readability.
- Useful for Collections Framework.
- Frequently used in enterprise applications.

---

# Real-World Applications

Wrapper Class methods are commonly used in:

- Form validation
- Database Applications
- Banking Systems
- Student Management Systems
- Spring Applications
- Hibernate Applications
- Java Streams
- File Handling

---

# Frequently Asked Interview Questions

### 1. Which method converts a primitive into a Wrapper object?

**Answer:**

```java
valueOf()
```

---

### 2. Which method converts a String into an int?

**Answer:**

```java
Integer.parseInt()
```

---

### 3. Which method converts a Wrapper object into a primitive?

**Answer:**

```java
xxxValue()
```

Example:

```java
intValue()
```

---

### 4. Which method compares two Wrapper objects?

**Answer:**

```java
compareTo()
```

---

### 5. Which method checks equality?

**Answer:**

```java
equals()
```

---

### 6. Which method returns the hash code?

**Answer:**

```java
hashCode()
```

---

# Quick Revision

| Method | Purpose |
|---------|---------|
| valueOf() | Primitive/String → Wrapper |
| parseXXX() | String → Primitive |
| xxxValue() | Wrapper → Primitive |
| toString() | Value → String |
| compare() | Compare primitive values |
| compareTo() | Compare Wrapper objects |
| equals() | Check equality |
| hashCode() | Return hash code |

---

# Key Takeaways

- Wrapper Classes provide many built-in utility methods.
- `valueOf()` creates Wrapper objects.
- `parseXXX()` converts Strings into primitive values.
- `xxxValue()` converts Wrapper objects into primitive values.
- `compare()` and `compareTo()` are used for comparisons.
- These methods are frequently used in Java interviews.

---

# Summary

Wrapper Classes provide powerful utility methods that simplify data conversion, comparison, validation, and object manipulation. Methods such as `valueOf()`, `parseXXX()`, `xxxValue()`, `compare()`, `compareTo()`, and `equals()` are widely used in Java programming and are among the most frequently asked topics in Java technical interviews.
