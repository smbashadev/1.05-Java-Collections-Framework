/*
 * =============================================================================
 * Program Name    : Create HashSet
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 06-HashSet
 *
 * Description:
 * This program demonstrates how to create a HashSet, add elements,
 * and display its contents.
 *
 * Note:
 * This example intentionally uses a raw HashSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.HashSet;

public class CreateHashSet {

    public static void main(String[] args) {

        // Creating a HashSet
        HashSet set = new HashSet();

        // Adding elements
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);

        // Displaying the HashSet
        System.out.println("HashSet Elements:");
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
An empty HashSet is created.

HashSet set = new HashSet();

Step 3:
Five elements are added.

40
10
30
20
50

Step 4:
HashSet stores only unique elements.

Since all elements are unique, all are stored successfully.

Step 5:
The HashSet is displayed.

Note:
HashSet does not maintain insertion order.
The displayed order may vary.

Step 6:
The number of elements is displayed using size().

Output:

5

Step 7:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

HashSet Elements:
[50, 20, 40, 10, 30]

Number of Elements:
5

Note:
The order of elements may vary because HashSet does not
maintain insertion order.

===============================================================================
  */
