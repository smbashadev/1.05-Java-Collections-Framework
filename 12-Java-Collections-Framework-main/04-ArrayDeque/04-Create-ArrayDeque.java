/*
 * =============================================================================
 * Program Name    : Create ArrayDeque
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 04-ArrayDeque
 *
 * Description:
 * This program demonstrates how to create an ArrayDeque object and
 * display its elements.
 *
 * Note:
 * This example intentionally uses a raw ArrayDeque (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayDeque;

public class CreateArrayDeque {

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
Five elements are added using add().

ArrayDeque Contents:

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The complete ArrayDeque is displayed.

Step 5:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayDeque Elements:
[Java, HTML, CSS, JavaScript, SQL]

===============================================================================
*/
