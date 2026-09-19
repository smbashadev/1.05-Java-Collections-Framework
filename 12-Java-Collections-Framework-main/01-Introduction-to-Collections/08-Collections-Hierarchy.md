# Collections Hierarchy

## Introduction

The **Java Collections Framework (JCF)** provides a well-organized hierarchy of interfaces and implementation classes that simplifies the storage and manipulation of groups of objects.

Instead of creating separate and unrelated data structures, Java organizes its Collection classes into a hierarchical architecture. This hierarchy improves code reusability, maintainability, flexibility, and consistency.

Understanding the Collections Hierarchy is one of the most important concepts in Java and is frequently asked in technical interviews.

---

# What is the Collections Hierarchy?

The **Collections Hierarchy** represents the relationship between the interfaces and implementation classes available in the Java Collections Framework.

It shows:

- Root interfaces
- Child interfaces
- Implementation classes
- Separate Map hierarchy

This hierarchy helps developers choose the appropriate Collection implementation based on their application requirements.

---

# Complete Collections Hierarchy

```text
                                 Iterable
                                     │
                                     │
                              Collection
                                     │
        ┌────────────────────────────┼────────────────────────────┐
        │                            │                            │
       List                         Set                         Queue
        │                            │                            │
  ┌─────┼─────────┐          ┌────────┼─────────┐            ┌─────┴─────┐
  │     │         │          │        │         │            │           │
ArrayList LinkedList Vector HashSet LinkedHashSet TreeSet PriorityQueue ArrayDeque
                  │
                Stack


                     Map (Separate Hierarchy)
                             │
          ┌──────────────────┼──────────────────┐
          │                  │                  │
       HashMap        LinkedHashMap         TreeMap
          │
      Hashtable (Legacy)
```

> **Important:** The **Map** interface is **not** a child of the **Collection** interface. It belongs to the Java Collections Framework but follows a separate hierarchy because it stores **key-value pairs** instead of individual objects.

---

# Hierarchy Explanation

## 1. Iterable Interface

The **Iterable** interface is the top-most interface for traversing objects.

### Purpose

- Supports iteration using loops.
- Enables the enhanced for-each loop.

Every Collection implementation ultimately inherits the ability to iterate through elements.

---

## 2. Collection Interface

The **Collection** interface is the root interface of the Java Collections Framework.

It defines common operations that all Collection implementations support.

Some common operations include:

- Add elements
- Remove elements
- Check size
- Search elements
- Clear Collection
- Traverse elements

The Collection interface is extended by:

- List
- Set
- Queue

---

## 3. List Interface

The **List** interface represents an ordered collection of elements.

### Characteristics

- Maintains insertion order
- Allows duplicate elements
- Supports index-based access
- Stores multiple null values (implementation dependent)

### Common Implementations

- ArrayList
- LinkedList
- Vector
- Stack

---

## 4. Set Interface

The **Set** interface represents a collection of unique elements.

### Characteristics

- Does not allow duplicate elements
- No index-based access
- Optimized for uniqueness

### Common Implementations

- HashSet
- LinkedHashSet
- TreeSet

---

## 5. Queue Interface

The **Queue** interface is designed for processing elements in a specific order.

Generally, Queue follows the **FIFO (First In, First Out)** principle.

### Common Implementations

- PriorityQueue
- ArrayDeque

Queue is commonly used for:

- Task scheduling
- Job processing
- Message processing
- Request handling

---

## 6. Deque Interface

**Deque** stands for **Double Ended Queue**.

It allows insertion and deletion from both the front and rear.

### Common Implementation

- ArrayDeque

Applications include:

- Browser history
- Undo and Redo operations
- Scheduling systems

---

## 7. Map Interface

The **Map** interface stores data in the form of **key-value pairs**.

Unlike Collection interfaces, Map stores two related objects together.

### Characteristics

- Unique keys
- Duplicate values allowed
- Fast lookup using keys

### Common Implementations

- HashMap
- LinkedHashMap
- TreeMap
- Hashtable

---

# Relationship Between Interfaces

| Parent Interface | Child Interface |
|------------------|-----------------|
| Iterable | Collection |
| Collection | List |
| Collection | Set |
| Collection | Queue |
| Queue | Deque |
| Map | HashMap, LinkedHashMap, TreeMap, Hashtable |

---

# Common Implementation Classes

| Interface | Implementation Classes |
|-----------|-------------------------|
| List | ArrayList, LinkedList, Vector, Stack |
| Set | HashSet, LinkedHashSet, TreeSet |
| Queue | PriorityQueue, ArrayDeque |
| Deque | ArrayDeque |
| Map | HashMap, LinkedHashMap, TreeMap, Hashtable |

---

# Why is the Hierarchy Important?

Understanding the hierarchy helps developers:

- Select the correct data structure.
- Write reusable code.
- Switch implementations with minimal changes.
- Improve application performance.
- Design scalable applications.

---

# Real-World Example

Consider an **Online Banking Application**.

Different modules require different Collection types.

| Module | Suitable Collection |
|--------|----------------------|
| Customer List | List |
| Account Numbers | Set |
| Transaction Queue | Queue |
| Customer Records | Map |

By understanding the Collections Hierarchy, developers can choose the most suitable implementation for each module.

---

# Frequently Asked Interview Questions

### 1. Which interface is the root interface of the Java Collections Framework?

**Collection** is the root interface for most Collection classes.

---

### 2. Which interface is above Collection?

**Iterable**.

---

### 3. Is Map a child of Collection?

No.

Map has a separate hierarchy.

---

### 4. Which interface allows duplicate elements?

List.

---

### 5. Which interface does not allow duplicate elements?

Set.

---

### 6. Which interface stores key-value pairs?

Map.

---

### 7. Which interface supports FIFO?

Queue.

---

# Key Points

- Iterable is the top-most interface.
- Collection is the root interface of most Collection classes.
- List allows duplicates and maintains insertion order.
- Set stores unique elements.
- Queue generally follows FIFO.
- Deque allows insertion and deletion from both ends.
- Map has a separate hierarchy.
- Understanding the hierarchy helps in selecting the appropriate Collection implementation.

---

# Summary

The Java Collections Hierarchy provides a structured architecture that organizes interfaces and implementation classes into a logical relationship. Starting from the **Iterable** interface, the hierarchy extends to **Collection**, which further branches into **List**, **Set**, and **Queue**, while **Map** follows a separate hierarchy for key-value storage. A solid understanding of this hierarchy enables developers to write efficient, maintainable, and scalable Java applications and is essential for technical interviews.
