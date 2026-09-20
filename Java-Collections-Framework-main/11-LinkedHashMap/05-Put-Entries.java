/*
 * ============================================================================
 * Program: Add Entries to LinkedHashMap using put() Method
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 11-LinkedHashMap
 *
 * Description:
 * This program demonstrates how to add key-value pairs into a
 * LinkedHashMap using the put() method. It also shows that
 * LinkedHashMap maintains the insertion order of entries.
 *
 * ============================================================================
 */

import java.util.LinkedHashMap;

public class PutEntries {

    public static void main(String[] args) {

        // Creating a LinkedHashMap
        LinkedHashMap map = new LinkedHashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap after inserting entries:");
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
Create an empty LinkedHashMap.

map = { }

Step 2:
Insert entries.

101 -> Rahul
102 -> Anjali
103 -> David
104 -> Priya

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 3:
Insert an existing key.

map.put(103, "Kiran");

Since key 103 already exists,
its old value is replaced.

map = {101=Rahul, 102=Anjali, 103=Kiran, 104=Priya}

Step 4:
Display the LinkedHashMap.

The insertion order remains unchanged.

========================
Expected Output
========================

LinkedHashMap after inserting entries:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

After updating key 103:
{101=Rahul, 102=Anjali, 103=Kiran, 104=Priya}

Note:
- put() inserts a new key-value pair.
- If the key already exists, its value is replaced.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- LinkedHashMap always maintains insertion order.
*/
