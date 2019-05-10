package bankaccountproject;

import java.io.*;
import java.util.*;

public class BankAccountProject {

    public static String choice(Scanner k) {
        for (;;) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("a - Check Balance");
            System.out.println("b - Withdraw");
            System.out.println("c - Deposit");
            System.out.println("q - Quit");
            String response = keyboard.next();
            if (response.equals("a") || response.equals("b") || response.equals("c") || response.equals("q")) {
                return response;
            } else {
                System.out.println("Invalid response - try again");
            }

        }
    }

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(new FileInputStream("accounts.txt"));

        allAccounts.load(reader);  //store account in allAccounts

        Scanner sc = new Scanner(System.in);
        Account a;
        do {
            System.out.print(" Please enter name of account holder: ");
            String Account = sc.next();

            a = allAccounts.locate(Account);
            if (a == null) {
                System.out.println(Account + " does not have an account with us ");

            }
            
        } while (a == null);

        //  if (a != null) {
        String c = "";
        int pin; 
        do {
            System.out.print(" Please enter your pin #: ");

            pin = sc.nextInt();

            if (pin == a.pin()) {
                System.out.println(" Welcome " + a.n + ". ");
            } else {
                System.out.println(" Invalid Pin please try again: ");
            }

        }while (pin != a.pin());

     do{ 

                Scanner keyboard = new Scanner(System.in);
                c = choice(keyboard);
                
                if (c.equals("q")) {
                    System.out.print("Thank you. ");
                    
                } else if (c.equals("a")) {

                    System.out.println(" Balance is: $" + a.balance());

                } else if (c.equals("b")) {
                    System.out.println(" Enter amount to withdraw: ");
                    double M = keyboard.nextDouble();
                    a.withdraw(M);
                    System.out.println("Your new balance after withdrawing is: $" + a.balance());

                } else if (c.equals("c")) {
                    System.out.println(" Enter amount to deposit: ");
                    double B = keyboard.nextDouble();
                    a.deposite(B);
                    System.out.println("Your new balance after depositing is: $" + a.balance());
                }

            
        } while (!c.equals("q"));
    PrintStream outfile = new PrintStream("account2.txt");
    Account fin [] = new Account [1000];
    while (reader.hasNext()) {
       
    }
    }
}