/*
 * ============================================================================
 * Program: Iterate Through a HashMap
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 10-HashMap
 *
 * Description:
 * This program demonstrates how to iterate through a HashMap using the
 * entrySet() method and a for-each loop. Each key-value pair is accessed
 * and displayed individually.
 *
 * ============================================================================
 */

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap map = new HashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Displaying the complete HashMap
        System.out.println("Complete HashMap:");
        System.out.println(map);

        System.out.println();

        // Iterating through the HashMap
        System.out.println("Iterating through HashMap:");

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
Call entrySet().

The HashMap returns all key-value pairs.

Step 4:
Use a for-each loop.

Each entry is processed one by one.

Step 5:
Retrieve the key and value.

entry.getKey()
entry.getValue()

Step 6:
Display every key-value pair.

========================
Expected Output
========================

Complete HashMap:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Iterating through HashMap:
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
- entrySet() returns all key-value pairs in the HashMap.
- Each entry is represented by a Map.Entry object.
- getKey() returns the key.
- getValue() returns the corresponding value.
- HashMap does not guarantee insertion order, so the display order may vary.
*/
