# TreeMap Methods in Java

## Introduction

The **TreeMap** class provides several built-in methods for inserting, retrieving, updating, deleting, searching, and navigating key-value pairs. Since TreeMap stores keys in **sorted order**, it also offers powerful navigational methods that are not available in HashMap.

Understanding these methods is essential for Java programming and technical interview preparation.

---

# Commonly Used TreeMap Methods

| Method | Description |
|---------|-------------|
| put() | Inserts a key-value pair |
| putAll() | Copies all mappings from another map |
| get() | Returns the value associated with a key |
| remove() | Removes a key-value pair |
| replace() | Replaces the value of an existing key |
| containsKey() | Checks whether a key exists |
| containsValue() | Checks whether a value exists |
| size() | Returns the number of entries |
| isEmpty() | Checks whether the map is empty |
| clear() | Removes all entries |
| firstKey() | Returns the first (smallest) key |
| lastKey() | Returns the last (largest) key |
| higherKey() | Returns the next higher key |
| lowerKey() | Returns the next lower key |
| ceilingKey() | Returns the given key or the next higher key |
| floorKey() | Returns the given key or the next lower key |
| keySet() | Returns all keys |
| values() | Returns all values |
| entrySet() | Returns all key-value pairs |

---

# 1. put()

## Purpose

Inserts a key-value pair into the TreeMap.

## Syntax

```java
map.put(key, value);
```

---

# 2. putAll()

## Purpose

Copies all mappings from another map.

## Syntax

```java
map.putAll(otherMap);
```

---

# 3. get()

## Purpose

Returns the value associated with the specified key.

## Syntax

```java
map.get(key);
```

---

# 4. remove()

## Purpose

Removes the specified key-value pair.

## Syntax

```java
map.remove(key);
```

---

# 5. replace()

## Purpose

Replaces the value of an existing key.

## Syntax

```java
map.replace(key, newValue);
```

---

# 6. containsKey()

## Purpose

Checks whether the specified key exists.

## Syntax

```java
map.containsKey(key);
```

---

# 7. containsValue()

## Purpose

Checks whether the specified value exists.

## Syntax

```java
map.containsValue(value);
```

---

# 8. size()

## Purpose

Returns the total number of entries.

## Syntax

```java
map.size();
```

---

# 9. isEmpty()

## Purpose

Checks whether the TreeMap contains any entries.

## Syntax

```java
map.isEmpty();
```

---

# 10. clear()

## Purpose

Removes all entries from the TreeMap.

## Syntax

```java
map.clear();
```

---

# 11. firstKey()

## Purpose

Returns the smallest key in the TreeMap.

## Syntax

```java
map.firstKey();
```

---

# 12. lastKey()

## Purpose

Returns the largest key in the TreeMap.

## Syntax

```java
map.lastKey();
```

---

# 13. higherKey()

## Purpose

Returns the next higher key than the specified key.

## Syntax

```java
map.higherKey(key);
```

---

# 14. lowerKey()

## Purpose

Returns the next lower key than the specified key.

## Syntax

```java
map.lowerKey(key);
```

---

# 15. ceilingKey()

## Purpose

Returns the specified key if it exists; otherwise returns the next higher key.

## Syntax

```java
map.ceilingKey(key);
```

---

# 16. floorKey()

## Purpose

Returns the specified key if it exists; otherwise returns the next lower key.

## Syntax

```java
map.floorKey(key);
```

---

# 17. keySet()

## Purpose

Returns all keys in sorted order.

## Syntax

```java
map.keySet();
```

---

# 18. values()

## Purpose

Returns all values.

## Syntax

```java
map.values();
```

---

# 19. entrySet()

## Purpose

Returns all key-value pairs.

## Syntax

```java
map.entrySet();
```

---

# Summary Table

| Method | Return Type | Purpose |
|---------|-------------|---------|
| put() | Value | Inserts a key-value pair |
| putAll() | void | Copies another map |
| get() | Value | Retrieves a value |
| remove() | Value | Removes an entry |
| replace() | Value | Updates an existing value |
| containsKey() | boolean | Checks key existence |
| containsValue() | boolean | Checks value existence |
| size() | int | Returns number of entries |
| isEmpty() | boolean | Checks whether map is empty |
| clear() | void | Removes all entries |
| firstKey() | Key | Returns first key |
| lastKey() | Key | Returns last key |
| higherKey() | Key | Returns next higher key |
| lowerKey() | Key | Returns next lower key |
| ceilingKey() | Key | Returns equal or next higher key |
| floorKey() | Key | Returns equal or next lower key |
| keySet() | Set | Returns all keys |
| values() | Collection | Returns all values |
| entrySet() | Set | Returns all key-value pairs |

---

# Advantages

- Automatically sorts keys
- Easy navigation using built-in methods
- Fast searching
- Fast insertion
- Fast deletion
- Suitable for ordered data

---

# Real-World Applications

TreeMap methods are commonly used in:

- Banking systems
- Student ranking systems
- Employee management systems
- Dictionary applications
- Leaderboards
- Inventory management
- Report generation
- Data analytics

---

# Frequently Asked Interview Questions

### 1. Which method inserts data into a TreeMap?

**Answer:**

```java
put()
```

---

### 2. Which method retrieves a value?

**Answer:**

```java
get()
```

---

### 3. Which method removes an entry?

**Answer:**

```java
remove()
```

---

### 4. Which method returns the first key?

**Answer:**

```java
firstKey()
```

---

### 5. Which method returns the last key?

**Answer:**

```java
lastKey()
```

---

### 6. Which method returns the next higher key?

**Answer:**

```java
higherKey()
```

---

### 7. Which method returns the next lower key?

**Answer:**

```java
lowerKey()
```

---

### 8. Which method returns all key-value pairs?

**Answer:**

```java
entrySet()
```

---

# Key Takeaways

- `put()` inserts entries.
- `get()` retrieves values.
- `remove()` deletes entries.
- `replace()` updates values.
- `firstKey()` and `lastKey()` return boundary keys.
- `higherKey()`, `lowerKey()`, `ceilingKey()`, and `floorKey()` support navigation.
- TreeMap automatically stores keys in sorted order.
- Frequently asked in Java interviews.

---

# Summary

TreeMap provides a rich collection of methods for managing sorted key-value pairs. Along with basic CRUD operations, it offers powerful navigational methods such as `firstKey()`, `lastKey()`, `higherKey()`, `lowerKey()`, `ceilingKey()`, and `floorKey()`. Mastering these methods is essential for developing efficient Java applications and succeeding in Java Collections Framework interviews.
