/*
 * ============================================================================
 * Program: Create a LinkedHashMap in Java
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 11-LinkedHashMap
 *
 * Description:
 * This program demonstrates how to create a LinkedHashMap, add
 * key-value pairs using the put() method, and display all entries.
 * LinkedHashMap maintains the insertion order of elements.
 *
 * ============================================================================
 */

import java.util.LinkedHashMap;

public class CreateLinkedHashMap {

    public static void main(String[] args) {

        // Creating a LinkedHashMap
        LinkedHashMap map = new LinkedHashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap Contents:");
        System.out.println(map);
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
Insert the first entry.

101 -> Rahul

map = {101=Rahul}

Step 3:
Insert more entries.

102 -> Anjali
103 -> David
104 -> Priya

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 4:
Display the LinkedHashMap.

Since LinkedHashMap maintains insertion order,
the entries are displayed in the same order
they were inserted.

========================
Expected Output
========================

LinkedHashMap Contents:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Note:
- LinkedHashMap stores data as key-value pairs.
- It maintains insertion order.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- One null key and multiple null values are permitted.
*/
