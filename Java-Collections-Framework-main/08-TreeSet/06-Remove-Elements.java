/*
 * =============================================================================
 * Program Name    : Remove Elements from TreeSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 08-TreeSet
 *
 * Description:
 * This program demonstrates how to remove elements from a TreeSet
 * using the remove() method. It also demonstrates checking whether
 * an element was successfully removed.
 *
 * Note:
 * This example intentionally uses a raw TreeSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.TreeSet;

public class RemoveElements {

    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet set = new TreeSet();

        // Adding elements
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);

        // Displaying the original TreeSet
        System.out.println("Original TreeSet:");
        System.out.println(set);

        // Removing an existing element
        System.out.println("\nRemoving 30:");
        System.out.println(set.remove(30));

        // Displaying TreeSet after removing 30
        System.out.println("\nTreeSet After Removing 30:");
        System.out.println(set);

        // Attempting to remove a non-existing element
        System.out.println("\nRemoving 100:");
        System.out.println(set.remove(100));

        // Displaying the final TreeSet
        System.out.println("\nFinal TreeSet:");
        System.out.println(set);

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
20
40
10
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
The original TreeSet is displayed.

Step 6:
remove(30) is executed.

30 exists in the TreeSet.

Return Value:

true

Step 7:
TreeSet after removing 30.

Elements:

10
20
40
50

Step 8:
remove(100) is executed.

100 is not present.

Return Value:

false

Step 9:
The final TreeSet is displayed.

Step 10:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original TreeSet:
[10, 20, 30, 40, 50]

Removing 30:
true

TreeSet After Removing 30:
[10, 20, 40, 50]

Removing 100:
false

Final TreeSet:
[10, 20, 40, 50]

Note:
- TreeSet automatically maintains ascending sorted order.
- remove() returns true if the element is removed successfully.
- remove() returns false if the element does not exist.

===============================================================================
*/
