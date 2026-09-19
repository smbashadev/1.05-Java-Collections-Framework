/*
 * =============================================================================
 * Program Name    : Remove Elements from HashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 06-HashSet
 *
 * Description:
 * This program demonstrates how to remove elements from a HashSet using
 * the remove() method. It also demonstrates checking whether an element
 * was successfully removed.
 *
 * Note:
 * This example intentionally uses a raw HashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.HashSet;

public class RemoveElements {

    public static void main(String[] args) {

        // Creating a HashSet
        HashSet set = new HashSet();

        // Adding elements
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // Displaying original HashSet
        System.out.println("Original HashSet:");
        System.out.println(set);

        // Removing an existing element
        System.out.println("\nRemoving 300:");
        System.out.println(set.remove(300));

        // Displaying HashSet after removal
        System.out.println("\nHashSet After Removing 300:");
        System.out.println(set);

        // Trying to remove a non-existing element
        System.out.println("\nRemoving 700:");
        System.out.println(set.remove(700));

        // Displaying final HashSet
        System.out.println("\nFinal HashSet:");
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
The original HashSet is displayed.

Step 5:
remove(300) is executed.

300 is found.

It is removed successfully.

Return Value:

true

Step 6:
The HashSet is displayed after removing 300.

Step 7:
remove(700) is executed.

700 is not found.

Return Value:

false

Step 8:
The final HashSet is displayed.

Step 9:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original HashSet:
[400, 100, 500, 200, 300]

Removing 300:
true

HashSet After Removing 300:
[400, 100, 500, 200]

Removing 700:
false

Final HashSet:
[400, 100, 500, 200]

Note:
The order of elements may vary because HashSet does not
maintain insertion order.

===============================================================================
*/
