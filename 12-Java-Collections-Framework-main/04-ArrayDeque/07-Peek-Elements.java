/*
 * =============================================================================
 * Program Name    : Peek Elements in ArrayDeque
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 04-ArrayDeque
 *
 * Description:
 * This program demonstrates different ways to retrieve elements from an
 * ArrayDeque without removing them using peek(), peekFirst(),
 * peekLast(), getFirst(), and getLast() methods.
 *
 * Note:
 * This example intentionally uses a raw ArrayDeque (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayDeque;

public class PeekElements {

    public static void main(String[] args) {

        // Creating an ArrayDeque
        ArrayDeque deque = new ArrayDeque();

        // Adding elements
        deque.add("Java");
        deque.add("HTML");
        deque.add("CSS");
        deque.add("JavaScript");
        deque.add("SQL");

        // Displaying original deque
        System.out.println("ArrayDeque:");
        System.out.println(deque);

        // Retrieving the first element
        System.out.println("\npeek() : " + deque.peek());

        // Retrieving the first element
        System.out.println("peekFirst() : " + deque.peekFirst());

        // Retrieving the last element
        System.out.println("peekLast() : " + deque.peekLast());

        // Retrieving the first element
        System.out.println("getFirst() : " + deque.getFirst());

        // Retrieving the last element
        System.out.println("getLast() : " + deque.getLast());

        // Displaying the deque again
        System.out.println("\nArrayDeque After Peek Operations:");
        System.out.println(deque);

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An empty ArrayDeque is created.

ArrayDeque deque = new ArrayDeque();

Step 3:
Five elements are added.

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
peek() returns the first element.

Java

Step 5:
peekFirst() returns the first element.

Java

Step 6:
peekLast() returns the last element.

SQL

Step 7:
getFirst() returns the first element.

Java

Step 8:
getLast() returns the last element.

SQL

Step 9:
No elements are removed.

ArrayDeque remains:

[Java, HTML, CSS, JavaScript, SQL]

Step 10:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayDeque:
[Java, HTML, CSS, JavaScript, SQL]

peek() : Java
peekFirst() : Java
peekLast() : SQL
getFirst() : Java
getLast() : SQL

ArrayDeque After Peek Operations:
[Java, HTML, CSS, JavaScript, SQL]

===============================================================================
*/
