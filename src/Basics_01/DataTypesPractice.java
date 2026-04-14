package Basics_01;

public class DataTypesPractice {
    public static void main(String[] args) {
        // 1. BOOLEAN TYPE (Only true or false)
        boolean isJavaFun = true;

        // 2. BYTE TYPE (-128 to 127) - Uses vary little memory
        byte range = 124;

        // 3. SHORT TYPE (-32768 to 32767)
        short temperature = -200;

        // 4. INT TYPE (Most common for whole numbers)
        int population = 1000000;

        // 5. LONG TYPE (Very Large number - add 'L' at the end)
        long distanceToSun = 150000000000L;

        // 6. FLOAT TYPE (Decimals -add 'f' at the end)
        float pi = 3.14f;

        // 7. DOUBLE TYPE (Most common for decimals)
        double preciseNumber = -42.33;

        // 8. CHAR TYPE (Single characters - use single quotes)
        char grade = 'A';

        // Printing everything out to see them in action
        System.out.println("Boolean value: " + isJavaFun);
        System.out.println("Byte value: " + range);
        System.out.println("Short value: " + temperature);
        System.out.println("Int value: " + population);
        System.out.println("Long value: " + distanceToSun);
        System.out.println("Float value: " + pi);
        System.out.println("Long value: " + preciseNumber);
        System.out.println("Char value: " + grade);
    }
}
