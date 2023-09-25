public class AccountTest{
    public static void main(String[]args){
        CheckingAccount ca = new CheckingAccount();
        ca.balance = 1000;
        ca.accountName = "Boaty McBoatface";
        ca.accountInterest = 0.05;
        ca.displayCustomer();
        ca.withdraw(1500);
        SavingsBond sb = new SavingsBond(48, 600.0);
    }
}