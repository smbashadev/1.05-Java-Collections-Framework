# LinkedHashMap Methods in Java

## Introduction

The **LinkedHashMap** class provides various built-in methods for storing, retrieving, updating, deleting, and traversing key-value pairs. These methods allow developers to efficiently manage ordered key-value data while preserving the insertion order.

Understanding these methods is important for Java programming and technical interview preparation.

---

# Commonly Used LinkedHashMap Methods

| Method | Description |
|---------|-------------|
| put() | Inserts a key-value pair into the map |
| putAll() | Copies all mappings from another map |
| get() | Returns the value associated with a key |
| getOrDefault() | Returns the value or a default value if the key is absent |
| remove() | Removes a key-value pair |
| replace() | Replaces the value of an existing key |
| containsKey() | Checks whether a key exists |
| containsValue() | Checks whether a value exists |
| size() | Returns the number of entries |
| isEmpty() | Checks whether the map is empty |
| clear() | Removes all entries |
| keySet() | Returns all keys |
| values() | Returns all values |
| entrySet() | Returns all key-value entries |

---

# 1. put()

## Purpose

Adds a key-value pair to the LinkedHashMap.

## Syntax

```java
map.put(key, value);
```

## Example

```java
map.put(101, "Rahul");
```

---

# 2. putAll()

## Purpose

Copies all entries from another map.

## Syntax

```java
map.putAll(otherMap);
```

---

# 3. get()

## Purpose

Returns the value associated with a specified key.

## Syntax

```java
map.get(key);
```

---

# 4. getOrDefault()

## Purpose

Returns the value if the key exists; otherwise returns the specified default value.

## Syntax

```java
map.getOrDefault(key, defaultValue);
```

---

# 5. remove()

## Purpose

Removes the specified key-value pair.

## Syntax

```java
map.remove(key);
```

---

# 6. replace()

## Purpose

Replaces the value associated with an existing key.

## Syntax

```java
map.replace(key, newValue);
```

---

# 7. containsKey()

## Purpose

Checks whether the specified key exists.

## Syntax

```java
map.containsKey(key);
```

---

# 8. containsValue()

## Purpose

Checks whether the specified value exists.

## Syntax

```java
map.containsValue(value);
```

---

# 9. size()

## Purpose

Returns the total number of entries.

## Syntax

```java
map.size();
```

---

# 10. isEmpty()

## Purpose

Checks whether the LinkedHashMap contains any entries.

## Syntax

```java
map.isEmpty();
```

---

# 11. clear()

## Purpose

Removes all entries from the LinkedHashMap.

## Syntax

```java
map.clear();
```

---

# 12. keySet()

## Purpose

Returns all keys stored in the LinkedHashMap.

## Syntax

```java
map.keySet();
```

---

# 13. values()

## Purpose

Returns all values stored in the LinkedHashMap.

## Syntax

```java
map.values();
```

---

# 14. entrySet()

## Purpose

Returns all key-value pairs stored in the LinkedHashMap.

## Syntax

```java
map.entrySet();
```

---

# Summary Table

| Method | Return Type | Purpose |
|---------|-------------|---------|
| put() | Value | Adds a key-value pair |
| putAll() | void | Copies another map |
| get() | Value | Retrieves a value |
| getOrDefault() | Value | Returns value or default |
| remove() | Value | Removes an entry |
| replace() | Value | Updates an existing value |
| containsKey() | boolean | Checks key existence |
| containsValue() | boolean | Checks value existence |
| size() | int | Returns number of entries |
| isEmpty() | boolean | Checks whether map is empty |
| clear() | void | Removes all entries |
| keySet() | Set | Returns all keys |
| values() | Collection | Returns all values |
| entrySet() | Set | Returns all entries |

---

# Advantages

- Simple to use
- Preserves insertion order
- Fast data retrieval
- Easy data modification
- Supports dynamic storage

---

# Real-World Applications

These methods are widely used in:

- Banking applications
- Employee management systems
- Student databases
- Shopping cart applications
- Inventory management
- Report generation
- Configuration management
- Cache implementations

---

# Frequently Asked Interview Questions

### 1. Which method inserts data into a LinkedHashMap?

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

### 4. Which method checks whether a key exists?

**Answer:**

```java
containsKey()
```

---

### 5. Which method checks whether a value exists?

**Answer:**

```java
containsValue()
```

---

### 6. Which method removes all entries?

**Answer:**

```java
clear()
```

---

### 7. Which method returns all keys?

**Answer:**

```java
keySet()
```

---

### 8. Which method returns all values?

**Answer:**

```java
values()
```

---

### 9. Which method returns all key-value pairs?

**Answer:**

```java
entrySet()
```

---

### 10. Which method returns the number of entries?

**Answer:**

```java
size()
```

---

# Key Takeaways

- `put()` inserts key-value pairs.
- `get()` retrieves values.
- `remove()` deletes entries.
- `replace()` updates values.
- `containsKey()` checks key availability.
- `containsValue()` checks value availability.
- `keySet()`, `values()`, and `entrySet()` are used for traversal.
- LinkedHashMap preserves insertion order.
- Frequently asked in Java interviews.

---

# Summary

LinkedHashMap provides a rich collection of methods for managing ordered key-value pairs efficiently. These methods support insertion, retrieval, updating, deletion, and traversal while preserving insertion order. Understanding these methods is essential for Java application development and Java Collections Framework interview preparation.
