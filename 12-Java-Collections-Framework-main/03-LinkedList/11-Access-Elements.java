/*
 * =============================================================================
 * Program Name    : Access Elements from LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to access elements from a LinkedList
 * using the get(), getFirst(), and getLast() methods.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class AccessElements {

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
        System.out.println("LinkedList : " + list);

        // Accessing elements
        System.out.println("Element at Index 2 : " + list.get(2));

        // Accessing first element
        System.out.println("First Element : " + list.getFirst());

        // Accessing last element
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
The entire LinkedList is displayed.

Step 5:
The element at index 2 is accessed.

list.get(2)

Result:

CSS

Step 6:
The first element is accessed.

list.getFirst()

Result:

Java

Step 7:
The last element is accessed.

list.getLast()

Result:

SQL

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedList : [Java, HTML, CSS, JavaScript, SQL]
Element at Index 2 : CSS
First Element : Java
Last Element : SQL

===============================================================================
*/
