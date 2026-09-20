/*
 * =============================================================================
 * Program Name    : Iterate PriorityQueue
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 05-PriorityQueue
 *
 * Description:
 * This program demonstrates different ways to iterate through the
 * elements of a PriorityQueue using a for-each loop and an Iterator.
 *
 * Note:
 * This example intentionally uses a raw PriorityQueue (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratePriorityQueue {

    public static void main(String[] args) {

        // Creating a PriorityQueue
        PriorityQueue queue = new PriorityQueue();

        // Adding elements
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        queue.add(50);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue:");
        System.out.println(queue);

        // ---------------------------------------------------------
        // Iteration using for-each loop
        // ---------------------------------------------------------
        System.out.println("\nUsing for-each Loop:");

        for (Object element : queue) {
            System.out.println(element);
        }

        // ---------------------------------------------------------
        // Iteration using Iterator
        // ---------------------------------------------------------
        System.out.println("\nUsing Iterator:");

        Iterator itr = queue.iterator();

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
An empty PriorityQueue is created.

PriorityQueue queue = new PriorityQueue();

Step 3:
Five elements are added.

40
10
30
20
50

Step 4:
PriorityQueue internally arranges the elements according to
their priority.

Step 5:
The PriorityQueue is displayed.

Example:

[10, 20, 30, 40, 50]

(Note:
The displayed order represents the internal heap structure,
which may not always appear completely sorted.)

Step 6:
Elements are traversed using the enhanced for-each loop.

Step 7:
Elements are traversed using an Iterator.

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

PriorityQueue:
[10, 20, 30, 40, 50]

Using for-each Loop:
10
20
30
40
50

Using Iterator:
10
20
30
40
50

Note:
The iteration order may vary because PriorityQueue iterates
according to its internal heap representation rather than
strict sorted order.

===============================================================================
*/
