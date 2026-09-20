/*
 * =============================================================================
 * Program Name    : Create TreeSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 08-TreeSet
 *
 * Description:
 * This program demonstrates how to create a TreeSet, add elements,
 * and display its contents in ascending sorted order.
 *
 * Note:
 * This example intentionally uses a raw TreeSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.TreeSet;

public class CreateTreeSet {

    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet set = new TreeSet();

        // Adding elements
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);

        // Displaying the TreeSet
        System.out.println("TreeSet Elements:");
        System.out.println(set);

        // Displaying the size
        System.out.println("\nNumber of Elements:");
        System.out.println(set.size());

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An empty TreeSet is created.

TreeSet set = new TreeSet();

Step 3:
Five elements are added.

40
10
30
20
50

Step 4:
TreeSet automatically sorts the elements in ascending order.

Sorted Order:

10
20
30
40
50

Step 5:
The TreeSet is displayed.

Step 6:
The number of elements is displayed using size().

Output:

5

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

TreeSet Elements:
[10, 20, 30, 40, 50]

Number of Elements:
5

Note:
TreeSet automatically maintains elements in ascending sorted order.

===============================================================================
*/
