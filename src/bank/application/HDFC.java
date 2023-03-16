package bank.application;

import java.util.UUID;

public class HDFC implements BankSystem {
    private String password;
    private int balance;
    private String name;
    public int rateOfInterest;
    public String accountNo;

    public HDFC (String name, String password) {
        this.name = name;
        this.password = password;
        this.accountNo = UUID.randomUUID().toString();
    }

    @Override
    public String addMoney(int money, String password) {
        if (this.password.equals(password)) {
            this.balance += money;
            String str = "Money has been added to your bank account. Your new balance is " + this.balance;
            return str;
        }
        return "Wrong Password";
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if (this.password.equals(password)) {
            if (money > this.balance) {
                return "Insufficent Balance.";
            }
            this.balance -= money;
            String str = "Money is successfully withdrawn. Your remaning balance is " + this.balance;
            return str;
        }
        return "Wrong Password";
    }

    @Override
    public String checkBalance(String password) {
        if (this.password.equals(password)) {
            String str = "Your balance is " + this.balance;
            return str;
        }
        return "Wrong Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return "Your password is changed successfully.";
        }
        return "Wrong Old password";
    }

    @Override
    public String checkRateOfInterest(int years) {
        double interest = this.balance* this.rateOfInterest * years;
        String str = "Your total amount after " + years + " years will be " + interest +".";
        return str;
    }
}
