public class Loops {
    public static void main(String[] args) {
        // For loop - counting from 1 to 5
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // While loop - counting down from 5 to 1
        System.out.println("\nWhile loop:");
        int count = 5;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--;
        }

        // Do-while loop - executes at least once
        System.out.println("\nDo-while loop:");
        int number = 0;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 3);

        // Loop with break - stop when condition met
        System.out.println("\nLoop with break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Found 7, stopping!");
                break;
            }
            System.out.println("Number: " + i);
        }

        // Loop with continue - skip certain iterations
        System.out.println("\nLoop with continue (skip even numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
    }
}