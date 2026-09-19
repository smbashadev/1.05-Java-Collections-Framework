/*
 * =============================================================================
 * Program Name    : Iterate ArrayDeque
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 04-ArrayDeque
 *
 * Description:
 * This program demonstrates different ways to iterate through the
 * elements of an ArrayDeque. It uses a for-each loop and an
 * Iterator to traverse the collection.
 *
 * Note:
 * This example intentionally uses a raw ArrayDeque (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayDeque;
import java.util.Iterator;

public class IterateArrayDeque {

    public static void main(String[] args) {

        // Creating an ArrayDeque
        ArrayDeque deque = new ArrayDeque();

        // Adding elements
        deque.add("Java");
        deque.add("HTML");
        deque.add("CSS");
        deque.add("JavaScript");
        deque.add("SQL");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque:");
        System.out.println(deque);

        // ---------------------------------------------------------
        // Iteration using for-each loop
        // ---------------------------------------------------------
        System.out.println("\nUsing for-each Loop:");

        for (Object element : deque) {
            System.out.println(element);
        }

        // ---------------------------------------------------------
        // Iteration using Iterator
        // ---------------------------------------------------------
        System.out.println("\nUsing Iterator:");

        Iterator itr = deque.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

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

ArrayDeque Contents:

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The complete ArrayDeque is displayed.

Step 5:
Elements are traversed using the enhanced for-each loop.

Output:

Java
HTML
CSS
JavaScript
SQL

Step 6:
Elements are traversed using an Iterator.

Output:

Java
HTML
CSS
JavaScript
SQL

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayDeque:
[Java, HTML, CSS, JavaScript, SQL]

Using for-each Loop:
Java
HTML
CSS
JavaScript
SQL

Using Iterator:
Java
HTML
CSS
JavaScript
SQL

===============================================================================
*/
