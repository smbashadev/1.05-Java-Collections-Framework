/*
 * =============================================================================
 * Program Name    : TreeSet Navigational Methods
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 08-TreeSet
 *
 * Description:
 * This program demonstrates the commonly used navigational methods
 * provided by the TreeSet class such as first(), last(), higher(),
 * lower(), ceiling(), and floor().
 *
 * Note:
 * This example intentionally uses a raw TreeSet (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.TreeSet;

public class NavigationalMethods {

    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet set = new TreeSet();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Displaying TreeSet
        System.out.println("TreeSet Elements:");
        System.out.println(set);

        // first()
        System.out.println("\nFirst Element:");
        System.out.println(set.first());

        // last()
        System.out.println("\nLast Element:");
        System.out.println(set.last());

        // higher()
        System.out.println("\nHigher than 30:");
        System.out.println(set.higher(30));

        // lower()
        System.out.println("\nLower than 30:");
        System.out.println(set.lower(30));

        // ceiling()
        System.out.println("\nCeiling of 35:");
        System.out.println(set.ceiling(35));

        // floor()
        System.out.println("\nFloor of 35:");
        System.out.println(set.floor(35));

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

10
20
30
40
50

Step 4:
TreeSet automatically sorts the elements.

Sorted Order:

10
20
30
40
50

Step 5:
first() returns the smallest element.

Output:

10

Step 6:
last() returns the largest element.

Output:

50

Step 7:
higher(30) returns the next greater element.

Output:

40

Step 8:
lower(30) returns the next smaller element.

Output:

20

Step 9:
ceiling(35) returns the smallest element greater than or equal to 35.

Output:

40

Step 10:
floor(35) returns the largest element less than or equal to 35.

Output:

30

Step 11:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

TreeSet Elements:
[10, 20, 30, 40, 50]

First Element:
10

Last Element:
50

Higher than 30:
40

Lower than 30:
20

Ceiling of 35:
40

Floor of 35:
30

Note:
- first() returns the smallest element.
- last() returns the largest element.
- higher() returns the next greater element.
- lower() returns the next smaller element.
- ceiling() returns the specified element if present; otherwise the next greater element.
- floor() returns the specified element if present; otherwise the next smaller element.

===============================================================================
*/
