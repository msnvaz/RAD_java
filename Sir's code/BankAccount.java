class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    BankAccount(String accountNumberIn, String accountHolderNameIn){
        this.accountHolderName = accountHolderNameIn;
        this.accountNumber = accountNumberIn;
        this.balance = 0;
    }


    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance < amount){
            return false; // balance is insufficient
        }
        this.balance -= amount;
        return true;
    }

    public double checkBalance(){
        return this.balance;
    }

    public void setAccountHolderName(String accountHolderNameIn){
        if(accountHolderNameIn.length() > 5){
            this.accountHolderName = accountHolderNameIn;
        }
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
}