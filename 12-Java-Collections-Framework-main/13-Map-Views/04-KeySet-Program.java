/*
 * ============================================================================
 * Program: Demonstrate keySet() Method in Java Map
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 13-Map-Views
 *
 * Description:
 * This program demonstrates how to use the keySet() method of the
 * Map interface. The keySet() method returns a Set containing all
 * the keys present in the map. The program iterates through the keys
 * using a for-each loop.
 *
 * ============================================================================
 */

import java.util.HashMap;
import java.util.Set;

public class KeySetProgram {

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

        // Getting all keys
        Set keys = map.keySet();

        System.out.println("Keys in the Map:");

        // Iterating through the keys
        for (Object key : keys) {
            System.out.println(key);
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
Call keySet().

keys =
[101, 102, 103, 104]

Step 4:
Iterate through the Set.

Print every key one by one.

========================
Expected Output
========================

Complete Map:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Keys in the Map:
101
102
103
104

Note:
- keySet() returns all keys present in the map.
- The returned object is of type Set.
- Duplicate keys are not possible.
- keySet() is commonly used for iterating through map keys.
*/
