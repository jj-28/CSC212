/*3 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

import java.util.Scanner;

/**
 *
 * @author Jeffrey JOhnson course CSC 212 Section 81F date 9 6 16 description:
 * Write a Java program that computes Y and Y'. The equations that determine
 * their values are Y = aX^2 + bX + c Y' = 2aX + b Input: The values for X, a,
 * b, and c are provided interactively. X is a double and a,b, and c are int
 * variables. The constraint a not being zero must be applied. Output: Y and Y'
 */
public class Equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* declaration of the variable xy and y' variables. 
         * declaration of x is provided, need to add declaration of 
         * two other double variables for y and y_prime */
        double x;

        /* declare the three int constant holding variables: a, b, and c */
 /* abort if a is zero. Note this causes complier error 
          * as a is not yet declared         
         */
 /* needed to receive input values for int and double variables */
        //do {
        Scanner sc = new Scanner(System.in);

        /*input x, a, b, and c. input for x is shown, need input of a,b, and c */
        
        System.out.print("Please enter the value for x ");
        x = sc.nextDouble();

        System.out.print("Please enter the value for a ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Program is aborted; " + ""
                    + "a set at zero makes the function linear");
            System.exit(-1);
        }
        System.out.print("Please enter the value for b ");
        int b = sc.nextInt();

        System.out.print("Please enter the value for c ");
        int c = sc.nextInt();

        double y;

        double y_prime;

        y = (a * (x * x)) + (b * x) + (c);

        y_prime = (2 * (a * x)) + (b);

        System.out.println("For X, a, b, and c values:" + 
                x + ", " + a + ", " + b + ", " + c
                + " respectively, the Y value is " + y);
 System.out.println("For X, a, b, and c values:" + 
                x + ", " + a + ", " + b + ", " + c
                + " respectively, the Y' value is " + y_prime);
        /*Write the code for calculating y and y' and storing results in 
         * their respective variables */
 /* Write the code to output y and y' using the format expected
         * in the assignment */
    }
        //}while (!sc.equals("q"))
}
