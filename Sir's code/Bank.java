import java.util.ArrayList;

public class Bank {
    
    private ArrayList<BankAccount> list = new ArrayList<>();

    private int search(String accountNumberIn){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAccountNumber().equals(accountNumberIn)){
                return i;
            }  
        }
        return -999;
    }

    public boolean addBankAccount(String bankAccountNumberIn, String bankAccountHolderNameIn){
        if(search(bankAccountNumberIn) == -999){
            BankAccount account = new BankAccount(bankAccountNumberIn, bankAccountHolderNameIn);
            list.add(account);
            return true;
        }
        return false;
    }
}
