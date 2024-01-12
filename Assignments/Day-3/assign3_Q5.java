import java.util.Scanner;

class Student {
    private String studentName;
    private int registerNumber;
    private int[] subjectMarks = new int[5];
    private double totalMarks;
    private double averageMarks;

    // Constructor to initialize student details
    public Student(String studentName, int registerNumber, int[] subjectMarks) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        this.subjectMarks = subjectMarks;

        // Calculate total and average marks
        calculateTotalAndAverage();
    }

    // Method to calculate total and average marks
    private void calculateTotalAndAverage() {
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }

        averageMarks = totalMarks / subjectMarks.length;
    }

    // Method to display student details and marks
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Subject Marks:");

        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

public class assign3_Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details and marks
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Register Number: ");
        int registerNumber = scanner.nextInt();

        int[] subjectMarks = new int[5];
        System.out.println("Enter Subject Marks:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        // Create a Student object with the provided details
        Student student = new Student(studentName, registerNumber, subjectMarks);

        // Display student details and marks
        student.displayStudentDetails();
    }
}
