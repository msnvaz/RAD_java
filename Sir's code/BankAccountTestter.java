import java.util.ArrayList;

public class BankAccountTestter {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "john Doe");
        acc1.deposit(1000);
        acc1.withdraw(500);
        
        BankAccount acc2 = new BankAccount("5656565", "Sam");
        BankAccount acc3 = new BankAccount("716152663","Will");

        int[] numbers = new int[3];

        BankAccount[] accounts = new BankAccount[10];

        accounts[0] = acc1;
        accounts[1] = acc2;
        accounts[2] = acc3;

        accounts[0].deposit(1000);

        System.out.println(accounts[1].checkBalance());

        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        
        values.remove(0);
        values.size();

        values.get(0);

        ArrayList<BankAccount> accountss = new ArrayList<>();

        accountss.add(acc1);
        accountss.add(acc2);

        accountss.get(1).getAccountHolderName();

        System.out.println(accountss.size());

        accountss.remove(0);
    
    }
}
