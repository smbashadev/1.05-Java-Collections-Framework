/*
 * =============================================================================
 * Program Name    : Iterate HashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 06-HashSet
 *
 * Description:
 * This program demonstrates different ways to iterate through the
 * elements of a HashSet using an enhanced for-each loop and an Iterator.
 *
 * Note:
 * This example intentionally uses a raw HashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

    public static void main(String[] args) {

        // Creating a HashSet
        HashSet set = new HashSet();

        // Adding elements
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // Displaying the HashSet
        System.out.println("HashSet Elements:");
        System.out.println(set);

        // ---------------------------------------------------------
        // Iterating using enhanced for-each loop
        // ---------------------------------------------------------
        System.out.println("\nUsing Enhanced for-each Loop:");

        for (Object element : set) {
            System.out.println(element);
        }

        // ---------------------------------------------------------
        // Iterating using Iterator
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
An empty HashSet is created.

HashSet set = new HashSet();

Step 3:
Five elements are added.

100
200
300
400
500

Step 4:
The HashSet is displayed.

Note:
HashSet does not maintain insertion order.
The displayed order may vary.

Step 5:
The enhanced for-each loop traverses every element.

Step 6:
An Iterator object is created.

Iterator itr = set.iterator();

Step 7:
The while loop uses hasNext() and next() to traverse
all elements in the HashSet.

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

HashSet Elements:
[400, 100, 500, 200, 300]

Using Enhanced for-each Loop:
400
100
500
200
300

Using Iterator:
400
100
500
200
300

Note:
The order of elements may vary because HashSet does not
maintain insertion order.

===============================================================================
*/
