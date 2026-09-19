/*
 * ============================================================================
 * Program: Legacy Classes Examples in Java
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 16-Legacy-Classes
 *
 * Description:
 * This program demonstrates the usage of Java Legacy Classes:
 *
 * 1. Vector
 * 2. Stack
 * 3. Hashtable
 * 4. Dictionary
 * 5. Enumeration
 *
 * Note:
 * This program intentionally uses raw collection types
 * (without Generics) to maintain consistency throughout
 * this repository.
 * ============================================================================
 */

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class Examples {

    public static void main(String[] args) {

        System.out.println("========== VECTOR ==========");

        Vector vector = new Vector();

        vector.add("Java");
        vector.add("Python");
        vector.add("SQL");

        System.out.println("Vector : " + vector);

        System.out.println();

        // ------------------------------------------------------------

        System.out.println("========== STACK ==========");

        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack : " + stack);

        System.out.println("Peek : " + stack.peek());

        System.out.println("Pop  : " + stack.pop());

        System.out.println("Stack After Pop : " + stack);

        System.out.println();

        // ------------------------------------------------------------

        System.out.println("========== HASHTABLE ==========");

        Hashtable table = new Hashtable();

        table.put(101, "Rahul");
        table.put(102, "Anita");
        table.put(103, "Kiran");

        System.out.println("Hashtable : " + table);

        System.out.println("Student 102 : " + table.get(102));

        System.out.println();

        // ------------------------------------------------------------

        System.out.println("========== DICTIONARY ==========");

        Dictionary dictionary = new Hashtable();

        dictionary.put(1, "Apple");
        dictionary.put(2, "Banana");
        dictionary.put(3, "Orange");

        System.out.println("Dictionary Size : " + dictionary.size());

        System.out.println("Key 2 Value : " + dictionary.get(2));

        System.out.println();

        // ------------------------------------------------------------

        System.out.println("========== ENUMERATION ==========");

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {

            System.out.println(enumeration.nextElement());

        }

        System.out.println();

        System.out.println("Program Completed Successfully.");
    }
}

/*
============================================================================
Dry Run
============================================================================

Step 1:
Create a Vector.

↓

Add:
Java
Python
SQL

Vector:

[Java, Python, SQL]

------------------------------------------------------------

Step 2:
Create a Stack.

Push:

A
B
C

Top

↓

C

peek()

↓

C

pop()

↓

C removed

Stack:

[A, B]

------------------------------------------------------------

Step 3:
Create Hashtable.

101 -> Rahul
102 -> Anita
103 -> Kiran

Retrieve:

Key = 102

↓

Anita

------------------------------------------------------------

Step 4:
Create Dictionary.

1 -> Apple
2 -> Banana
3 -> Orange

Size = 3

Key = 2

↓

Banana

------------------------------------------------------------

Step 5:
Enumeration

Read Vector elements one by one.

↓

Java

↓

Python

↓

SQL

============================================================================
Expected Output
============================================================================

========== VECTOR ==========
Vector : [Java, Python, SQL]

========== STACK ==========
Stack : [A, B, C]
Peek : C
Pop  : C
Stack After Pop : [A, B]

========== HASHTABLE ==========
Hashtable : {103=Kiran, 102=Anita, 101=Rahul}
Student 102 : Anita

========== DICTIONARY ==========
Dictionary Size : 3
Key 2 Value : Banana

========== ENUMERATION ==========
Java
Python
SQL

Program Completed Successfully.

============================================================================
Important Points
============================================================================

✓ Vector is a synchronized dynamic array.

✓ Stack follows the LIFO (Last In First Out) principle.

✓ Hashtable stores key-value pairs and does not allow null keys or null values.

✓ Dictionary is an abstract Legacy Class implemented by Hashtable.

✓ Enumeration is a read-only interface used to traverse legacy collections.

✓ Legacy Classes are mainly maintained for backward compatibility and are less commonly used in modern Java applications.
*/
