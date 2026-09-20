/*
 * =============================================================================
 * Program Name    : Add Elements to TreeSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 08-TreeSet
 *
 * Description:
 * This program demonstrates how to add elements to a TreeSet using
 * the add() method. It also shows that TreeSet automatically removes
 * duplicate elements and stores elements in ascending sorted order.
 *
 * Note:
 * This example intentionally uses a raw TreeSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.TreeSet;

public class AddElements {

    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet set = new TreeSet();

        // Adding elements
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);

        // Adding duplicate elements
        set.add(20);
        set.add(40);

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
Elements are added.

50
20
40
10
30

Step 4:
Duplicate elements are added.

20
40

TreeSet ignores duplicate elements.

Step 5:
The TreeSet automatically arranges the elements in ascending order.

Sorted Order:

10
20
30
40
50

Step 6:
The TreeSet is displayed.

Step 7:
The number of unique elements is displayed using size().

Output:

5

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

TreeSet Elements:
[10, 20, 30, 40, 50]

Number of Elements:
5

Note:
- TreeSet automatically stores elements in ascending sorted order.
- Duplicate elements are ignored.

===============================================================================
*/
