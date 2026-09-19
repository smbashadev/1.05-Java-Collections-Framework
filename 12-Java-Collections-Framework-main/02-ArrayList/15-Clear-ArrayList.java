/*
 * =============================================================================
 * Program Name    : Clear ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to remove all elements from an ArrayList
 * using the clear() method. After calling clear(), the ArrayList becomes
 * empty while the ArrayList object itself continues to exist.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class ClearArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying ArrayList before clearing
        System.out.println("ArrayList Before clear():");
        System.out.println(list);

        // Removing all elements
        list.clear();

        // Displaying ArrayList after clearing
        System.out.println("\nArrayList After clear():");
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

ArrayList Contents:

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The clear() method removes all elements.

list.clear();

ArrayList becomes:

[]

Step 5:
The empty ArrayList is displayed.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Before clear():
[Java, HTML, CSS, JavaScript, SQL]

ArrayList After clear():
[]

===============================================================================
*/
