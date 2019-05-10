/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.util.*;

/**
 *
 * @author jeffr
 */
public class Newproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner kb = new Scanner(System.in);

        //System.out.println("Hey! Welcome to Jeffrey's Star Show!");
        //System.out.println("How are you doing?");
        //String response;
        Random r = new Random();

        int x[][] = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
            
                x[i][j] = r.nextInt(20);
                if ( x [i][j] % 2 == 0) {
                    System.out.println(" " + "\t");
                }else { 
                        System.out.println("*");
                    }
                }
        }
System.out.println();
    }
}

