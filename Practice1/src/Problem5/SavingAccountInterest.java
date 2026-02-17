package Problem5;

public class SavingAccountInterest {
    public static void main(String[] args) {
        double balance = 1000.0;
        double interestRate = 0.05;

        System.out.println("Initial Balance: $" + balance);

        double interestAmount = balance * interestRate;
        balance += interestAmount;

        System.out.println("Interest Added: $" + interestAmount);
        System.out.println("New Balance: $" + balance);
    }
}
