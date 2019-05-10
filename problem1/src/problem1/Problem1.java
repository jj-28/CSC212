/*
 * Write a program that asks the user about the amount of change they have in their pocket and 
 * coverts that to $ amount. This initial version only handles quarters. Need to handle other coins too.
 */
package problem1;
import java.util.*;
import java.lang.Exception;
/**
 *
 * @author mohammad
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
            Scanner sc = new Scanner(System.in);
       
            
      System.out.print("Please enter # of quarters: ");
      int i = sc.nextInt();
      
      double howmuch = i *.25;
      System.out.println ("you have " +  howmuch + " dollars");
              
    }
    
}
