public  class GoldAccountTester {
    public static void main(String[] args){
        GoldAccount Gold2 =new GoldAccount("VazGold", "1234567890",10000);
        System.out.println("Balance = "+ Gold2.getAccBal());
        Gold2.deposit(2000);
        System.out.println("Balance = "+ Gold2.getAccBal());
        
        System.out.println(Gold2.withdraw(10000));
        System.out.println("Balance = "+ Gold2.getAccBal());

    }
}
