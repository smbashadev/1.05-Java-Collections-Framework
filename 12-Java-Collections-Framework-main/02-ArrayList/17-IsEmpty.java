/*
 * =============================================================================
 * Program Name    : Check Whether ArrayList is Empty
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to check whether an ArrayList is empty
 * using the isEmpty() method. The method returns true if the ArrayList
 * contains no elements; otherwise, it returns false.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class IsEmpty {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Checking whether the ArrayList is empty
        System.out.println("Is ArrayList Empty? : " + list.isEmpty());

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");

        // Displaying the ArrayList
        System.out.println("\nArrayList Elements:");
        System.out.println(list);

        // Checking again
        System.out.println("\nIs ArrayList Empty? : " + list.isEmpty());

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
The isEmpty() method is called.

list.isEmpty();

Since the ArrayList contains no elements,

Result:

true

Step 4:
Three elements are added.

ArrayList Contents:

[Java, HTML, CSS]

Step 5:
The isEmpty() method is called again.

list.isEmpty();

Since the ArrayList contains elements,

Result:

false

Step 6:
The results are displayed.

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Is ArrayList Empty? : true

ArrayList Elements:
[Java, HTML, CSS]

Is ArrayList Empty? : false

===============================================================================
*/
