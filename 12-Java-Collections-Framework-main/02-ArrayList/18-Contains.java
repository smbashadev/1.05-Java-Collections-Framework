/*
 * =============================================================================
 * Program Name    : Check Element Using contains() Method
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to check whether a particular element
 * exists in an ArrayList using the contains() method. The method returns
 * true if the specified element is present; otherwise, it returns false.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class Contains {

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

        // Checking whether elements exist
        System.out.println("\nDoes ArrayList contain 'Java'? : "
                + list.contains("Java"));

        System.out.println("Does ArrayList contain 'Python'? : "
                + list.contains("Python"));

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
The contains() method checks whether "Java" exists.

list.contains("Java");

Result:

true

Step 5:
The contains() method checks whether "Python" exists.

list.contains("Python");

Result:

false

Step 6:
The results are displayed.

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Elements:
[Java, HTML, CSS, JavaScript, SQL]

Does ArrayList contain 'Java'? : true
Does ArrayList contain 'Python'? : false

===============================================================================
*/
