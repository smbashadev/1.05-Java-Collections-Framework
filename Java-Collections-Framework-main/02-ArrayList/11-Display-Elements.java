/*
 * =============================================================================
 * Program Name    : Display Elements of ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to display all the elements stored in an
 * ArrayList. After adding several elements, the complete ArrayList is
 * displayed using the println() method.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class DisplayElements {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying the complete ArrayList
        System.out.println("Displaying all elements:");
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
Five elements are added using the add() method.

ArrayList Contents:
[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The entire ArrayList is displayed using:

System.out.println(list);

Step 5:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Displaying all elements:
[Java, HTML, CSS, JavaScript, SQL]

===============================================================================
*/
