/*
 * =============================================================================
 * Program Name    : Add Elements to LinkedList
 * Author          : Shaik Mahaboob Basha
 * Repository      : 12-Java-Collections-Framework
 * Folder          : 03-LinkedList
 *
 * Description:
 * This program demonstrates how to add elements to a LinkedList using
 * the add() method. The add() method inserts elements at the end of
 * the LinkedList while maintaining the insertion order.
 *
 * Note:
 * This example intentionally uses a raw LinkedList (without Generics)
 * for learning purposes.
 * =============================================================================
 */

import java.util.LinkedList;

public class AddElements {

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
        System.out.println("LinkedList Elements:");
        System.out.println(list);

        // Displaying the size
        System.out.println("Size : " + list.size());

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
Elements are added using add().

After adding "Java"

[Java]

After adding "HTML"

[Java, HTML]

After adding "CSS"

[Java, HTML, CSS]

After adding "JavaScript"

[Java, HTML, CSS, JavaScript]

After adding "SQL"

[Java, HTML, CSS, JavaScript, SQL]

Step 4:
The LinkedList is displayed.

Step 5:
The size of the LinkedList is displayed.

Size = 5

Step 6:
Program execution ends successfully.

===============================================================================
Expected Output
===============================================================================

LinkedList Elements:
[Java, HTML, CSS, JavaScript, SQL]
Size : 5

===============================================================================
*/
