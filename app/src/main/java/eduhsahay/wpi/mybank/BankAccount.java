package eduhsahay.wpi.mybank;

/**
 * Created by Himanshu on 5/19/2015.
 */
public class BankAccount {
    private double mBalance;
    public static final double OVERDRAFT_FEE = 30;

    public void withdraw(double amount){
        mBalance -= amount;
    }

    public void deposit(double amount){
        mBalance += amount;
    }

    public double getBalance(){
        return mBalance;
    }
}
