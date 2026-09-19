/*
 * ============================================================================
 * Program: Remove Entries from TreeMap using remove() Method
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 12-TreeMap
 *
 * Description:
 * This program demonstrates how to remove key-value pairs from a
 * TreeMap using the remove() method. If the specified key exists,
 * the corresponding entry is removed. If the key does not exist,
 * remove() returns null. The remaining entries continue to be
 * displayed in ascending order of keys.
 *
 * ============================================================================
 */

import java.util.TreeMap;

public class RemoveEntries {

    public static void main(String[] args) {

        // Creating a TreeMap
        TreeMap map = new TreeMap();

        // Adding key-value pairs
        map.put(103, "David");
        map.put(101, "Rahul");
        map.put(104, "Priya");
        map.put(102, "Anjali");

        // Displaying the original TreeMap
        System.out.println("Original TreeMap:");
        System.out.println(map);

        // Removing an existing key
        Object removedValue = map.remove(102);

        System.out.println();
        System.out.println("Removed Value : " + removedValue);
        System.out.println("TreeMap after removing key 102:");
        System.out.println(map);

        // Removing a non-existing key
        Object result = map.remove(105);

        System.out.println();
        System.out.println("Removing key 105 : " + result);
        System.out.println("Final TreeMap:");
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
Insert key-value pairs.

103 -> David
101 -> Rahul
104 -> Priya
102 -> Anjali

TreeMap automatically sorts the keys.

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

TreeMap remains unchanged.

========================
Expected Output
========================

Original TreeMap:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Removed Value : Anjali
TreeMap after removing key 102:
{101=Rahul, 103=David, 104=Priya}

Removing key 105 : null
Final TreeMap:
{101=Rahul, 103=David, 104=Priya}

Note:
- remove(key) removes the specified key-value pair.
- It returns the removed value if the key exists.
- It returns null if the specified key is not found.
- TreeMap automatically maintains ascending order of keys after removal.
*/
