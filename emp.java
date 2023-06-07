import java.util.Scanner;

public class emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5]; // Create an array to hold 5 Student objects

        int index = 0; // Current index in the array

        do {
            System.out.println("Enter student details:");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            System.out.print("Grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            Student student = new Student(name, age, grade); // Create a new Student object
            students[index] = student; // Add the student to the array

            index++; // Increment the index

        } while (index < 5);

        // Display the student details
        System.out.println("Student details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i]);
        }

        scanner.close();
    }
}

class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Your Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}