/*
 * ============================================================================
 * Program: Collections Algorithms Examples in Java
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 17-Collections-Algorithms
 *
 * Description:
 * This program demonstrates the commonly used algorithms provided by the
 * java.util.Collections class.
 *
 * Algorithms Covered:
 * 1. sort()
 * 2. binarySearch()
 * 3. reverse()
 * 4. shuffle()
 * 5. max()
 * 6. min()
 *
 * Note:
 * This program intentionally uses raw collection types
 * (without Generics) to maintain consistency throughout
 * this repository.
 * ============================================================================
 */

import java.util.ArrayList;
import java.util.Collections;

public class Examples {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);

        System.out.println("Original List");
        System.out.println(list);

        System.out.println();

        // ------------------------------------------------------------

        Collections.sort(list);

        System.out.println("After Sorting");
        System.out.println(list);

        System.out.println();

        // ------------------------------------------------------------

        int index = Collections.binarySearch(list, 30);

        System.out.println("Searching for 30");
        System.out.println("Index : " + index);

        System.out.println();

        // ------------------------------------------------------------

        Collections.reverse(list);

        System.out.println("After Reversing");
        System.out.println(list);

        System.out.println();

        // ------------------------------------------------------------

        Collections.shuffle(list);

        System.out.println("After Shuffling");
        System.out.println(list);

        System.out.println();

        // ------------------------------------------------------------

        System.out.println("Maximum Element");
        System.out.println(Collections.max(list));

        System.out.println();

        System.out.println("Minimum Element");
        System.out.println(Collections.min(list));

        System.out.println();

        System.out.println("Program Completed Successfully.");
    }
}

/*
============================================================================
Dry Run
============================================================================

Original List

↓

[40, 10, 30, 20, 50]

------------------------------------------------------------

Collections.sort()

↓

[10, 20, 30, 40, 50]

------------------------------------------------------------

Collections.binarySearch(list, 30)

↓

Index = 2

------------------------------------------------------------

Collections.reverse()

↓

[50, 40, 30, 20, 10]

------------------------------------------------------------

Collections.shuffle()

↓

Random Order

Example

[20, 50, 10, 40, 30]

(The order changes on every execution.)

------------------------------------------------------------

Collections.max()

↓

50

------------------------------------------------------------

Collections.min()

↓

10

============================================================================
Expected Output
============================================================================

Original List
[40, 10, 30, 20, 50]

After Sorting
[10, 20, 30, 40, 50]

Searching for 30
Index : 2

After Reversing
[50, 40, 30, 20, 10]

After Shuffling
(Random order)

Maximum Element
50

Minimum Element
10

Program Completed Successfully.

============================================================================
Important Points
============================================================================

✓ Collections.sort() arranges elements in ascending order.

✓ Collections.binarySearch() works correctly only on a sorted list.

✓ Collections.reverse() reverses the elements of the original list.

✓ Collections.shuffle() randomly rearranges the elements.

✓ Collections.max() returns the largest element.

✓ Collections.min() returns the smallest element.

✓ All these methods are static methods of the Collections utility class.

✓ Collections Algorithms reduce coding effort and improve code readability.
*/
