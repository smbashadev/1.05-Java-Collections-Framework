# Constructors of LinkedList

## Introduction

Before storing elements in a **LinkedList**, an object of the LinkedList class must be created. Java provides multiple constructors that allow developers to create a LinkedList in different ways depending on the application's requirements.

Constructors initialize the LinkedList object and prepare it to store elements. Choosing the appropriate constructor helps simplify programming and makes working with collections more efficient.

The **LinkedList** class provides **two constructors**.

---

# What is a Constructor?

A **constructor** is a special method that is automatically executed when an object is created.

For a LinkedList, the constructor is responsible for:

- Creating the LinkedList object
- Initializing the internal data structure
- Preparing the list to store elements

---

# Constructors of LinkedList

The LinkedList class provides the following constructors:

1. LinkedList()
2. LinkedList(Collection c)

---

# 1. LinkedList()

## Syntax

```java
LinkedList list = new LinkedList();
```

## Description

This is the **default constructor**.

It creates an empty LinkedList with no elements.

Memory for nodes is allocated dynamically as elements are added.

## When to Use

Use this constructor when:

- The number of elements is unknown.
- Elements will be added dynamically.
- A new empty LinkedList is required.

## Example Scenario

A customer registration system where new customers are added continuously.

---

# 2. LinkedList(Collection c)

## Syntax

```java
LinkedList list = new LinkedList(existingCollection);
```

## Description

This constructor creates a new LinkedList containing all the elements from another Collection.

The order of elements is preserved according to the source Collection.

## Advantages

- Quickly copies an existing Collection.
- Simplifies Collection conversion.
- Eliminates manual copying of elements.

## When to Use

Use this constructor when:

- Copying an existing Collection.
- Converting another Collection into a LinkedList.
- Creating a duplicate list before making modifications.

## Example Scenario

Creating a backup copy of an existing employee list before updating records.

---

# Constructor Comparison

| Constructor | Purpose | Typical Use Case |
|-------------|---------|------------------|
| LinkedList() | Creates an empty LinkedList | Dynamic applications with unknown data size |
| LinkedList(Collection c) | Creates a LinkedList from another Collection | Copying or converting Collections |

---

# Choosing the Right Constructor

Use the constructor based on your application's requirements.

| Requirement | Recommended Constructor |
|-------------|-------------------------|
| Create an empty LinkedList | LinkedList() |
| Copy another Collection | LinkedList(Collection c) |

---

# Internal Working

When a LinkedList object is created:

1. The constructor creates an empty LinkedList object.
2. Initially, no nodes are present.
3. Nodes are created dynamically as elements are added.
4. When using the Collection constructor, all elements from the source Collection are copied into newly created nodes.

---

# Real-World Applications

## Student Management System

Use:

```java
LinkedList()
```

Students are added dynamically as they enroll.

---

## Inventory Management System

Use:

```java
LinkedList(Collection c)
```

Create a working copy of an existing inventory before processing updates.

---

# Interview Questions

### 1. How many constructors does LinkedList provide?

Two.

---

### 2. Which constructor creates an empty LinkedList?

```java
LinkedList()
```

---

### 3. Which constructor copies another Collection?

```java
LinkedList(Collection c)
```

---

### 4. Does LinkedList provide an initial capacity constructor like ArrayList?

No.

LinkedList allocates memory dynamically through nodes and therefore does not require an initial capacity.

---

### 5. Which constructor should be used to duplicate an existing Collection?

```java
LinkedList(Collection c)
```

---

# Key Points

- LinkedList provides two constructors.
- The default constructor creates an empty LinkedList.
- The Collection constructor copies elements from another Collection.
- LinkedList does not provide an initial capacity constructor.
- Memory is allocated dynamically through nodes.
- Selecting the appropriate constructor simplifies application development.

---

# Summary

The LinkedList class provides two constructors that support different programming scenarios. The default constructor is used to create an empty LinkedList for dynamically growing data, while the Collection constructor creates a new LinkedList by copying elements from an existing Collection. Understanding these constructors helps developers efficiently create and manage LinkedList objects in Java applications and prepares them for technical interviews.
