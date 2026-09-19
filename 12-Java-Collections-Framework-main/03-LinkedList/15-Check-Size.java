/*
 * =============================================================================
 * Program Name    : Check Size of LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to determine the number of elements
 * present in a LinkedList using the size() method.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class CheckSize {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList list = new LinkedList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying the LinkedList
        System.out.println("LinkedList :");
        System.out.println(list);

        // Displaying the size
        System.out.println("\nNumber of Elements : " + list.size());

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An empty LinkedList is created.

LinkedList list = new LinkedList();

Step 3:
Five elements are added.

LinkedList Contents:

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The LinkedList is displayed.

Step 5:
The size() method is called.

list.size();

Result:

5

Step 6:
The total number of elements is displayed.

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedList :
[Java, HTML, CSS, JavaScript, SQL]

Number of Elements : 5

===============================================================================
*/
