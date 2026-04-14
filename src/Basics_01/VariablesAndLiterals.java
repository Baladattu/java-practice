package Basics_01;

public class VariablesAndLiterals {
    public static void main(String[] args) {

        // 1. VARIABLE DECLARATION & INITIALIZATION
        // format: dataType variableName = literalValue;
        int speedLimit = 80;

        // 2. DIFFERENT TYPES OF LITERALS
        boolean flag = false; // Boolean literal
        int binaryNumber = 0b10010; // Binary literal (starts with 0b)
        double realNumber = 3.4;    // Floating-point literal
        char letter = 'J';          // Character literal (single quotes)
        String str = "Program"; // String literal (double quotes)

        // 3. CHANGING VARIABLE VALUES
        // Notice we don't put 'int' again because it's already declared
        speedLimit = 90;

        // 4. PRINTING OUTPUT
        System.out.println("The speed limit is: " + speedLimit);
        System.out.println("Is the flag set? " + flag);
        System.out.println("The letter is: " + letter);
        System.out.println("A real number is: " + realNumber);
        System.out.println("A string is: " + str);
        System.out.println("Binary 0b10010 in decimal is: " + binaryNumber);
    }
}
