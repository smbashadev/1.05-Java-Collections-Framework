/*
 * =============================================================================
 * Program Name    : Add Elements to ArrayList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to add elements to an ArrayList using the
 * add() method. The elements are inserted one after another, and the
 * ArrayList is displayed after all elements are added.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class AddElements {

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
        System.out.println("Elements in ArrayList:");
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
Elements are added one by one using the add() method.

After adding "Java"
[Java]

After adding "HTML"
[Java, HTML]

After adding "CSS"
[Java, HTML, CSS]

After adding "JavaScript"
[Java, HTML, CSS, JavaScript]

After adding "SQL"
[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The ArrayList is printed.

Step 5:
Program execution ends.

===============================================================================
Expected Output
===============================================================================

Elements in ArrayList:
[Java, HTML, CSS, JavaScript, SQL]

===============================================================================
*/
