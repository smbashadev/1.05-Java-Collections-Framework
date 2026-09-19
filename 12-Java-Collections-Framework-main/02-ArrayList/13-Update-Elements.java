/*
 * =============================================================================
 * Program Name    : Update Elements in ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to update an existing element in an
 * ArrayList using the set() method. The set() method replaces the
 * element at the specified index with a new element.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class UpdateElements {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying ArrayList before update
        System.out.println("ArrayList Before Update:");
        System.out.println(list);

        // Updating an element using set()
        list.set(2, "Python");

        // Displaying ArrayList after update
        System.out.println("\nArrayList After Update:");
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

Before Update

Index    Element
-----    -------
0        Java
1        HTML
2        CSS
3        JavaScript
4        SQL

Step 4:
The set() method updates the element at index 2.

list.set(2, "Python");

After Update

Index    Element
-----    -------
0        Java
1        HTML
2        Python
3        JavaScript
4        SQL

Step 5:
The updated ArrayList is displayed.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Before Update:
[Java, HTML, CSS, JavaScript, SQL]

ArrayList After Update:
[Java, HTML, Python, JavaScript, SQL]

===============================================================================
*/
