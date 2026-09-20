/*
 * =============================================================================
 * Program Name    : Find Index Using indexOf() Method
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 02-ArrayList
 *
 * Description:
 * This program demonstrates how to find the index of an element in an
 * ArrayList using the indexOf() method. The method returns the index of
 * the first occurrence of the specified element. If the element is not
 * found, it returns -1.
 *
 * Note:
 * This example intentionally uses a raw ArrayList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.ArrayList;

public class IndexOf {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");
        list.add("Java");

        // Displaying the ArrayList
        System.out.println("ArrayList Elements:");
        System.out.println(list);

        // Finding the first occurrence of elements
        System.out.println("\nIndex of 'Java' : " + list.indexOf("Java"));
        System.out.println("Index of 'CSS' : " + list.indexOf("CSS"));
        System.out.println("Index of 'Python' : " + list.indexOf("Python"));

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
-----    ----------
0        Java
1        HTML
2        CSS
3        JavaScript
4        SQL
5        Java

Step 4:
The indexOf() method searches for the first occurrence.

list.indexOf("Java");

Returns:

0

Step 5:
The indexOf() method searches for "CSS".

Returns:

2

Step 6:
The indexOf() method searches for "Python".

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
[Java, HTML, CSS, JavaScript, SQL, Java]

Index of 'Java' : 0
Index of 'CSS' : 2
Index of 'Python' : -1

===============================================================================
*/
