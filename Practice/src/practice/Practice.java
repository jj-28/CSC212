/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;


public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Hello,  welcome to Jeffrey's Change Counter!");
        
        System.out.print("How many quarters do you have?");
        
            int q = sc.nextInt();
                
        System.out.print("How many dimes do you have?");
        
            int d = sc.nextInt();
        
        System.out.print("How many pennies do you have?");
         
            int p = sc.nextInt();
        
        System.out.print("How many nickels do you have?");
            int n = sc.nextInt(); 
        
        double howmuch= ( q * .25 ) + ( d* .1 ) + ( p * .01 ) + ( n * .05 );
        
        System.out.println("You have $"+  howmuch  +  " in change!" );
        
        System.out.println(" Come again! ");

                
        
        
        
        
        
        
        
                
        // TODO code application logic here
    }
    
}
