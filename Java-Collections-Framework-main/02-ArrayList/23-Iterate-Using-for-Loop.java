/*
 * =============================================================================
 * Program Name    : Iterate ArrayList Using for Loop
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to iterate through all the elements of
 * an ArrayList using a traditional for loop. The elements are accessed
 * using their index positions with the get() method.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class IterateUsingForLoop {

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

        // Iterating using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
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
The for loop starts with index 0.

Iteration 1:
i = 0
list.get(0) → Java

Iteration 2:
i = 1
list.get(1) → HTML

Iteration 3:
i = 2
list.get(2) → CSS

Iteration 4:
i = 3
list.get(3) → JavaScript

Iteration 5:
i = 4
list.get(4) → SQL

Step 5:
All elements are displayed one by one.

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
