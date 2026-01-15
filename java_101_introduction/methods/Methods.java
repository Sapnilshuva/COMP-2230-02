public class Methods {
    public static void main(String[] args) {
        // Calling void methods
        greet();
        greetPerson("Alice");

        // Calling methods that return values
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        double average = calculateAverage(10, 20, 30);
        System.out.println("Average: " + average);

        // Calling method with return value used in condition
        if (isEven(4)) {
            System.out.println("4 is even");
        }

        if (!isEven(7)) {
            System.out.println("7 is odd");
        }
    }

    // Void method - no return value
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Void method with parameter
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method that returns an int
    public static int add(int a, int b) {
        return a + b;
    }

    // Method that returns a double
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Method that returns a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}