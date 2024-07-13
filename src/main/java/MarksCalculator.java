import java.util.Scanner;

public class MarksCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF SUBJECTS:");
        int numberOfSubjects = sc.nextInt();
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        for (int i = 0; i < numberOfSubjects; i++)
        {
            System.out.print("ENTER THE MARKS OF SUBJECTS" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("TOTAL MARKS OBTAINED : " + totalMarks);
        System.out.println("AVERAGE PERCENTAGE : " + averagePercentage + "%");
        System.out.println("GRADE : " + grade);
        sc.close();
    }
}
