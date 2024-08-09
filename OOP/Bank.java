import java.util.ArrayList;
public class Bank {
    private ArrayList<BankAcc> BankAccsList = new ArrayList<>();

    private int search(String accountNumberIn){
        for (int i = 0; i < BankAccsList.size(); i++) {
            if(BankAccsList.get(i).getAccNumber().equals(accountNumberIn)){
                return i;
            }
            
        }
        return -999;
    }

    public boolean addBankAccount(String bankAccountNumberIn,String AccountHolderNameIn){
        if (search(bankAccountNumberIn)==-999){
            BankAcc account =new BankAcc( bankAccountNumberIn, AccountHolderNameIn);
            BankAccsList.add(account);
            return true;
        }
        return false;
        
    }

}
