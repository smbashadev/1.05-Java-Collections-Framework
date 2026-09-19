/*
 * ============================================================================
 * Program: Add Entries to TreeMap using put() Method
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 12-TreeMap
 *
 * Description:
 * This program demonstrates how to add key-value pairs into a
 * TreeMap using the put() method. It also shows that TreeMap
 * automatically stores entries in ascending order of keys.
 *
 * ============================================================================
 */

import java.util.TreeMap;

public class PutEntries {

    public static void main(String[] args) {

        // Creating a TreeMap
        TreeMap map = new TreeMap();

        // Adding key-value pairs
        map.put(103, "David");
        map.put(101, "Rahul");
        map.put(104, "Priya");
        map.put(102, "Anjali");

        // Displaying the TreeMap
        System.out.println("TreeMap after inserting entries:");
        System.out.println(map);

        // Updating an existing key
        map.put(103, "Kiran");

        System.out.println();
        System.out.println("After updating key 103:");
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
Insert entries.

103 -> David
101 -> Rahul
104 -> Priya
102 -> Anjali

Although the entries are inserted in this order,

103
101
104
102

TreeMap automatically sorts the keys.

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 3:
Insert an existing key.

map.put(103, "Kiran");

Since key 103 already exists,
its old value is replaced.

map = {101=Rahul, 102=Anjali, 103=Kiran, 104=Priya}

Step 4:
Display the TreeMap.

The entries remain sorted by keys.

========================
Expected Output
========================

TreeMap after inserting entries:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

After updating key 103:
{101=Rahul, 102=Anjali, 103=Kiran, 104=Priya}

Note:
- put() inserts a new key-value pair.
- If the key already exists, its value is replaced.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- TreeMap automatically keeps keys in ascending order.
*/
