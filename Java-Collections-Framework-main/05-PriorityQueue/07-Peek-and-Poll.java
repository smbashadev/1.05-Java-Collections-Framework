/*
 * =============================================================================
 * Program Name    : Peek and Poll in PriorityQueue
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 05-PriorityQueue
 *
 * Description:
 * This program demonstrates how to retrieve and remove elements from a
 * PriorityQueue using peek() and poll() methods.
 *
 * Note:
 * This example intentionally uses a raw PriorityQueue (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.PriorityQueue;

public class PeekAndPoll {

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
        System.out.println("Original PriorityQueue:");
        System.out.println(queue);

        // Retrieving the head element without removing it
        System.out.println("\npeek() : " + queue.peek());

        // Displaying the queue after peek()
        System.out.println("After peek():");
        System.out.println(queue);

        // Removing the head element
        System.out.println("\npoll() : " + queue.poll());

        // Displaying the queue after poll()
        System.out.println("After poll():");
        System.out.println(queue);

        // Displaying the new head element
        System.out.println("\nNew Head Element:");
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
Five elements are added.

40
10
30
20
50

Step 4:
PriorityQueue arranges elements according to natural ordering.

Head Element:

10

Step 5:
peek() retrieves the head element without removing it.

Returned:

10

Queue remains unchanged.

Step 6:
poll() removes and returns the head element.

Removed:

10

Remaining Queue:

[20, 40, 30, 50]

Step 7:
peek() displays the new head element.

20

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original PriorityQueue:
[10, 20, 30, 40, 50]

peek() : 10
After peek():
[10, 20, 30, 40, 50]

poll() : 10
After poll():
[20, 40, 30, 50]

New Head Element:
20

Note:
The displayed order may vary because PriorityQueue shows
its internal heap representation rather than a fully sorted list.

===============================================================================
*/
