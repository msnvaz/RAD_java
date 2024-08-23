public class student extends person{
    public String StudentId;

    /*public void changeValue(){
        phoneNumber="12345678";
        name ="Sam test";
        super.setAddress("Moratuwa");
        //since getAddress method is a public method
        //we can still call it without the super key word
    }*/

    //constructor to claim super(person) class attributes
    public student(String nameIn,String addressIn,String PNIn,String StdIdIn){
        super(nameIn, addressIn, PNIn);
        this.StudentId=StdIdIn;
    }
}
