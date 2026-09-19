/*
 * =============================================================================
 * Program Name    : Iterate LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates different ways to iterate through the
 * elements of a LinkedList. It uses a for loop, enhanced for-each loop,
 * and Iterator to traverse the LinkedList.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList list = new LinkedList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");

        // Displaying the LinkedList
        System.out.println("LinkedList :");
        System.out.println(list);

        // ---------------------------------------------------------
        // Iteration using for loop
        // ---------------------------------------------------------
        System.out.println("\nUsing for Loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // ---------------------------------------------------------
        // Iteration using for-each loop
        // ---------------------------------------------------------
        System.out.println("\nUsing for-each Loop:");

        for (Object element : list) {
            System.out.println(element);
        }

        // ---------------------------------------------------------
        // Iteration using Iterator
        // ---------------------------------------------------------
        System.out.println("\nUsing Iterator:");

        Iterator itr = list.iterator();

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
An empty LinkedList is created.

LinkedList list = new LinkedList();

Step 3:
Five elements are added.

LinkedList Contents:

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The complete LinkedList is displayed.

Step 5:
Elements are traversed using a for loop.

Output:

Java
HTML
CSS
JavaScript
SQL

Step 6:
Elements are traversed using the enhanced for-each loop.

Output:

Java
HTML
CSS
JavaScript
SQL

Step 7:
Elements are traversed using an Iterator.

Output:

Java
HTML
CSS
JavaScript
SQL

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedList :
[Java, HTML, CSS, JavaScript, SQL]

Using for Loop:
Java
HTML
CSS
JavaScript
SQL

Using for-each Loop:
Java
HTML
CSS
JavaScript
SQL

Using Iterator:
Java
HTML
CSS
JavaScript
SQL

===============================================================================
*/
