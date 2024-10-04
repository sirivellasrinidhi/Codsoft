import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subs = sc.nextInt();
        int[] marks = new int[subs];
        int totalMarks = 0;
        for (int i = 0; i < subs; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i]; 
        }
        double averagePercentage = (double) totalMarks / subs;
        String grade;
        if (averagePercentage >= 90) {
            grade = "O";
        } 
        else if (averagePercentage >= 75) {
            grade = "A";
        }
        else if (averagePercentage >= 60) {
            grade = "B";
        } 
        else if (averagePercentage >= 36) {
            grade = "C";
        } 
        else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}

