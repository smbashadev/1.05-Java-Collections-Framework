/*
 * =============================================================================
 * Program Name    : Remove Elements from LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to remove elements from a LinkedList
 * using the remove() method. Elements can be removed either by their
 * index position or by specifying the object value.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class RemoveElements {

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
        System.out.println("Original LinkedList :");
        System.out.println(list);

        // Removing an element by index
        list.remove(2);

        // Displaying the LinkedList after removing by index
        System.out.println("\nAfter Removing Element at Index 2 :");
        System.out.println(list);

        // Removing an element by object
        list.remove("HTML");

        // Displaying the LinkedList after removing by object
        System.out.println("\nAfter Removing Element \"HTML\" :");
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
The original LinkedList is displayed.

Step 5:
The element at index 2 is removed.

list.remove(2);

Removed Element:

CSS

LinkedList becomes:

[Java, HTML, JavaScript, SQL]

Step 6:
The element "HTML" is removed.

list.remove("HTML");

LinkedList becomes:

[Java, JavaScript, SQL]

Step 7:
The updated LinkedList is displayed.

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original LinkedList :
[Java, HTML, CSS, JavaScript, SQL]

After Removing Element at Index 2 :
[Java, HTML, JavaScript, SQL]

After Removing Element "HTML" :
[Java, JavaScript, SQL]

===============================================================================
*/
