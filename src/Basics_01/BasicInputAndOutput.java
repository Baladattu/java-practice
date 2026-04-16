package Basics_01;

import java.util.Scanner; // imported to use Scanner

public class BasicInputAndOutput {
    public static void main(String[] args){
        System.out.println("Java programming is interesting.");

        // print() - It prints string inside the quotes.
        // println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
        // printf() - It provides string formatting (similar to printf in C/C++ programming).

        System.out.println("1. println ");
        System.out.println("2. println ");

        System.out.print("1. print ");
        System.out.print("2. print");

        // Printing variables and literals
        Double number = -10.6;
        System.out.println(5);
        System.out.println(number);

        // print concatenated strings
        System.out.println("I am " + "awesome.");
        System.out.println("Number = " + number);

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // take input from the user
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.print("You entered " + num);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

        // closing the scanner object
        input.close();
    }
}
