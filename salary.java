import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();
        int tax;

        if(salary>0 && salary<=50000){
            System.out.println("No tax");
        }else if (salary>50000 && salary<=100000) {
            tax=salary*5/100;
            System.out.println("Salary after tax = " + (salary-tax));
        }else if (salary>100000 && salary<=150000) {
            tax=salary*10/100;
            System.out.println("Salary after tax = " + (salary-tax));
        }else if (salary>150000 && salary<=200000) {
            tax=salary*15/100;
            System.out.println("Salary after tax = " + (salary-tax));
        }else if (salary>200000) {
            tax=salary*20/100;
            System.out.println("Salary after tax = " + (salary-tax));
        }else{
            System.out.println("Incorrect Value");
        }

        
        /*  Consume the newline character
        scanner.nextLine();

        System.out.println("Number is " + value);

        System.out.println("Enter a string:");
        
        // Read the string input
        String inputString = scanner.nextLine();
        
        // Process the input string
        System.out.println("You entered: " + inputString);
        */


        // Close the scanner
        scanner.close();
    }
}
