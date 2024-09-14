package Institute;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    ArrayList<Payment> Payments = new ArrayList<>();

    
    public Student(String name ,String id)
    {
        this.name=name;
        this.id=id;
    }

    public String getStudentName(){
        return this.name;
    }
    public String getStudentid(){
        return this.id;
    }   
    public void addPayment(Payment p){
        Payments.add(p);
    }

    // public void setStundetName(String name){
    //     this.name=name;
    // }  
    // public void addPayment(Payment p){
    //     Payments.add(p);
    // }
}
