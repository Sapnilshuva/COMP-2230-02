public class Arrays {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        // Access elements using index
        System.out.println("First element: " + numbers[0]);   // 10
        System.out.println("Third element: " + numbers[2]);   // 30
        System.out.println("Last element: " + numbers[4]);    // 50

        // Get array length
        System.out.println("Array length: " + numbers.length);

        // Modify elements
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Iterate through array using for loop
        System.out.println("\nAll elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Iterate using enhanced for loop (for-each)
        System.out.println("\nAll elements using for-each loop:");
        for (int num : numbers) {
            System.out.println("Value: " + num);
        }

        // Declare array with specific size
        double[] grades = new double[5];
        grades[0] = 85.5;
        grades[1] = 92.0;
        grades[2] = 78.5;
        grades[3] = 88.0;
        grades[4] = 95.5;

        System.out.println("\nGrades array:");
        for (double grade : grades) {
            System.out.println("Grade: " + grade);
        }

        // Calculate sum and average
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.println("Average grade: " + average);

        // String array
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        System.out.println("\nNames:");
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }
}