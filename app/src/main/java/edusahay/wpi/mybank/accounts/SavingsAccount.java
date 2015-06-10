package edusahay.wpi.mybank.accounts;

import edusahay.wpi.mybank.accounts.BankAccount;

/**
 * Created by Himanshu on 5/31/2015.
 */
public class SavingsAccount extends BankAccount {

    private static final String TAG = "SavingsAccount";

    @Override
    public void withdraw(double amount){
       if(numberOfWithdrawals() >= 3){
           return;
       }
        // Call to withdraw method of BankAccount
        super.withdraw(amount);
    }
}
