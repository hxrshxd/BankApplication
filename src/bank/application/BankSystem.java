package bank.application;

public interface BankSystem {

    public String addMoney(int money, String password);

    public String withdrawMoney(int money, String password);

    public String checkBalance(String password);

    public String changePassword(String oldPassword, String newPassword);

    public String checkRateOfInterest(int years);
}
