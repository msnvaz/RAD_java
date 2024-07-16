import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks for Biology: ");
        int biology = scanner.nextInt();

        System.out.print("Enter marks for Mathematics: ");
        int mathematics = scanner.nextInt();

        System.out.print("Enter marks for Computer: ");
        int computer = scanner.nextInt();

        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (double) totalMarks / 5;

        String grade;
        if (percentage >= 90) {
            grade = "Grade A";
        } else if (percentage >= 80) {
            grade = "Grade B";
        } else if (percentage >= 70) {
            grade = "Grade C";
        } else if (percentage >= 60) {
            grade = "Grade D";
        } else if (percentage >= 40) {
            grade = "Grade E";
        } else {
            grade = "Grade F";
        }

        System.out.println("Total: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println(grade);

        scanner.close();
    }
}
