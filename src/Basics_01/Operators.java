package Basics_01;

public class Operators {
    public static void main(String[] args) {
        // 1. ARITHMETIC OPERATORS

        // declare variables
        int a = 12, b = 5;

        System.out.println("a + b = " + (a + b)); // addition operator
        System.out.println("a - b = " + (a - b)); // subtraction operator
        System.out.println("a * b = " + (a * b)); // multiplication operator
        System.out.println("a / b = " + (a / b)); // division operator
        System.out.println("a % b = " + (a % b)); // modulo operator

        // 2. ASSIGNMENT OPERATORS

        int age = 15;
        int var;

        // assign value using =
        var = age;
        System.out.println("var using =: " + var);

        // assign value using +=
        var += age;
        System.out.println("var using +=: " + var);

        // assign value using *=
        var *= age;
        System.out.println("var using *=: " + var);

        // 3. RELATIONAL OPERATORS
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // true

        // < operator
        System.out.println(a < b);  // false

        // >= operator
        System.out.println(a >= b);  // true

        // <= operator
        System.out.println(a <= b);  // false

        // 4. LOGICAL OPERATORS

        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

        // 5. UNARY OPERATOR
        int result1, result2;

        // original value
        System.out.println("Value of a: " + a);

        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b);

        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);
    }
}
