public class person{
    private  String name;
    private String address;
    private String phoneNumber;

    public void introduce(){
        System.out.println("Hello my name is "+name);
    }

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