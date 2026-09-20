/*
 * =============================================================================
 * Program Name    : Add Elements to PriorityQueue
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 05-PriorityQueue
 *
 * Description:
 * This program demonstrates different ways to add elements to a
 * PriorityQueue using add() and offer() methods.
 *
 * Note:
 * This example intentionally uses a raw PriorityQueue (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.PriorityQueue;

public class AddElements {

    public static void main(String[] args) {

        // Creating a PriorityQueue
        PriorityQueue queue = new PriorityQueue();

        // Adding elements using add()
        queue.add(40);
        queue.add(10);
        queue.add(30);

        // Adding elements using offer()
        queue.offer(20);
        queue.offer(50);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue Elements:");
        System.out.println(queue);

        // Displaying the head element
        System.out.println("\nHead Element:");
        System.out.println(queue.peek());

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An empty PriorityQueue is created.

PriorityQueue queue = new PriorityQueue();

Step 3:
Elements are added using add().

40
10
30

Step 4:
Elements are added using offer().

20
50

Step 5:
PriorityQueue automatically arranges the elements according
to their natural (ascending) order.

Head Element:

10

Step 6:
The PriorityQueue is displayed.

(Note:
The displayed order represents the internal heap structure,
not a completely sorted sequence.)

Step 7:
The head element is displayed using peek().

Output:

10

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

PriorityQueue Elements:
[10, 20, 30, 40, 50]

Head Element:
10

Note:
The exact printed arrangement may vary because PriorityQueue
displays its internal heap representation.

===============================================================================
*/
