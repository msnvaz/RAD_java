package Institute;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Institute institute = new Institute();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1:Add Studnet Details");
            System.out.println("2:Add Course Details");
            System.out.println("3:Display Student Details");
            System.out.println("4:Exit");
            System.out.println("5:Add payment details");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter student name");
                    String name = sc.nextLine();
                    System.out.println("Enter student id");
                    String id = sc.nextLine();
                    institute.addStudent(name, id);
                    break;
                case 2:
                    System.out.println("Enter course name");
                    String courseName = sc.nextLine();
                    System.out.println("Enter course id");
                    String courseId = sc.nextLine();
                    Course c = new Course(courseName, courseId);
                    institute.addCourse(c);
                    break;
                case 3:
                    institute.displayStudent();
                    break;
                case 4:
                    flag = false;
                    break;
                case 5:
                    System.out.println("Enter student id");
                    String studentId = sc.nextLine();
                    System.out.println("Enter payment Id");
                    String paymentId = sc.nextLine();
                    System.out.println("Enter course id");
                    String courseId1 = sc.nextLine();
                    System.out.println("Enter the amout ");
                    double amount = sc.nextDouble();
                    System.out.println("Enter month");
                    int month = sc.nextInt();
                    Payment p = new Payment(paymentId,amount,month,courseId1);
                    institute.searchStudent(studentId).addPayment(p);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }
}
