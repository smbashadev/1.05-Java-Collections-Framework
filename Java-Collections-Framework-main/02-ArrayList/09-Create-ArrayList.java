/*
 * =============================================================================
 * Program Name    : Create ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to create an ArrayList object in Java.
 * It uses the default constructor of the ArrayList class and displays
 * a confirmation message after successful creation.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class CreateArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList object
        ArrayList list = new ArrayList();

        // Displaying confirmation message
        System.out.println("ArrayList created successfully.");

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An empty ArrayList object is created.

ArrayList list = new ArrayList();

Step 3:
The confirmation message is printed.

Step 4:
Program execution ends.

===============================================================================
Expected Output
===============================================================================

ArrayList created successfully.

===============================================================================
*/
