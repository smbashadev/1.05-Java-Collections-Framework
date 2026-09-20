/*
 * =============================================================================
 * Program Name    : Create PriorityQueue
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 05-PriorityQueue
 *
 * Description:
 * This program demonstrates how to create a PriorityQueue, add elements,
 * and display its contents.
 *
 * Note:
 * This example intentionally uses a raw PriorityQueue (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.PriorityQueue;

public class CreatePriorityQueue {

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
Five elements are added.

40
10
30
20
50

Step 4:
PriorityQueue automatically arranges elements according to
their natural (ascending) order using a Binary Heap.

Head Element:

10

Step 5:
The PriorityQueue is displayed.

(Note:
The printed order represents the internal heap structure,
not a fully sorted sequence.)

Step 6:
The head element is displayed using peek().

Output:

10

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

PriorityQueue Elements:
[10, 20, 30, 40, 50]

Head Element:
10

Note:
The exact printed arrangement of elements may vary because
PriorityQueue displays its internal heap representation.

===============================================================================
*/
