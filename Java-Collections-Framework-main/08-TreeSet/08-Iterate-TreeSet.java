/*
 * =============================================================================
 * Program Name    : Iterate TreeSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 08-TreeSet
 *
 * Description:
 * This program demonstrates different ways to iterate through the
 * elements of a TreeSet using an enhanced for-each loop and an Iterator.
 *
 * Note:
 * This example intentionally uses a raw TreeSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.Iterator;
import java.util.TreeSet;

public class IterateTreeSet {

    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet set = new TreeSet();

        // Adding elements
        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);

        // Displaying the TreeSet
        System.out.println("TreeSet Elements:");
        System.out.println(set);

        // ---------------------------------------------------------
        // Iteration using Enhanced for-each Loop
        // ---------------------------------------------------------
        System.out.println("\nUsing Enhanced for-each Loop:");

        for (Object element : set) {
            System.out.println(element);
        }

        // ---------------------------------------------------------
        // Iteration using Iterator
        // ---------------------------------------------------------
        System.out.println("\nUsing Iterator:");

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
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
An empty TreeSet is created.

TreeSet set = new TreeSet();

Step 3:
Five elements are added.

50
10
40
20
30

Step 4:
TreeSet automatically sorts the elements.

Sorted Order:

10
20
30
40
50

Step 5:
The TreeSet is displayed.

Output:

[10, 20, 30, 40, 50]

Step 6:
The enhanced for-each loop traverses all elements.

Output:

10
20
30
40
50

Step 7:
An Iterator object is created.

Iterator itr = set.iterator();

Step 8:
The while loop uses hasNext() and next()
to traverse all elements in ascending order.

Step 9:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

TreeSet Elements:
[10, 20, 30, 40, 50]

Using Enhanced for-each Loop:
10
20
30
40
50

Using Iterator:
10
20
30
40
50

Note:
- TreeSet automatically maintains ascending sorted order.
- Both the enhanced for-each loop and Iterator traverse elements in sorted order.

===============================================================================
*/
