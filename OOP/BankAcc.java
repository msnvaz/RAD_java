public class BankAcc{
    //attributes
    private String accName;
    private String accNo;
    private double accBalance;

    //constructor
    public BankAcc(String accNameIn,String accNoIn, double accBalanceIn){
        this.accName= accNameIn;
        this.accNo = accNoIn;
        this.accBalance=accBalanceIn;
    }

    public BankAcc(String accNameIn,String accNoIn){
        this.accName= accNameIn;
        this.accNo = accNoIn;
        this.accBalance=0;
    }

    //setters
    public void setaccDetails(String AccHolderNameIn){
        if(AccHolderNameIn.length()>5){
            this.accName=AccHolderNameIn;}
            else{
                System.out.println("Enter different name");
            }
        
    }

    //getter
public String getAccHolderName(){
    return this.accName;
}

public String getAccNumber(){
    return this.accNo;
}

public double getAccBal(){
    return this.accBalance;
}

public void setAccBal(double NewAccBal){
    this.accBalance=NewAccBal;
}

    //same constructor with diiferebt signature(method overloading)
    public BankAcc(String accNameIn){
        this.accName= accNameIn;
        this.accNo = "888888";
        this.accBalance=0;
    }

    //methods
    public void deposit(double amount){
        if(amount>0){
            accBalance+=amount;

        }else{
            System.out.println("Transaction unsuccessful : Invalid Amount ");
            
        }
    }
    
    public boolean withdraw(double amount){
    if(accBalance<amount){
        return false;
    }else{
        this.accBalance-=amount;
        return true;
    }
}

    public double checkBal(){
        return this.accBalance;
    };


}