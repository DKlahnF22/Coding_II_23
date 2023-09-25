public class CheckingAccount{
    public double accountInterest;
    public double balance;
    public String accountName;
    public void displayCustomer(){
        System.out.println("Customer: " + accountName);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + accountInterest);
    }
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("WARNING: BALANCE TOO LOW.");
        } else if(amount < 0){
            System.out.println("WARNING: PLEASE INPUT NON-NEGATIVE AMOUNT.");
        } else {
            balance -= amount;
            System.out.println("NEW BALANCE:" + balance);
        }

    }
}