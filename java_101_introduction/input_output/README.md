# COMP 2230-02: Data Structures, Algorithm Analysis, and Program Design

# Input/Output

Programs need to interact with users and display results. Java provides several ways to handle I/O.

## Output

### System.out.println()
Prints text to the console followed by a newline.

```java
System.out.println("Hello, World!");
System.out.println(42);
```

### System.out.print()
Prints text without a newline.

```java
System.out.print("Hello");
System.out.print(" World!");
// Output: Hello World!
```

### System.out.printf()
Formatted output (similar to C's printf).

```java
System.out.printf("Name: %s, Age: %d%n", name, age);
```

## Input

### Scanner Class
Use `Scanner` for reading user input from console.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();      // Read entire line
int age = scanner.nextInt();          // Read integer
double price = scanner.nextDouble();  // Read double
```

## Example Program

See `BasicIO.java` for examples of input and output operations.

---

**Author:** Shivani Tyagi (Professor, Computing Science)