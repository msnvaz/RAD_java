import java.util.Scanner;

public class CalculateGrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double HRA, DA;

        if (basicSalary <= 10000) {
            HRA = basicSalary * 0.2;
            DA = basicSalary * 0.8;
        } else if (basicSalary <= 20000) {
            HRA = basicSalary * 0.25;
            DA = basicSalary * 0.9;
        } else {
            HRA = basicSalary * 0.3;
            DA = basicSalary * 0.95;
        }

        double grossSalary = basicSalary + HRA + DA;

        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}
