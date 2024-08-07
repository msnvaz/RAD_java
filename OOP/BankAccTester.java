import java.util.ArrayList;

public class BankAccTester {
/*  public static void main(String[] args) {
        BankAcc acc1 = new BankAcc("Sandeep","22021061",0);
        acc1.deposit(1000);

//BankAcc acc1.setaccDetails("Sandeep","22021061",0);

        BankAcc acc2 = new BankAcc("Nawod");
        System.out.println("Rs."+acc2.checkBal() +" deposited to account "+ acc2.getAccNumber());

        BankAcc[] accounts =new BankAcc[10];
        accounts[0]=acc1;
        accounts[1]=acc2;

        accounts[0].deposit(1000);
        System.out.println("Rs."+accounts[0].checkBal() +" account "+ accounts[0].getAccNumber());
    }*/


    public static void main(String[] args) {
        ArrayList<BankAcc> accounts =new ArrayList<>();
        
        accounts.add(0,new BankAcc("Vaz","059020189406",0));
        accounts.add(1,new BankAcc("Lochi","059020189409",25));

//dont use index method as we need to keep track of indexes as well
//instead use trverse methods like a search

        for(int i=0;i<accounts.size();i++){
            System.out.println("Account Name : "+ accounts.get(i).getAccHolderName());
            System.out.println("Account Number : "+ accounts.get(i).getAccNumber());
            System.out.println("Account Balance : "+ accounts.get(i).getAccBal());
            System.out.println();
        }

        accounts.remove(0);
    }
}
