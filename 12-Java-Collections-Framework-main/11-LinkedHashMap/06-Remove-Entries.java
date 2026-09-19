/*
 * ============================================================================
 * Program: Remove Entries from LinkedHashMap using remove() Method
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 11-LinkedHashMap
 *
 * Description:
 * This program demonstrates how to remove key-value pairs from a
 * LinkedHashMap using the remove() method. If the specified key
 * exists, the corresponding entry is removed. If the key does not
 * exist, remove() returns null. LinkedHashMap maintains the
 * insertion order of the remaining entries.
 *
 * ============================================================================
 */

import java.util.LinkedHashMap;

public class RemoveEntries {

    public static void main(String[] args) {

        // Creating a LinkedHashMap
        LinkedHashMap map = new LinkedHashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Displaying the original LinkedHashMap
        System.out.println("Original LinkedHashMap:");
        System.out.println(map);

        // Removing an existing entry
        Object removedValue = map.remove(102);

        System.out.println();
        System.out.println("Removed Value : " + removedValue);
        System.out.println("LinkedHashMap after removing key 102:");
        System.out.println(map);

        // Removing a non-existing key
        Object result = map.remove(105);

        System.out.println();
        System.out.println("Removing key 105 : " + result);
        System.out.println("Final LinkedHashMap:");
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
Insert key-value pairs.

101 -> Rahul
102 -> Anjali
103 -> David
104 -> Priya

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 3:
Remove key 102.

Removed value:
Anjali

map = {101=Rahul, 103=David, 104=Priya}

Step 4:
Attempt to remove key 105.

Since key 105 does not exist,
remove() returns null.

The LinkedHashMap remains unchanged.

========================
Expected Output
========================

Original LinkedHashMap:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Removed Value : Anjali
LinkedHashMap after removing key 102:
{101=Rahul, 103=David, 104=Priya}

Removing key 105 : null
Final LinkedHashMap:
{101=Rahul, 103=David, 104=Priya}

Note:
- remove(key) removes the specified key-value pair.
- It returns the removed value if the key exists.
- It returns null if the specified key is not found.
- LinkedHashMap preserves the insertion order of the remaining entries.
*/
