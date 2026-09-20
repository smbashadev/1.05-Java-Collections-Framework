/*
 * =============================================================================
 * Program Name    : Iterate LinkedHashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 07-LinkedHashSet
 *
 * Description:
 * This program demonstrates different ways to iterate through the
 * elements of a LinkedHashSet using an enhanced for-each loop and
 * an Iterator.
 *
 * Note:
 * This example intentionally uses a raw LinkedHashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IterateLinkedHashSet {

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet set = new LinkedHashSet();

        // Adding elements
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet Elements:");
        System.out.println(set);

        // ---------------------------------------------------------
        // Iteration using enhanced for-each loop
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
An empty LinkedHashSet is created.

LinkedHashSet set = new LinkedHashSet();

Step 3:
Five elements are added.

100
200
300
400
500

Step 4:
The LinkedHashSet is displayed.

Insertion Order:

100
200
300
400
500

Step 5:
The enhanced for-each loop traverses every element.

Output:

100
200
300
400
500

Step 6:
An Iterator object is created.

Iterator itr = set.iterator();

Step 7:
The while loop uses hasNext() and next() to traverse
all elements in insertion order.

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedHashSet Elements:
[100, 200, 300, 400, 500]

Using Enhanced for-each Loop:
100
200
300
400
500

Using Iterator:
100
200
300
400
500

Note:
LinkedHashSet preserves insertion order while iterating.

===============================================================================
*/
