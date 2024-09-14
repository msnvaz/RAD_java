public class HostelApplication {
    public static void main(String[] args) {
        int choice;

        
        Hostel hostel = new Hostel();

        do { 

            System.out.println();
            System.out.println("Welcome to the Hostel Management System");
            System.out.println();
            System.out.println("1. Add a Tenant");
            System.out.println("2. Remove a Tenant");
            System.out.println("3. List All Tenants");
            System.out.println("4. Check Room Availability");
            System.out.println("5. Record Monthly Payments");
            System.out.println("6. Display Payment History of a Tenant");
            System.out.println("7. Calculate Total Payment for a Room");
            System.out.println("8. Check Payment Status of a Tenant");
            System.out.println("9. Identify Tenants with Missing Payments");
            System.out.println("10. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            choice = EasyScanner.nextInt();

            switch(choice)
                {
                case 1:
                    
                    hostel.displayAvailableRooms();
                    
                    System.out.println();
                    System.out.println("Enter Tenant ID: ");
                    String tenantId = EasyScanner.nextString();
                    System.out.println("Enter Tenant Name: ");
                    String name = EasyScanner.nextString();
                    System.out.println("Enter Room Number: ");
                    int roomNumber = EasyScanner.nextInt();

                    if(addTenant(tenantId, name, roomNumber))
                    {
                        System.out.println("Tenant Added Successfully");
                    }
                    else
                    {
                        System.out.println("Failed to Add Tenant");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter Tenant ID: ");
                    tenantId = EasyScanner.nextString();
                    if(hostel.removeTenant(tenantId))
                    {
                        System.out.println("Tenant Removed Successfully");
                    }
                    else
                    {
                        System.out.println("Failed to Remove Tenant");
                    }
                    System.out.println();
                    break;

                case 3:
                    Hostel.listAllTenants();
                    break;

                case 4:
                    hostel.checkRoomAvailability();
                    break;

                case 5:
                    System.out.println("Enter Tenant ID: ");
                    tenantId = EasyScanner.nextString();
                    System.out.println("Enter Month: ");
                    int month = EasyScanner.nextInt();
                    System.out.println("Enter Amount: ");
                    double amount = EasyScanner.nextDouble();
                    hostel.recordMonthlyPayment(tenantId, month);
                    break;

                case 6:
                    System.out.println("Enter Tenant ID: ");
                    tenantId = EasyScanner.nextString();
                    hostel.displayPaymentHistory(tenantId);
                    break;

                case 7:
                    System.out.println("Enter Tenant ID: ");
                    tenantId = EasyScanner.nextString();
                    hostel.calculateTotalPayment(tenantId);
                    break;

                case 8:
                    System.out.println("Enter Tenant ID: ");
                    tenantId = EasyScanner.nextString();
                    System.out.println("Enter Month: ");
                    month = EasyScanner.nextInt();
                    hostel.checkPaymentStatus(tenantId, month);
                    break;

                case 9:
                    System.out.println("Enter Month: ");
                    month = EasyScanner.nextInt();
                    hostel.identifyTenantsWithMissingPayments(month);
                    break;
                    
                case 10:
                    System.out.println("Exiting Hostel Management System");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;

                }
        } while (choice!=10);

    }

    public static boolean addTenant(String tenantId, String name, int roomNumber) {
       if( Hostel.addTenant(tenantId, name, roomNumber)){
           return true;
       }else{
              return false;
         }
    }

    public static void recordMonthlyPayment(String tenantId, int month, double amount) {
        if(Hostel.recordMonthlyPayment(tenantId, month)){
            System.out.println("Payment Recorded Successfully");
    }else{
        System.out.println("Failed to Record Payment");
    }
    }

    public static void displayPaymentHistory(String tenantId) {
        Hostel.displayPaymentHistory(tenantId);
    }

    public static void calculateTotalPayment(String tenantId) {
        double totalPayment = Hostel.calculateTotalPayment(tenantId);
        System.out.println("Total Payment: " + totalPayment);
    }

    public static void checkPaymentStatus(String tenantId, int month) {
        if(Hostel.checkPaymentStatus(tenantId, month)){
            System.out.println("Payment Status: Paid");
        }else{
            System.out.println("Payment Status: Not Paid");
        }
    }

    public static void identifyTenantsWithMissingPayments(int month) {
        Hostel.identifyTenantsWithMissingPayments(month);
    }
}

