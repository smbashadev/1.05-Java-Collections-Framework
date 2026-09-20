# Java Collections Hierarchy Diagram

## Introduction

The Java Collections Framework (JCF) is organized into a hierarchical structure consisting of interfaces and implementation classes. Understanding this hierarchy helps developers choose the most suitable collection based on requirements such as ordering, uniqueness, performance, and data storage.

This document provides a simplified and interview-friendly hierarchy diagram of the Java Collections Framework.

---

# Complete Java Collections Hierarchy

```text
                               java.lang.Iterable
                                        │
                                        ▼
                              java.util.Collection
                   ┌────────────────┼────────────────┐
                   │                │                │
                   ▼                ▼                ▼
                 List             Set             Queue
                   │                │                │
      ┌────────────┼──────────┐     │         ┌──────┴──────┐
      │            │          │     │         │             │
      ▼            ▼          ▼     ▼         ▼             ▼
 ArrayList   LinkedList    Vector HashSet PriorityQueue   Deque
                                │                          │
                                ▼                          ▼
                              Stack                   ArrayDeque
                                │
                                ▼
                        LinkedHashSet
                                │
                                ▼
                             TreeSet


                  Map (Separate Hierarchy)
                           │
            ┌──────────────┼──────────────┐
            │              │              │
            ▼              ▼              ▼
         HashMap     LinkedHashMap     TreeMap
            │
            ▼
        Hashtable
```

---

# Interface Hierarchy

```text
Iterable
    │
    ▼
Collection
    ├── List
    ├── Set
    └── Queue

Map (Separate Interface)
```

---

# List Hierarchy

```text
List
 ├── ArrayList
 ├── LinkedList
 ├── Vector
 └── Stack
```

### Characteristics

- Ordered collection
- Allows duplicate elements
- Supports index-based access

---

# Set Hierarchy

```text
Set
 ├── HashSet
 ├── LinkedHashSet
 └── TreeSet
```

### Characteristics

- Stores unique elements
- No duplicate values
- Different ordering strategies depending on implementation

---

# Queue Hierarchy

```text
Queue
 ├── PriorityQueue
 ├── LinkedList
 └── Deque
        │
        └── ArrayDeque
```

### Characteristics

- Used for processing elements
- FIFO-based implementations
- Deque supports insertion and deletion from both ends

---

# Map Hierarchy

```text
Map
 ├── HashMap
 ├── LinkedHashMap
 ├── TreeMap
 └── Hashtable
```

### Characteristics

- Stores key-value pairs
- Keys are unique
- Map is **not** a child of Collection

---

# Hierarchy Summary Table

| Interface/Class | Purpose | Common Implementations |
|-----------------|---------|------------------------|
| Collection | Root interface | List, Set, Queue |
| List | Ordered collection | ArrayList, LinkedList, Vector |
| Set | Unique elements | HashSet, LinkedHashSet, TreeSet |
| Queue | Processing elements | PriorityQueue, LinkedList |
| Deque | Double-ended queue | ArrayDeque |
| Map | Key-value storage | HashMap, LinkedHashMap, TreeMap, Hashtable |

---

# Important Points

- Collection is the root interface of the Java Collections Framework.
- Iterable is the parent interface of Collection.
- List stores ordered and duplicate elements.
- Set stores unique elements.
- Queue is used for processing elements.
- Deque supports operations at both ends.
- Map belongs to a separate hierarchy.
- HashMap, LinkedHashMap, TreeMap, and Hashtable implement the Map interface.
- Stack extends Vector.
- ArrayDeque implements the Deque interface.

---

# Interview Questions

### 1. What is the root interface of the Java Collections Framework?

**Answer:**

Collection.

---

### 2. Which interface is the parent of Collection?

**Answer:**

Iterable.

---

### 3. Which interface stores duplicate elements?

**Answer:**

List.

---

### 4. Which interface stores only unique elements?

**Answer:**

Set.

---

### 5. Which interface stores key-value pairs?

**Answer:**

Map.

---

### 6. Is Map a child of Collection?

**Answer:**

No.

---

### 7. Which class extends Vector?

**Answer:**

Stack.

---

### 8. Which class implements Deque?

**Answer:**

ArrayDeque.

---

# Quick Revision

| Topic | Answer |
|--------|--------|
| Parent Interface | Iterable |
| Root Interface | Collection |
| Ordered Collection | List |
| Unique Collection | Set |
| Processing Collection | Queue |
| Double Ended Queue | Deque |
| Key-Value Storage | Map |
| Stack Parent | Vector |
| Deque Implementation | ArrayDeque |

---

# Key Takeaways

- Iterable is the top-level interface.
- Collection is the root interface of JCF.
- List, Set, and Queue extend Collection.
- Deque extends Queue.
- Stack extends Vector.
- Map belongs to a separate hierarchy.
- Understanding the hierarchy helps in selecting the appropriate collection for different programming scenarios.
- Collections Hierarchy is one of the most frequently asked Java interview topics.

---

# Summary

The Java Collections Hierarchy organizes interfaces and implementation classes into a structured architecture that simplifies data storage and manipulation. By understanding the relationships between Collection, List, Set, Queue, Deque, and Map along with their implementations, developers can choose the right collection for different requirements and confidently answer Java Collections Framework interview questions.
