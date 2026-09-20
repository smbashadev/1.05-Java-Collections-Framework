/*
 * ============================================================================
 * Program: Create a TreeMap in Java
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 12-TreeMap
 *
 * Description:
 * This program demonstrates how to create a TreeMap, add key-value
 * pairs using the put() method, and display all entries.
 * TreeMap automatically stores the entries in ascending order of keys.
 *
 * ============================================================================
 */

import java.util.TreeMap;

public class CreateTreeMap {

    public static void main(String[] args) {

        // Creating a TreeMap
        TreeMap map = new TreeMap();

        // Adding key-value pairs
        map.put(103, "David");
        map.put(101, "Rahul");
        map.put(104, "Priya");
        map.put(102, "Anjali");

        // Displaying the TreeMap
        System.out.println("TreeMap Contents:");
        System.out.println(map);
    }
}

/*
========================
Dry Run
========================

Step 1:
Create an empty TreeMap.

map = { }

Step 2:
Insert the first entry.

103 -> David

map = {103=David}

Step 3:
Insert more entries.

101 -> Rahul
104 -> Priya
102 -> Anjali

Although the entries are inserted in the order:

103
101
104
102

TreeMap automatically sorts the keys.

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 4:
Display the TreeMap.

The entries are displayed in ascending order of keys.

========================
Expected Output
========================

TreeMap Contents:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Note:
- TreeMap stores data as key-value pairs.
- Keys are automatically sorted in ascending order.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Null keys are not allowed.
- Multiple null values are allowed.
*/
