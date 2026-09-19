/*
 * ============================================================================
 * Program: Demonstrate values() Method in Java Map
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 13-Map-Views
 *
 * Description:
 * This program demonstrates how to use the values() method of the
 * Map interface. The values() method returns a Collection containing
 * all the values present in the map. The program iterates through
 * the values using a for-each loop.
 *
 * ============================================================================
 */

import java.util.Collection;
import java.util.HashMap;

public class ValuesProgram {

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

        // Getting all values
        Collection values = map.values();

        System.out.println("Values in the Map:");

        // Iterating through the values
        for (Object value : values) {
            System.out.println(value);
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
Call values().

values =
[Rahul, Anjali, David, Priya]

Step 4:
Iterate through the Collection.

Print every value one by one.

========================
Expected Output
========================

Complete Map:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Values in the Map:
Rahul
Anjali
David
Priya

Note:
- values() returns all values present in the map.
- The returned object is of type Collection.
- Duplicate values are allowed.
- values() is commonly used for processing or displaying map values.
*/
