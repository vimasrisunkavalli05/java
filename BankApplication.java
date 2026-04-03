import java.util.Scanner;
// User-defined Exception
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
 super(message);
 }
}
// Bank Account Class
class BankAccount {
 double balance;
 BankAccount(double balance) {
 this.balance = balance;
 }
 void withdraw(double amount)throws InsufficientFundsException {
 if (amount > balance) {
 throw new InsufficientFundsException("Insufficient balance in account.");
 } else {
 balance = balance - amount;
 System.out.println("Withdrawal successful.");
 System.out.println("Remaining Balance = " + balance);
 
 }
 }
}
// Main Class
public class BankApplication {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean txStatus=false;
 try {
 // Taking input as String (for NumberFormatException)
 System.out.println("Enter initial balance:");
 String balInput = sc.nextLine();
 double balance = Double.parseDouble(balInput);
 BankAccount account = new BankAccount(balance);
 System.out.println("Enter amount to withdraw:");
 String amtInput = sc.nextLine();
 double amount = Double.parseDouble(amtInput);
 account.withdraw(amount);
 txStatus=true;
 }
 // User-defined Exception
 catch (InsufficientFundsException e) {
 System.out.println("User Defined Exception: " + e.getMessage());
 }
 // Built-in Exception
 catch (NumberFormatException e) {
 System.out.println("Built-in Exception: Invalid numeric input.");
 }
 // General Exception
 catch (Exception e) {
 System.out.println("Some other exception occurred.");
 }
 finally {
if(txStatus)
 System.out.println("Bank transaction completed Successfully");
else
System.out.println("Bank transaction was Unsuccessfull");
 }
 sc.close();
 }
}
