/*
 * =============================================================================
 * Program Name    : Access First and Last Elements of LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to retrieve the first and last elements
 * of a LinkedList using the getFirst() and getLast() methods.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class FirstAndLastElements {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList list = new LinkedList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying the LinkedList
        System.out.println("LinkedList :");
        System.out.println(list);

        // Displaying the first element
        System.out.println("\nFirst Element : " + list.getFirst());

        // Displaying the last element
        System.out.println("Last Element : " + list.getLast());

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
The complete LinkedList is displayed.

Step 5:
The getFirst() method returns the first element.

Result:

Java

Step 6:
The getLast() method returns the last element.

Result:

SQL

Step 7:
The first and last elements are displayed.

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedList :
[Java, HTML, CSS, JavaScript, SQL]

First Element : Java
Last Element : SQL

===============================================================================
*/
