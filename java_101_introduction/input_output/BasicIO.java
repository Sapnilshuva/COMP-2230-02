import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Output examples
        System.out.println("=== Output Examples ===");
        System.out.println("This is println - adds newline");
        System.out.print("This is print - ");
        System.out.println("no newline added");

        // Formatted output
        String name = "Alice";
        int age = 25;
        double gpa = 3.8;
        System.out.printf("Student: %s, Age: %d, GPA: %.1f%n", name, age, gpa);

        // Input examples
        System.out.println("\n=== Input Examples ===");

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double userGpa = scanner.nextDouble();

        // Clear the newline character left by nextDouble()
        scanner.nextLine();

        System.out.print("Enter your major: ");
        String major = scanner.nextLine();

        // Display collected information
        System.out.println("\n=== User Information ===");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("GPA: " + userGpa);
        System.out.println("Major: " + major);

        // Close scanner
        scanner.close();
    }
}