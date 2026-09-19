/*
 * =============================================================================
 * Program Name    : Check Whether LinkedList is Empty
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to check whether a LinkedList is empty
 * using the isEmpty() method. The method returns true if the LinkedList
 * contains no elements; otherwise, it returns false.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class IsEmpty {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList list = new LinkedList();

        // Checking before adding elements
        System.out.println("Before Adding Elements:");
        System.out.println("LinkedList : " + list);
        System.out.println("Is Empty : " + list.isEmpty());

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");

        // Checking after adding elements
        System.out.println("\nAfter Adding Elements:");
        System.out.println("LinkedList : " + list);
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
The isEmpty() method is called.

list.isEmpty();

Result:

true

Step 4:
Three elements are added.

LinkedList Contents:

[Java, HTML, CSS]

Step 5:
The isEmpty() method is called again.

list.isEmpty();

Result:

false

Step 6:
The LinkedList and the result of isEmpty() are displayed.

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Before Adding Elements:
LinkedList : []
Is Empty : true

After Adding Elements:
LinkedList : [Java, HTML, CSS]
Is Empty : false

===============================================================================
*/
