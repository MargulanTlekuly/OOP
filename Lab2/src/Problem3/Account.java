package Problem3;

public class Account {
    private double balance; // The current balance
    private int accNumber; // The account number
    public Account(int a){
        balance = 0.0;
        accNumber = a;
    }
    public void deposit(double sum) {
        balance = balance + sum;
    }
    public void withdraw(double sum) {
        if(sum <= balance){
            balance = balance - sum;
        }else{
            System.out.println("No money");
        }
    }
    public double getBalance() {
        return balance;
    }
    public double getAccountNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other) {
        withdraw(amount);
        other.deposit(amount);
    }
    public String toString() {
        return "Account #" + accNumber + ", Balance: " + balance;
    }
    public final void print() {
        System.out.println(toString());
    }
}
