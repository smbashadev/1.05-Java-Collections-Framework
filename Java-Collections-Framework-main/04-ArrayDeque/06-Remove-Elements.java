/*
 * =============================================================================
 * Program Name    : Remove Elements from ArrayDeque
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 04-ArrayDeque
 *
 * Description:
 * This program demonstrates different ways to remove elements from an
 * ArrayDeque using remove(), removeFirst(), removeLast(),
 * poll(), pollFirst(), and pollLast() methods.
 *
 * Note:
 * This example intentionally uses a raw ArrayDeque (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayDeque;

public class RemoveElements {

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
        System.out.println("Original ArrayDeque:");
        System.out.println(deque);

        // Removing first element using remove()
        System.out.println("\nremove() : " + deque.remove());

        // Removing first element using removeFirst()
        System.out.println("removeFirst() : " + deque.removeFirst());

        // Removing last element using removeLast()
        System.out.println("removeLast() : " + deque.removeLast());

        // Removing first element using poll()
        System.out.println("poll() : " + deque.poll());

        // Adding elements again
        deque.add("Python");
        deque.add("C");

        System.out.println("\nAfter Adding Elements:");
        System.out.println(deque);

        // Removing first element using pollFirst()
        System.out.println("\npollFirst() : " + deque.pollFirst());

        // Removing last element using pollLast()
        System.out.println("pollLast() : " + deque.pollLast());

        // Displaying final deque
        System.out.println("\nFinal ArrayDeque:");
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
remove() removes the first element.

Removed:
Java

Remaining:
[HTML, CSS, JavaScript, SQL]

Step 5:
removeFirst() removes HTML.

Remaining:
[CSS, JavaScript, SQL]

Step 6:
removeLast() removes SQL.

Remaining:
[CSS, JavaScript]

Step 7:
poll() removes CSS.

Remaining:
[JavaScript]

Step 8:
Python and C are added.

[JavaScript, Python, C]

Step 9:
pollFirst() removes JavaScript.

Remaining:
[Python, C]

Step 10:
pollLast() removes C.

Remaining:
[Python]

Step 11:
The final ArrayDeque is displayed.

Step 12:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original ArrayDeque:
[Java, HTML, CSS, JavaScript, SQL]

remove() : Java
removeFirst() : HTML
removeLast() : SQL
poll() : CSS

After Adding Elements:
[JavaScript, Python, C]

pollFirst() : JavaScript
pollLast() : C

Final ArrayDeque:
[Python]

===============================================================================
*/
