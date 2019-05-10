/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner*;


/**
 *
 * @author Jeffrey
 */
public class JavaApplication5 {
    
  
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("What is the total amount you change that you have?");
          int change = sc.nextInt();
          int quarters= change / 25;
          int leftOver= change % 25;
          int dimes = leftOver / 10;
          leftOver = leftOver % 10;
          int nickels = leftOver / 5;
          leftOver = leftOver % 5;
          int pennies = leftOver / 1;
          leftOver = leftOver % 1;
          
          System.out.println(" you have " + quarters + " quarters and " + dimes + "dimes"
                  + nickels + " nickels " + pennies + leftOver + "and pennies left over" );
          
          /*an integer that is not funny divisible will not cause an error
          */
          
         
          
        // TODO code application logic here
    }
    
}
