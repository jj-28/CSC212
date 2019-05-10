/*
 *A simple program that show how one does both input and output. This program 
 *was used to demonstrate how one calculates complex formulas.
 */
package class2;

import java.util.*;

/**
 *
 * @author mohammad
 */
public class Class2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //decalre and instantiate a scanner variable

        System.out.print("please enter your name: ");
        String name = sc.next(); //get the name of the person

        System.out.print("Please enter an intenger number: ");
        int i = sc.nextInt(); // get an int

        System.out.print("Please enter a double number: ");
        double d = sc.nextDouble();  //get a double

        double x = (i + d) * 10 / 5; //calculate something

        System.out.println("the result is " + x);

    }

}
