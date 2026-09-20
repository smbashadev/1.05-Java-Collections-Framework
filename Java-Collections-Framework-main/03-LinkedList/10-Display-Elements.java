/*
 * =============================================================================
 * Program Name    : Display Elements of LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to display all the elements stored in
 * a LinkedList. The LinkedList object is printed directly, which displays
 * all elements in insertion order.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class DisplayElements {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList list = new LinkedList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying all elements
        System.out.println("Elements in the LinkedList:");
        System.out.println(list);

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
The LinkedList object is printed.

Java automatically calls the toString() method to display all elements.

Step 5:
Elements are displayed in insertion order.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Elements in the LinkedList:
[Java, HTML, CSS, JavaScript, SQL]

===============================================================================
*/
