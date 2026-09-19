/*
 * ============================================================================
 * Program: Iterate Through a TreeMap
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 12-TreeMap
 *
 * Description:
 * This program demonstrates how to iterate through a TreeMap
 * using the entrySet() method and a for-each loop. Since TreeMap
 * stores entries in ascending order of keys, the entries are
 * displayed in sorted order.
 *
 * ============================================================================
 */

import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {

    public static void main(String[] args) {

        // Creating a TreeMap
        TreeMap map = new TreeMap();

        // Adding key-value pairs
        map.put(103, "David");
        map.put(101, "Rahul");
        map.put(104, "Priya");
        map.put(102, "Anjali");

        // Displaying the complete TreeMap
        System.out.println("Complete TreeMap:");
        System.out.println(map);

        System.out.println();

        // Iterating through the TreeMap
        System.out.println("Iterating through TreeMap:");

        for (Object obj : map.entrySet()) {

            Map.Entry entry = (Map.Entry) obj;

            System.out.println("Key   : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
            System.out.println("----------------------");
        }
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
Insert key-value pairs.

103 -> David
101 -> Rahul
104 -> Priya
102 -> Anjali

Although inserted in random order,
TreeMap automatically sorts the keys.

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 3:
Call entrySet().

The TreeMap returns all key-value pairs.

Step 4:
Use a for-each loop.

Each entry is processed one by one.

Step 5:
Retrieve the key and value.

entry.getKey()
entry.getValue()

Step 6:
Display every key-value pair.

The entries are displayed in ascending order of keys.

========================
Expected Output
========================

Complete TreeMap:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Iterating through TreeMap:
Key   : 101
Value : Rahul
----------------------
Key   : 102
Value : Anjali
----------------------
Key   : 103
Value : David
----------------------
Key   : 104
Value : Priya
----------------------

Note:
- entrySet() returns all key-value pairs in the TreeMap.
- Each entry is represented by a Map.Entry object.
- getKey() returns the key.
- getValue() returns the corresponding value.
- TreeMap always iterates in ascending order of keys.
*/
