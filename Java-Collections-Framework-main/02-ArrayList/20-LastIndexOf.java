/*
 * =============================================================================
 * Program Name    : Find Last Index Using lastIndexOf() Method
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to find the last occurrence of an
 * element in an ArrayList using the lastIndexOf() method. The method
 * returns the index of the last occurrence of the specified element.
 * If the element is not found, it returns -1.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class LastIndexOf {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("Java");
        list.add("JavaScript");
        list.add("SQL");
        list.add("Java");

        // Displaying the ArrayList
        System.out.println("ArrayList Elements:");
        System.out.println(list);

        // Finding the last occurrence of elements
        System.out.println("\nLast Index of 'Java' : "
                + list.lastIndexOf("Java"));

        System.out.println("Last Index of 'CSS' : "
                + list.lastIndexOf("CSS"));

        System.out.println("Last Index of 'Python' : "
                + list.lastIndexOf("Python"));

    }
}

/*
===============================================================================
Dry Run
===============================================================================

Step 1:
Program execution starts from the main() method.

Step 2:
An empty ArrayList is created.

ArrayList list = new ArrayList();

Step 3:
Elements are added.

Index    Element
-----    -------------
0        Java
1        HTML
2        CSS
3        Java
4        JavaScript
5        SQL
6        Java

Step 4:
The lastIndexOf() method searches for the last occurrence of "Java".

list.lastIndexOf("Java");

Returns:

6

Step 5:
The lastIndexOf() method searches for "CSS".

Returns:

2

Step 6:
The lastIndexOf() method searches for "Python".

Since the element is not present,

Returns:

-1

Step 7:
The results are displayed.

Step 8:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

ArrayList Elements:
[Java, HTML, CSS, Java, JavaScript, SQL, Java]

Last Index of 'Java' : 6
Last Index of 'CSS' : 2
Last Index of 'Python' : -1

===============================================================================
*/
