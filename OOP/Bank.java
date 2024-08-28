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

    /*public boolean removeBankAccount(String accountNumberIn){
        for (int i = 0; i < BankAccsList.size(); i++) {
            if(BankAccsList.get(i).getAccNumber().equals(accountNumberIn)){
                BankAccsList.remove(i);
                return true;
            }else{
                System.out.println("Account not found");
            }
            
        }

        return false;
    }*/

    public boolean removeBankAccount(String accountNumberIn){
        if(search(accountNumberIn)!=-999){
            int index =search(accountNumberIn);
            BankAccsList.remove(index);
            return true; //successfully removed bank account 
        }
        return false;
    }

//to deposit money we need to get the bank acc beacuse the search is private
//so we need a getter for account number

    private BankAcc getBankAccount(String accountNumberIn){
        int index = search(accountNumberIn);
        if(index!=-999){
            return BankAccsList.get(index);
        }
        return null;
    }

    public boolean depositMoney(String accountNumberIn,double amount){
        BankAcc account = getBankAccount(accountNumberIn);
        if(account!=null){
            account.deposit(amount); // transfer successful
        return true;
        }
        return false; //transfer unsuccessful
    }

    public boolean withdrawMoney(String accountNumberIn,double amount){
        BankAcc account = getBankAccount(accountNumberIn);
        if(account!=null){
            if(account.withdraw(amount)){
                return true;//transfer  successful
            }// transfer unsuccessful
        return true;
        }
        return false; //transfer unsuccessful
    }

    //add goldAccount
    public boolean addGoldAccount(String bankAccountNumberIn,String AccountHolderNameIn,double ODLimitIn){
        if (search(bankAccountNumberIn)==-999){
            GoldAccount account =new GoldAccount( bankAccountNumberIn, AccountHolderNameIn,ODLimitIn);
            BankAccsList.add(account);
            return true;
        }
        return false;
        
    }

}
