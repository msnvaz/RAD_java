import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hostel {
    static ArrayList<Tenant> tenants = new ArrayList<Tenant>();
    static int numberOfRooms = 50;
    static int payment=20000;
    

    public static boolean addTenant(String TenantIdIn,String name, int roomNumber) {
        if (checkRoomTaken(roomNumber)) {
            System.out.println("Room is already taken");
            return false;
        }else if (checkTenantExists(TenantIdIn)){
            System.out.println("Tenant already exists");
            return false;
        }
        else{
        Tenant tenant = new Tenant(TenantIdIn, name, roomNumber);
        tenants.add(tenant);
            return true;
        }
    }

    
    public void checkRoomAvailability() {
        if (tenants.size() < numberOfRooms) {
            System.out.println("There are vacant rooms");
        } else {
            System.out.println("There are no vacant rooms");
        }
    }

    public void displayAvailableRooms() {
        System.out.println("Available rooms are: ");
        for (int i = 0; i < numberOfRooms; i++) {
            boolean found = false;
            for (Tenant tenant : tenants) {
                if (tenant.roomNumber == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i+",");
            }
        }
    }

    public static boolean checkRoomTaken(int roomNumber) {
        for (Tenant tenant : tenants) {
            if (tenant.roomNumber == roomNumber) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTenantExists(String tenantId) {
        for (Tenant tenant : tenants) {
            if (tenant.tenantId.equals(tenantId)) {
                return true;
            }
        }
        return false;
    }
    public static boolean removeTenant(String tenantId) {
        for (Tenant tenant : tenants) {
            if (tenant.tenantId.equals(tenantId)) {
                tenants.remove(tenant);
                return true;
            }
        }
        return false;
    }

    public static void listAllTenants() {
        for (Tenant tenant : tenants) {
            System.out.println("Tenant ID: " + tenant.tenantId + " Name: " + tenant.name + " Room Number: " + tenant.roomNumber);
        }
    }

    public static boolean recordMonthlyPayment(String tenantId, int month) {
        for (Tenant tenant : tenants) {
            if (tenant.tenantId.equals(tenantId)) {
                tenant.payments[month] = payment;
                tenant.paymentCount++;
                return true;
            }
        }
        return false;
    }

    public static void displayPaymentHistory(String tenantId) {
        
        for (Tenant tenant : tenants) {
            if (tenant.tenantId.equals(tenantId)) {
                for (int i = 0; i < tenant.paymentCount; i++) {
                    System.out.println("Month: " + i + " Amount: " + tenant.payments[i]);
                }
            }
        }
    }

    public static void calculateTotalPayment(String tenantId) {
        double totalPayment = 0;
        for (Tenant tenant : tenants) {
            if (tenant.tenantId.equals(tenantId)) {
                for (int i = 0; i < 12; i++) {
                    totalPayment += tenant.payments[i];
                }
            }
        }
        System.out.println(totalPayment); 
    }

    public static void checkPaymentStatus(String tenantId, int month) {
        for (Tenant tenant : tenants) {
            if (tenant.tenantId.equals(tenantId)) {
                if (tenant.payments[month] == 0) {
                   System.out.println("Payment Status: Not Paid");
                } else {
                    System.out.println("Payment Status: Paid");
                }
            }
        }
        
    }

    public static void identifyTenantsWithMissingPayments(int month) {
        for (Tenant tenant : tenants) {
            if (tenant.payments[month] == 0) {
                System.out.println("Tenant ID: " + tenant.tenantId + " Name: " + tenant.name);
            }
        }
    }
}
