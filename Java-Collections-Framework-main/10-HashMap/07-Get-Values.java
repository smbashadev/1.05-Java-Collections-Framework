/*
 * ============================================================================
 * Program: Retrieve Values from HashMap using get() Method
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 10-HashMap
 *
 * Description:
 * This program demonstrates how to retrieve values from a HashMap
 * using the get() method. If the specified key is present, its
 * corresponding value is returned. If the key is not present,
 * the get() method returns null.
 *
 * ============================================================================
 */

import java.util.HashMap;

public class GetValues {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap map = new HashMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anjali");
        map.put(103, "David");
        map.put(104, "Priya");

        // Retrieving values using keys
        System.out.println("Student with ID 101 : " + map.get(101));
        System.out.println("Student with ID 103 : " + map.get(103));

        // Retrieving a value using a non-existing key
        System.out.println("Student with ID 105 : " + map.get(105));
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
Retrieve value for key 101.

Output:
Rahul

Step 4:
Retrieve value for key 103.

Output:
David

Step 5:
Retrieve value for key 105.

Since the key does not exist,
get() returns null.

========================
Expected Output
========================

Student with ID 101 : Rahul
Student with ID 103 : David
Student with ID 105 : null

Note:
- get(key) returns the corresponding value if the key exists.
- If the key is not found, get() returns null.
- HashMap performs value retrieval efficiently using hashing.
*/
