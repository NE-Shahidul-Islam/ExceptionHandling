public class BankAccount {
    private String accountNumber;
    private double balance;
    private String userName;


    // Create a constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit korbo
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount: " + amount+"\n");

        }
        balance = balance + amount;

    }

    // Withdraw korbo
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount: "  + amount+"\n");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal: " + amount+"\n");
        }
        balance = balance - amount;

    }


    public double getBalance() {
        return balance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
