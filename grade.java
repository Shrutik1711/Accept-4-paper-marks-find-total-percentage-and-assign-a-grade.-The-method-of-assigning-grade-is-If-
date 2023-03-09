import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for paper 1: ");
        int paper1 = scanner.nextInt();

        System.out.println("Enter marks for paper 2: ");
        int paper2 = scanner.nextInt();

        System.out.println("Enter marks for paper 3: ");
        int paper3 = scanner.nextInt();

        System.out.println("Enter marks for paper 4: ");
        int paper4 = scanner.nextInt();

        int totalMarks = paper1 + paper2 + paper3 + paper4;
        double percentage = (double) totalMarks / 4;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
