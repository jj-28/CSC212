/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountproject;

/**
 *
 * Name: create and maintain a bank account
 *
 */
public class Account {

    String n;
    int p;
    double b;
    //need variables that are needed for representing a bank account:
    //name, pin, and balance.

    //the consttructor for Account brings in values needed for variables 
    //maintained for an account (name, pin, etc.)
    public Account(String i, int pin, double balance) {
        n=i;
        p=pin;
        b=balance;
        
    }

    //this method is temporarily set up to return zero; it needs to return the balance.
    public double balance() {
        return b;
    }

    //this method is temporarily set up to return zero; it needs to return the balance.
    public int pin() {
        return p;
    }

    //this method is temporarily set up to return an emplty string, it needs to return the name.
    public String name() {
        return n;
    }

    //this method is temporarily set up to return true, it needs to return the 
    // true if withdrawal is possible and false otherwise.  If withdrawal is possible,
    //the balance is reduced by the amount in the parameter, otherwise, no change is made to the balance.
    public boolean withdraw(double amount) {
        if ((amount) < b) {
            b = b - amount;
            return true;
        } else {
            return false;
        }
    }

    //this method is expected to increase the balance by the amount in the parameter.
    public void deposite(double amount) {
        b = balance() + amount;

    }
//authorize will enable us to check a pin number against the pin number of the account object.
    //method returns true if the pins match and false otherwise. This method temporarily return true.

    public boolean authorize(int p) {
        if (pin() == p) {
            return true;
        } else {
            return false;
        }
    }
}
