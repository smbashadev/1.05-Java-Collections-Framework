/*
 * ============================================================================
 * Program: Autoboxing and Unboxing Examples in Java
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 15-Autoboxing-and-Unboxing
 *
 * Description:
 * This program demonstrates:
 * 1. Autoboxing
 * 2. Unboxing
 * 3. Primitive to Wrapper conversion
 * 4. Wrapper to Primitive conversion
 * 5. Autoboxing with ArrayList
 * 6. Unboxing from ArrayList
 *
 * Note:
 * This program intentionally uses raw ArrayList (without Generics)
 * to maintain consistency throughout this repository.
 * ============================================================================
 */

import java.util.ArrayList;

public class Examples {

    public static void main(String[] args) {

        System.out.println("========== AUTBOXING ==========");

        int number = 100;

        // Automatic conversion from primitive to Wrapper object
        Integer integerObject = number;

        System.out.println("Primitive Value : " + number);
        System.out.println("Wrapper Object  : " + integerObject);

        System.out.println();

        System.out.println("========== UNBOXING ==========");

        Integer marks = Integer.valueOf(95);

        // Automatic conversion from Wrapper object to primitive
        int score = marks;

        System.out.println("Wrapper Object  : " + marks);
        System.out.println("Primitive Value : " + score);

        System.out.println();

        System.out.println("========== AUTBOXING WITH ARRAYLIST ==========");

        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("ArrayList : " + list);

        System.out.println();

        System.out.println("========== UNBOXING FROM ARRAYLIST ==========");

        int firstValue = (Integer) list.get(0);
        int secondValue = (Integer) list.get(1);

        System.out.println("First Value  : " + firstValue);
        System.out.println("Second Value : " + secondValue);

        System.out.println();

        System.out.println("========== ARITHMETIC OPERATION ==========");

        Integer a = 50;
        Integer b = 25;

        int sum = a + b;

        System.out.println("Sum = " + sum);

        System.out.println();

        System.out.println("========== COMPARISON ==========");

        Integer x = 200;
        Integer y = 200;

        System.out.println("Equals : " + x.equals(y));

        System.out.println();

        System.out.println("Program Completed Successfully.");
    }
}

/*
============================================================================
Dry Run
============================================================================

Step 1:
Primitive value
number = 100

↓

Autoboxing

Integer object = 100

------------------------------------------------

Step 2:
Wrapper object

marks = 95

↓

Unboxing

score = 95

------------------------------------------------

Step 3:
Create ArrayList

[]

↓

Add elements

[10, 20, 30, 40]

Each primitive is automatically converted
into an Integer object.

------------------------------------------------

Step 4:
Retrieve first element

(Integer) list.get(0)

↓

Automatic Unboxing

10

------------------------------------------------

Step 5:
Arithmetic

50 + 25

↓

75

------------------------------------------------

Step 6:
Compare Wrapper objects

200 equals 200

↓

true

============================================================================
Expected Output
============================================================================

========== AUTBOXING ==========
Primitive Value : 100
Wrapper Object  : 100

========== UNBOXING ==========
Wrapper Object  : 95
Primitive Value : 95

========== AUTBOXING WITH ARRAYLIST ==========
ArrayList : [10, 20, 30, 40]

========== UNBOXING FROM ARRAYLIST ==========
First Value  : 10
Second Value : 20

========== ARITHMETIC OPERATION ==========
Sum = 75

========== COMPARISON ==========
Equals : true

Program Completed Successfully.

============================================================================
Important Points
============================================================================

✓ Autoboxing converts primitive values into Wrapper objects automatically.

✓ Unboxing converts Wrapper objects into primitive values automatically.

✓ Collections Framework stores Wrapper objects.

✓ Java compiler performs these conversions automatically.

✓ Autoboxing and Unboxing were introduced in Java 5.

✓ Excessive boxing and unboxing may affect application performance.
*/
