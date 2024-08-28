
public class GoldAccount extends BankAcc {
    private double OverdraftLimit;

    public void setODLimit(double ODLimitIn){
        this.OverdraftLimit=ODLimitIn;
    }

    public double getODLimit(){
        return this.OverdraftLimit;
    }

    public GoldAccount(String accNameIn,String accNoIn, double OverdraftLimitIn){
        super(accNameIn, accNoIn);
        this.OverdraftLimit=OverdraftLimitIn;  
    }

    @Override
    public boolean withdraw(double amount){
        double accBal=getAccBal();
        if((accBal+OverdraftLimit)<amount){
            return false;
        }else{
            accBal-=amount;
            setAccBal(accBal);
            //without using the get method we can change the balance into protected
            return true;
        }
    }

}
