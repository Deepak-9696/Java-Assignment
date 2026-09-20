class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private static double interestRate = 4.5;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.printf("Balance             : %.2f%n", balance);
        System.out.printf("Interest Rate       : %.1f%%%n", interestRate);
        System.out.println();
    }

    static void setInterestRate(double newRate) {
        interestRate = newRate;
    }
}

public class BankAccountStaticDemo {
    public static void main(String[] args) {
        BankAccount first = new BankAccount("ACC1001", "Rahul Sharma", 5000.00);
        BankAccount second = new BankAccount("ACC1002", "Priya Singh", 7500.00);
        BankAccount third = new BankAccount("ACC1003", "Aman Verma", 6200.00);

        System.out.println("BANK ACCOUNT DETAILS");
        System.out.println("=====================");
        first.displayDetails();
        second.displayDetails();
        third.displayDetails();

        System.out.println("Changing interest rate using BankAccount.setInterestRate(6.0)");
        BankAccount.setInterestRate(6.0);
        System.out.println("\nUPDATED ACCOUNT DETAILS");
        System.out.println("=======================");
        first.displayDetails();
        second.displayDetails();
        third.displayDetails();
    }
}
