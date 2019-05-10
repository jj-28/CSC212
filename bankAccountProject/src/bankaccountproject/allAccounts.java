/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccountproject;

import java.util.Scanner;

/**
 *
 * * Name: Jeffrey Johnson
 * create and maintain all accounts
 * 
 */
public class allAccounts {
    static Account a[] =  new Account [1000];
static int count =  0;
//Account a = new Account (sc.hasNextInt(),sc.hasNextDouble(),sc.hasNextInt())

   // need an static array that holds all accounts. Also need a static integer that tracks
   // how many accounts there are in the array
    //only one array of accounts (only one bank!!!!)
    //all things have to be declared as static objects
    
    
    
    //this method gets the scanner object for the data file that holds all 
    //account information.  It need to then read each line holding data for an account
    // (name, pin, etc.) and then store that account in the array, keeping track of how 
    //many accounts there are.
    public static void load (Scanner sc) {
        while (sc.hasNext()) {
        a[count]= new Account (sc.next(),sc.nextInt(),sc.nextDouble());
       
        count++;
        
        /*scanner class reads  information from data file
        create an array of accounts, you dont know how many accounts you have
        you will not have more than 1000 accounts ie: j[1000]
        have to adjust  the code to adapt to how many account we have. Array might
        have 50, 100  accounts and so on and so on.
        can track the amount of accounts  by: 
        inst. a variable that counts the amount of lines read
        */
        //static methods can only look for static variables
        
    }
    }
    //locate an return the account with the name matching the paramter. If no account
    //is found with this name, the method returns null. This method temporarily returns null.
    public static Account locate (String name) {
        for (int i = 0;  i <count; i++) {
            if (a[i].n.equals(name)) return a[i];
        }
      


//has to search throught the account til you find what youre looking for
        //possible to not have  a name in directory
        //null means nothing. Doesnt return anything when  the name isnt there
        //returns the account info when when finds the name
     return null; 
    
        
    }
    
    // teach how to write to file, and edit information as is needed.
}
