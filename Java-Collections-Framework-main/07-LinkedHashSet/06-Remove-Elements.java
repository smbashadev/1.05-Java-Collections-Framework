/*
 * =============================================================================
 * Program Name    : Remove Elements from LinkedHashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 07-LinkedHashSet
 *
 * Description:
 * This program demonstrates how to remove elements from a LinkedHashSet
 * using the remove() method. It also demonstrates checking whether an
 * element was successfully removed while preserving insertion order.
 *
 * Note:
 * This example intentionally uses a raw LinkedHashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedHashSet;

public class RemoveElements {

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet set = new LinkedHashSet();

        // Adding elements
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // Displaying original LinkedHashSet
        System.out.println("Original LinkedHashSet:");
        System.out.println(set);

        // Removing an existing element
        System.out.println("\nRemoving 300:");
        System.out.println(set.remove(300));

        // Displaying LinkedHashSet after removal
        System.out.println("\nLinkedHashSet After Removing 300:");
        System.out.println(set);

        // Trying to remove a non-existing element
        System.out.println("\nRemoving 700:");
        System.out.println(set.remove(700));

        // Displaying final LinkedHashSet
        System.out.println("\nFinal LinkedHashSet:");
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
The original LinkedHashSet is displayed.

Insertion Order:

100
200
300
400
500

Step 5:
remove(300) is executed.

300 is found.

It is removed successfully.

Return Value:

true

Step 6:
The LinkedHashSet is displayed after removing 300.

Remaining Elements:

100
200
400
500

Step 7:
remove(700) is executed.

700 is not found.

Return Value:

false

Step 8:
The final LinkedHashSet is displayed.

Insertion order of remaining elements is preserved.

Step 9:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

Original LinkedHashSet:
[100, 200, 300, 400, 500]

Removing 300:
true

LinkedHashSet After Removing 300:
[100, 200, 400, 500]

Removing 700:
false

Final LinkedHashSet:
[100, 200, 400, 500]

Note:
LinkedHashSet preserves the insertion order of the remaining elements.

===============================================================================
*/
