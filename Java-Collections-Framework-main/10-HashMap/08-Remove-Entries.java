/*
 * ============================================================================
 * Program: Remove Entries from HashMap using remove() Method
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 10-HashMap
 *
 * Description:
 * This program demonstrates how to remove key-value pairs from a HashMap
 * using the remove() method. If the specified key exists, the corresponding
 * entry is removed. If the key does not exist, the remove() method returns
 * null and the HashMap remains unchanged.
 *
 * ============================================================================
 */

import java.util.HashMap;

public class RemoveEntries {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap map = new HashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        System.out.println("Original HashMap:");
        System.out.println(map);

        // Removing an existing key
        Object removedValue = map.remove(102);

        System.out.println();
        System.out.println("Removed Value : " + removedValue);
        System.out.println("HashMap after removing key 102:");
        System.out.println(map);

        // Attempting to remove a non-existing key
        Object result = map.remove(105);

        System.out.println();
        System.out.println("Removing key 105 : " + result);
        System.out.println("Final HashMap:");
        System.out.println(map);
    }
}

/*
========================
Dry Run
========================

Step 1:
Create an empty HashMap.

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

HashMap remains unchanged.

========================
Expected Output
========================

Original HashMap:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Removed Value : Anjali
HashMap after removing key 102:
{101=Rahul, 103=David, 104=Priya}

Removing key 105 : null
Final HashMap:
{101=Rahul, 103=David, 104=Priya}

Note:
- remove(key) removes the specified key-value pair.
- It returns the removed value if the key exists.
- It returns null if the specified key is not found.
- HashMap does not maintain insertion order, so the display order may vary.
*/
