/*
 * =============================================================================
 * Program Name    : Update Elements in LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to update an existing element in a
 * LinkedList using the set() method. The set() method replaces the
 * element present at the specified index with a new value.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class UpdateElements {

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

        // Updating an element
        list.set(2, "Python");

        // Displaying the updated LinkedList
        System.out.println("\nUpdated LinkedList :");
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
The set() method updates the element at index 2.

list.set(2, "Python");

Old Value:

CSS

New Value:

Python

LinkedList becomes:

[Java, HTML, Python, JavaScript, SQL]

Step 6:
The updated LinkedList is displayed.

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original LinkedList :
[Java, HTML, CSS, JavaScript, SQL]

Updated LinkedList :
[Java, HTML, Python, JavaScript, SQL]

===============================================================================
*/
