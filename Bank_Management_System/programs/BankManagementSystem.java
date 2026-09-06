class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    // Getter and Setter for accountNumber with validation
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty() && accountNumber.length() >= 5) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number must not be empty and must contain at least 5 characters.");
        }
    }

    // Getter and Setter for accountHolderName with validation
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty() && accountHolderName.length() >= 3) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Error: Name must not be empty and must contain at least 3 characters.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositing: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid Withdrawal Amount");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        // Creating a bank account based on sample output
        BankAccount account = new BankAccount("ACC1001", "Rahul Sharma", 5000.0);

        // Display Initial Details
        account.displayAccountDetails();

        // Performing Transactions
        account.deposit(2000);
        account.withdraw(3000);

        // Display Updated Balance
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
