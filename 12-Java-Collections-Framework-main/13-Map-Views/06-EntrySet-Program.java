/*
 * ============================================================================
 * Program: Demonstrate entrySet() Method in Java Map
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 13-Map-Views
 *
 * Description:
 * This program demonstrates how to use the entrySet() method of the
 * Map interface. The entrySet() method returns a Set containing all
 * key-value pairs in the map. Each element is represented as a
 * Map.Entry object. The program iterates through all entries and
 * displays both keys and values.
 *
 * ============================================================================
 */

import java.util.HashMap;
import java.util.Map;

public class EntrySetProgram {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap map = new HashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Displaying the complete map
        System.out.println("Complete Map:");
        System.out.println(map);

        System.out.println();

        // Iterating using entrySet()
        System.out.println("Key-Value Pairs:");

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

map =
{
101=Rahul,
102=Anjali,
103=David,
104=Priya
}

Step 3:
Call entrySet().

The method returns a Set of Map.Entry objects.

Step 4:
Iterate through each Map.Entry object.

Retrieve:

entry.getKey()

entry.getValue()

Step 5:
Display each key-value pair.

========================
Expected Output
========================

Complete Map:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Key-Value Pairs:
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
- entrySet() returns all key-value pairs in the map.
- Each element is represented by a Map.Entry object.
- getKey() returns the key.
- getValue() returns the corresponding value.
- entrySet() is the most efficient way to iterate through both keys and values simultaneously.
*/
