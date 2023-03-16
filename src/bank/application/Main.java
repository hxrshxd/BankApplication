package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HDFC.rateOfInterest = 8;

        Scanner sc = new Scanner(System.in);

        System.out.println("Your name:");
        String name = sc.next();

        System.out.println("Your password:");
        String password = sc.next();

        getBank(name, password);
    }

    private static void getBank(String name, String password) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a bank: 1.SBI, 2.HDFC, 3.Exit");
        int bank = sc.nextInt();

        if (bank == 1) {
            SBI account = new SBI(name, password);
            int choice = getChoice();
            createSBI(choice, account);
        }
        else if (bank == 2) {
            HDFC account = new HDFC(name, password);
            int choice = getChoice();
            createHDFC(choice, account);
        }
        else if (bank == 3) {
            return;
        }
        else {
            System.out.println("Wrong bank number.");
            getBank(name, password);
        }
    }

    private static int getChoice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chose one option:");
        System.out.println("1.Add Money, 2.Withdraw Money, 3.Check Balance, 4.Rate of interest, 5.Change Passward, 6.Exit");
        int choice = sc.nextInt();

        return choice;
    }

    private static void createSBI(int choice, SBI account) {
        Scanner sc = new Scanner(System.in);

        if (choice == 1) {
            System.out.println("Enter the amount of money:");
            int money = sc.nextInt();

            System.out.println("Enter your password:");
            String pwd = sc.next();

            String result = account.addMoney(money, pwd);
            System.out.println(result);

            choice = getChoice();
            createSBI(choice, account);
        }
        else if (choice == 2) {
            System.out.println("Enter the amount of money:");
            int money = sc.nextInt();

            System.out.println("Enter your password:");
            String pwd = sc.next();

            String result = account.withdrawMoney(money, pwd);
            System.out.println(result);

            choice = getChoice();
            createSBI(choice, account);
        }
        else if (choice == 3) {
            System.out.println("Enter your password:");
            String pwd = sc.next();

            String result = account.checkBalance(pwd);
            System.out.println(result);

            choice = getChoice();
            createSBI(choice, account);
        }
        else if (choice == 4) {
            System.out.println("Enter the number of years:");
            int years = sc.nextInt();

            String result = account.checkRateOfInterest(years);
            System.out.println(result);

            choice = getChoice();
            createSBI(choice, account);
        }
        else if (choice == 5) {
            System.out.println("Enter your old password:");
            String oldPwd = sc.next();

            System.out.println("Enter your new password:");
            String newPwd = sc.next();

            String result = account.changePassword(oldPwd, newPwd);
            System.out.println(result);

            choice = getChoice();
            createSBI(choice, account);
        } else if (choice == 6) return;
        else {
            System.out.println("Wrong Input");

            choice = getChoice();
            createSBI(choice, account);
        }
    }

    private static void createHDFC(int choice, HDFC account) {
        Scanner sc = new Scanner(System.in);

        if (choice == 1) {
            System.out.println("Enter the amount of money:");
            int money = sc.nextInt();

            System.out.println("Enter your password:");
            String pwd = sc.next();

            String result = account.addMoney(money, pwd);
            System.out.println(result);

            choice = getChoice();
            createHDFC(choice, account);
        }
        else if (choice == 2) {
            System.out.println("Enter the amount of money:");
            int money = sc.nextInt();

            System.out.println("Enter your password:");
            String pwd = sc.next();

            String result = account.withdrawMoney(money, pwd);
            System.out.println(result);

            choice = getChoice();
            createHDFC(choice, account);
        }
        else if (choice == 3) {
            System.out.println("Enter your password:");
            String pwd = sc.next();

            String result = account.checkBalance(pwd);
            System.out.println(result);

            choice = getChoice();
            createHDFC(choice, account);
        }
        else if (choice == 4) {
            System.out.println("Enter the number of years:");
            int years = sc.nextInt();

            String result = account.checkRateOfInterest(years);
            System.out.println(result);

            choice = getChoice();
            createHDFC(choice, account);
        }
        else if (choice == 5) {
            System.out.println("Enter your old password:");
            String oldPwd = sc.next();

            System.out.println("Enter your new password:");
            String newPwd = sc.next();

            String result = account.changePassword(oldPwd, newPwd);
            System.out.println(result);

            choice = getChoice();
            createHDFC(choice, account);
        }
        else if (choice == 6) return;
        else {
            System.out.println("Wrong Input");

            choice = getChoice();
            createHDFC(choice, account);
        }
    }
}