/*
 * =============================================================================
 * Program Name    : Access Elements from ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to access elements from an ArrayList
 * using the get() method. The get() method retrieves an element based
 * on its index position.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class AccessElements {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Accessing elements using index
        System.out.println("Element at Index 0 : " + list.get(0));
        System.out.println("Element at Index 2 : " + list.get(2));
        System.out.println("Element at Index 4 : " + list.get(4));

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

Index    Element
-----    -------
0        Java
1        HTML
2        CSS
3        JavaScript
4        SQL

Step 4:
The get() method retrieves elements using their index.

list.get(0) returns "Java"

list.get(2) returns "CSS"

list.get(4) returns "SQL"

Step 5:
The retrieved elements are displayed.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Element at Index 0 : Java
Element at Index 2 : CSS
Element at Index 4 : SQL

===============================================================================
*/
