# Dictionary in Java

## Introduction

**Dictionary** is one of the oldest classes in Java and is considered a **Legacy Class**. It was introduced before the Java Collections Framework to store data in the form of **key-value pairs**.

Dictionary is an **abstract class**, which means its objects cannot be created directly. Classes such as **Hashtable** extend Dictionary and provide its implementation.

Today, Dictionary has been largely replaced by the **Map** interface and its implementations such as **HashMap**, **LinkedHashMap**, and **TreeMap**. However, it remains an important topic for understanding the history of Java Collections and for interview preparation.

---

# Definition

A **Dictionary** is an abstract class that stores data as **key-value pairs**, where each key is associated with a single value.

---

# Package

```java
java.util.Dictionary
```

---

# Declaration

```java
Dictionary dictionary;
```

Since Dictionary is an abstract class, it cannot be instantiated directly.

```java
Dictionary dictionary = new Hashtable();
```

---

# Features of Dictionary

- Abstract class.
- Stores data as key-value pairs.
- Each key is unique.
- One value is associated with each key.
- Cannot be instantiated directly.
- Implemented by Hashtable.
- Part of the `java.util` package.
- Considered a Legacy Class.

---

# Internal Working

1. Dictionary provides the basic structure for storing key-value pairs.
2. It defines abstract methods for inserting, retrieving, and removing data.
3. Concrete classes such as Hashtable provide the actual implementation.
4. Data is accessed using unique keys.

---

# Commonly Used Methods

| Method | Description |
|---------|-------------|
| `put()` | Adds a key-value pair |
| `get()` | Retrieves the value associated with a key |
| `remove()` | Removes a key-value pair |
| `size()` | Returns the number of entries |
| `isEmpty()` | Checks whether the Dictionary is empty |
| `keys()` | Returns all keys |
| `elements()` | Returns all values |

---

# Example

```java
Dictionary dictionary = new Hashtable();

dictionary.put(101, "Rahul");
dictionary.put(102, "Anita");
dictionary.put(103, "Kiran");

System.out.println(dictionary.get(102));

System.out.println(dictionary.size());

dictionary.remove(101);

System.out.println(dictionary.size());
```

### Output

```
Anita
3
2
```

---

# Advantages

- Simple key-value storage.
- Provides the foundation for Hashtable.
- Easy to understand.
- Suitable for maintaining older Java applications.
- Still supported for backward compatibility.

---

# Limitations

- Abstract class; cannot be instantiated directly.
- Considered obsolete for modern Java development.
- Replaced by the Map interface.
- Limited functionality compared to modern collections.

---

# Dictionary vs Map

| Feature | Dictionary | Map |
|---------|------------|-----|
| Type | Abstract Class | Interface |
| Introduced | Before Java 1.2 | Java 1.2 |
| Preferred Today | No | Yes |
| Implementation | Hashtable | HashMap, LinkedHashMap, TreeMap, Hashtable |
| Flexibility | Less | More |

---

# Real-World Applications

Dictionary concepts are found in:

- Legacy Java Applications
- Enterprise Maintenance Projects
- Banking Software
- Government Systems
- Educational Examples
- Java Collections History

---

# Interview Questions

### 1. What is Dictionary in Java?

**Answer:**

Dictionary is an abstract Legacy Class used to store data as key-value pairs.

---

### 2. Can we create an object of Dictionary?

**Answer:**

No.

Dictionary is an abstract class.

---

### 3. Which class implements Dictionary?

**Answer:**

Hashtable.

---

### 4. Is Dictionary used in modern Java applications?

**Answer:**

Generally, no.

The Map interface and its implementations are preferred.

---

### 5. Why should we learn Dictionary?

**Answer:**

It helps in understanding the evolution of Java Collections and is a common interview topic.

---

# Quick Revision

| Property | Value |
|----------|-------|
| Package | java.util |
| Type | Abstract Class |
| Data Structure | Key-Value Pair |
| Object Creation | Not Possible |
| Implemented By | Hashtable |
| Modern Replacement | Map Interface |

---

# Key Takeaways

- Dictionary is a Legacy Class.
- It is an abstract class.
- It stores data as key-value pairs.
- Hashtable extends Dictionary.
- Modern Java uses the Map interface instead of Dictionary.
- Dictionary is important for understanding legacy Java code and interview preparation.

---

# Summary

Dictionary is an abstract Legacy Class that introduced key-value storage in Java before the Java Collections Framework. Although it has been replaced by the Map interface in modern Java development, it remains valuable for understanding legacy applications, the evolution of Java collections, and technical interview concepts.
