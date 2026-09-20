/*
 * =============================================================================
 * Program Name    : Add Elements to ArrayDeque
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 04-ArrayDeque
 *
 * Description:
 * This program demonstrates different ways to add elements to an
 * ArrayDeque using add(), addFirst(), addLast(), offer(),
 * offerFirst(), and offerLast() methods.
 *
 * Note:
 * This example intentionally uses a raw ArrayDeque (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayDeque;

public class AddElements {

    public static void main(String[] args) {

        // Creating an ArrayDeque
        ArrayDeque deque = new ArrayDeque();

        // Adding elements at the rear
        deque.add("Java");
        deque.add("HTML");

        // Adding element at the front
        deque.addFirst("Python");

        // Adding element at the rear
        deque.addLast("CSS");

        // Adding element using offer()
        deque.offer("JavaScript");

        // Adding element at the front using offerFirst()
        deque.offerFirst("C");

        // Adding element at the rear using offerLast()
        deque.offerLast("SQL");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque Elements:");
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
Elements are added using different insertion methods.

add("Java")
add("HTML")
addFirst("Python")
addLast("CSS")
offer("JavaScript")
offerFirst("C")
offerLast("SQL")

Step 4:
Final ArrayDeque becomes:

[C, Python, Java, HTML, CSS, JavaScript, SQL]

Step 5:
The ArrayDeque is displayed.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayDeque Elements:
[C, Python, Java, HTML, CSS, JavaScript, SQL]

===============================================================================
*/
