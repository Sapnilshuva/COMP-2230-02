// Define a Student class
class Student {
    // Fields (instance variables)
    String name;
    int age;
    String studentId;

    // Constructor - called when creating objects
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }

    // Method to check if student is adult
    public boolean isAdult() {
        return age >= 18;
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Alice Johnson", 20, "12345");
        Student student2 = new Student("Bob Smith", 17, "67890");

        // Call methods on objects
        System.out.println("Student 1:");
        student1.displayInfo();
        System.out.println("Is adult: " + student1.isAdult());

        System.out.println("\nStudent 2:");
        student2.displayInfo();
        System.out.println("Is adult: " + student2.isAdult());

        // Access fields directly
        System.out.println("\nDirect field access:");
        System.out.println(student1.name + "'s age: " + student1.age);
        System.out.println(student2.name + "'s student ID: " + student2.studentId);
    }
}