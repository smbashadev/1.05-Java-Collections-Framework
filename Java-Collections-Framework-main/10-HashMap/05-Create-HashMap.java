/*
 * ============================================================================
 * Program: Create a HashMap in Java
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 10-HashMap
 *
 * Description:
 * This program demonstrates how to create a HashMap and store
 * key-value pairs using the put() method.
 *
 * ============================================================================
 */

import java.util.HashMap;

public class CreateHashMap {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap map = new HashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Displaying the HashMap
        System.out.println("HashMap Elements:");
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
Print the HashMap.

========================
Expected Output
========================

HashMap Elements:
{101=Rahul, 102=Anjali, 103=David, 104=Priya}

Note:
The display order is not guaranteed because HashMap does not maintain insertion order.
*/
