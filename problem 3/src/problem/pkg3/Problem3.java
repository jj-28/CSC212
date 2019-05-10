/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg3;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter how much change you have (Ex:73, 75) ");
                int change = sc.nextInt();
                change change_money = new change (change);
                System.out.println("You have " + change_money.quarters() + (" quarters " ) +  );
        // TODO code application logic here
    }
    
}
