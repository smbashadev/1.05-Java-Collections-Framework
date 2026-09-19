/*
 * =============================================================================
 * Program Name    : Remove Elements from ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to remove elements from an ArrayList
 * using the remove() method. Elements can be removed either by their
 * index position or by specifying the object.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class RemoveElements {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying ArrayList before removal
        System.out.println("ArrayList Before Removal:");
        System.out.println(list);

        // Removing an element using index
        list.remove(2);

        // Removing an element using object
        list.remove("SQL");

        // Displaying ArrayList after removal
        System.out.println("\nArrayList After Removal:");
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
An empty ArrayList is created.

ArrayList list = new ArrayList();

Step 3:
Five elements are added.

Before Removal

Index    Element
-----    -----------
0        Java
1        HTML
2        CSS
3        JavaScript
4        SQL

Step 4:
The element at index 2 is removed.

list.remove(2);

ArrayList becomes:

[Java, HTML, JavaScript, SQL]

Step 5:
The element "SQL" is removed.

list.remove("SQL");

ArrayList becomes:

[Java, HTML, JavaScript]

Step 6:
The updated ArrayList is displayed.

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Before Removal:
[Java, HTML, CSS, JavaScript, SQL]

ArrayList After Removal:
[Java, HTML, JavaScript]

===============================================================================
*/
