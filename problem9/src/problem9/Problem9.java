/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem9;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    // roll dicc, use won, lost, or nothing happened
    public static void main(String[] args) {   
        int wins = 0;
           int losses = 0;
           
           for (int i = 0; i < 1000000; i++) {
            dice x;       
                if (x.snakeEyes()) losses++;
                if (x.win()) wins++;
                    }
           System.out.println("% of wins: " + wins / 10000);
           System.out.println("% of losses: " + losses / 10000);
           
            
            /*casting - means you are converting the type of number
            Ie: casting the example makes it from 1- 6
            */
            //Math.random generates a number from 0 to .9999999(etc)not incuding 1
        // TODO code application logic here
    }
    
}
