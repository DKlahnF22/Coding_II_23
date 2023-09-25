/** * A bank account has a balance that can be changed by
adding deposits or subtracting withdrawals
* @author Sally Smith
*/
public class BankAccount {
double balance;
/**
@param amount the amount to withdraw
*/
public void withdraw(double amount){
balance +=amount;
}
/**
* @return the current balance
*/
public double getBalance(){
return balance;
}
}