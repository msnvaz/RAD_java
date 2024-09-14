package Institute;

public class Payment {
    private String id;
    private double amount;
    private int month; 
    private String courseID;  

    public Payment(String id, double amount, int month, String courseID) {
        this.id = id;
        this.amount = amount;
        this.month = month;
        this.courseID = courseID;
    }
    // public String getId() {
    //     return id;
    // }
    // public double getAmount() {
    //     return amount;
    // }
    // public int getMonth() {
    //     return month;
    // }

}
