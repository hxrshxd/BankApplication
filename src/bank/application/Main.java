package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a bank: 1.SBI, 2.HDFC");
        int bank = sc.nextInt();
        System.out.println("Your name:");
        String name = sc.next();
        System.out.println("Your password:");
        String password = sc.next();
        SBI sbi;
        HDFC hdfc;
        if (bank == 1) createSBI(name, password);
        else if (bank == 2) hdfc = new HDFC(name, password);
        else {
            System.out.println("Wrong bank number.");
        }
    }
    
    private static void createSBI(String name, String password) {
        SBI account = new SBI(name, password);
    }
}