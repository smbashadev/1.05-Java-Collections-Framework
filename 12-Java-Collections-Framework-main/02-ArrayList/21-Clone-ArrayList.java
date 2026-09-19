/*
 * =============================================================================
 * Program Name    : Clone ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to create a copy of an ArrayList using
 * the clone() method. The clone() method creates a shallow copy of the
 * original ArrayList.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class CloneArrayList {

    public static void main(String[] args) {

        // Creating the original ArrayList
        ArrayList originalList = new ArrayList();

        // Adding elements
        originalList.add("Java");
        originalList.add("HTML");
        originalList.add("CSS");
        originalList.add("JavaScript");
        originalList.add("SQL");

        // Displaying the original ArrayList
        System.out.println("Original ArrayList:");
        System.out.println(originalList);

        // Cloning the ArrayList
        ArrayList clonedList = (ArrayList) originalList.clone();

        // Displaying the cloned ArrayList
        System.out.println("\nCloned ArrayList:");
        System.out.println(clonedList);

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An original ArrayList is created.

ArrayList originalList = new ArrayList();

Step 3:
Five elements are added.

Original ArrayList:

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The clone() method is called.

ArrayList clonedList = (ArrayList) originalList.clone();

A shallow copy of the original ArrayList is created.

Step 5:
The cloned ArrayList is displayed.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original ArrayList:
[Java, HTML, CSS, JavaScript, SQL]

Cloned ArrayList:
[Java, HTML, CSS, JavaScript, SQL]

===============================================================================
*/
