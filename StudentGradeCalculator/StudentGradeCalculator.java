package StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine(); // Clear buffer

        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int total = 0;

        // Input subjects and marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name: ");
            subjects[i] = sc.nextLine();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // Clear buffer
            total += marks[i];
        }

        double average = (double) total / numSubjects;

        // Tabular output
        System.out.println("\n+----------------+--------+");
        System.out.println("|   Subject      | Marks  |");
        System.out.println("+----------------+--------+");
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("| %-14s | %-6d |\n", subjects[i], marks[i]);
        }
        System.out.println("+----------------+--------+");
        System.out.printf("| %-14s | %-6.2f |\n", "Average", average);
        System.out.println("+----------------+--------+");
    }
}
