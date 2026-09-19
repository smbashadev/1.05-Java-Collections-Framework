/*
 * =============================================================================
 * Program Name    : Check Size of ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to determine the number of elements
 * present in an ArrayList using the size() method.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class CheckSize {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying the ArrayList
        System.out.println("ArrayList Elements:");
        System.out.println(list);

        // Finding the size of the ArrayList
        int size = list.size();

        // Displaying the size
        System.out.println("\nNumber of Elements : " + size);

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
The size() method is called.

int size = list.size();

The method returns:

5

Step 5:
The size of the ArrayList is displayed.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Elements:
[Java, HTML, CSS, JavaScript, SQL]

Number of Elements : 5

===============================================================================
*/
