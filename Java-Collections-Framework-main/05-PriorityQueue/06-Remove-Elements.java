/*
 * =============================================================================
 * Program Name    : Remove Elements from PriorityQueue
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 05-PriorityQueue
 *
 * Description:
 * This program demonstrates different ways to remove elements from a
 * PriorityQueue using remove() and poll() methods.
 *
 * Note:
 * This example intentionally uses a raw PriorityQueue (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.PriorityQueue;

public class RemoveElements {

    public static void main(String[] args) {

        // Creating a PriorityQueue
        PriorityQueue queue = new PriorityQueue();

        // Adding elements
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        queue.add(50);

        // Displaying the original PriorityQueue
        System.out.println("Original PriorityQueue:");
        System.out.println(queue);

        // Removing the head element using remove()
        System.out.println("\nremove() : " + queue.remove());

        // Displaying the PriorityQueue
        System.out.println("After remove():");
        System.out.println(queue);

        // Removing the head element using poll()
        System.out.println("\npoll() : " + queue.poll());

        // Displaying the PriorityQueue
        System.out.println("After poll():");
        System.out.println(queue);

        // Displaying the current head element
        System.out.println("\nCurrent Head Element:");
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
remove() removes the head element.

Removed:

10

Remaining Queue:

[20, 40, 30, 50]

Step 6:
poll() removes the next head element.

Removed:

20

Remaining Queue:

[30, 40, 50]

Step 7:
peek() returns the current head element.

30

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original PriorityQueue:
[10, 20, 30, 40, 50]

remove() : 10
After remove():
[20, 40, 30, 50]

poll() : 20
After poll():
[30, 40, 50]

Current Head Element:
30

Note:
The displayed order may vary because PriorityQueue shows
its internal heap representation rather than a sorted list.

===============================================================================
*/
