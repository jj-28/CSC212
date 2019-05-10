/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem10;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dice x = new dice();
        String response = "";
        do {

            System.out.println("do you want to roll? <y, n>");
            response = sc.next();

            if (response.equals("y")) {
                x.roll();
                    if (x.snakeEyes()) System.out.println ("You  lost.");
                    else if (x.win()) System.out.println("You win!!");
                    else
                        System.out.println("nothing happened");

            }
        } while (!response.equals("n"));

    }
    // TODO code application logic here
}


