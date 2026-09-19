/*
 * =============================================================================
 * Program Name    : Convert ArrayList to Array
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to convert an ArrayList into an array
 * using the toArray() method. The method returns an Object array
 * containing all the elements of the ArrayList.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class ConvertToArray {

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

        // Converting ArrayList to Array
        Object[] array = list.toArray();

        // Displaying the Array elements
        System.out.println("\nElements in Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
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
The toArray() method is called.

Object[] array = list.toArray();

The ArrayList is converted into an Object array.

Step 5:
A for loop iterates through the array.

Each element is displayed one by one.

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Elements:
[Java, HTML, CSS, JavaScript, SQL]

Elements in Array:
Java
HTML
CSS
JavaScript
SQL

===============================================================================
*/
