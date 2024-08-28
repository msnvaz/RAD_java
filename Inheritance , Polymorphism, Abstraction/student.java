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

    //can call parent methods by super keyword and also parent name
    public void printAddress(){
        System.out.println("super.(getAddress)");
    }

    //override a method in the parent class from children class
    @Override
    public void introduce(){
        System.out.println("Hello my name is "+getName()+" Im a student");
    }
}
