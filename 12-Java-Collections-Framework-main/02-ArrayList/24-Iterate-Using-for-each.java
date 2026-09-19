/*
 * =============================================================================
 * Program Name    : Iterate ArrayList Using for-each Loop
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to iterate through all the elements of
 * an ArrayList using the enhanced for loop (for-each loop). This approach
 * is simple, readable, and is commonly used when only reading elements.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class IterateUsingForEach {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying ArrayList
        System.out.println("ArrayList Elements:");

        // Iterating using for-each loop
        for (Object element : list) {
            System.out.println(element);
        }

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
The enhanced for loop starts.

Iteration 1:
element = Java

Iteration 2:
element = HTML

Iteration 3:
element = CSS

Iteration 4:
element = JavaScript

Iteration 5:
element = SQL

Step 5:
Each element is displayed one by one.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Elements:
Java
HTML
CSS
JavaScript
SQL

===============================================================================
*/
