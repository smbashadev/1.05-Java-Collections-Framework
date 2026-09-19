/*
 * =============================================================================
 * Program Name    : Create LinkedHashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 07-LinkedHashSet
 *
 * Description:
 * This program demonstrates how to create a LinkedHashSet, add elements,
 * and display its contents while preserving insertion order.
 *
 * Note:
 * This example intentionally uses a raw LinkedHashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedHashSet;

public class CreateLinkedHashSet {

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet set = new LinkedHashSet();

        // Adding elements
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet Elements:");
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
An empty LinkedHashSet is created.

LinkedHashSet set = new LinkedHashSet();

Step 3:
Five elements are added.

40
10
30
20
50

Step 4:
LinkedHashSet stores only unique elements.

Since all elements are unique, all are stored successfully.

Step 5:
LinkedHashSet maintains the insertion order.

Output Order:

40
10
30
20
50

Step 6:
The LinkedHashSet is displayed.

Step 7:
The number of elements is displayed using size().

Output:

5

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedHashSet Elements:
[40, 10, 30, 20, 50]

Number of Elements:
5

Note:
LinkedHashSet preserves the insertion order of elements.

===============================================================================
*/
