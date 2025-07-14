package Part5_ObjectedOrientedList.ModifiersOfAcess_FixationExercise;

import java.util.Scanner;
import java.util.Locale;

public class AccountExecution {
    public static void main(String[] args) {
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

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Enter account number: ");
        String number =keyboard.nextLine();

        System.out.printf("Enter account holder: ");
        String name=keyboard.nextLine();

        System.out.printf("Is there a initial deposit  (y/n)? ");
        char answer=keyboard.next().charAt(0);

        Account account;

        if (answer=='y') {
            System.out.printf("Enter initial deposit value: ");
            double initialDeposit = keyboard.nextDouble();
            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        System.out.println("Account Data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double depositAmount = keyboard.nextDouble();
        account.depositAccountMoney(depositAmount);
        System.out.println("Updated account data:");
        System.out.println(account);
        
        System.out.print("\nEnter a withdraw value: ");
        double withdrawAmount = keyboard.nextDouble();
        account.withdrawalAccountMoney(withdrawAmount);
        System.out.println("Updated account data:");
        System.out.println(account);

        keyboard.close();
    }
}
