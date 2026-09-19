/*
 * ============================================================================
 * Program: Add Key-Value Pairs to HashMap using put() Method
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 10-HashMap
 *
 * Description:
 * This program demonstrates how to insert key-value pairs into a HashMap
 * using the put() method. If a duplicate key is inserted, the existing
 * value is replaced with the new value.
 *
 * ============================================================================
 */

import java.util.HashMap;

public class PutElements {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap map = new HashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        System.out.println("HashMap after adding elements:");
        System.out.println(map);

        // Adding a duplicate key
        map.put(102, "Sneha");

        System.out.println();
        System.out.println("HashMap after updating duplicate key:");
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
Insert:
101 -> Rahul

map = {101=Rahul}

Step 3:
Insert:
102 -> Anjali

map = {101=Rahul, 102=Anjali}

Step 4:
Insert:
103 -> David

map = {101=Rahul, 102=Anjali, 103=David}

Step 5:
Insert:
104 -> Priya

map = {101=Rahul, 102=Anjali, 103=David, 104=Priya}

Step 6:
Insert duplicate key:

102 -> Sneha

The old value "Anjali" is replaced with "Sneha".

map = {101=Rahul, 102=Sneha, 103=David, 104=Priya}

Step 7:
Display the HashMap.

========================
Expected Output
========================

HashMap after adding elements:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

HashMap after updating duplicate key:
{101=Rahul, 102=Sneha, 103=David, 104=Priya}

Note:
HashMap does not allow duplicate keys.
When the same key is inserted again, the previous value is replaced.
The display order may vary because HashMap does not maintain insertion order.
*/
