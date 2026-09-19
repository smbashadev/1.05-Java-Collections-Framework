/*
 * ============================================================================
 * Program: Wrapper Classes Examples in Java
 * Author : Shaik Mahaboob Basha
 * Repository : 12-Java-Collections-Framework
 * Folder : 14-Wrapper-Classes
 *
 * Description:
 * This program demonstrates commonly used Wrapper Class operations
 * including:
 * 1. Creating Wrapper objects
 * 2. Converting primitive values to Wrapper objects
 * 3. Converting String values to Wrapper objects
 * 4. Parsing Strings into primitive data types
 * 5. Converting Wrapper objects to primitive values
 * 6. Comparing Wrapper objects
 * 7. Using equals() method
 *
 * ============================================================================
 */

public class Examples {

    public static void main(String[] args) {

        // Creating Wrapper objects
        Integer integerObject = Integer.valueOf(100);
        Double doubleObject = Double.valueOf(25.75);
        Character characterObject = Character.valueOf('A');
        Boolean booleanObject = Boolean.valueOf(true);

        System.out.println("Wrapper Objects:");
        System.out.println(integerObject);
        System.out.println(doubleObject);
        System.out.println(characterObject);
        System.out.println(booleanObject);

        System.out.println();

        // Parsing String values
        int number = Integer.parseInt("200");
        double amount = Double.parseDouble("1500.50");

        System.out.println("Parsed Primitive Values:");
        System.out.println(number);
        System.out.println(amount);

        System.out.println();

        // Converting Wrapper object to primitive
        int primitiveValue = integerObject.intValue();

        System.out.println("Primitive Value:");
        System.out.println(primitiveValue);

        System.out.println();

        // Comparing Wrapper objects
        Integer first = Integer.valueOf(50);
        Integer second = Integer.valueOf(75);

        System.out.println("Comparison Result:");
        System.out.println(first.compareTo(second));

        System.out.println();

        // Checking equality
        Integer value1 = Integer.valueOf(500);
        Integer value2 = Integer.valueOf(500);

        System.out.println("Equals Result:");
        System.out.println(value1.equals(value2));

        System.out.println();

        // Converting to String
        String text = Integer.toString(999);

        System.out.println("String Value:");
        System.out.println(text);
    }
}

/*
========================
Dry Run
========================

Step 1:
Create Wrapper objects.

Integer -> 100
Double -> 25.75
Character -> A
Boolean -> true

Step 2:
Parse String values.

"200" -> 200
"1500.50" -> 1500.50

Step 3:
Convert Integer object to primitive.

100 -> int

Step 4:
Compare two Wrapper objects.

50 compared with 75

Result:
-1

Step 5:
Check equality.

500 equals 500

Result:
true

Step 6:
Convert integer to String.

999 -> "999"

========================
Expected Output
========================

Wrapper Objects:
100
25.75
A
true

Parsed Primitive Values:
200
1500.5

Primitive Value:
100

Comparison Result:
-1

Equals Result:
true

String Value:
999

Note:
- valueOf() creates Wrapper objects.
- parseXXX() converts String into primitive values.
- xxxValue() converts Wrapper objects into primitive values.
- compareTo() compares Wrapper objects.
- equals() checks whether two Wrapper objects contain the same value.
- toString() converts primitive values into String.
*/
