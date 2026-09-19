/*
 * =============================================================================
 * Program Name    : Create a LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to create an empty LinkedList in Java.
 * Initially, the LinkedList contains no elements. Elements can be added
 * later using methods like add(), addFirst(), and addLast().
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class CreateLinkedList {

    public static void main(String[] args) {

        // Creating an empty LinkedList
        LinkedList list = new LinkedList();

        // Displaying the LinkedList
        System.out.println("LinkedList Created Successfully.");

        // Printing the LinkedList
        System.out.println("LinkedList : " + list);

        // Displaying the size
        System.out.println("Size : " + list.size());

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An empty LinkedList is created.

LinkedList list = new LinkedList();

Step 3:
No elements are added.

LinkedList Contents:

[ ]

Step 4:
The LinkedList is displayed.

Step 5:
The size of the LinkedList is displayed.

Size = 0

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedList Created Successfully.
LinkedList : []
Size : 0

===============================================================================
*/
