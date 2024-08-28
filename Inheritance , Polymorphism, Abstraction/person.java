public abstract class person{
    //when u make a class abstract we cannot use that class to directly create objects
    //but we can inherit their properties

    //if a method is abstract 
    //then we need to override those methods in children classes

    private  String name;
    private String address;
    private String phoneNumber;

   /* public void abstract introduce(){
        System.out.println("Hello my name is "+name);
    }*/

 // we need to implement definetly in children classes
 
    public abstract void introduce();

    //getter and setter for private

    public void setAddress(String Address){
        this.address=Address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setPN(String PN){
        this.phoneNumber=PN;
    }

    public String getPN(){
        return this.phoneNumber;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    //constructor
    public person(String nameIn, String AddressIn,String PNIn){
        this.name = nameIn;
        this.address = AddressIn;
        this.phoneNumber=PNIn;
    }
}