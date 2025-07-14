package Part5_ObjectedOrientedList.ModifiersOfAcess_FixationExercise;

public class Account {
    /*
     * In a bank, to register a bank account, it is necessary to inform the account
     * number, the account holder's name, and the initial deposit amount that the
     * holder deposited when opening the account. This initial deposit amount,
     * however, is optional, meaning: if the holder does not have money to deposit
     * at the moment of opening their account, the initial deposit will not be made
     * and the account's initial balance will naturally be zero.
     * 
     * Important: once a bank account has been opened, the account number can never
     * be changed. However, the holder's name can be changed (since a person can
     * change their name on occasion of marriage, for example).
     * 
     * Finally, the account balance cannot be freely altered. There must be a
     * mechanism to protect this. The balance only increases through deposits, and
     * only decreases through withdrawals. For each withdrawal made, the bank
     * charges a fee of $5.00. Note: the account can have a negative balance if the
     * balance is not sufficient to make the withdrawal and/or pay the fee.
     * 
     * You should make a program that registers an account, giving the option for
     * the initial deposit amount to be informed or not. Then, perform a deposit and
     * then a withdrawal, always showing the account data after each operation.
     */

    private String number;
    private String name;
    private double balance;

    //with initial deposit
        public Account(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    
    // without initial deposit
    public Account(String number, String name) {
        this.number = number;
        this.name = name;
        this.balance = 0.00;
    }

    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param String set the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the money
     */
    public double getBalance() {
        return balance;
    }

    // methods deposit and withdrawal
    public void depositAccountMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawalAccountMoney(double amount) {
        this.balance -= (amount + 5.00);
    }

    public String toString() {
        return "Account: " + number + 
        ", Name: " + name + 
        ", Money in Account: $" + String.format("%.2f", balance);
    }
}
