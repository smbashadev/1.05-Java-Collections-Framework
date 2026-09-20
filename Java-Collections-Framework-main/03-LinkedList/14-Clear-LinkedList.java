/*
 * =============================================================================
 * Program Name    : Clear LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to remove all elements from a
 * LinkedList using the clear() method. After calling clear(),
 * the LinkedList becomes empty and its size becomes zero.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class ClearLinkedList {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList list = new LinkedList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying the original LinkedList
        System.out.println("Original LinkedList:");
        System.out.println(list);

        // Clearing the LinkedList
        list.clear();

        // Displaying the LinkedList after clearing
        System.out.println("\nLinkedList After clear():");
        System.out.println(list);

        // Displaying the size
        System.out.println("Size : " + list.size());

        // Checking whether the LinkedList is empty
        System.out.println("Is Empty : " + list.isEmpty());

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
Five elements are added.

LinkedList Contents:

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The original LinkedList is displayed.

Step 5:
The clear() method is called.

list.clear();

All elements are removed.

LinkedList becomes:

[]

Step 6:
The size of the LinkedList is displayed.

Size = 0

Step 7:
The isEmpty() method returns true.

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original LinkedList:
[Java, HTML, CSS, JavaScript, SQL]

LinkedList After clear():
[]
Size : 0
Is Empty : true

===============================================================================
*/
