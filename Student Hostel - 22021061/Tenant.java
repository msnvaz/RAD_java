public class Tenant {
    String tenantId;
    String name;
    int roomNumber;
    double[] payments = new double[12];
    int paymentCount = 0;
    
    
    //constructor
    public Tenant(String tenantId, String name, int roomNumber) {
        this.tenantId = tenantId;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    //public int getPaymentCount() {
      //  return paymentCount;
    //}
    

    
}
