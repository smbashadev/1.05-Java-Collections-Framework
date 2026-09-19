/*
 * ============================================================================
 * Program: Iterate Through a LinkedHashMap
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 11-LinkedHashMap
 *
 * Description:
 * This program demonstrates how to iterate through a LinkedHashMap
 * using the entrySet() method and a for-each loop. Since LinkedHashMap
 * maintains insertion order, the entries are displayed in the same
 * order in which they were inserted.
 *
 * ============================================================================
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class IterateLinkedHashMap {

    public static void main(String[] args) {

        // Creating a LinkedHashMap
        LinkedHashMap map = new LinkedHashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Displaying the complete LinkedHashMap
        System.out.println("Complete LinkedHashMap:");
        System.out.println(map);

        System.out.println();

        // Iterating through the LinkedHashMap
        System.out.println("Iterating through LinkedHashMap:");

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
Create an empty LinkedHashMap.

map = { }

Step 2:
Insert key-value pairs.

101 -> Rahul
102 -> Anjali
103 -> David
104 -> Priya

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 3:
Call entrySet().

The LinkedHashMap returns all key-value pairs.

Step 4:
Use a for-each loop.

Each entry is processed one by one.

Step 5:
Retrieve the key and value.

entry.getKey()
entry.getValue()

Step 6:
Display every key-value pair.

The entries are displayed in insertion order.

========================
Expected Output
========================

Complete LinkedHashMap:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Iterating through LinkedHashMap:
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
- entrySet() returns all key-value pairs in the LinkedHashMap.
- Each entry is represented by a Map.Entry object.
- getKey() returns the key.
- getValue() returns the corresponding value.
- LinkedHashMap maintains insertion order while iterating.
*/
