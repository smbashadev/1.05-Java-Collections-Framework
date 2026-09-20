/*
 * =============================================================================
 * Program Name    : Add Elements to LinkedHashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 07-LinkedHashSet
 *
 * Description:
 * This program demonstrates how to add elements to a LinkedHashSet using
 * the add() method. It also shows that duplicate elements are
 * automatically ignored while preserving insertion order.
 *
 * Note:
 * This example intentionally uses a raw LinkedHashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedHashSet;

public class AddElements {

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet set = new LinkedHashSet();

        // Adding elements
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // Adding duplicate elements
        set.add(200);
        set.add(300);

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet Elements:");
        System.out.println(set);

        // Displaying the number of elements
        System.out.println("\nSize of LinkedHashSet:");
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
An empty LinkedHashSet is created.

LinkedHashSet set = new LinkedHashSet();

Step 3:
Five unique elements are added.

100
200
300
400
500

Step 4:
Duplicate elements are added.

200
300

Step 5:
LinkedHashSet checks for duplicates.

Duplicate elements are ignored.

Step 6:
LinkedHashSet preserves the insertion order.

Stored Order:

100
200
300
400
500

Step 7:
The LinkedHashSet is displayed.

Step 8:
The size of the LinkedHashSet is displayed.

Output:

5

Step 9:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedHashSet Elements:
[100, 200, 300, 400, 500]

Size of LinkedHashSet:
5

Note:
Duplicate elements are ignored, and insertion order is preserved.

===============================================================================
*/
