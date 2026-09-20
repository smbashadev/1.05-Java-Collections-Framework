/*
 * ============================================================================
 * Program: TreeMap Navigational Methods
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 12-TreeMap
 *
 * Description:
 * This program demonstrates the commonly used navigational methods
 * available in TreeMap. These methods help retrieve keys based on
 * their sorted order.
 *
 * ============================================================================
 */

import java.util.TreeMap;

public class NavigationalMethods {

    public static void main(String[] args) {

        // Creating a TreeMap
        TreeMap map = new TreeMap();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(103, "David");
        map.put(105, "Priya");
        map.put(107, "Anjali");
        map.put(109, "Kiran");

        // Displaying the TreeMap
        System.out.println("TreeMap:");
        System.out.println(map);

        System.out.println();

        // Navigational Methods
        System.out.println("First Key   : " + map.firstKey());
        System.out.println("Last Key    : " + map.lastKey());
        System.out.println("Higher Key (103)   : " + map.higherKey(103));
        System.out.println("Lower Key (107)    : " + map.lowerKey(107));
        System.out.println("Ceiling Key (104)  : " + map.ceilingKey(104));
        System.out.println("Floor Key (104)    : " + map.floorKey(104));
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
Insert key-value pairs.

101 -> Rahul
103 -> David
105 -> Priya
107 -> Anjali
109 -> Kiran

TreeMap automatically sorts the keys.

map =
{
101=Rahul,
103=David,
105=Priya,
107=Anjali,
109=Kiran
}

Step 3:
Call firstKey().

Output:
101

Step 4:
Call lastKey().

Output:
109

Step 5:
Call higherKey(103).

Returns:
105

Step 6:
Call lowerKey(107).

Returns:
105

Step 7:
Call ceilingKey(104).

Returns:
105

Step 8:
Call floorKey(104).

Returns:
103

========================
Expected Output
========================

TreeMap:
{101=Rahul, 103=David, 105=Priya, 107=Anjali, 109=Kiran}

First Key   : 101
Last Key    : 109
Higher Key (103)   : 105
Lower Key (107)    : 105
Ceiling Key (104)  : 105
Floor Key (104)    : 103

Note:
- firstKey() returns the smallest key.
- lastKey() returns the largest key.
- higherKey() returns the next higher key.
- lowerKey() returns the next lower key.
- ceilingKey() returns the given key if present; otherwise the next higher key.
- floorKey() returns the given key if present; otherwise the next lower key.
- These methods are available because TreeMap implements the NavigableMap interface.
*/
