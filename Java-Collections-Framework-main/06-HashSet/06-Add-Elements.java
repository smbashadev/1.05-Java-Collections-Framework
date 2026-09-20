/*
 * =============================================================================
 * Program Name    : Add Elements to HashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 06-HashSet
 *
 * Description:
 * This program demonstrates how to add elements to a HashSet using the
 * add() method. It also shows that duplicate elements are automatically
 * ignored by HashSet.
 *
 * Note:
 * This example intentionally uses a raw HashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.HashSet;

public class AddElements {

    public static void main(String[] args) {

        // Creating a HashSet
        HashSet set = new HashSet();

        // Adding elements
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // Adding duplicate elements
        set.add(200);
        set.add(300);

        // Displaying the HashSet
        System.out.println("HashSet Elements:");
        System.out.println(set);

        // Displaying the number of elements
        System.out.println("\nSize of HashSet:");
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
An empty HashSet is created.

HashSet set = new HashSet();

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
HashSet checks for duplicates.

Duplicate elements are ignored.

Step 6:
The HashSet is displayed.

Only unique elements are present.

Step 7:
The size of the HashSet is displayed.

Output:

5

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

HashSet Elements:
[400, 100, 500, 200, 300]

Size of HashSet:
5

Note:
The order of elements may vary because HashSet does not
maintain insertion order.

===============================================================================
*/
